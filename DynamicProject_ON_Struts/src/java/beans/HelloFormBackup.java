/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author heerababu
 */
public class HelloFormBackup extends ActionForm
{
    private String name;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
       ActionErrors ae= new ActionErrors();
       if(name.equals(""))
           ae.add(name, new ActionMessage("msg"));
       return ae;
    }
}
