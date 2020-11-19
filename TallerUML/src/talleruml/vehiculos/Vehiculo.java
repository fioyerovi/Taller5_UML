/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package talleruml.vehiculos;

import java.util.Date;

/**
 *
 * @author fioye
 */
public class Vehiculo {
    private String numeroRegistro;
    private String capacidadMotor;
    private Date proxFechaPrueba;

    public Vehiculo(String numeroRegistro, String capacidadMotor, Date proxFechaPrueba) {
        this.numeroRegistro = numeroRegistro;
        this.capacidadMotor = capacidadMotor;
        this.proxFechaPrueba = proxFechaPrueba;
    }
    //Getters and Setters

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(String capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public Date getProxFechaPrueba() {
        return proxFechaPrueba;
    }

    public void setProxFechaPrueba(Date proxFechaPrueba) {
        this.proxFechaPrueba = proxFechaPrueba;
    }
    
}
