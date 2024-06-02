package com.binas.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence..Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class IngedientsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long name;


    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

   @OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
    private List<IngredientsItem> ingredients = new ArrayList<>();


}
