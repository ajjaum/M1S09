package com.FullStack.M1S09.atividade9.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LivroRequest {

    private Long id;
    private String titulo;
    private String autor;
    private Long anoPublicacao;
}
