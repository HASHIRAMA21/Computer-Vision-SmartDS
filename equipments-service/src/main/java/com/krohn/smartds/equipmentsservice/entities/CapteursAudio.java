package com.krohn.smartds.equipmentsservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.krohn.smartds.equipmentsservice.enums.CapteursAudioType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CapteursAudio extends EquipementsAudio {
    //@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @JsonProperty("nom_capteurs")
    @NotNull
    private String nomCapteurs;
    @NotNull
    private String resolution;
    @NotNull
    private String sensibilite;
    @NotNull
    private String précision ;
    @NotNull
    private String reproductibilité ;
    @NotNull
    private String linéarité;

    @NotNull
    @Enumerated(EnumType.STRING)
    @JsonProperty("capteur_type")
    private CapteursAudioType capteursType =  CapteursAudioType.TOR ;
}
