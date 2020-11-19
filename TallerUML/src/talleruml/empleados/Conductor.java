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
public class Conductor extends Permanente{
   private String licencia;

    public Conductor(String licencia, String seguroSocial, double salario, String referencia, String nombre, Date fechaNacimiento, String direccion) {
        super(seguroSocial, salario, referencia, nombre, fechaNacimiento, direccion);
        this.licencia = licencia;
    }
    //Getters and Setters
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
   
    
}
