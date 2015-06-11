/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author alum.fial1
 */
public class Conexion {
    private static Connection cx = null;
    private static final String url ="jdbc:mysql://localhost:3306/bd_almacen";
    private static final String user ="root";
    private static final String pass ="root";
    private static final String driver ="com.mysql.jdbc.Driver";
    
    public static Connection getConexion() throws SQLException{
        try {
            Class.forName(driver);
            if(cx==null){
               cx = DriverManager.getConnection(url, user, pass);
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return cx;
    }
}
