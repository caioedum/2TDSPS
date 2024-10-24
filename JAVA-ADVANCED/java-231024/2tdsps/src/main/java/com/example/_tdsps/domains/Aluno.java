package com.example._tdsps.domains;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String nome;
}
