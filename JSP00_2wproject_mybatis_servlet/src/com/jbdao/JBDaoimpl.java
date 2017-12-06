package com.jbdao;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jbdto.JBDto;

import com.jbdao.JBSqlMapConfig;

public class JBDaoimpl implements JBDao {
	
	private String nameSpace="com.jb.jboard.";


	@Override
	public int getContentCountDao() {
		
	
		
		SqlSession session = null;
		JBSqlMapConfig JBSql = new JBSqlMapConfig();

		// SqlSession 객체 = SqlSessionFactory객체.openSession(true=오토커밋)

		session = JBSql.getSqlSessionFactory().openSession(true);
		int res = session.selectOne(nameSpace + "selectrowcnt");
		
		session.close();
		
		return res;
		
	}

	@Override
	public List<JBDto> getContentListDao(HashMap minmax) {
		
		List<JBDto> res = new ArrayList();
		
		SqlSession session = null;
		JBSqlMapConfig JBSql = new JBSqlMapConfig();

		// SqlSession 객체 = SqlSessionFactory객체.openSession(true=오토커밋)

		session = JBSql.getSqlSessionFactory().openSession(true);
		res = session.selectList(nameSpace + "selectPage",minmax);
		
		session.close();
		
		return res;
	}

	@Override
	public int writeContentDao(JBDto jb) {
		int res = 0;
		
		SqlSession session = null;
		JBSqlMapConfig JBSql = new JBSqlMapConfig();

		// SqlSession 객체 = SqlSessionFactory객체.openSession(true=오토커밋)

		session = JBSql.getSqlSessionFactory().openSession(true);
		res = session.insert(nameSpace + "insert",jb);
		
		session.close();
		
		return res;
	}

	@Override
	public int updateContentDao(JBDto jb) {
		int res = 0;
		
		SqlSession session = null;
		JBSqlMapConfig JBSql = new JBSqlMapConfig();

		// SqlSession 객체 = SqlSessionFactory객체.openSession(true=오토커밋)

		session = JBSql.getSqlSessionFactory().openSession(true);
		res = session.update(nameSpace + "update",jb);
		
		session.close();
		
		return res;
	}

	@Override
	public int deleteContentDao(HashMap JBseq) {
		int res = 0;
		
		SqlSession session = null;
		JBSqlMapConfig JBSql = new JBSqlMapConfig();

		// SqlSession 객체 = SqlSessionFactory객체.openSession(true=오토커밋)

		session = JBSql.getSqlSessionFactory().openSession(true);
		res = session.update(nameSpace + "enableN",JBseq);
		
		session.close();
		
		return res;

	}

	@Override
	public int addBongDao(HashMap bong) {
		
		int res = 0;
		
		SqlSession session = null;
		JBSqlMapConfig JBSql = new JBSqlMapConfig();

		// SqlSession 객체 = SqlSessionFactory객체.openSession(true=오토커밋)

		session = JBSql.getSqlSessionFactory().openSession(true);
		res = session.update(nameSpace + "bongupdate",bong);
		
		session.close();
		
		return res;
	}

	@Override
	public int subBongDao(HashMap bong) {
		int res = 0;
		
		SqlSession session = null;
		JBSqlMapConfig JBSql = new JBSqlMapConfig();

		// SqlSession 객체 = SqlSessionFactory객체.openSession(true=오토커밋)

		session = JBSql.getSqlSessionFactory().openSession(true);
		res = session.update(nameSpace + "bongupdate",bong);
		
		session.close();
		
		return res;
	}

}
