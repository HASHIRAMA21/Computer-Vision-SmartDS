package com.krohn.smartds.userservice.repositories;

import com.krohn.smartds.userservice.entities.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends MongoRepository<Person,String> {
}
