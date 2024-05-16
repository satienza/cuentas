/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Create a current account. Allows to make movements and consult the balance.
 * @version 1.0
 * @author satienza
 */
public class CCuenta {
    
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
     * @param nom Account user name
     * @param cue Account number
     * @param sal Account balance
     * @param tipo Account interest rate
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Returns the user name
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the user name
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Returns the account number
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Set the account number
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Returns the account amount
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Set the account amount
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Return the interest rate
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Set the interest rate
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Return the account status (amount)
     * @see #getSaldo() 
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Withdraw from the account
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
     * Deposit into the account
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
