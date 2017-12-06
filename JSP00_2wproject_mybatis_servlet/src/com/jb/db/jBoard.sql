DROP TABLE JBOARD PURGE;
DROP SEQUENCE JBSEQ;


CREATE SEQUENCE JBSEQ; --게시글고유번호

CREATE TABLE JBOARD(
JBNO NUMBER PRIMARY KEY, -- JBSEQ를 이용, 고유번호 부여
EMAILORPHONE VARCHAR2(100) NOT NULL, -- 세션으로부터 로그인ID값 획득하여 입력.
NAME VARCHAR2(100) NOT NULL, -- 세션으로부터 로그인 name값 획득하여 입력.
IMGURL VARCHAR2(200), -- 글작성시 업로드한 이미지 파일의 경로URL
CONTENT VARCHAR2(4000) NOT NULL, -- 글작성 form에서 유저가 작성한 글 내용.
BONGLIST VARCHAR2(4000), --작성글에  봉(추천)을 추가하거나 삭제할 경우,  (본 기능을 사용한 유저의 ID(emailorphone)값 + "/")을 기존 bonglist에서 추가,제거. 이후 리스트에 작성된 ID값들을 통해 이미 추천했는지 여부를 확인.
BONGCOUNT NUMBER, --봉(추천),봉취소시마다 카운트 업다운
JBDATE DATE NOT NULL, --작성 수정시 SYSDATE입력
ENABLE VARCHAR2(2) NOT NULL -- 삭제 전까지는 Y로 유지 N으로 바뀌면 리스트에 표시되지않음.
);




INSERT INTO JBOARD VALUES(JBSEQ.NEXTVAL,'01062083718','김말순','','글내용을 작성합니다.','01062083718',1,SYSDATE);

SELECT * FROM JBOARD ORDER BY JBNO DESC;

SELECT JBSEQ.CURRVAL FROM JBOARD;

SELECT LAST_NUMBER FROM USER_SEQUENCES WHERE SEQUENCE_NAME = 'JBSEQ';



