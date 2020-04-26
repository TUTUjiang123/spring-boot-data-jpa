package com.tutu.springbootdatajpa.entity.repository;

import com.tutu.springbootdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> { //第一个泛型是填操作哪个实体类，第二个范型是实体类中的主键
}
