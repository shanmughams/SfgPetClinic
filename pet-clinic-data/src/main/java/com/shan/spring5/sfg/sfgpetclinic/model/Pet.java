package com.shan.spring5.sfg.sfgpetclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
