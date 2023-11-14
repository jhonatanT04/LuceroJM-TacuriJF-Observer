/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author venot
 */
public class MonitoreoMet implements Sujeto{
    private int temperatuara;
    private List<IObserver> listaObserver = new ArrayList<>();
        
    public void actualizarTemp(int tempNueva){
        temperatuara = tempNueva;
        notificarObser();
    }
    
    
    
    
    @Override
    public void agregar(IObserver observador) {
        listaObserver.add(observador);
    }

    @Override
    public void delete(IObserver observer) {
        listaObserver.remove(observer);
    }

    @Override
    public void notificarObser() {
        for (IObserver iObserver : listaObserver) {
            
        }
    }
    
}
