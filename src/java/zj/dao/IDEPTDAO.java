/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.dao;
import zj.vo.Dept;
import java.util.*;

/**
 *
 * @author blocks
 */
public interface IDEPTDAO {
    
    public List<Dept> getAll()throws Exception;

    public Dept getById(int id) throws Exception;
}
