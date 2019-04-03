/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backservice.Controller;

import Backservice.DAO.UsuarioDAO;
import Model.Usuarios;
import java.util.List;

/**
 *
 * @author lincoln
 */
public class UsuariosController {
    private final UsuarioDAO userdao = new UsuarioDAO();
    
    public int salvarUsuarioController(Usuarios user){
        
        
    Usuarios usuarios = (user.getUser_id() != null ) ?  this.getUser(user.getUser_id()) : null;

        
        if( usuarios == null ){
             return this.userdao.SalvarUsuarioDAO(user);
            
        } else {
//            update usuario
            if(this.userdao.updateUser(user)){
                System.err.println("fiz update");
                return 1;
            }else {
                return 0;
            }
            
        }
    }
        
        
        public int updateUsuario(Usuarios user){
        
        Usuarios usuarios = this.getUser(user.getUser_id());
        
        if(usuarios.getUser_id() == null){
             return this.userdao.SalvarUsuarioDAO(user);
            
        } else {
//            update usuario
            if(this.userdao.updateUser(user)){
                return 1;
            }else {
                return 0;
            }
            
        }
        
        
        
        
       
        
    }
    
    
    public List<Usuarios> getUsers(){
        return this.userdao.getAllUsers();
        
    }
    
    public boolean deleteUsuario(Usuarios usuarios){
        return this.userdao.deleteUser(usuarios);
        
        
        
    }
    
    public Usuarios getUser(int idUser){
        
        
        System.err.println("passei aqui tentando ");
        return this.userdao.getUser(idUser);
        
        
    }
    
    
}
