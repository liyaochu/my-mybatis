package com.lyc;

import com.lyc.dao.User;
import com.lyc.mapper.UserMapper;
import com.lyc.mybatis.session.MySqlsession;

import java.io.InputStream;

/**
 * @program: my-mybatis
 * @description:
 * @author: Jhon_Li
 * @create: 2019-06-20 11:02
 **/
public class Test {
    public static void main(String[] args) {
        MySqlsession sqlsession=new MySqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey("abc");
        System.out.println(user.toString());    }
}
