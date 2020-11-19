/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package talleruml.vehiculos;

import java.util.ArrayList;

/**
 *
 * @author fioye
 */
public class Fabricante {
    private String nombre;
    private String codFabricante;

    public Fabricante(String nombre,String codigo) {
        this.nombre = nombre;
        this.codFabricante=codigo;
        
    }
    
    
    public void agregarVehiculoFabricado(Vehiculo vehiculo){
        //Asignarle a este fabricante otro vehiculo que el a fabricado
        
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodFabricante() {
        return codFabricante;
    }

    public void setCodFabricante(String codFabricante) {
        this.codFabricante = codFabricante;
    }

    
    
}
