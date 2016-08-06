/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.factory;
import zj.dao.EmpDAOProxy;

/**
 *
 * @author blocks
 */
public class IEmpDAOFactory {
    public static EmpDAOProxy getConnection()
    {
        return new EmpDAOProxy();
    }
    
}
