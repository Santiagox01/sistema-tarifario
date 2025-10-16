/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_poo;

/**
 *
 * @author XiusAM
 */
public class CentralDeControl {

    // Este método recibe un "vehiculo" que cumple SistemaTarifario
    public static void procesarViaje(SistemaTarifario vehiculo, double km) {
        // 1) Mostrar la ruta (cada clase lo hace a su manera)
        vehiculo.mostrarRuta();

        // 2) Calcular la tarifa usando la implementación que toque
        double tarifa = vehiculo.calcularTarifa(km);

        // 3) Imprimir resultado simple
        System.out.println("Distancia: " + km + " -> Tarifa: $" + tarifa + " COP");
        System.out.println("-------------------------------");
    }
}