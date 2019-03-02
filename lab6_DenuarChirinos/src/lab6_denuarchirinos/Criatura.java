/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_denuarchirinos;

import java.util.ArrayList;

/**
 *
 * @author Denuar
 */
public class Criatura {
    private String nombre, cantEnergia, años, region, cantEspecies;
    private ArrayList <String> objetos = new ArrayList();

    public Criatura() {
    }

    public Criatura(String nombre, String cantEnergia, String años, String region, String cantEspecies) {
        this.nombre = nombre;
        this.cantEnergia = cantEnergia;
        this.años = años;
        this.region = region;
        this.cantEspecies = cantEspecies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantEnergia() {
        return cantEnergia;
    }

    public void setCantEnergia(String cantEnergia) {
        this.cantEnergia = cantEnergia;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCantEspecies() {
        return cantEspecies;
    }

    public void setCantEspecies(String cantEspecies) {
        this.cantEspecies = cantEspecies;
    }

    public ArrayList<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<String> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return "Criatura{" + "nombre=" + nombre + ", cantEnergia=" + cantEnergia + ", a\u00f1os=" + años + ", region=" + region + ", cantEspecies=" + cantEspecies + ", objetos=" + objetos + '}';
    }
    
}
