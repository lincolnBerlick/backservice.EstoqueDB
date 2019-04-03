/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author lincoln
 */

@Entity(name = "usuarios_db")
@Table(name = "Table_usuarios")
public class Usuarios implements Serializable {
    
    @Id
    @Column(name = "user_id")  
    @GeneratedValue(strategy=GenerationType.AUTO)   
    private Integer user_id;    
    
    private String user_name;
    
    @Column(name = "\"user_Senha\"")
    private String user_Senha;
    
    private String user_email;
  

    

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
    
    
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_Senha() {
        return user_Senha;
    }

    public void setUser_Senha(String user_Senha) {
        this.user_Senha = user_Senha;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }
    private int user_type;

    @Override
    public String toString() {
        return "Usuarios{" + "user_name=" + user_name + ", user_Senha=" + user_Senha + ", user_Email=" + user_email + ", user_id=" + user_id + ", user_type=" + user_type + '}';
    }

  
    
    
}
