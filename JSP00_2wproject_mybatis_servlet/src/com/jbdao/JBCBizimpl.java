package com.jbdao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jbdto.JBCDto;

public class JBCBizimpl implements JBCBiz {

	@Override
	public int getCommentCountBiz() {
		JBCDaoimpl jbcdao = new JBCDaoimpl();
		int res = jbcdao.getCommentCountDao();
		
		return res;
	}

	@Override
	//글하나의 댓글리스트 이므로, 페이지 작성시에는 콘트롤러에서 글번호 배열을 작성하여 for문 돌리세요. 결과값의 list로 페이지구성하세요.
	public List getCommentBiz(int jbno, int min, int max) {
			JBCDaoimpl jbcdao = new JBCDaoimpl();
		
			List <JBCDto> res = new ArrayList(); 
			HashMap jbc = new HashMap();
			jbc.put("jbno", jbno);
			jbc.put("commentbignum", min);
			jbc.put("commentsmallnum", max);	
			
			res = jbcdao.getCommentDao(jbc); 
		
		
		return res;
	}

	@Override
	public int writeCommentBiz(JBCDto jbc) {
		JBCDaoimpl jbcdao = new JBCDaoimpl();
		//시퀀스를 선취득해서
		int jbcno = jbcdao.getSeqDao();
		//기존 시퀀스 자리에 숫자로 넣어주고
		jbc.setJbcno(jbcno);
		//경로(reroute)값에도 기존경로스트링+취득한시퀀스+"/"의 형태로 쌓아준다. ( 예 : 11/2/1/의 형태는 11번글 2번째댓글의 1번째 대댓글)
		//단, 경로값이 없다면(부모글작성중이라서 받아 온 dto, jbc의 경로값이 null 이라면) (스트링)취득시퀀스+"/"만 넣어준다. 	
		if(jbc.getReroute()!=null) {
			jbc.setReroute(jbc.getReroute()+Integer.toString(jbcno)+"/");
		}else {
			jbc.setReroute(Integer.toString(jbcno)+"/");
		}
		int res = jbcdao.writeCommentDao(jbc);
		
		return res;
		
	}

	@Override
	public int updateCommentBiz(JBCDto jbc) {
		int res = 0;
		
		JBCDaoimpl jbcdao = new JBCDaoimpl();
		
		res = jbcdao.writeCommentDao(jbc); 
		
		
		return res;
	}

	@Override
	public int deleteCommentBiz(JBCDto jbcseq) {
		int res = 0;
		
		JBCDaoimpl jbcdao = new JBCDaoimpl();
				
		res = jbcdao.deleteCommentDao(jbcseq); 
		return res;
	}

	@Override
	public int addBongBiz(int JBCseq, String OBlist, int OBcount, String emailorphone) {
		JBCDaoimpl jbcdao = new JBCDaoimpl();
		HashMap param = new HashMap();
		String bonglist="";

		if(OBlist!=null) {
			bonglist =OBlist + emailorphone + "/";	
		}else {
			bonglist =emailorphone + "/";
		}

		int bongcount = OBcount + 1;
		
		param.put("bonglist", bonglist);
		param.put("bongcount", bongcount);
		param.put("jbcno",JBCseq);
		
		int res = jbcdao.addBongDao(param);
		return res;
	}

	@Override
	public int subBongBiz(int JBCseq, String OBlist, int OBcount, String emailorphone) {
		
		JBCDaoimpl jbcdao = new JBCDaoimpl();
		HashMap param = new HashMap();
		
		int bongcount = OBcount - 1;
		
		String bonglist = OBlist.replace((emailorphone+"/") , "");
		
		param.put("bonglist", bonglist);
		param.put("bongcount", bongcount);
		param.put("jbcno",JBCseq);
		
		int res = jbcdao.addBongDao(param);
		return res;
	}

}
