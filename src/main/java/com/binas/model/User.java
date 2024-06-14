package com.binas.model;

import com.binas.dto.Restaurantdto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private USER_ROLE role;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "user_favorites", joinColumns = @JoinColumn(name = "user_id"))
    private List<Restaurantdto> favorites = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();
}
