package com.krohn.smartds.userservice.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString @Builder
public class Address {
    private String address;
    private String address2;
    private String city;
    private String country;
    private String zipCode;
}
