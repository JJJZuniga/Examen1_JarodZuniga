
package examen1_jarodzuniga;

import javax.swing.JTextField;


public class tutorias {
    private String hora, aula, dia, clase, mes, año, tema ,tutor , alumnos ;

    public tutorias(String hora, String aula, String dia, String clase, String mes, String año, String tema, String tutor, String alumnos) {
        this.hora = hora;
        this.aula = aula;
        this.dia = dia;
        this.clase = clase;
        this.mes = mes;
        this.año = año;
        this.tema = tema;
        this.tutor = tutor;
        this.alumnos = alumnos;
    }

    tutorias(JTextField tx_hora, String text, Object selectedItem, String text0, String text1, String text2, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "tutorias{" + "hora=" + hora + ", aula=" + aula + ", dia=" + dia + ", clase=" + clase + ", mes=" + mes + ", a\u00f1o=" + año + ", tema=" + tema + ", tutor=" + tutor + ", alumnos=" + alumnos + '}';
    }
    
}
