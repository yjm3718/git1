package com.jbdto;

import java.sql.Date;

public class JBDto {


	/*
 	JBNO NUMBER PRIMARY KEY,
	EMAILORPHONE VARCHAR2(100) NOT NULL,
	NAME VARCHAR2(100) NOT NULL,
	IMGURL VARCHAR2(200),
	CONTENT VARCHAR2(4000) NOT NULL,
	BONGLIST VARCHAR2(4000),
	BONGCOUNT NUMBER,
	JBDATE DATE NOT NULL
	*/

	
	private int jbno;
	private String emailorphone;
	private String name;
	private String imgurl;
	private String content;
	private String bonglist;
	private int bongcount;
	private Date jbdate;
	private String enable;
	
	
	
	
	public JBDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JBDto(int jbno, String emailorphone, String name, String imgurl, String content, String bonglist,
			int bongcount, Date jbdate, String enable) {
		super();
		this.jbno = jbno;
		this.emailorphone = emailorphone;
		this.name = name;
		this.imgurl = imgurl;
		this.content = content;
		this.bonglist = bonglist;
		this.bongcount = bongcount;
		this.jbdate = jbdate;
		this.enable = enable;
	}


	public int getJbno() {
		return jbno;
	}


	public void setJbno(int jbno) {
		this.jbno = jbno;
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


	public String getImgurl() {
		return imgurl;
	}


	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
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
