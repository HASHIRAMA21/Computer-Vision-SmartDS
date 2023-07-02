package com.krohn.smartds.equipmentsservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.krohn.smartds.equipmentsservice.enums.StateMateriels;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.Timestamp;
import lombok.*;


import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Materiels {
    @Id @GeneratedValue(generator = Constants.ID_GENERATOR)
    @NotNull
    @JsonProperty("nom_materiels")
    private String nomMateriels;

    @NotNull
    private String description;

    @NotNull
    @JsonProperty("date_ajout")
    @Timestamp
    private Date dateAjout;

    @NotNull
    @JsonProperty("date_maintenace")
    @Timestamp
    private Date dateMaintenance;

    @JsonProperty("state_materiels")
    @Enumerated(EnumType.STRING)
    @NotNull
    private StateMateriels stateMateriels = StateMateriels.NON_DEPLOYER;

}
