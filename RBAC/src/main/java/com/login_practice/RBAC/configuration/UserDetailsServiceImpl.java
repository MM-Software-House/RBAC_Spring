/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login_practice.RBAC.configuration;

import com.login_practice.RBAC.entities.Users;
import com.login_practice.RBAC.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Dhanuaji Pratama
 */
public class UserDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepository.getUserByEmail(username);
        if (users == null) {
            throw new UsernameNotFoundException("User Not Found!");
        }
        System.out.println("username : "+users.getEmail());
        System.out.println("role : "+users.getRolesList());
        System.out.println("active account : "+users.getIsActive());
        return new MyUserDetails(users);
    }
    
}
