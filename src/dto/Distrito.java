/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author alum.fial1
 */
public class Distrito {
    private int idd;
    private int idregion;
    private String dist;

    public Distrito() {
    }

    public Distrito(int idregion, String dist) {
        this.idregion = idregion;
        this.dist = dist;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }
    
}
