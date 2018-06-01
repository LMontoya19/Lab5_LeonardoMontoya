/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_leonardomontoya;

import java.util.ArrayList;

/**
 *
 * @author Inspiron
 */
public class MundoDisco {
    private String nombre;
    private ArrayList<criatura> lista = new ArrayList();
    private int peso;

    public MundoDisco(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
