시퀀스(순차적으로 증가하는 값을 가지는 데이터베이스 오브젝트)
사용 예)회원가입
회원을 구분하기 위해서 구분 키, 게시글 번호 :  자동적으로 증가 해야 하는 수 

  회원					구매내역
1 id1  홍길동			id1  tv    1
2 id2  이순신			id1  컴     2
3  1   신사임당		id2  과자   10
4 kim1 김장금				.....

시퀀스 만들기 
create sequence [시퀀스이름] 
start with [시작값]
increment by [증가값]
maxvlaue [최대값]
cycle; //순환할지 안할지 결정


create sequence test_seq 
start with 1 
increment by 1
maxvalue 999999
cycle;

시쿼스의 다음값 가져오기
 select text_seq2.nextval from dual;
시퀀스의 현재값 가져오기 
 select test_seq.currval from dual;
 
 
 사용자가 생성한 시퀀스 확인하기(user_sequences:시퀀스의 정보를 저장)
select * from suer_sequences

ex)학생정보(번호,이름,점수)를 저장하는 테이블 student_ex
	예 자동으로 번호를 증가 시키면서 입력하기
	
	insert
	into student_ex
	values (test_seq.nextval,"홍길동",1);
	 
시퀀스 초기화
   현재 시퀀스값 만큼 빼고 다시 1부터 시작
   
 select student_seq.nextval from dual; 
 select student_seq.nextval from dual;   
시퀀스 변경
	//증가값을 현재 값으로 변경
	alter sequence student_seq increment by -8;
	//초기화
   	select student_seq.nextval from dual;
   	//다시 증가값 1로 변경
   	alter sequence student_seq increment by 1;
	//증가 시퀀스 증가 시키기
	select student_seq.nextval from dual;
	
mysql에는 auto_increment를 이용해서 key값을 1씩 증가 시킬수 있음
-------------------------------------------------------
제약사항
테이블에 데이터를 입력할 때 특정한 값만 들어갈 수 있도록 설정
ex)중복되지 않는 값만 넣을 수 있게 한다. null은 넣지못하도록 한다, 
   범위지정 등등...
	primary key 기본키 지정(중복안됨, not null), 테이블당 하나
	not null null 허용 X	
	unique 중복 허용 X 
	check 특정범위지정 
	foreign key 다른 테이블의 기본키(primary key)인 값만 쓸수 있게 지정
	
제약사항 지정 방법

테이블에 적용된 제약사항 확인하기
user_constraints <<적용된 제약사항이 저장된 테이블
테이블에서 테이블 이름, 제약사항 이름, 제약사항 타입 조회하기

select table_name,constraint_name,constraint_type
	from user_constraints
	where table_name ='STUDENT';

1. 테이블 생성할 때
student 테이블 작성 
번호 : 기본키, 
이름 : not null, 
학년 : not null, 
점수 : 100이하

create table student(
    num number(3) primary key,
    name varchar2(20) not null,
    grade number(2) not null,
    email varchar2(50) unique,
    score number(5) check (score<=100)
    );
    
 insert into student
    values(1,'홍길동',3,50);

    
not null 확인

insert into student (num,name,score)
values (3,'이이',100)

check 확인
insert into student (num,name,grade,score)
    values (3,'이이',1,101);

    
 constraint [제약사항이름] [제약사항]   
 create table student(
    num number(3) ,
    name varchar2(20) ,
    grade number(2) ,
    email varchar2(50),
    score number(5),
    
    primary key(num),
    constraint student_email_uq unique(email),
    constraint student_score_under check(score <=100)
    );
    
    create table student(
    num number(3) constraint student_pk primary key,
    name varchar2(20) not null,
    grade number(2)  not null,
    email varchar2(50) not null,
    score number(5),
    
    primary key(num),
    constraint student_email_uq unique(email),
    constraint student_score_under check(score <=100)
    );
    
    
    create table student(
    num number(3) constraint student_pk primary key,
    name varchar2(20) not null,
    grade number(2)  not null,
    email varchar2(50) not null,
    score number(5),

    constraint student_email_uq unique(email),
    constraint student_score_under check(score <=100),
    constraint student_email_fk reference 테이블명(칼럼명)
    );   
    
    
2. 테이블 생성하고 난 뒤(테이블 수정)

alter table student add primary key(num);
alter table student add modify name varchar2(20) not null;
alter table student 
add constraint student_fk 
foreign key(제약사항 대상 칼럼) 
reference 테이블명(칼럼명);



--------------------------------------------------
create table student(
num number(5),
name varchar(20),
email varchar2(50)
);


alter table student 
add constraint email_fk foreign key(email)
references email_info(email)

create table email_info(
email varchar2(20) primary key,
info varchar2(100)
);

insert into email_info values('email1','info1');
insert into email_info values('email2','info2');

email_info에 들어가 있지 않은 key를 넣으려고 하면 foregin key 정책 위반
insert into student values(1,'hong','email');
commit;
-----------------------------------------------------
테이블 생성시 칼럼 기본값 설정하기
create table student(
	num number(5) primary key,
	name varchar2(40) not null,
	birthday date default sysdate
)
insert into student (num,name) values(1,'hong');





mbmber table 작성하기
m_num number(10) 기본키, 회원번호
id: varchar2(30) not null, unique, 아이디
pw: varchar2(50) null 허용x 비밀번호
name: varchar2(20) null 허용X 이름
email: varchar2(30) null 허용x,중복허용 x 이메일
regDate date     기본값 sysdate  회원가입일
테이블 작성하고, insert update,delete,select 연습해보고
dao 작성까지
(insertMember,updateMember,deleteMember,selectOne,selectAll) 
삭제,selectOne조회 기준은 num


mnum number(10) primary key,
mid varchar2(30) not null,
mpw varchar2(50) not null,
mname varchar2(20) not null,
memail varchar2(30) not null,
mregDate date default sysdate,









