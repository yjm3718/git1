DROP TABLE JBOARDCOMMENT PURGE;
DROP SEQUENCE JBCSEQ;


CREATE SEQUENCE JBCSEQ; --댓글고유번호

CREATE TABLE JBOARDCOMMENT(
JBCNO NUMBER PRIMARY KEY, 			-- JBCSEQ를 이용, 댓글고유번호 부여.
JBNO NUMBER,						-- 게시판 원글의 고유번호
RELEVEL NUMBER,						-- 단계번호. 들여쓰기에 사용. 최대 3단계. 
REROUTE VARCHAR2(400) NOT NULL,		-- 경로값. 예시) "38/5/2/" : 38번 게시글의 5번째 댓글의 2번째 대댓글. 댓글 리스트 order by에도 사용  
EMAILORPHONE VARCHAR2(100) NOT NULL,-- 세션으로부터 로그인ID값 획득하여 입력.
NAME VARCHAR2(100) NOT NULL,		-- 세션으로부터 로그인 name값 획득하여 입력.
CONTENT VARCHAR2(4000) NOT NULL,	-- 댓글작성폼에 유저가 작성한 댓글내용 
BONGLIST VARCHAR2(4000),			-- 작성글에  봉(추천)을 추가하거나 삭제할 경우,  
									-- (본 기능을 사용한 유저의 ID(emailorphone)값 + "/")을 기존 bonglist에서 추가,제거. 
									-- 이후 리스트에 작성된 ID값들을 통해 이미 추천했는지 여부를 확인.
									

BONGCOUNT NUMBER,					-- 봉(추천),봉취소시마다 카운트 업다운
JBCDATE DATE NOT NULL,				-- 작성, 수정시 SYSDATE로 갱신.
ENABLE VARCHAR2(2) NOT NULL			-- 작성시 Y. 삭제시 N. N일경우 페이지에 표시하지 않음.
);


INSERT INTO JBOARDCOMMENT VALUES(JBCSEQ.NEXTVAL,1,1,JBCSEQ.CURRVAL'aaa','asdf','qwqwasd',SYSDATE)

SELECT * FROM MYBOARD ORDER BY MYNO DESC;




