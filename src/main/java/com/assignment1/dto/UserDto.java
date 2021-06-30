package com.assignment1.dto;

import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
}
