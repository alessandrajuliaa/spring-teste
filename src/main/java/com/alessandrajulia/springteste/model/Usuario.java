package com.alessandrajulia.springteste.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Campo nome não pode estar vazio.")
    @Length(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 catacteres")
    private String nome;

    @NotEmpty(message = "Campo login não pode estar vazio.")
    @Length(min = 4, max = 25, message = "Login deve ter entre 4 e 25 catacteres")
    private String login;

    @NotEmpty(message = "Campo senha não pode estar vazio.")
    @Length(min = 8, max = 20, message = "Senha deve ter entre 8 e 20 catacteres")
    private String senha;
}
