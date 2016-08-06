/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zj.bean;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.*;
import java.util.*;
import zj.vo.Emp;
import zj.factory.IEmpDAOFactory;
import java.io.*;
/**
 *
 * @author blocks
 */
public class doModEmp {
    
    public static boolean doModify(ServletConfig config,HttpServletRequest request, HttpServletResponse response)throws Exception
    {
        boolean flag=false;
        
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        
        upload.setFileSizeMax(3145728);
        
        List<FileItem> items=upload.parseRequest(request);
        
        Iterator<FileItem> iter=items.iterator();
        
        Emp emp=new Emp();
        
        while(iter.hasNext())
        {
            FileItem item=iter.next();
            if(item.getFieldName().equals("ename"))
            {
                
                emp.setEname(item.getString());
            }
            else if(item.getFieldName().equals("job"))
            {
                emp.setJob(item.getString());
            }
            else if(item.getFieldName().equals("hiredate"))
            {
                emp.setHiredate(item.getString());
            }
            else if(item.getFieldName().equals("sal"))
            {
                emp.setSal(Double.parseDouble(item.getString()));
            }
            else if(item.getFieldName().equals("comm"))
            {
                if(item.getString().equals(""))
                {
                    emp.setComm(0);
                    
                }
                else
                {
                 emp.setComm(Double.parseDouble(item.getString()));
                }
            }
            else if(item.getFieldName().equals("mgr"))
            {
                if(item.getString().equals(""))
                {
                    emp.setMgr(0);
                }
                else{
                    emp.setMgr(Integer.parseInt(item.getString()));
                }
            }
            else if(item.getFieldName().equals("depno"))
            {
                if(item.getString().equals(""))
                {
                    emp.setDeptno(0);
                }
                emp.setDeptno(Integer.parseInt(item.getString()));
            }
            else if(item.getFieldName().equals("note"))
            {
                emp.setNote(item.getString());
            }
            else if(item.getFieldName().equals("photo"))
            {
                
                System.out.println("item_name:"+item.getName());
                
                
                if(item.getName()=="")
                {
                    emp.setPhoto("nophoto.jpg");
                    
                }
                else{
                
                InputStream input=null;
                OutputStream output=null;
                File saveDirectory=null;
                
                saveDirectory=new File(config.getServletContext().getRealPath("/")+"images");
                if(!saveDirectory.exists())
                {
                    saveDirectory.mkdir();
                }
                
                String filename=saveDirectory.toString()+File.separator+item.getName();
                File saveFile=null;
                String fname=item.getName();
                String fname2=fname.substring(0,fname.lastIndexOf("."));
                String fname3=fname.substring(fname.lastIndexOf(".")+1,fname.length());
                
                int i=0;
                while(true)
                {
                saveFile=new File(filename);
                emp.setPhoto(saveDirectory.getName()+File.separator+fname2+"("+i+")"+"."+fname3);
                System.out.println("photopath:"+saveDirectory.getName()+File.separator+fname2+"("+i+")"+"."+fname3);
                
                if(saveFile.exists())
                {
                    i++;
                    filename=saveDirectory.toString()+File.separator+fname2+"("+i+")"+"."+fname3;
                    emp.setPhoto(saveDirectory.getName()+File.separator+fname2+"("+i+")"+"."+fname3);
                    System.out.println("photopath:"+saveDirectory.getName()+File.separator+fname2+"("+i+")"+"."+fname3);
                }
                else
                {
                    break;
                }
            }
            
            input=item.getInputStream();
            output=new FileOutputStream(saveFile);
            
            byte[] data=new byte[512];
            
            while(input.read(data)!=-1)
            {
                output.write(data);
            }
            
            input.close();
            output.close();
            
        }
        
            } 
        
    }
        
        Emp tmp=(Emp)request.getSession().getAttribute("emp");
        
        emp.setEmpno(tmp.getEmpno());
        
        flag=IEmpDAOFactory.getConnection().doUpdate(emp);
        return flag;
    }
    
    
}
