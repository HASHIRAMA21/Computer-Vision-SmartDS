package com.krohn.smartds.equipmentsservice.repositories;

import com.krohn.smartds.equipmentsservice.entities.Materiels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MaterielsRepository extends JpaRepository<Materiels,String> {
}
