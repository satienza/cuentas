/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author satienza
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Saldo de la cuenta
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Retirar dinero de la cuenta
     * @param cantidad 
     */
    public void retirar(double cantidad)
    {
        try {
            System.out.println("Retiro en cuenta:" + cantidad);
            if (cantidad <= 0)
                throw new Exception ("No se puede retirar una cantidad negativa");
            if (estado()< cantidad)
                throw new Exception ("No se hay suficiente saldo");
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * Ingresar dineero en la cuenta
     * @param cantidad 
     */
    public void ingresar(double cantidad)
    {
        try {
            System.out.println("Ingreso en cuenta:" + cantidad);
            if (cantidad<0)
                throw new Exception("No se puede ingresar una cantidad negativa");
            setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
