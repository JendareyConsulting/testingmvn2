package com.jendarey.jendareytech.model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Voter {





    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String firstName;
    private String lastName;

    private Integer phoneNo;

    private String country;

    private String yearsOfExperience;
    private  String email;
    private  DevopsTools devopsTools;








}
