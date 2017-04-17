package com.demo.mapper;

import java.util.List;

import com.demo.entity.UserEntity;
import com.demo.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
	
	List<UserEntity> getAll();

	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);


}