/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_poo;

/**
 *
 * @author XiusAM
 */
// Archivo: src/main/java/com/tallerpoo/Teleferico.java

/**
 * Teleferico: tarifa base + costo por km (o por estación).
 */
public class Teleferico implements SistemaTarifario {

    private static final double TARIFA_BASE = 1000.0;
    private static final double COSTO_POR_KM = 500.0;

    @Override
    public double calcularTarifa(double distancia) {
        // Ejemplo: 1000 + 500 * distancia
        return TARIFA_BASE + COSTO_POR_KM * distancia;
    }

    @Override
    public void mostrarRuta() {
        System.out.println("Ruta de conexión veredal (base $1000 COP)");
    }
}
