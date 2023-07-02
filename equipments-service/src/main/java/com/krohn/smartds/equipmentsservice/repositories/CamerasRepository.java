package com.krohn.smartds.equipmentsservice.repositories;

import com.krohn.smartds.equipmentsservice.entities.Cameras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CamerasRepository extends JpaRepository<Cameras,String> {
}
