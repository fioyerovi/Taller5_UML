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
public class Remolque {
    private int numRemolque;
    private float capacidadCarga;
    private Date fechaSErvicio;

    public Remolque(int numRemolque, float capacidadCarga, Date fechaSErvicio) {
        this.numRemolque = numRemolque;
        this.capacidadCarga = capacidadCarga;
        this.fechaSErvicio = fechaSErvicio;
    }
    public void AsignarAUnCamion(Camion camion){
        //Comprobar que al camion tiene capacidad para este remolque
        //Asignarle el remolque al camion si tiene capacidad suficiente
    }
    
    //Getters and Setters

    public int getNumRemolque() {
        return numRemolque;
    }

    public void setNumRemolque(int numRemolque) {
        this.numRemolque = numRemolque;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Date getFechaSErvicio() {
        return fechaSErvicio;
    }

    public void setFechaSErvicio(Date fechaSErvicio) {
        this.fechaSErvicio = fechaSErvicio;
    }
    
}
