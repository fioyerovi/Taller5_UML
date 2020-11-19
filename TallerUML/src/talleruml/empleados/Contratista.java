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
public class Contratista extends Empleado {
    private String nombreEmpres;
    private Date fechaInnicio;
    private double duracion;

    public Contratista(String nombreEmpres, Date fechaInnicio, double duracion, String nombre, Date fechaNacimiento, String direccion) {
        super(nombre, fechaNacimiento, direccion);
        this.nombreEmpres = nombreEmpres;
        this.fechaInnicio = fechaInnicio;
        this.duracion = duracion;
    }
    //Getters and Setters

    public String getNombreEmpres() {
        return nombreEmpres;
    }

    public void setNombreEmpres(String nombreEmpres) {
        this.nombreEmpres = nombreEmpres;
    }

    public Date getFechaInnicio() {
        return fechaInnicio;
    }

    public void setFechaInnicio(Date fechaInnicio) {
        this.fechaInnicio = fechaInnicio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
}
