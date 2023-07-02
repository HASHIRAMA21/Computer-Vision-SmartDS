package com.krohn.smartds.equipmentsservice.entities;

import com.krohn.smartds.equipmentsservice.enums.StateEquipementAudio;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "equipement_audios")
@Data  @AllArgsConstructor
@NoArgsConstructor
public class EquipementsAudio extends Materiels {
    // @Id @GeneratedValue(generator = Constants.ID_GENERATOR)
    @Enumerated(EnumType.STRING)
    @NotNull
    private StateEquipementAudio stateEquipementAudio = StateEquipementAudio.ARRET;
}
