/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_jarodzuniga;

/**
 *
 * @author Rosa
 */
public class cuentas {
    protected String nombre;
    protected String edad;
    protected String carrera;
    protected String lugar_nac;
    protected String num_cuen;
    protected String usuario;
    protected String pass;

    public cuentas(String nombre, String edad, String carrera, String lugar_nac, String num_cuen, String usuario, String pass) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.lugar_nac = lugar_nac;
        this.num_cuen = num_cuen;
        this.usuario = usuario;
        this.pass = pass;
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
        return "cuentas" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", lugar_nac=" + lugar_nac + ", num_cuen=" + num_cuen + ", usuario=" + usuario + ", pass=" + pass ;
    }
    
    
}
