DROP TABLE SAMPLE;

CREATE TABLE SAMPLE (
	ID NUMBER(12) PRIMARY KEY,
	TITLE VARCHAR2(200),
	REG_USER VARCHAR2(20),
	CONTENT VARCHAR2(2000),
	REG_DATE DATE DEFAULT SYSDATE
);

INSERT INTO SAMPLE VALUES(1, 'JAVA Programming', '관리자', 'JAVA 관련 글만 등록하세요.', SYSDATE);

SELECT * FROM SAMPLE;