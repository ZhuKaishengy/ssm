package com.aisino.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;  
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;  
  
@XStreamAlias("column")  
public class Column   
{  
    @XStreamAsAttribute  
    private String name;  
      
    @XStreamAsAttribute  
    private String type;  
      
    @XStreamAsAttribute  
    private Integer length;  
      
    @XStreamAsAttribute  
    private String comment;  
  
    public String getName()   
    {  
        return name;  
    }  
  
    public void setName(String name)   
    {  
        this.name = name;  
    }  
  
    public String getType()   
    {  
        return type;  
    }  
  
    public void setType(String type)   
    {  
        this.type = type;  
    }  
  
    public Integer getLength()   
    {  
        return length;  
    }  
  
    public void setLength(Integer length)   
    {  
        this.length = length;  
    }  
  
    public String getComment()   
    {  
        return comment;  
    }  
  
    public void setComment(String comment)   
    {  
        this.comment = comment;  
    }  
}  