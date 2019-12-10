package com.imooc.repository;

import com.imooc.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄查询;方法名不能乱写
    public List<Girl> findByAge(Integer age);
}
