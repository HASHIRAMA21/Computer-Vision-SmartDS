package com.krohn.smartds.equipmentsservice.repositories;

import com.krohn.smartds.equipmentsservice.entities.Drones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DronesRepository extends JpaRepository<Drones,String> {
}
