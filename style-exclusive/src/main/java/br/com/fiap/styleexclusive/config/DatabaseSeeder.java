package br.com.fiap.styleexclusive.config;

import br.com.fiap.styleexclusive.model.Produto;
import br.com.fiap.styleexclusive.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {
        produtoRepository.deleteAll();
        produtoRepository.saveAll(List.of(
                new Produto("Camisa Azul e Legal", "camisa", 69.99F, "uma camisa bem bonita"),
                new Produto("Calça Jeans", "calca_jeans", 70F, "uma calça bem legal"),
                new Produto("Shorts", "shorts", 99.99F, "um shorts")
        ));
    }

}
