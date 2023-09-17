package com.modelsis.modelsisspringbootfullstack.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="TypeProduct")

public class TypeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_type;

    @Column(unique = true, nullable = false)
    private String name;


}
