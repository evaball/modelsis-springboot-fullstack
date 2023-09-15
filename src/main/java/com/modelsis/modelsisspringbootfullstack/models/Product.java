package com.modelsis.modelsisspringbootfullstack.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TypeProduct type;
}
