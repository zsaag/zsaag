SQL(Structed Query Language)
:DBMS를 통해서 데이터 베이스에 데이터를 조회, 수정,삭제,변경를 하기위한 언어

sqlplus / as sysdba :관리자 권한 접속

유저생성
CREATE USER zsaag IDENTIFIED BY "whdgus12!";

유저권한
모든권한주기
GRANT connect,dba,resource to zsaag;

비밀번호 변경
ALTER user 아이디 identified "비밀번호";

접속하기

conn 아이디/비번;

테이블 : 실제 데이터가 저장되는 공간
테이블 생성하기

CREATE TABLE [테이블명](
 [컬럼명] [자료형] [옵션],
 [컬럼명] [자료형] [옵션],
 [컬럼명] [자료형] [옵션],
 [컬럼명] [자료형] [옵션],
 [컬럼명] [자료형] [옵션]
);


자료형 : 문자, 숫자, 날짜, 이진데이터
   varchar2, number, data, blob
학생정보를 저장하는 테이블을 만들어 봅시다.
(학생번호-숫자,이름-문자열, 학년-숫자)


CREATE TABLE student_ex()
  snum number(7),
  sname varchar2(20),
  sgrade number
); ;이후 enter치면 완료

만들어진 테이블 확인
desc student_ex;

테이블 삭제
DROP TABLE student_ex;

테이블에 데이터를 확용해서 할 수있는 일 : 조회,삭제,수정,추가
CRUD
Create,Read,Update,Delete

학생
[번호] [이름]   [학년]
snum sname sgrade


테이블에 데이터넣어주기
insert into [테이블명]
			 ([칼럼명1],[칼럼명2],...)
		values ([value1],[value2);
		
ex)insert into student_ex(snum,sname,sgrade)
			   values(1,'홍길동',3);
모든 칼럼에 모두 데이터를 집어넣고자 할때는 칼럼명을 생략해도 된다. 
단, 데이터의 순서는 칼럼명의 순서와 같아야 한다.		
		
insert into student_ex values(1,'홍길동',3);

조회(select)
테이블에 저장되어 있는 데이터를 조회


select [칼럼명],[칼럼명],[칼럼명]
 from [테이블명]
 -------------------
 where [조건] 특정 Row를 조회하고자 할 때 사용

 select snum,sname,sgrade
     from student_ex;
     0
모든 칼럼을 조회할 때는 칼럼명을 쓰지 않고, *을 대신 사용해도 된다.
seelct * from student_ex;

삭제(delete)(데이터베이스 오브젝트(테이블,유저,뷰,프로시져 등등) 삭제는 drop, 데이터 삭제는 delete)
삭제(delete)
삭제는 로우 전체를 삭제해야 한다. >>특정 칼럼을 지칭할 필요 X
where이 없으면, 모든 row삭제 
특정한 로우만 지우기 위해서 where 사용
delete from[테이블명] 
student_ex
where [조건]


delete
from student_ex
-----------------
where snum=1;

수정(update)
존재하는 로우의 데이터를 변경하기 위해서 사용

update [테이블명]
set [칼럼명] = [값],
	[칼럼명] = [값],
	[칼럼명] = [값],
	[칼럼명] = [값],
-------------------
where [조건]	

update student_ex 
  set sgrade=3;

 
commit = COMMIT은 저장되지 않은 모든 데이터를 데이터베이스에 저장하고 현재의 트랜잭션을 종료하라는 명령
rollback= ◦작업 중 문제가 발생했을 때, 트랜젝션의 처리 과정에서 발생한 변경 사항을 취소하고, 트랜젝션 과정을 종료시킨다.


