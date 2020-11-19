/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package talleruml.vehiculos;

import java.util.Date;
import talleruml.empleados.Empleado;

/**
 *
 * @author fioye
 */
public class VehiculoCarga extends Vehiculo{
    private float pesoCragado;

    public VehiculoCarga(float pesoCragado, String numeroRegistro, String capacidadMotor, Date proxFechaPrueba) {
        super(numeroRegistro, capacidadMotor, proxFechaPrueba);
        this.pesoCragado = pesoCragado;
    }
    public void AsignarUnEmpleadoPermanente(Empleado empleado){
        //Si es Camion verificar que su grado de licencia sea la necesaria
        //Si es furgoneta asignarle al empleado
    }
    //Getters and Setters 
    public float getPesoCragado() {
        return pesoCragado;
    }

    public void setPesoCragado(float pesoCragado) {
        this.pesoCragado = pesoCragado;
    }
    
}
