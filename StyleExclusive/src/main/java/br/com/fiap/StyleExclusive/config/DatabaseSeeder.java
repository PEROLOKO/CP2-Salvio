package br.com.fiap.StyleExclusive.config;

import br.com.fiap.StyleExclusive.model.Produto;
import br.com.fiap.StyleExclusive.repository.ProdutoRepository;
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
                new Produto("Blusa Azul e Legal", "blusa", 69.99F, "uma blusa bem bonita"),
                new Produto("Calça Vermelho", "calça", 70F, "uma calça bem legal"),
                new Produto("Shorts", "shorts", 99.99F, "um shorts")
        ));
    }

}
