package com.aisino.domain;

import java.util.List;  

import com.thoughtworks.xstream.annotations.XStreamAlias;  
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;  
import com.thoughtworks.xstream.annotations.XStreamImplicit;  
  
@XStreamAlias("table")  
public class Table   
{  
    @XStreamAsAttribute  
    private String name;  
      
    @XStreamAsAttribute  
    private String comment;  
      
    @XStreamImplicit(itemFieldName="column")  
    private List<Column> columnList;  
  
    public String getName()   
    {  
        return name;  
    }  
  
    public void setName(String name)   
    {  
        this.name = name;  
    }  
  
    public String getComment()   
    {  
        return comment;  
    }  
  
    public void setComment(String comment)   
    {  
        this.comment = comment;  
    }  
  
    public List<Column> getColumnList()   
    {  
        return columnList;  
    }  
  
    public void setColumnList(List<Column> columnList)   
    {  
        this.columnList = columnList;  
    }  
}  