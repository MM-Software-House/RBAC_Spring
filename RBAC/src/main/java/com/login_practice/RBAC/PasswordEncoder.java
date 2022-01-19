/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login_practice.RBAC;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Dhanuaji Pratama
 * This Class Just For Generate ByCrypt Password
 */
public class PasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String pass = "slipkinot123";
        String passGenerate = bCryptPasswordEncoder.encode(pass);
        
        System.out.println(passGenerate);
    }
}
