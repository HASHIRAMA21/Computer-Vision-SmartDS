package com.krohn.smartds.equipmentsservice.entities;

import com.krohn.smartds.equipmentsservice.enums.StateEquipementVideo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "equipement_videos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class EquipementVideo extends Materiels{
    //@Id @GeneratedValue(generator = Constants.ID_GENERATOR)
    @Enumerated(EnumType.STRING)
    @NotNull
    private StateEquipementVideo stateEquipementVideo = StateEquipementVideo.ARRET;
}
