/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.connectmsaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HH137
 */
public class ConnectMsAccess {

    public static Connection conn(){
    
    try{
        String url = "jdbc:ucanaccess://C://Users//dell i7 4th gen//Desktop//NetBeansProjects//ConnectMsAccess//db//DatabaseGaviola.accdb";
        
        Connection conn =  DriverManager.getConnection(url);
        return conn;
    }
    catch (SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }
        return null;
    }
}
