package com.lyc.mapper;

import com.lyc.dao.User;

public interface UserMapper {
    User selectByPrimaryKey(String id);
}
