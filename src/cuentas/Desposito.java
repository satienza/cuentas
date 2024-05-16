/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

/**
 *
 * @author satienza
 */
public class Desposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        CCuenta miCuenta;
        double saldoActual;
        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );
            operaciones(miCuenta);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    /**
     * 
     * @param miCuenta 
     */
    public static void operaciones(CCuenta miCuenta) {
        // Operaciones de ingreso y retiro
        miCuenta.retirar(2300);
        miCuenta.ingresar(685);
    }
    
}
