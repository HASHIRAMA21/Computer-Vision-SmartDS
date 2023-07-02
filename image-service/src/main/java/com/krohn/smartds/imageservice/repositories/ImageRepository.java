package com.krohn.smartds.imageservice.repositories;

import com.krohn.smartds.imageservice.entities.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepository extends MongoRepository<Image,String> {
}
