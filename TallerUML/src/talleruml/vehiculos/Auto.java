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
public class Auto extends Vehiculo{
    private String marca;
    public Auto(String marca,String numeroRegistro, String capacidadMotor, Date proxFechaPrueba) {
        super(numeroRegistro, capacidadMotor, proxFechaPrueba);
        this.marca=marca;
    }
    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
