/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.dao;
import zj.vo.Emp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.*;

/**
 *
 * @author blocks
 */
import zj.vo.Emp;
public class EmpDAOImpl implements IEMPDAO{
    
    private Connection conn=null;
    private PreparedStatement pstmt=null;
    
    public EmpDAOImpl(Connection conn)
    {
        this.conn=conn;
        
    }
    
    
    public boolean doInsert(Emp emp) throws Exception
    {
        boolean flag=false;
        Emp temp=new Emp();
        temp.setEmpno(emp.getEmpno());
        temp.setEname(emp.getEname());
        temp.setJob(emp.getJob());
        temp.setHiredate(emp.getHiredate());
        temp.setMgr(emp.getMgr());
        temp.setDeptno(emp.getDeptno());
        temp.setSal(emp.getSal());
        temp.setComm(emp.getComm());
        temp.setPhoto(emp.getPhoto());
        temp.setNote(emp.getNote());
        
        String sql="insert into emp(empno,ename,job,hiredate,sal,comm,mgr,deptno,photo,note)"
                +"values(?,?,?,?,?,?,?,?,?,?)";
        
        pstmt=conn.prepareStatement(sql);
        
        pstmt.setInt(1, emp.getEmpno());
        pstmt.setString(2, emp.getEname());
        pstmt.setString(3, emp.getJob());
        pstmt.setString(4,emp.getHiredate());
        pstmt.setDouble(5,emp.getSal());
        pstmt.setDouble(6, emp.getComm());
        pstmt.setInt(7, emp.getMgr());
        pstmt.setInt(8, emp.getDeptno());
        pstmt.setString(9, emp.getPhoto());
        pstmt.setString(10, emp.getNote());
        
        if(pstmt.executeUpdate()>0)
        {
            flag=true;
        }
        
        pstmt.close();
        
        return flag;
    }
        
    
    public Emp getById(int id) throws Exception
    {
        String sql="select * from emp where empno=?";
        
        pstmt=conn.prepareStatement(sql);
        
        pstmt.setInt(1, id);
        
        ResultSet rs=pstmt.executeQuery();
        
        Emp emp=new Emp();
        
        while(rs.next())
        {
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setJob(rs.getString("job"));
            emp.setHiredate(rs.getString("hiredate"));
            emp.setSal(rs.getDouble("sal"));
            emp.setComm(rs.getDouble("comm"));
            emp.setMgr(rs.getInt("mgr"));
            emp.setDeptno(rs.getInt("deptno"));
            emp.setPhoto(rs.getString("photo"));
            emp.setNote(rs.getString("note"));
        }
        
        if(rs!=null)
        {
            rs.close();
        }
        if(pstmt!=null)
        {
            pstmt.close();
        }
        
        return emp;
        
    }
    

    public boolean doUpdate(Emp emp) throws Exception
    {
        boolean flag=false;
        Emp temp=new Emp();
        temp.setEmpno(emp.getEmpno());
        temp.setEname(emp.getEname());
        temp.setJob(emp.getJob());
        temp.setHiredate(emp.getHiredate());
        temp.setMgr(emp.getMgr());
        temp.setDeptno(emp.getDeptno());
        temp.setSal(emp.getSal());
        temp.setComm(emp.getComm());
        temp.setPhoto(emp.getPhoto());
        temp.setNote(emp.getNote());
        
        String sql="update emp set ename=?,job=?,hiredate=?,sal=?,comm=?,mgr=?,deptno=?,photo=?,note=? where empno=?";
    
        pstmt=conn.prepareStatement(sql);
        
        pstmt.setInt(10, emp.getEmpno());
        pstmt.setString(1, emp.getEname());
        pstmt.setString(2, emp.getJob());
        pstmt.setString(3,emp.getHiredate());
        pstmt.setDouble(4,emp.getSal());
        pstmt.setDouble(5, emp.getComm());
        pstmt.setInt(6, emp.getMgr());
        pstmt.setInt(7, emp.getDeptno());
        pstmt.setString(8, emp.getPhoto());
        pstmt.setString(9, emp.getNote());
        
        if(pstmt.executeUpdate()>0)
        {
            flag=true;
        }
        
        pstmt.close();
        
        return flag;
        
        
        
    }
    
    public List<Emp> getAll() throws Exception
    {
        List<Emp> cont=new LinkedList<Emp>();
        
        String sql="select * from emp";
        
        pstmt=conn.prepareStatement(sql);

        ResultSet rs=pstmt.executeQuery();
        
        
        
        while(rs.next())
        {
            Emp emp=new Emp();
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setJob(rs.getString("job"));
            emp.setHiredate(rs.getString("hiredate"));
            emp.setSal(rs.getDouble("sal"));
            emp.setComm(rs.getDouble("comm"));
            emp.setMgr(rs.getInt("mgr"));
            emp.setDeptno(rs.getInt("deptno"));
            emp.setPhoto(rs.getString("photo"));
            emp.setNote(rs.getString("note"));
            
            cont.add(emp);
        }
        
        if(rs!=null)
        {
            rs.close();
        }
        if(pstmt!=null)
        {
            pstmt.close();
        }
        
        return cont;
    }
    
     public List<Emp> getByDepno(int no) throws Exception
     {
         String sql="select * from emp where deptno=?";
        
        pstmt=conn.prepareStatement(sql);
        
        pstmt.setInt(1, no);
        
        ResultSet rs=pstmt.executeQuery();
        
        List<Emp> emp=new LinkedList<Emp>();
        
        while(rs.next())
        {
            Emp temp=new Emp();
            temp.setEmpno(rs.getInt("empno"));
            temp.setEname(rs.getString("ename"));
            temp.setJob(rs.getString("job"));
            temp.setHiredate(rs.getString("hiredate"));
            temp.setSal(rs.getDouble("sal"));
            temp.setComm(rs.getDouble("comm"));
            temp.setMgr(rs.getInt("mgr"));
            temp.setDeptno(rs.getInt("deptno"));
            temp.setPhoto(rs.getString("photo"));
            temp.setNote(rs.getString("note"));
            emp.add(temp);
        }
        
        if(rs!=null)
        {
            rs.close();
        }
        if(pstmt!=null)
        {
            pstmt.close();
        }
        
        return emp;
        
         
         
         
     }
    
}
