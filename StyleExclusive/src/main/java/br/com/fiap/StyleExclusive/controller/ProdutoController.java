package br.com.fiap.StyleExclusive.controller;

import br.com.fiap.StyleExclusive.model.Produto;
import br.com.fiap.StyleExclusive.repository.ProdutoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ProdutoController {
    Logger log = LoggerFactory.getLogger(ProdutoController.class);
    @Autowired
    ProdutoRepository repository;

    @GetMapping("/api/produto")
    public List<Produto> index() {
        return repository.findAll();
    }

    @PostMapping("/api/produto")
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        log.info("cadastrando produto: " + produto);
        repository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

    @GetMapping("api/produto/{id}")
    public ResponseEntity<Produto> show(@PathVariable Long id) {
        log.info("Buscar produto " + id);
        var produtoEncontrada = repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Código não Encontrado"));
        return ResponseEntity.ok((Produto) produtoEncontrada);
    }

    @DeleteMapping("/api/produto/{id}")
    public ResponseEntity<Produto> delete(@PathVariable Long id) {
        var produtoEncontrada = repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Código não Encontrado"));
        repository.delete((Produto) produtoEncontrada);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/api/produto/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto) {
        var produtoEncontrada = repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Código não Encontrado"));
        produto.setId(id);
        repository.save((Produto) produtoEncontrada);
        return ResponseEntity.ok(produto);
    }
}
