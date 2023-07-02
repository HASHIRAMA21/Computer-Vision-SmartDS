package com.krohn.smartds.userservice.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@AllArgsConstructor @Builder @NoArgsConstructor @ToString
@CompoundIndex(name = "age_idx", def = "{'lastName': 1, 'age': -1}")
public class Person<T extends Address> {
    @Id
     private String id;
     private String firstName;
     private String lastName;
     @DBRef
     private Gender gender;
     private T address;
     @DBRef
     private Contact contact;
     private Date birthday;
     private Integer age;
     @DBRef
     private List<Images> images;
}
