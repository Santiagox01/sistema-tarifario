/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller_poo;

/**
 *
 * @author XiusAM
 */
public class App {
    public static void main(String[] args) {
        // Creamos un bus y un teleférico
        SistemaTarifario miBus = new BusArticulado();
        SistemaTarifario miTeleferico = new Teleferico();

        // Procesamos dos viajes (ejemplos)
        CentralDeControl.procesarViaje(miBus, 5);        // 5 km (no afecta al bus)
        CentralDeControl.procesarViaje(miTeleferico, 2); // 2 km -> 1000 + 500*2 = 2000
    }
}
