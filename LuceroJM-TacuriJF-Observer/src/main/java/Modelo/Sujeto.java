/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author venot
 */
public interface Sujeto {
    void agregar(IObserver observador);
    void delete(IObserver observer);
    void notificarObser();
}
