package com.tutu.springbootdatajpa.entity;

import lombok.Data;

import javax.persistence.*;

@Data //get set toString
@Entity //告诉jpa，这是一个实体类(和数据表映射的类)
@Table(name = "tb_user") //指定和哪个数据表对应，如果没有指定，默认表名就是user(类名小写)
public class User {
    @Id //这时一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自增
    private Integer id;

    @Column(name="last_name",length = 50) //这是和数据表对应的一个列
    private String lastName;

    @Column //省略默认列名就是属性名
    private String email;

}
