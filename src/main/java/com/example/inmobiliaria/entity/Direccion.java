/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.inmobiliaria.entity;

/**
 *
 * @author UsuarioM
 */
public class Direccion {

    public Direccion(String Provincia, String CP, int Numero, String calle, int id) {
        this.Provincia = Provincia;
        this.CP = CP;
        this.Numero = Numero;
        this.calle = calle;
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String Provincia;

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }


    private String CP;

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }


    private int Numero;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    
    private String calle;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    
}
