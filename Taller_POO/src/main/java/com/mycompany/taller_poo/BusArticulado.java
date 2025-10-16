/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_poo;

/**
 *
 * @author XiusAM
 */

/**
 * BusArticulado: tarifa fija. Ignora la distancia.
 */
public class BusArticulado implements SistemaTarifario {

    // Tarifa fija en pesos colombianos
    private static final double TARIFA_FIJA = 2950.0;

    @Override
    public double calcularTarifa(double distancia) {
        // No usamos 'distancia' porque es tarifa fija
        return TARIFA_FIJA;
    }

    @Override
    public void mostrarRuta() {
        System.out.println("Ruta troncal (tarifa fija: $2950 COP)");
    }
}

