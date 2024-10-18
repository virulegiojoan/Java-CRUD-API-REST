package com.restapi.apirest.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data //Genera geters y seters con lombok
@AllArgsConstructor // genera el constructor con todos sus argumentos
@NoArgsConstructor // constructor vacio
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Nonnull
    private String name;
    @Nonnull
    private Double price;




}
