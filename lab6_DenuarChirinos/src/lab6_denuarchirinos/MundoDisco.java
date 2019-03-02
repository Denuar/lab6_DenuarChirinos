/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_denuarchirinos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Denuar
 */
public class MundoDisco {
    String nombreTortuga;
    ArrayList <Criatura> criaturas = new ArrayList();
    File archivo = null;
    ArrayList <MundoDisco> mundos = new ArrayList();

    public MundoDisco(String direccion) {
        archivo = new File(direccion);
    }    

    public String getNombreTortuga() {
        return nombreTortuga;
    }

    public void setNombreTortuga(String nombreTortuga) {
        this.nombreTortuga = nombreTortuga;
    }

    public ArrayList<Criatura> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criatura> criaturas) {
        this.criaturas = criaturas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<MundoDisco> getMundos() {
        return mundos;
    }

    public void setMundos(ArrayList<MundoDisco> mundos) {
        this.mundos = mundos;
    }

    @Override
    public String toString() {
        return "MundoDisco{" + "nombreTortuga=" + nombreTortuga + ", criaturas=" + criaturas + ", archivo=" + archivo + ", mundos=" + mundos + '}';
    }
        
    //Crear credenciales:
    public void crearCredenciales(String user, String pass, int llave) throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(archivo, false);//reemplaza el contenido ya existente
            bw = new BufferedWriter(fw);            
            bw.write(user + ";");
            bw.write(pass + ";");
            bw.write(llave + ";");
            bw.flush();
        }catch(Exception e){
            e.getStackTrace();
        }
        bw.close();
        fw.close();
    }//fin crearCredenciales
    
    //agregar criaturas
    public void agregarCriatura() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            //:bw = new BufferedWriter(new FileWriter(archivo,false));
            Criatura c = new Criatura();
            for (int i = 0; i < criaturas.size(); i++) {
                bw.write(criaturas.get(i).getNombre()+ ";");
                bw.write(criaturas.get(i).getCantEnergia()+ ";");
                bw.write(criaturas.get(i).getCantEspecies()+ ";");
                bw.write(criaturas.get(i).getRegion()+ ";");
                bw.write(criaturas.get(i).getAños()+ ";");

                for (int j=0; j<criaturas.get(i).getObjetos().size(); j++){
                    bw.write(criaturas.get(i).getObjetos().get(j) + "-");
                }
                bw.write(";\n");
            }//fin for
            bw.flush();
        }catch(Exception e){
            e.getStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void modificarCriatura() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            //:bw = new BufferedWriter(new FileWriter(archivo,false));
            Criatura c = new Criatura();
            for (int i = 0; i < criaturas.size(); i++) {
                bw.write(criaturas.get(i).getNombre()+ ";");
                bw.write(criaturas.get(i).getCantEnergia()+ ";");
                bw.write(criaturas.get(i).getCantEspecies()+ ";");
                bw.write(criaturas.get(i).getRegion()+ ";");
                bw.write(criaturas.get(i).getAños()+ ";");

                for (int j=0; j<criaturas.get(i).getObjetos().size(); j++){
                    bw.write(criaturas.get(i).getObjetos().get(j) + "-");
                }
                bw.write(";\n");
            }//fin for
            bw.flush();
        }catch(Exception e){
            e.getStackTrace();
        }
        bw.close();
        fw.close();
    }  
    public void eliminarCriaturas() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            //:bw = new BufferedWriter(new FileWriter(archivo,false));
            bw.write("null\n");
            bw.flush();
        }catch(Exception e){
            e.getStackTrace();
        }
        bw.close();
        fw.close();
    }  
}
