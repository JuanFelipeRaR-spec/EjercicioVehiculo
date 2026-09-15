/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciovehiculos;

public class EjercicioVehiculos {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = {
            new VehiculoParticular("Toyota", "Corolla", 60000000),
            new VehiculoParticular("Mazda", "3", 40000000),
            new VehiculoTransporte("Hyundai", "H1", 80000000),
            new VehiculoTransporte("Mercedes", "Sprinter", 90000000)
        };

        for (Vehiculo vehiculo : vehiculos) {

            System.out.println("Marca: " + vehiculo.marca);
            System.out.println("Modelo: " + vehiculo.modelo);
            System.out.println("Valor comercial: $" + vehiculo.valorComercial);
            System.out.println("Costo calculado: $" + vehiculo.calcularCosto());
            System.out.println("-----------------------------");
        }
    }
}