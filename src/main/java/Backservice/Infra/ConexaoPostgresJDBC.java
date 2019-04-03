/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backservice.Infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lincoln
 */
public class ConexaoPostgresJDBC {
    
    private Connection connection =null;
    
    public ConexaoPostgresJDBC() throws SQLException, ClassNotFoundException {
        
         Class.forName("org.postgresql.Driver");

        Properties properties = new Properties();
        properties.put("user", "postgres");
        properties.put("password", "postgres");

        this.connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/EstoqueDB", properties);
        
    }


    
    
 
    
}
