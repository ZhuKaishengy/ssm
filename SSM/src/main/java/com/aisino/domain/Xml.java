package com.aisino.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *  <xml>
 *  <ToUserName><![CDATA[gh_0300f5b7cdb1]]></ToUserName>
	<FromUserName><![CDATA[oRpn5v2xs1Pd-ipyY9ZYw6gm-dqw]]></FromUserName>
	<CreateTime>1501056703</CreateTime>
	<MsgType><![CDATA[event]]></MsgType>
	<Event><![CDATA[subscribe]]></Event>
	<EventKey><![CDATA[]]></EventKey>
	</xml> 
 * @author Administrator
 *
 */
@XStreamAlias("xml") 
public class Xml {
	
	@XStreamAlias("ToUserName")
	private String toUserName;
	@XStreamAlias("FromUserName")  
	private String fromUserName;
	@XStreamAlias("CreateTime")
	private String createTime;
	@XStreamAlias("MsgType")
	private String msgType;
	@XStreamAlias("Event")
	private String event;
	@XStreamAlias("EventKey")
	private String eventKey;
	
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	
	
}
