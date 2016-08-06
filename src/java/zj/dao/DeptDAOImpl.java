/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.dao;
import zj.vo.Dept;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.*;

/**
 *
 * @author blocks
 */
public class DeptDAOImpl implements IDEPTDAO{
    
    private Connection conn=null;
    private PreparedStatement pstmt=null;
    
    public DeptDAOImpl(Connection conn)
    {
        this.conn=conn;
    }
    
    
    
    
    public List<Dept> getAll()throws Exception
            
    {
        String sql="select * from dept";
        pstmt=conn.prepareStatement(sql);
        
        ResultSet rs=pstmt.executeQuery();
        
        List<Dept> dept=new LinkedList<Dept>();
        
        while(rs.next())
        {
            Dept dep=new Dept();
            dep.setDeptno(rs.getInt("depno"));
            dep.setDname(rs.getString("dname"));
            dep.setLoc(rs.getString("loc"));
            
            dept.add(dep);
            
        }
        
        if(rs!=null)
        {
            rs.close();
        }
        
        if(pstmt!=null)
        {
            pstmt.close();
        }
        
        return dept;
    }
    
    public Dept getById(int id) throws Exception
    {
        String sql="select * from dept where depno=?";
        
        pstmt=conn.prepareStatement(sql);
        
        pstmt.setInt(1, id);
        
        ResultSet rs=pstmt.executeQuery();
        
        Dept dep=new Dept();
        
        if(rs.next())
        {
            dep.setDeptno(id);
            dep.setDname(rs.getString("dname"));
            dep.setLoc(rs.getString("loc"));
        }
        
        if(rs!=null)
        {
            rs.close();
        }
        
        if(pstmt!=null)
        {
            pstmt.close();
        }
        
        return dep;
        
    }
}
