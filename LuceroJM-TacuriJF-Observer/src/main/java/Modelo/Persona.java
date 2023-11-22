/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author venot
 */
public class Persona implements IObserver{
    private String name;

    public Persona(String name) {
        this.name = name;
    }
    
    
    
    @Override
    public String actualizar(int temperatura) {
        
        return name +" la temperatura actual es de "+ temperatura;
    }
    
}
