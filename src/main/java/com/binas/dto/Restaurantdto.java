package com.binas.dto;


import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable

public class Restaurantdto {

    private  String title;


    @column(lenght = 1000)
    private List<String> images;

    private String description;

}
