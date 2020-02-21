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
public class tutores extends cuentas{
    private String clases;
    private int ganancia;
    private ArrayList tutodad=new ArrayList();
    private int nivelens;

    public tutores(String clases, int ganancia, int nivelens, String nombre, String edad, String carrera, String lugar_nac, String num_cuen, String usuario, String pass) {
        super(nombre, edad, carrera, lugar_nac, num_cuen, usuario, pass);
        this.clases = clases;
        this.ganancia = ganancia;
        this.nivelens = nivelens;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    public ArrayList getTutodad() {
        return tutodad;
    }

    public void setTutodad(ArrayList tutodad) {
        this.tutodad = tutodad;
    }

    public int getNivelens() {
        return nivelens;
    }

    public void setNivelens(int nivelens) {
        this.nivelens = nivelens;
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
        return "tutores" + "clases=" + clases + ", ganancia=" + ganancia + ", tutodad=" + tutodad + ", nivelens=" + nivelens;
    }
    
    
}
