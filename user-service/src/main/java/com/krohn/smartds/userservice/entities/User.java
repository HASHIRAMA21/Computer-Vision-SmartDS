package com.krohn.smartds.userservice.entities;

import lombok.*;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class User {
    private String username;
    private String email;
    private String password;
}
