package com.MobaApplication.Moba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MobaApplication.Moba.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
