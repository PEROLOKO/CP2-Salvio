package br.com.fiap.StyleExclusive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@Data
public class Produto {
    @Id
    private Long id;

    private Long idProduto;
    private String nome;
    private String tipo;
    private String desc;
    private Float preco;

    public Produto(Long idProduto, String nome, String tipo, Float preco, String desc) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Produto(Long id, Long idProduto, String nome, String tipo, String desc, Float preco) {
        this.id = id;
        this.idProduto = idProduto;
        this.nome = nome;
        this.tipo = tipo;
        this.desc = desc;
        this.preco = preco;
    }
}
