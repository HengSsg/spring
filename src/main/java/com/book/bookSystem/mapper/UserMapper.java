package com.book.bookSystem.mapper;

import com.book.bookSystem.model.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int save(UserDTO userDTO);
}
