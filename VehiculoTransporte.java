/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciovehiculos;

public class VehiculoTransporte extends Vehiculo {

    public VehiculoTransporte(String marca, String modelo, double valorComercial) {
        super(marca, modelo, valorComercial);
    }

    @Override
    public double calcularCosto() {

        if (marca.equalsIgnoreCase("Hyundai")) {
            return valorComercial + (valorComercial * 0.01);
        }

        return valorComercial;
    }
}
