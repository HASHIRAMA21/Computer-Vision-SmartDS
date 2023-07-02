package com.krohn.smartds.userservice.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Images {
    @Id
    private String id;
    private String url;
    private String name;
}
