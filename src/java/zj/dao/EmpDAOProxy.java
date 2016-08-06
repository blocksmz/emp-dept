/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.dao;
import java.util.List;
import zj.dbc.DatabaseConnection;
import zj.vo.Emp;

/**
 *
 * @author blocks
 */
public class EmpDAOProxy implements IEMPDAO{
    
    private DatabaseConnection dbc=null;
    private IEMPDAO dao=null;
    
    
    public EmpDAOProxy()
    {
        dbc=new DatabaseConnection();
        dao=new EmpDAOImpl(dbc.getConnection());
    }
    
    public boolean doInsert(Emp emp) throws Exception
    {
        boolean flag=false;
        if(dao!=null)
        {
            flag=dao.doInsert(emp);
        }
        
        if(dbc!=null)
        {
            dbc.close();
        }
        
        return flag;
        
    }
    
    public Emp getById(int id) throws Exception
    {
        Emp emp=new Emp();
        emp=dao.getById(id);
        
        if(dbc!=null)
        {
            dbc.close();
        }
        
        return emp;
    }
    
     public boolean doUpdate(Emp emp) throws Exception
     {
         boolean flag=false;
         flag=dao.doUpdate(emp);
         
         if(dbc!=null)
         {
             dbc.close();
         }
         
         return flag;
     }
     
     public List<Emp> getAll() throws Exception
     {
         List<Emp> cont;
         
         cont=dao.getAll();
         
         if(dbc!=null)
         {
             dbc.close();
         }
         
         return cont;
     }
     
     public List<Emp> getByDepno(int no) throws Exception
     {
         List<Emp> emp;
         emp=dao.getByDepno(no);
         
         if(dbc!=null)
         {
             dbc.close();
         }
         
         return emp;
     }
}
