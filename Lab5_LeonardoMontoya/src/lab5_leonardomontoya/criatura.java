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
public class criatura {
    private String raza;
    private int energia;
    private int maxanios;
    private String region;
    private int numespecies;
    private ArrayList<String> objetos;

    public criatura() {
    }

    public criatura(String raza, int energia, int maxanios, String region, int numespecies) {
        this.raza = raza;
        this.energia = energia;
        this.maxanios = maxanios;
        this.region = region;
        this.numespecies = numespecies;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getMaxanios() {
        return maxanios;
    }

    public void setMaxanios(int maxanios) {
        this.maxanios = maxanios;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumespecies() {
        return numespecies;
    }

    public void setNumespecies(int numespecies) {
        this.numespecies = numespecies;
    }

    public ArrayList<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<String> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return raza;
    }
    
}
