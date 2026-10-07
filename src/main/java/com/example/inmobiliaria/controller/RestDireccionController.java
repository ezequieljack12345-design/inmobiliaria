/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.inmobiliaria.controller;

import com.example.inmobiliaria.entity.Direccion;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UsuarioM
 */
@RestController
@RequestMapping("inmobiliaria")
public class RestDireccionController {
    
       List<Direccion> direccionlist;
       
       @PostConstruct
       public void data() {
           direccionlist = new ArrayList<>();
           
            direccionlist.add(new Direccion("Barcelona","08030",1,"Passeig de gracia",1));
            direccionlist.add (new Direccion("Barcelona","08043",2,"Plaza espanya",2));
           
             
       }
 @GetMapping("/Direccion")
 public List<Direccion> ListDireccion() {
     
     return direccionlist;
 }
 @GetMapping("/Direccion/{direccionId}")
 public Direccion getDireccion (@PathVariable int direccionId) {
     
     for(Direccion direccion: this.direccionlist) {
         if(direccion.getId() == direccionId) {
             return direccion;
         }
     }
          return null;
 }
 
  
}

