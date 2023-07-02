package com.krohn.smartds.equipmentsservice.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name ="cameras")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder @ToString
public class Cameras extends EquipementVideo{
    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private String ipAdress;
}
