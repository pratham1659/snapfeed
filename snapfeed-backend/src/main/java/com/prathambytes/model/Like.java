package com.prathambytes.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Tweets tweets;


}
