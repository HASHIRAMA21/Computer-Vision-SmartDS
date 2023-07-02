package com.krohn.smartds.userservice.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor @Builder @ToString
public class Contact {
    private String email;
    private String phone;
    private String skype;
    private String facebook;
    private String linkedin;
    private String website;
    private String note;
}
