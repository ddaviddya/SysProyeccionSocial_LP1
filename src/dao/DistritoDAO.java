/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import dto.Distrito;
import interfaces.DistritoInterface;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alum.fial1
 */
public class DistritoDAO implements DistritoInterface{
    private Statement st;
    private ResultSet rs;
    private String sql;
    private Connection cx;
    @Override
    public List<Distrito> listarDistrito() {
       sql = "SELECT *FROM distrito";
       List<Distrito> lista = new ArrayList<>();
        try {
            //cx = 
        } catch (Exception e) {
        }
        return lista;
    }
    
}
