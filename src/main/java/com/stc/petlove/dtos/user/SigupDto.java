package com.stc.petlove.dtos.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SigupDto {
    private String name;

    // email không được trùng nhau
    private String email;

    private String password;

    private String dienThoai;
}
