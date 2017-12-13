package my.javaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// класс установки соединения с БД mysql 
public class MyDBConnection {
    String host,database,userlogin,password;
    private Connection myConnection;
  
    /** Creates a new instance of MyDBConnection */
    public MyDBConnection(String phost, String pdatabase, String puserlogin, String ppassword ) {
        host=phost;
        database=pdatabase;
        userlogin=puserlogin;
        password=ppassword;
    }
    /*создание соединения с бд. В данном примере БД расположена на localhost (указать сервер размещения)
    имя пользователя: root (указать свое имя)
    пароль: **** (указать свой пароль)
    название БД: javacp (указать название БД)
    */
    public void init(){
    
       try{
        
        Class.forName("com.mysql.jdbc.Driver");
        myConnection=DriverManager.getConnection(
                "jdbc:mysql://"+host+"/"+database,userlogin,password
                );
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }
    
    //фукнция возвращения соединения
    public Connection getMyConnection(){
        return myConnection;
    }
    
    //функция закрытия соединения
    public void close(ResultSet rs){      
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        }
    }
    
     public void close(java.sql.Statement stmt){      
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){} 
        }
    }
    
    // функция уничтожения соединения
    public void destroy(){
    if(myConnection !=null){
         try{
               myConnection.close();
            }
            catch(Exception e){}         
    }
  }
    
}

