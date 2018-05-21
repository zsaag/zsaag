학습내용 : sql 기본 문접에 대해서 학습합니다.
:기본 문법 + Oracle 함수 사용법 익히기

연습해보기 위해서 계정하나 추가해서 사용
scott 계정 사용하기
emp,dept,grade

C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin

scott/tiger

create user scott identified by tiger;
alter user scott identified by tiger account unlock;

GRANT CONNECT,RESOURCE,UNLIMITED TABLESPACE TO SCOTT IDENTIFIED BY TIGER;

select 할때는 표현식으로 조회가 가능하다


표현식은 특정 테이블에 데이터가 있는것이 아니기 때문에 임의의 테이터에서 가져 올 수 있음 dual


ex) select empno,ename,'입니다.' from emp;

emp테이블에서 직원 번호, 직원이름 조회
select empno, ename from emp;


2. 칼럼명을 바꿔서 조회 할 수 있다.(Alias)
select [칼럼명] as [별명],
		[칼럼명] as [별명]
	from [테이블명]
	ex) select empno as"사번",
				ename as "이름"
				from emp;
	oracle은 as 생략해도 사용가능


	
distinct : 중복되는 결과를 출력하지 않음
ex) select deptno  from emp; ->중복되는 결과가 출력
	select distinct deptno  from emp;
	
------------------------------------------------------

key : 하나의 로우(레코드)를 구분할 수 있는 데이터
	기본키 : 테이블에서 대표가 되는 키(primary key)
	후보키 : 키 중에, 최소 단위 그룹
	복합키 : 여러개의 칼럼을 한꺼번에 비교 했을 때 특정 레코드를 조회할 수 있으면 복합키 
	왜래키 : 다른테이블에서 기본키로 사용하고 있는 데이터(foreign key)

ex)
이름 		학년	 반 	번호
홍길동	3	 1	 1
이순신	3	 2	 1
신사임당	2	 1	 2
이순신	3	 1	 2

이름 기본키
반, 번호 복합키
반, 번호 후보키
-------------------------------------------------------
where 를 이용해서 원하는 데이터만 선택할 수 있다.
조건을 주고, 그 조건에 맞는 데이터를 선택할 때 사용

where [조건식]
=,!=(<>),>,<,>=,<=
문자비교, 숫자비교, 날짜비교 모두 가능 

ex) 부서번호가 20인 직원의 이름, 부서 번호를 조회

	select ename, deptno
	from emp where deptno='20';
					ename,jon,sal

**급여가 4000이상인 직원의 이름과 업무와 급여를 조회 	
select ename, deptno, sal
	from emp where sal>='4000';
	
-------------------------------------
조건식을 여러개 쓰고 싶을 때는 AND,OR 이용
**부서 번호가 30인 직원 중, 급여가 1500 이상인 직원의 이름, 업무, 급여, 부서번호를 조회 
	select ename, job, sal
	from emp where sal>='1500' and deptno='30';
	
------------------------------------------------	
** or는 둘중 하나라도 포함하면 전부다 출력 	
	select ename, job, sal, deptno
	from emp where sal>='1500' or deptno='30';
	
----------------------------------------------------

	like : 문자열 비교, 문자열 포함 여부를 검사할 때 사용
	
	job이 'SALESMAN'인 직원의 몬든 정보를 조회
	
	select * from emp where job like 'SALESMAN';
	
	문자열 포함여부 검사 '%'
	**이름이 'C'로 시작하는 모든 직원의 모든정보 조회
	
	seelct * from emp where ename like 'C%';
	
	**이름이 'E'로 포함하는모든 직원의 모든정보 조회
	
	seelct * from emp where ename like '%E%';
	
--------------------------------------------------------	
	in:여러 조건을 비교할 때 사용
	** 업무가 SALESMAN 또는 MANGER 인 직원의 이름과 업무 조회
	
	select ename, job
	from emp
	where job = 'SALESMAN' or job = 'MANAGER';
	
	select ename, job
	from emp
	where job in ('SALESMAN','MANAGER');
	
	
	null 비교 : is null, is not null
	
	**MGR(매니저)이 null인 직원의 모든정보 조회
	select * from emp
	where MANAGER is null;
	
	
	**comm이 null이 아닌 직원의 이름, 직책, 급여를 조회
	select ename,job,sal from emp where comm is not null;
-------------------------------------------------------------

	between A and B : 특정 범위를 조건으로 줄때 사용
	
	**급여가 1500 이상 3000 이하 인 직원의 이름, 부서번호, 업무, 급여, 조회
	
	select ename,deptno,job,sal 
		from emp
		where sal between 1500 and 3000;
	
	
	select ename,deptno,job,sal 
		from emp
		where sal >= 1500 and sal <=3000;
		
--------------------------------------------------------------		
		문자열 
		select * from emp
		where ename >= 'C';
		
		이름이 M으로 시작하는 모든 직원
		select * from emp
		where ename >= 'M'
        and ename<='N';
 -------------------------------------------------------------
	order by : 조회 정렬 기준 설정
	//모든직원의 모든 정보를 조회
	
	select * from emp order by sal;
	
	desc :내림차순 정렬
	
	select * from emp order by sal desc;
---------------------------------------------------------------
1.부서 번호가 10이고 업무가 CLERK인 직원의 이름, 업무, 부서 번호 조회
select ename,job,deptno from emp where job='CLERK' and deptno=10;
MILLER

2.입사일이 81년인 모든 직원의 모든정보 조회
select * from emp where hiredate like '81%%';
select * from emp where hiredate between '81/01/01' and '81/12/31';
3.매니저의 직원번호가 7698인 직원의 이름, 부서, 업무 조회
select ename,deptno,job from emp where job='MANAGER' and empno='7698';
select ename,deptno,job from emp where mgr = 7698;
4.업무가 SALESMAN인 직원 중, 급여가 1500 이상인 직원의 모든정보 조회
select ename,deptno,job from emp where job='SALESMAN' and sal>='1500';

5.(부서번호가 10인 직원 중, 업무가 CLERK 인 직원)+업무가 SALESMAN인 직원의 이름, 부서번호, 업무, 급여, 커미션을 조회
select ename,job,deptno,sal,comm from emp where job='CLERK' and deptno=10 or job='SALESMAN';
select ename,job,deptno,sal,comm from emp where (job='CLERK' and deptno=10) or (job like 'SALESMAN');
6.부서번호가 10인 직원의 이름, 업무, 급여, 부서번호 ,커미션 조회.
	단, 입사일 순으로 빠른 순으로 정렬
select ename,job,sal,comm,deptno,hiredate from emp where deptno=10 order by hiredate;

7. 업무가 SALESMAN인 직원의 이름, 급여, 커미션 출력
   단, 커미션이 500이상 경우만 출력, 커미션 기준 내림차순 정렬	
select ename,sal,comm from emp where job='SALESMAN' and comm>=500 order by hiredate desc;       
select ename,sal,comm from emp where job like 'SALESMAN' comm >=500 order by comm desc; 






	
	
	
	
	
	
	
	
    




