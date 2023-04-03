package br.com.fiap.StyleExclusive.repository;

import br.com.fiap.StyleExclusive.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    Optional<Object> findById(Long id);
}
