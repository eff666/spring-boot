package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    //自定义方法
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
    Long deleteById(Long id);
    Long countByUserName(String userName);
    List<User> findByEmailLike(String email);
    User findByUserNameIgnoreCase(String userName);
    List<User> findByUserNameOrderByEmailDesc(String email);


    
}