/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.cat.indiketa.degiro.engine;

/**
 *
 * @author indiketa
 */
public interface Listener<T> {

    public void handle(T data);

}
