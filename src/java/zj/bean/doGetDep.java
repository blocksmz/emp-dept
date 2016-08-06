/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.bean;
import zj.vo.Emp;
import zj.vo.Dept;
import zj.factory.IEmpDAOFactory;
import zj.factory.IDeptDAOFactory;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blocks
 */
public class doGetDep {
    
    private double highest=0;
    private double lowest=0;
    private double average=0;
    private int sum=0;
    private int depno;
    private String depname;
    private String deploc;
    private List<Emp> emp;
    
    public void getDepDetail(int depno)
    {
        try {
            try {
                emp=IEmpDAOFactory.getConnection().getByDepno(depno);
                
                Iterator<Emp> iter=emp.iterator();
                
                double tmpSum=0;
                while(iter.hasNext())
                {
                    Emp now=iter.next();
                    
                    if(getHighest()==0)
                    {
                        setHighest(now.getSal());
                    }
                    else if(highest<now.getSal())
                    {
                        highest=now.getSal();
                    }
                    
                    if(lowest==0)
                    {
                        lowest=now.getSal();
                    }
                    else if(lowest>now.getSal())
                    {
                        lowest=now.getSal();
                    }
                    
                    tmpSum+=now.getSal();
                    sum+=1;
                }
                
                average=tmpSum/sum;
                
            } catch (Exception ex) {
                Logger.getLogger(doGetDep.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Dept dep;
            dep=IDeptDAOFactory.getConnection().getById(depno);
            
            this.depno=depno;
            this.depname=dep.getDname();
            this.deploc=dep.getLoc();
            
        } catch (Exception ex) {
            Logger.getLogger(doGetDep.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * @return the highest
     */
    public double getHighest() {
        return highest;
    }

    /**
     * @param highest the highest to set
     */
    public void setHighest(double highest) {
        this.highest = highest;
    }

    /**
     * @return the lowest
     */
    public double getLowest() {
        return lowest;
    }

    /**
     * @param lowest the lowest to set
     */
    public void setLowest(double lowest) {
        this.lowest = lowest;
    }

    /**
     * @return the average
     */
    public double getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(double average) {
        this.average = average;
    }

    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    public void setSum(int sum) {
        this.sum = sum;
    }

    /**
     * @return the depno
     */
    public int getDepno() {
        return depno;
    }

    /**
     * @param depno the depno to set
     */
    public void setDepno(int depno) {
        this.depno = depno;
    }

    /**
     * @return the depname
     */
    public String getDepname() {
        return depname;
    }

    /**
     * @param depname the depname to set
     */
    public void setDepname(String depname) {
        this.depname = depname;
    }

    /**
     * @return the deploc
     */
    public String getDeploc() {
        return deploc;
    }

    /**
     * @param deploc the deploc to set
     */
    public void setDeploc(String deploc) {
        this.deploc = deploc;
    }


    
    
}
