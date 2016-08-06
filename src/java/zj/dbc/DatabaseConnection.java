/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.dbc;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author blocks
 */
public class DatabaseConnection {
    private String DBDRIVER="org.mariadb.jdbc.Driver";
    private String DBURL="jdbc:mariadb://localhost:3306/mldn";
    private String DBUSER="blocksmz";
    private String DBPASSWORD="MRZHAo0928";
    private Connection conn;
    
    public DatabaseConnection()
    {
        try
        {
            Class.forName(DBDRIVER);
            Connection con=DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
            
            this.conn=con;
            
            
        }catch(Exception e)
        {
            System.out.println("数据库连接出错");
            e.printStackTrace();
        }
    }
        public Connection getConnection()
        {
            return this.conn;
        }
        
        public void close()
        {
            try{
                
            if(this.conn!=null)
            {
                this.conn.close();
            }
            }
            catch(Exception e)
            {
                System.out.println("数据库关闭出错");
                e.printStackTrace();
            }
        }
    
    
}
