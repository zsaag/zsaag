단일행 함수, 복수행 함수 
EX)이름		학년		점수
홍		3		100
이		2		0(점수가 없을때 0점으로 바꿔줘라)->단일행 함수 적용해라
김		3		50


조회한 데이터에 대해서 값을 변경하거나, 
원하는 값을 얻어내기 위해서 사용하는 함수 - 오라클 내장함수
mvl은 mysql에서 is null




문자관련 함수
INITCAP : 문자열 첫글자를 대문자로 변경
	select initcap ('abcd') from dual;

LOWER : 문자열 소문자로 변경
	select lower ('ABCD') from dual;

UPPER : 문자열 대문자로 변경
	select upper ('abcd') from dual;

LENGTH : 문자열 길이 반환
	select lower(ename) from emp;
emp 테이블에서 이름의 길이가 5이상인 모든 직원의 이름을 조회
	select ename from emp where length(ename)>=5;
	
CONCAT : 두 문자열 결합, ||와 같은 기능
	select ename||' ' ||'입니다' from emp;
	select concat(ename,'입니다') from emp;
SUBSTR : 문자열에서 일부문자열 추출
	SUBSTR(문자열,인덱스,개수), 인덱스는 1부터 시작
	emp 테이블에서 모든 직원의 이름의 첫글자를 조회
	select substr(ename,1,1) from emp;
	emp 테이블에서 모든 직원의 이름의 앞 두 글자를 조회, 단소문자로
	select lower(substr(ename,1,2))AS aa from emp;  
	
INSTR : 문자열에서 특정 문자열 위치 반환
	INSTR(문자열,찾은문자열)
	select instr('abcdefg','cd') from dual;

LPAD : 문자열 왼쪽에 특정문자 채움(L)
	LPAD(문자열,길이,채울문자)
	select lpad('abcdef',10,'*') from dual;
RPAD : 문자열 오른쪽에 특정문자 채움(R)
	LPAD(문자열,길이,채울문자)
	select rpad('abcdef',10,'*') from dual;
LTRIM : 문자열 왼쪽에 특정문자 지움(L)
	LTRIM(문자열,지울문자)
	LTRIM(문자열): 공백삭제
	select ltrim ('******/****abc****/******','*')from dual;
RTRIM : 문자열 오른쪽에 특정문자 지움(R)
	RTRIM(문자열,지울문자)
	RTRIM(문자열): 공백삭제
	select Rtrim ('******/****abc****/******','*')from dual;
TRIM : 문자열 양쪽에 공백 삭제
	select trim('   abc   ')from dual;
REPLACE : 문자열에서 특정 문자열 교체
	REPLACE(문자열,교체대상문자열,교체문자열)
	select replace('abcdefg','cd','*') from dual;
-----------------------------------------------------------
숫자 관련함수(대문자 변경 ctrl+shift+x)
ROUND : 반올림
	ROUND(숫자,표시자리수)
	select round(12.34,1) from dual; 소수점 첫째자리수 까지 표시(반올림)
TRUNC : 버림
	select trunc(12.36,1) from dual; 소수점 첫째자리수 까지 표시(뒤에는 버림)
MOD : 나머지
	MOD(A,B) : A를 B로 나눈 나머지
	select mod(5,3) from dual;
FLOOR : 가장 가까운 작은 정수 출력
	select floor(12.34) from dual;
CEIL : 가장 가까운 큰 정수 출력
	select ceil(12.34) from dual;
POWER : 제곱수
	select power(4,3) from dual;
----------------------------------------------------------------------
날짜 관련 함수
날자 출력 포맷, 날짜계산, 일수확인 등등..

SYSDATE : 시스템 현재 날짜 변환
	select sysdate from dual;
TO_DATE : 특정 포맷의 문자열을 날짜 데이터로 변환
	Y2K 버그가 나와서 생긴 RRRR
	select to_date('2018-05-09','YYYY(RRRR)-MM-dd')from dual;
TO_CHAR : 날짜를 특정 포맷의 문자열로 반환
	select to_char(sysdate,'RRRR:MM:dd') from dual;
MONTHS_BETWEEN :  두 날짜간 개월 수 반환
	select months_between (sysdate,to_date('2017-05-09','RRRR-MM-dd')) from dual;
ADD_MONTHS : 특정날짜에 개월 수 더하기
	select add_months(sysdate,3) from dual;
next_day : 날짜 기준으로 지정한 요일의 돌아오는 날짜 반환
	select next_day(sysdate,'수') from dual;//영어로 설치되었을 경우 'mon'으로 입력해야 출력 가능
last_day : 날짜 속한 달의 마지막 날짜 
	select last_day(sysdate)from dual;
round : 낮 12시(정오) 기준으로 시간이 지났으면 다음날, 안지났으면 오늘 반환
	select round(sysdate)from dual;
	select round(to_date('2018-05-09 13:00 ','RRRR-MM-DD hh24:mi'))from dual;
trunc : 해당 날짜 반환
	select to_char(trunc(sysdate),'RRRR-MM-dd hh:mi:ss')from dual;
-------------------------------------------------------------------------------------
NVL(칼럼,값) : 조회한 칼럼이 null 이면 지정한 값을 넣어줌
emp테이블에서 모든 직원의 이름과, salmp; + comm 더한 급여를 조회
	select ename,job,sal,nvl(comm,0), sal+nvl(comm,0) from emp;
	select nvl(mgr,0) from emp;	
