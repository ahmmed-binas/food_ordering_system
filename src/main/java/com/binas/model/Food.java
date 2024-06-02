package com.binas.model;
import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    private  String name;
    private String description;

    private Long price;

    @ManyToOne
    private Category foodCategory;

    @Column(length = 1000)
    @ElementCollection
    private List<String> images

    private boolean available;


    @ManyToOne
    private Restaurant restaurant;

    private boolean isVegetarian;
    private boolean isSeasonal;


    @ManyToMany
    private  List<IngredientsItem> ingrediants = new ArrayList<>();

    private Date creationDate;




}
