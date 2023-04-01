package br.com.fiap.StyleExclusive.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cliente {
    private String id;
    private String login;
    private String senha;
    private boolean isOp;
}