DECODE  
DECODE(A,B,값)
	프로그래밍 언어에서 if(A==B) 값 출력 아니면 null
	
	10 ACCOUNTING
	20 RESEARCH
	30 SALES
	40 OPERATIONS
	emp 테이블에서 부서번호 조회	
	select deptno,decode(deptno,10,'ACCOUNTING') from emp;
	deptno가 10이면 'ACCOUNTING', 아니면 null
	select deptno,decode(deptno,10,'ACCOUNTING',20,'RESERCH','기타부서') from emp;
	decode(deptno,10,'ACCOUNTING',20,'RESEARCH','기타부서');
------------------------------------------------------------------------------------
그룹함수(복수행함수)
각 행마다 함수를 처리하는 것이 아니라, 
조회 결과중 여러 행을 묶어서 통계를 내는 함수
count : 조회된 행의 개수
count(칼럼)
	select count(*) as "직원수" from emp;
	부서번호가 10인 직원 수 
	select count(*) as "직원수" from emp where deptno=10;
	
	각 부서별 직원의 수를 알고 싶을 때....
	select count(*) as "직원수", deptno as "부서" from emp group by deptno;
	
	에러
	select count(*), deptno, ename from emp group by deptno;
	
	부서별, 업무별 형태로 묶어서 출력해야한다
		
sum : 조회된 행의 총합
전체직원의 급여의 총합
	select sum(sal) from emp;
부서별 급여의 총합
	select sum(sal),deptno from emp group by deptno;
업무별 급여의 총합
	select sum(sal),job from emp group by job;
부서-업무별	 급여 총합
	select sum(sal),deptno,job from emp group by deptno, job order by deptno, job;
avg : 조회도니 행들의 값의 평균
	select floor(avg(sal)) from emp; //floor 소수점 자리 없애버림
전체직원의 급여의 총합
	select avg(sal) from emp;
부서별 급여의 총합
	select avg(sal),deptno from emp group by deptno;
업무별 급여의 총합
	select avg(sal),job from emp group by job;
부서-업무별	 급여 총합
	select avg(sal),deptno,job from emp group by deptno, job order by deptno, job;		
max : 조회된 행들의 값중에 가장 큰 값
부서별 가장 높은 급여 조회
	select max(sal), deptno from emp group by deptno;
min : 조회된 행들의 값중에 가장 작은 값
	업무별 가장 적은 급여 조회
	select min(sal), job from emp group by job;
	
통계 함수에서 조건 : where 이 아니라 having
	업무별 급여의 총합 중 4000 이상인 값을 조회

	select sum(sal),job
	 from emp
	 group by job
	 having sum(sal)>=4000;
	 
	 부서번호가 10인 부서의 업무별 급여의 총합 중 2000 이상인 값을 조회

	select sum(sal),job
	 from emp
	 where deptno=10
	 group by job
	 having sum(sal)>=2000;
	 
1.모든 사원의 급여에 300을 더한 후 ,이름, 급여, 인상된 급여 조회
select ename, sal ,sal+nvl(comm,300) from emp;
select ename as"이름",sal as "급여", sal+300 as "인상급여" from emp;

2. 사원 번호가 7782인 사원의 이름과 부서번호 조회
select ename, deptno from emp where empno=7782;

3. 부서 번호가 20이거나 30인 사원의 이름과 부서번호 조회
select ename, deptno from emp where deptno=20 or deptno=30;

4. 급여가 2000이상 3000이하 이고, 부서가 20 또는 30인 사원의 이름, 급여, 부서번호
select ename, sal, deptno from emp where (deptno=20 or deptno=30) and sal>=2000 and sal<=3000;
select ename, sal, deptno from emp where sal between 2000 and 3000 and (deptno=20 or deptno30);

5. 커미션이 null이 아닌 사원의 이름, 급여, 업무 커미션 조회
select ename, sal,job from emp where comm is not null;

6. 업무가 CLERK 또는 SALESMAN 이면서 급여가 1600,950,1300 이 아닌 사원의 이름, 업무, 급여 조회
select ename, job, sal from emp where (job='CLERK' or job='SALESMAN') and not sal=1600 and not sal=950 and not sal=1300;
select ename, job, sal from emp where job in('CLERK','SALESMAN') and not sal in(1600,950,1300);

7. 커미션이 500 이상인 사원의 이름과 급여, 커미션 출력
select ename, sal, comm from emp where comm>=500;

8. 모든 사원의 이름, 업무, 급여(급여+커미션)을 조회
select ename, job,sal+nvl(comm,0) from emp;

9. 9-1 전체 사원의 급여의 최대값, 최소값, 평균값 조회
	select max(sal),min(sal),round(avg(sal)) from emp;
   	select max(sal) "최고급여", min(sal) "최저급여", floor(avg(sal)) "평균급여",
	from emp
	
	9-2 부서별 급여의 최대값, 최소값, 평균값 조회
 	select max(sal),min(sal),round(avg(sal)) from emp group by deptno;
	select max(sal) "최고급여", min(sal) "최저급여", floor(avg(sal)) "평균급여",
	deptno "부서번호" from emp group deptno;
 	
 	10. 전체 사원의 수, 커미션의 총합, 커미션의 평균값 조회 단, 커미션이 없을경우 0으로 계산, 
 	소수점은 둘째자리에서 반올림하여 첫째자리까지 표시  
select count(*), sum(comm), round(avg(nvl(comm,0)),1) from emp;	

     














