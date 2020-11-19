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
public class PersonalOficina  extends Permanente{
    private String cargo;

    public PersonalOficina(String cargo, String seguroSocial, double salario, String referencia, String nombre, Date fechaNacimiento, String direccion) {
        super(seguroSocial, salario, referencia, nombre, fechaNacimiento, direccion);
        this.cargo = cargo;
    }
    //Getters and Settters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
