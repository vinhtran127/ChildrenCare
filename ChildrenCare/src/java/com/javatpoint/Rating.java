 package com.javatpoint;  
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;   
import javax.servlet.jsp.PageContext;
  
public class Rating extends TagSupport{  
private int id;
private int min;
private int max;
private int value;

    public void setId(int id) {
        this.id = id;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public void setPageContext(PageContext pageContext) {
        this.pageContext = pageContext;
    }
  
  
  
public int doStartTag()throws JspException{  
    JspWriter out=pageContext.getOut();  
    try{   
        for(int i =min;i<=max;i++){
            if(i<=value){
              out.write("<i class=\"fa fa-star\" style=\"color:#44bd32;\"></i>");
            }else{
                 out.write("<i class=\"fa fa-star\" style=\"color:#dcdde1;\";></i>");
            }
           
        }
        
    }catch(Exception e){System.out.println(e);}  
    return SKIP_BODY;  
}  
}  