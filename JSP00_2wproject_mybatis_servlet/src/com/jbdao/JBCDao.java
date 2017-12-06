package com.jbdao;

import java.util.HashMap;
import java.util.List;

import com.jbdto.JBCDto;

public interface JBCDao {


	
	//  페이징계산
	public int getCommentCountDao();
	/*
	 *  원글의 시퀀스를 가진 글 테이블 전체 로우갯수를 카운트하여 리턴.
	 *  리턴값은 프론트단에서  페이지 넘버링으로 활용. (5개씩 출력 예정이므로 총페이지/5 = 총페이지 갯수)
	 */
	
	
	
//	페이지 읽기
	public List<JBCDto> getCommentDao(HashMap jbc);
	/*
	 * 원글의 시퀀스를 가진 코멘트 중, 
	 * X~Y 인트 범위의 로우넘에 해당하는 코멘트의 리스트를 컨트롤러로 전송.
	 * Mapper에서 order by는 reroute기준.   
	 */
	
//	글쓰기전 시퀀스 선취득(코멘트 경로(reroute)의 처리를 위함.)
	public int getSeqDao();
	
	
//	글쓰기 
	public int writeCommentDao(JBCDto jbc);
	/*
	 * dto입력받아 DB에 입력.
	 * content 
	 * 부모글이 없을경우 : content에 원글작성자의 이름을 가져와서"@이름 "을 표시.
	 * 부모글이 있을경우  : content에 부모의 이름을 가져와서"@이름 "을 표시.
	 * relevel 
	 * 부모글이 없을경우 : 1
	 * 부모글이 존재할 경우 : 부모글relevel + 1 (MAX, 즉 들여쓰기는 최대 3)
	 * reroute
	 * 부모글이 없을경우 : 스트링(jbcno(nextval)+"/")
	 * 부모글이 존재할 경우 : 부모글의 reroute + 스트링(jbcno(nextval)+"/")
	 */
	
//	글수정
	public int updateCommentDao(JBCDto JBC);
	/*
	 * dto입력받아 DB에 입력
	 * 
	 */
//	글삭제
	public int deleteCommentDao(JBCDto jbc);
	/*
	 * 해당 글 enable값을 N으로 처리.
	 */
	
//	글봉 입력
	public int addBongDao(HashMap jbc);
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
	public int subBongDao(HashMap jbc);
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
