/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.ejerciciovehiculos;

public class VehiculoParticular extends Vehiculo {

    public VehiculoParticular(String marca, String modelo, double valorComercial) {
        super(marca, modelo, valorComercial);
    }

    @Override
    public double calcularCosto() {

        if (valorComercial > 50000000) {
            return valorComercial + (valorComercial * 0.0005);
        }

        return valorComercial;
    }
}