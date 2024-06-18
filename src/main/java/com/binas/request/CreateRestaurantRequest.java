package com.binas.request;

import com.binas.model.Address;
import com.binas.model.ContactInformation;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CreateRestaurantRequest {

    private long id;
    private String name;
    private String description;
    private Address address;
    private ContactInformation contactInformation;
    private String openingHours;
    private List<String> images;
    private LocalDateTime openingDateTime;
    private String cuisineType;

}
