package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.User;
@Repository
public interface IUserDao extends JpaRepository<User, Long>{
}
