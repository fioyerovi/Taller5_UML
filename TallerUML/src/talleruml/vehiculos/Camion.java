/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package talleruml.vehiculos;

import java.util.Date;
import talleruml.empleados.Conductor;

/**
 *
 * @author fioye
 */
public class Camion extends VehiculoCarga{
    private int numRuedas;
    private double capacidadRemolque;
    private String gradoLicencia;

    public Camion(int numRuedas, double capacidadRemolque, String gradoLicencia, float pesoCragado, String numeroRegistro, String capacidadMotor, Date proxFechaPrueba) {
        super(pesoCragado, numeroRegistro, capacidadMotor, proxFechaPrueba);
        this.numRuedas = numRuedas;
        this.capacidadRemolque = capacidadRemolque;
        this.gradoLicencia = gradoLicencia;
    }
    public int ConsultarEspacioRemolque(){
        //Retornar cuantos remolques aqun se le pueden asignarle
        return 0;
    }
    
    public boolean VerificarConductorGradoLicencia(Conductor conductor){
        //Verificar si este conductor se le puede asignar este camion por su licencia
        return false;
    }
    //Getters and Setters

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public double getCapacidadRemolque() {
        return capacidadRemolque;
    }

    public void setCapacidadRemolque(double capacidadRemolque) {
        this.capacidadRemolque = capacidadRemolque;
    }

    public String getGradoLicencia() {
        return gradoLicencia;
    }

    public void setGradoLicencia(String gradoLicencia) {
        this.gradoLicencia = gradoLicencia;
    }
    
    
}
