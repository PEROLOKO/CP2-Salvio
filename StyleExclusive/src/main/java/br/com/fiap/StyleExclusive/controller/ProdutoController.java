package br.com.fiap.StyleExclusive.controller;

import br.com.fiap.StyleExclusive.model.Produto;
import br.com.fiap.StyleExclusive.repository.ProdutoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    ProdutoRepository repository;

    @GetMapping
    public List<Produto> index() { return repository.findAll(); }

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        log.info("Cadastrando produto " + produto);
        repository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

    @GetMapping("{id}")
    public ResponseEntity<Produto> show(@PathVariable String id) {
        log.info("Buscar produto " + id);
        var produtoEncontrada = repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não Encontrado"));
        return ResponseEntity.ok(produtoEncontrada);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Produto> delete(@PathVariable String id) {
        var produtoEncontrada = repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Não foi possivel deletar o produto"));
        repository.delete(produtoEncontrada);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Produto> update(@PathVariable String id, @RequestBody Produto produto) {
        repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Código não Encontrado"));
        produto.setId(id);
        repository.save(produto);
        return ResponseEntity.ok(produto);
    }
}
