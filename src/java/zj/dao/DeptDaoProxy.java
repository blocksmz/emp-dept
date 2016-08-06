/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.dao;
import java.sql.Connection;
import zj.vo.Dept;
import zj.dbc.DatabaseConnection;
import java.util.*;

/**
 *
 * @author blocks
 */
public class DeptDaoProxy {
    private DatabaseConnection dbc=null;
    private DeptDAOImpl dao=null;
    
    public DeptDaoProxy()
    {
        dbc=new DatabaseConnection();
        dao=new DeptDAOImpl(dbc.getConnection());
        
    }
    
    public List<Dept> getAll()throws Exception
    {
        List<Dept> dept=null;
        dept=dao.getAll();
        
        if(dbc!=null)
        {
            dbc.close();
        }
        
        return dept;
    }
    
     public Dept getById(int id) throws Exception
     {
         Dept dep;
         dep=dao.getById(id);
         
         if(dbc!=null)
         {
             dbc.close();
         }
         
         
         return dep;
     }
}
