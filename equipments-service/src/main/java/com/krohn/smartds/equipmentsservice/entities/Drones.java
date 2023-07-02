package com.krohn.smartds.equipmentsservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "drones")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder @ToString
public class Drones extends EquipementVideo{
    //@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @JsonProperty("nom_drones")
    @NotNull
    private String nomDrones;
    @NotNull
    @JsonProperty("marque_drones")
    private String marqueDrones;

    @NotNull
    @JsonProperty("altitude_max")
    private double altitudeMax;

    @NotNull
    @JsonProperty("poids_max")
    private double poidsMax;

    @NotNull
    private Date autonomie;

    @NotNull
    private String ipAdress;
}
