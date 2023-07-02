package com.krohn.smartds.equipmentsservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "localisation")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Localisation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private double latitude;
    @NotNull
    private double longitude;
    @NotNull
    private double altitude;
    @NotNull
    private String secteur;
}
