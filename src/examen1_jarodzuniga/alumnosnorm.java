/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_jarodzuniga;

import java.util.ArrayList;

/**
 *
 * @author Rosa
 */
public class alumnosnorm extends alumnos{
    private int conoc;
    private int nivapre;
    private ArrayList<examanes> ex=new ArrayList();

    public alumnosnorm(int conoc, int nivapre,ArrayList ex, String nombre, String edad, String carrera, String lugar_nac, String num_cuen, String usuario, String pass) {
        super(nombre, edad, carrera, lugar_nac, num_cuen, usuario, pass);
        this.conoc = conoc;
        this.nivapre = nivapre;
    }

    public int getConoc() {
        return conoc;
    }

    public void setConoc(int conoc) {
        this.conoc = conoc;
    }

    public int getNivapre() {
        return nivapre;
    }

    public void setNivapre(int nivapre) {
        this.nivapre = nivapre;
    }

    public ArrayList<examanes> getEx() {
        return ex;
    }

    public void setEx(ArrayList<examanes> ex) {
        this.ex = ex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugar_nac() {
        return lugar_nac;
    }

    public void setLugar_nac(String lugar_nac) {
        this.lugar_nac = lugar_nac;
    }

    public String getNum_cuen() {
        return num_cuen;
    }

    public void setNum_cuen(String num_cuen) {
        this.num_cuen = num_cuen;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "alumnosnorm{" + "conoc=" + conoc + ", nivapre=" + nivapre + ", ex=" + ex + '}';
    }
    
}
