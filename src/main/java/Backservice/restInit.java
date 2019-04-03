/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backservice;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author lincoln
 */
@ApplicationPath("rest")
public class restInit extends ResourceConfig {
    public restInit(){
        packages("EstoqueDB.Backservice.Resful.View.users");
    }
    
    
}
