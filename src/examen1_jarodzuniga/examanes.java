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
public class examanes {
    private String clas;
    private int conreq;
    private String tem;
    private int punt;

    public examanes(String clas, int conreq, String tem, int punt) {
        this.clas = clas;
        this.conreq = conreq;
        this.tem = tem;
        this.punt = punt;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public int getConreq() {
        return conreq;
    }

    public void setConreq(int conreq) {
        this.conreq = conreq;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }

    @Override
    public String toString() {
        return "examanes{" + "clas=" + clas + ", conreq=" + conreq + ", tem=" + tem + ", punt=" + punt + '}';
    }
    
}
