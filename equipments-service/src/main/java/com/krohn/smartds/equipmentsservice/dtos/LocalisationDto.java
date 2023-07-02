package com.krohn.smartds.equipmentsservice.dtos;

import lombok.Data;
import lombok.ToString;

@Data @ToString
public class LocalisationDto {
    private double latitude;
    private double longitude;
    private double altitude;
    private String secteur;
}
