/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

/**
 *
 * @author Marta Lopez Nicolas
 *
 */
public class CCuenta {

    /**
     * Variable privada: Nombre de la cuenta
     */
    private String nombre;

    /**
     * Variable privada: Numero de cuenta en formato String
     */
    private String cuenta;

    /**
     * Variable privada: Saldo de la cuenta
     */
    private double saldo;

    /**
     * Variable privada: Tipo interes de la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor de clase sin argumentos
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom
     * @param sal
     * @param cue
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método para asignar el nombre del titular de la cuenta
     *
     * @param nom Nombre requerido para asignar el nombre a la cuenta
     */
    public void setNombre(String nom) {
        nombre = nom;
    }

    /**
     * Método que me devuelve el nombre del titular
     *
     * @return String devuelve el nombre del titula de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que me devuelve el saldo disponible en cada momento
     *
     * @return Double devuelve el saldo de la cuenta
     */
    public double getEstado() {
        return saldo;
    }

    /**
     * Método para ingresar cantidades en la cuenta.Modifica el saldo. Este
 método va a ser probado con Junit
     *
     * @param cantidad Cantidad requerida para modificar el saldo
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar cantidades en la cuenta.Modifica el saldo. Este
 método va a ser probado con Junit
     *
     * @param cantidad Cantidad requerida para modificar el saldo
     * @throws java.lang.Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Método que me devuelve el número de cuenta
     *
     * @return String devuelve el número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    
        public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
