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
    
    
    public String salvarUsuarioController(Usuarios user){
        
    final String[] status = { "Não foi possivel salvar usuario", "Usuario salvo com Sucesso", "Email já cadastrado", "Usuario Atualizado com Sucesso"};    
    
    Usuarios usuarios = (user.getUser_id() != null ) ?  this.getUser(user.getUser_id()) : null;

        
    if(this.getEmail(user.getUser_email()).getUser_email() != null) {
        System.out.println("email retornado é  "+ this.getEmail(user.getUser_email()));
        return status[2];
    }
    
        else if(usuarios == null &&  user.getUser_id() == null){          
        this.userdao.SalvarUsuarioDAO(user);
        return status[1];

            } else {
    //            update usuario
                if(this.userdao.updateUser(user)){
                   return status[3];
                    }else {
                       return status[0];
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
   
   public Usuarios getEmail(String email){
        return this.userdao.getUseremail(email);          
    }
   
   
 }
