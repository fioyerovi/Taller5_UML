package talleruml.vehiculos;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author fioye
 */
public class Furgoneta extends VehiculoCarga{
    private float pesoSinCarga;
    private float capacidadCarga;

    public Furgoneta(float pesoSinCarga, float capacidadCarga, float pesoCragado, String numeroRegistro, String capacidadMotor, Date proxFechaPrueba) {
        super(pesoCragado, numeroRegistro, capacidadMotor, proxFechaPrueba);
        this.pesoSinCarga = pesoSinCarga;
        this.capacidadCarga = capacidadCarga;
    }
    
    //Getters and Setters

    public float getPesoSinCarga() {
        return pesoSinCarga;
    }

    public void setPesoSinCarga(float pesoSinCarga) {
        this.pesoSinCarga = pesoSinCarga;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
}
