/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backservice.Restful.View.users;

import Backservice.Controller.UsuariosController;
import Model.Usuarios;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author lincoln
 */

@Path("usuarios")
public class UsuariosViews {
    private final UsuariosController usercontroller = new UsuariosController();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
     public List<Usuarios> listarusuarios(){
         
         
         
         List<Usuarios> list = this.usercontroller.getUsers();
   
                
         
         return list;
         
         
     }
     
     
     @POST
     @Consumes(MediaType.APPLICATION_JSON)
     @Path("/")
     public Response create(Usuarios user){
         
         System.out.println(this.usercontroller.salvarUsuarioController(user));
         return Response.status(Response.Status.OK).build();
         
         
     }
     
     
     
     
     
   
    
}

