/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciovehiculos;

/**
 *
 * @author salas
 */
public class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected double valorComercial;

    public Vehiculo(String marca, String modelo, double valorComercial) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorComercial = valorComercial;
    }

    public double calcularCosto() {
        return valorComercial;
    }
}