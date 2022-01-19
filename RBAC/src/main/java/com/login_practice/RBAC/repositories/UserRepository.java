/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.login_practice.RBAC.repositories;

import com.login_practice.RBAC.entities.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dhanuaji Pratama
 */
@Repository
public interface UserRepository extends CrudRepository<Users, Integer>{    
    @Query(value = "SELECT * FROM users WHERE email = :email", nativeQuery = true)
    public Users getUserByEmail(@Param("email") String email);
}
