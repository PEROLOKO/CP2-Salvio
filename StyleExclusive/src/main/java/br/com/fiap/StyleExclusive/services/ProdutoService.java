package br.com.fiap.StyleExclusive.services;

import br.com.fiap.StyleExclusive.model.Produto;
import br.com.fiap.StyleExclusive.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void save(String nome, String tipo, String desc, Float preco, Long idProduto) {
        Produto produto = new Produto(idProduto, nome, tipo, preco, desc);
        this.produtoRepository.save(produto);
    }

}
