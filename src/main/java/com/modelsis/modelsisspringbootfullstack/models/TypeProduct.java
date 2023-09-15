package com.modelsis.modelsisspringbootfullstack.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="TypeProduct")

public class TypeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;

}
