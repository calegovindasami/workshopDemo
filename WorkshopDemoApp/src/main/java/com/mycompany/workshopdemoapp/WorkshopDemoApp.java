/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.workshopdemoapp;

import java.util.ArrayList;

/**
 *
 * @author caleg
 */
public class WorkshopDemoApp {

    public static void main(String[] args) {
        ArrayList<Student> arrays = new ArrayList<>();
        arrays.add(new Student("Test", "123"));
        System.out.println(arrays.get(0).getUsername());
        
    }
}