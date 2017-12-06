package com.jbdao;

import java.util.List;
import com.jbdao.JBSqlMapConfig;

import com.jbdto.JBDto;

public interface JBBiz {
	
	
//  페이징계산
	public int getContentCountBiz();
	/*
	 *  글 테이블 전체 로우갯수를 카운트하여 리턴.
	 *  리턴값은 프론트단에서  페이지 넘버링으로 활용. (5개씩 출력 예정이므로 총페이지/5 = 총페이지 갯수)
	 */
	
	
	
//	페이지 읽기
	public List<JBDto> getContentListBiz(int min, int max);
	/*
	 * X~Y 인트 범위의 로우넘에 해당하는 리스트를 컨트롤러로 전송. 
	 * orderby는 부여받은 시퀀스(jbno)
	 */
	
	
//	글쓰기 
	public int writeContentBiz(JBDto jb);
	/*
	 * dto입력받아 DB에 입력.
	 * jbno = 시퀀스.nextval
	 * emailorphone = 로그인아이디 (from 세션)
	 * name = 로그인 계정 이름 (from 세션)
	 * imgurl = WAS에 올라간 이미지 파일의 URL
	 * content = 작성form에서 유저가 작성한 글내용
	 * bonglist = 최초작성은 null 혹은 ""
	 * jbdate = sysdate
	 * enable = 최초작성은 "Y" 
	 */
	
//	글수정
	public int updateContentBiz(JBDto jb);
	/*
	 * dto입력받아 DB에 입력
	 * jbno = 수정없음
	 * emailorphone = 수정없음
	 * name = 수정없음
	 * imgurl = 수정없음
	 * content = 수정form에서 유저가 수정한 글내용
	 * bonglist = 수정없음
	 * jbdate = sysdate
	 * enable = 수정없음
	 */
//	글삭제
	public int deleteContentBiz(int JBseq);
	/*
	 * 해당 글 enable값을 N으로 처리.
	 */
	
//	글봉 입력
	public int addBongBiz(int JBseq, String OBlist, int OBcount, String emailorphone);
	/*
	 * 유저가 보는 현재 글봉여부는 리스트 뿌릴때 체크하여 버튼활성/비활성화.
	 * 컬럼가공후 DB 입력.
	 * 가공컬럼
	 * bonglist
	 * 본 기능을 사용한 유저의 ID(emailorphone)값 + "/"
	 * bongcount
	 * 기존 값 + 1
	 */

// 글봉취소
	public int subBongBiz(int JBseq, String OBlist, int OBcount, String emailorphone);
	/*
	 * 유저가 보는 현재 글봉여부는 리스트 뿌릴때 체크하여 버튼활성/비활성화.
	 * add 혹은 sub 커맨드에 따라 컬럼가공후 DB 입력.
	 * 가공컬럼
	 * bonglist
	 * (본 기능을 사용한 유저의 ID(emailorphone)값 + "/")을 기존 bonglist에서 제거 
	 * bongcount
	 * 기존 값 -1
	 */
}
