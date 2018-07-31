/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractoGarrafones;

/**
 *
 * @author Nincub
 */
public abstract class Garrafon {
    private String marca;
    private int capacidad;

//    protected Garrafon() {
//    }
//
//    protected Garrafon(String marca, int capacidad) {
//        this.marca = marca;
//        this.capacidad = capacidad;
//    }
    
    public abstract void Gritar (); 
    

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
