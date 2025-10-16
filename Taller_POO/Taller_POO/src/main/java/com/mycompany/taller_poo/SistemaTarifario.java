/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.taller_poo;

/**
 *
 * @author XiusAM
 */


/**
 * Interfaz simple: define lo que cualquier vehículo debe tener.
 */
public interface SistemaTarifario {
    // Calcula la tarifa según la distancia (puede ser km o estaciones).
    double calcularTarifa(double distancia);

    // Muestra por consola la ruta o una descripción del vehículo.
    void mostrarRuta();
}

