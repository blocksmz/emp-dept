/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.dao;
import zj.vo.Dept;
import zj.vo.Emp;
import java.util.*;
/**
 *
 * @author blocks
 */
public interface IEMPDAO {
    
    public boolean doInsert(Emp emp) throws Exception;
    
//    public boolean doUpdate(Emp emp) throws Exception;
//    
//    public List<Emp> getAll() throws Exception;
//    
//    public List<Emp> getByDepno(int depno)throws Exception;
    public Emp getById(int id)throws Exception;
    
    public boolean doUpdate(Emp emp) throws Exception;
    
    public List<Emp> getAll() throws Exception;
    
    public List<Emp> getByDepno(int no) throws Exception;
    
}
