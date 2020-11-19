/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package talleruml.empleados;

import java.util.Date;

/**
 *
 * @author fioye
 */
public class Permanente extends Empleado{
    private String seguroSocial;
    private double salario;
    private String referencia;

    public Permanente(String seguroSocial, double salario, String referencia, String nombre, Date fechaNacimiento, String direccion) {
        super(nombre, fechaNacimiento, direccion);
        this.seguroSocial = seguroSocial;
        this.salario = salario;
        this.referencia = referencia;
    }

    
    //Getters and Setters

    public String getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
}
