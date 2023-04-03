package br.com.fiap.StyleExclusive;

import br.com.fiap.StyleExclusive.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StyleExclusiveApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StyleExclusiveApplication.class, args);
	}

	@Autowired
	private ProdutoService produtoService;

	@Override
	public void run(String... args) throws Exception {
		this.produtoService.save("blusa azul de marca", "blusa", "uma blusa bem bonita", 69.99F);
	}

}
