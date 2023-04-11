package br.com.fiap.styleexclusive.repository;

import br.com.fiap.styleexclusive.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
