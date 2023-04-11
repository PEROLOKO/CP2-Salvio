package br.com.fiap.styleexclusive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produto {
    @Id
    private String id;
    private String nome;
    private String tipo;
    private String desc;
    private Float preco;

    public Produto(String nome, String tipo, Float preco, String desc) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.desc = desc;
    }
}
