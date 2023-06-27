package com.book.bookSystem.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private int no;
    private String userName;
    private String userId;
    private String userPw;
}
