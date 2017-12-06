package com.jbdao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.jbdao.JBSqlMapConfig;

import com.jbdto.JBDto;


public class JBBizimpl implements JBBiz {
	
	
	private String nameSpace="com.jb.jboard.";

	@Override
	public int getContentCountBiz() {
		JBDaoimpl jbdao = new JBDaoimpl();
		
		int res = jbdao.getContentCountDao();
		
		return res;
		
	}

	@Override
	public List<JBDto> getContentListBiz(int min, int max) {
		
		JBDaoimpl jbdao = new JBDaoimpl();
		
		List<JBDto> res = new ArrayList<JBDto>();
		HashMap param = new HashMap();
		param.put("pagesmallnum", min);
		param.put("pagebignum", max);
		res = jbdao.getContentListDao(param); 
		
		
		return res;
	}

	@Override
	public int writeContentBiz(JBDto jb) {
		
		int res = 0;
		
		JBDaoimpl jbdao = new JBDaoimpl();
		
		res = jbdao.writeContentDao(jb); 
		
		
		return res;
		
	}

	@Override
	public int updateContentBiz(JBDto jb) {
		int res = 0;
		
		JBDaoimpl jbdao = new JBDaoimpl();
		
		res = jbdao.writeContentDao(jb); 
		
		
		return res;
	}

	@Override
	public int deleteContentBiz(int JBseq) {
		JBDaoimpl jbdao = new JBDaoimpl();
		
		
		HashMap param = new HashMap();
		param.put("jbno", JBseq);
		
		int res = jbdao.deleteContentDao(param); 
		
		
		return res;
	}

	@Override
	public int addBongBiz(int JBseq, String OBlist, int OBcount, String emailorphone) {
		JBDaoimpl jbdao = new JBDaoimpl();
		HashMap param = new HashMap();
		
		String bonglist =OBlist + emailorphone + "/";
		int bongcount = OBcount + 1;
		
		param.put("bonglist", bonglist);
		param.put("bongcount", bongcount);
		param.put("jbno",JBseq);
		
		int res = jbdao.deleteContentDao(param); 
		
		
		return res;
	}

	@Override
	public int subBongBiz(int JBseq, String OBlist, int OBcount, String emailorphone) {

		JBDaoimpl jbdao = new JBDaoimpl();
		HashMap param = new HashMap();
		
		int bongcount = OBcount - 1;
		String bonglist =OBlist.replace((emailorphone+"/") , "");
		
		
		param.put("bonglist", bonglist);
		param.put("bongcount", bongcount);
		param.put("jbno",JBseq);
		
		int res = jbdao.deleteContentDao(param); 
		
		
		return res;
	}

}
