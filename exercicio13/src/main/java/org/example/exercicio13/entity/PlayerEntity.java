package org.example.exercicio13.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String position;
}