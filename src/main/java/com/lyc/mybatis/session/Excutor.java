package com.lyc.mybatis.session;

public interface Excutor {
 public <T> T query(String statement,Object parameter);  
}