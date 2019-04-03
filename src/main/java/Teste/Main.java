/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Backservice.Controller.UsuariosController;
import Backservice.DAO.UsuarioDAO;
import Backservice.Infra.ConexaoPostgresJDBC;
import Backservice.Infra.HibernateUtil;
import Backservice.Infra.JDBCConnect;
import Model.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author lincoln
 */
public class Main {
    
    public static void main(String[] args) {

    UsuariosController controller = new UsuariosController();

        
        List<Usuarios> list = controller.getUsers(); 
        System.err.println(list);
                
         
//    UsuariosController controller = new UsuariosController();
//    
//        UsuarioDAO dao = new UsuarioDAO();
//        
//        Usuarios user = new Usuarios();
//        
//        user.setUser_email("user1");
//        
//        System.out.println(dao.getUseremail("user1"));
//    
//        Usuarios user = new Usuarios();
//        user.setUser_name("joao3df");
//        user.setUser_email("user91");
//        user.setUser_Senha("stongfdgg");
////        user.setUser_id();
//        
//        user.setUser_type(2);
//        
//            System.err.println("status "+ controller.salvarUsuarioController(user));
//        
//        
//        
    
    
    

//    List<Usuarios> users = controller.getUsers();
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i));
//        }
//        
//        Usuarios u = users.get(users.size()-1);
//
//        boolean r = controller.deleteUsuario(u);
//        if(r){
//            System.err.println("usuario "+ u.getUser_name()+" excluido com sucesso");
//        }
    



    }
}
             
//        Usuarios user = new Usuarios();
//        user.setUser_name("joaod");
//        user.setUser_Email("lincolf@lingcolnfd5");
//        user.setUser_Senha("stong");
//        user.setUser_type(2);
//        
//        UsuariosController controller = new UsuariosController();
//            System.err.println("usuario salvo "+ controller.salvarUsuarioController(user));
//        
//        
//        }

//       Session session = HibernateUtil.getSessionFactory().openSession();
//       session.beginTransaction();
//       String sql = "select version()";
//       
//       String result = (String) session.createNativeQuery(sql).getSingleResult();
//       System.out.println(result);
//       session.getTransaction().commit();
//       session.close();
//      
//            
//        }
//        }
//            
            
//    private final String url = "jdbc:postgresql://localhost/EstoqueDB";
//    private final String user = "postgres";
//    private final String password = "postgres";
// 
//    /**
//     * Connect to the PostgreSQL database
//     *
//     * @return a Connection object
//     */
//    public Connection connect() {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to the PostgreSQL server successfully.");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
// 
//        return conn;
//    }
// 
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Main app = new Main();
//        
//        Statement stmt = null;
//        
//        Connection c = app.connect();
//        try {
//            stmt = c.createStatement();
//           String h1 =  stmt.executeQuery("select version()").toString();
//           System.out.println(h1);
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    

