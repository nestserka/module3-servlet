package com.module3.project3.entity;

import com.module3.project3.enams.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private long id;
    private String nickname;
    private String email;
    private UserRole role;
    private String ipAddress;

}