/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backservice.Infra;

import java.sql.Connection;

/**
 *
 * @author lincoln
 */
public interface JDBCConnect {
    
    public Connection getConnection();
    public void close();
    
    public void commit();
    
    public void rollback();
    
}
