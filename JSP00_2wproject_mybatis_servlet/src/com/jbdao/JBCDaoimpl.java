package com.jbdao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jbdto.JBCDto;

public class JBCDaoimpl implements JBCDao {
	
	private String nameSpace="com.jb.jboardcomment.";

	@Override
	public int getCommentCountDao() {
		SqlSession session = null;
		JBSqlMapConfig JBSql = new JBSqlMapConfig();

		// SqlSession 객체 = SqlSessionFactory객체.openSession(true=오토커밋)

		session = JBSql.getSqlSessionFactory().openSession(true);
		int res = session.selectOne(nameSpace + "selectrowcnt");
		
		session.close();
		
		return res;
	}

	@Override
	public List<JBCDto> getCommentDao(HashMap jbc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSeqDao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int writeCommentDao(JBCDto jbc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCommentDao(JBCDto JBC) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCommentDao(JBCDto jbc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addBongDao(HashMap jbc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subBongDao(HashMap jbc) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
