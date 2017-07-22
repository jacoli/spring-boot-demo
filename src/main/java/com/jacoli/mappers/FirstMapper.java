package com.jacoli.mappers;

import com.jacoli.DO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lichuange on 2017/7/21.
 */
@Repository
@Mapper
public interface FirstMapper {

    User findByUserName(@Param("name") String name);

    List<User> findUsers();
}
