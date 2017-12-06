package com.jbdto;

import java.sql.Date;

public class JBCDto {

	
	/*
 	JBCNO NUMBER PRIMARY KEY,
	JBNO NUMBER,
	RELEVEL NUMBER,
	REROUTE VARCHAR2(400) NOT NULL,
	EMAILORPHONE VARCHAR2(100) NOT NULL,
	NAME VARCHAR2(100) NOT NULL,
	CONTENT VARCHAR2(4000) NOT NULL,
	BONGLIST VARCHAR2(4000),
	BONGCOUNT NUMBER,
	JBCDATE DATE NOT NULL,
	ENABLE VARCHAR2 NOT NULL
	*/

	
	private int jbcno;
	private int jbno;
	private String relevel;
	private String reroute;
	private String emailorphone;
	private String name;
	private String content;
	private String bonglist;
	private int bongcount;
	private Date jbdate;
	private String enable;
	
	public JBCDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JBCDto(int jbcno, int jbno, String relevel, String reroute, String emailorphone, String name, String content,
			String bonglist, int bongcount, Date jbdate, String enable) {
		super();
		this.jbcno = jbcno;
		this.jbno = jbno;
		this.relevel = relevel;
		this.reroute = reroute;
		this.emailorphone = emailorphone;
		this.name = name;
		this.content = content;
		this.bonglist = bonglist;
		this.bongcount = bongcount;
		this.jbdate = jbdate;
		this.enable = enable;
	}


	public int getJbcno() {
		return jbcno;
	}


	public void setJbcno(int jbcno) {
		this.jbcno = jbcno;
	}


	public int getJbno() {
		return jbno;
	}


	public void setJbno(int jbno) {
		this.jbno = jbno;
	}


	public String getRelevel() {
		return relevel;
	}


	public void setRelevel(String relevel) {
		this.relevel = relevel;
	}


	public String getReroute() {
		return reroute;
	}


	public void setReroute(String reroute) {
		this.reroute = reroute;
	}


	public String getEmailorphone() {
		return emailorphone;
	}


	public void setEmailorphone(String emailorphone) {
		this.emailorphone = emailorphone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getBonglist() {
		return bonglist;
	}


	public void setBonglist(String bonglist) {
		this.bonglist = bonglist;
	}


	public int getBongcount() {
		return bongcount;
	}


	public void setBongcount(int bongcount) {
		this.bongcount = bongcount;
	}


	public Date getJbdate() {
		return jbdate;
	}


	public void setJbdate(Date jbdate) {
		this.jbdate = jbdate;
	}


	public String getEnable() {
		return enable;
	}


	public void setEnable(String enable) {
		this.enable = enable;
	}
	
	
	
	
	
	
	
	
}
