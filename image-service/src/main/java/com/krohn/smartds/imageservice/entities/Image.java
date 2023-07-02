package com.krohn.smartds.imageservice.entities;

import lombok.*;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@Data @NoArgsConstructor @Builder @ToString
public class Image {
    @Id
    private String id;
    private String name;
    private Binary image;

    public Image(String name) {
        this.name = name;
    }
}
