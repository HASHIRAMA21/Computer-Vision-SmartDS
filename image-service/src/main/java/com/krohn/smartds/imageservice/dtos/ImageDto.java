package com.krohn.smartds.imageservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.Binary;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class ImageDto {
    private String name;
    private Binary image;
}
