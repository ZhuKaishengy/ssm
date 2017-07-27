package com.aisino.test;

import org.junit.Test;

import com.aisino.domain.Column;
import com.aisino.domain.Table;
import com.aisino.domain.Xml;
import com.thoughtworks.xstream.XStream;

public class XmlTest {

	String xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<table name=\"ts_user\" comment=\"用户信息\">"
			+ "<column name=\"id\" type=\"char\" length=\"10\" comment=\"ID\"></column>"
			+ "<column name=\"name\" type=\"varchar\" length=\"50\" comment=\"用户名\"></column>"
			+ "<column name=\"password\" type=\"varchar\" length=\"100\" comment=\"密码\"></column>"
			+ "<column name=\"age\" type=\"int\" length=\"11\" comment=\"年龄\"></column>"
			+ "<column name=\"createDate\" type=\"date\" comment=\"创建日期\"></column>"
			+ "</table>";

	@Test
	public void testXStream(){
	    XStream xstream = new XStream();  
	    xstream.processAnnotations(new Class[]{Table.class, Column.class});  
	    Table table = (Table)xstream.fromXML(xmlContent); // xmlContent为xml内容  
	    System.out.println(table.getComment());
	}
	
	String xmlContent2 = "<xml><ToUserName><![CDATA[gh_0300f5b7cdb1]]></ToUserName><FromUserName><![CDATA[oRpn5v2xs1Pd-ipyY9ZYw6gm-dqw]]></FromUserName><CreateTime>1501056703</CreateTime><MsgType><![CDATA[event]]></MsgType><Event><![CDATA[subscribe]]></Event><EventKey><![CDATA[]]></EventKey></xml> ";
	@Test
	public void testXStream2(){
		XStream xstream = new XStream();  
		xstream.processAnnotations(new Class[]{Xml.class});  
		Xml xmlcon = (Xml)xstream.fromXML(xmlContent2); // xmlContent为xml内容  
		System.out.println(xmlcon.getToUserName());
	}
}
