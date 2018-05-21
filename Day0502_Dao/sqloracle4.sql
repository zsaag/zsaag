서브쿼리
쿼리문 안에 다른 쿼리문이 존재

예) 스미스씨와 같은 부서에서 일하는 모든 직원을 조회
1. 스미스가 어떤 부서에서 일하는지 알아햐 한다
  단일행 서브쿼리
  select ename
  	from emp
  	where detpno =(select deptno 
   						from emp
  						where ename = 'SMITH');
  
  
  복수행 서브쿼리
  select empno
  from emp
  where job='CLERK';
  
  업무가 CLERK인 직원이 근무하는 근무지
  
  select dname,loc
  	from dept
  	where  deptno in (select deptno
  						from emp
  						where job='CLERK');
  --------------------------------------------------
  
  						
  						
  						
  						
  select *
 	from (select * from emp
  			where deptno =10);
  			
  			
  select e.ename as "이름",
  		 e.deptno as "부서번호",
  		 e.sal as "급여",
  		 e.mgr as "매니저번호",
  		 d.dname as "부서이름",
  		 d.loc as "근무지"
  from emp e, dept d
  where e.deptno = d.deptno;
  
  
  select tmp.이름, tmp.근무지, tmp.부서이름 
  	from ( select e.ename as "이름",
  		 e.deptno as "부서번호",
  		 e.sal as "급여",
  		 e.mgr as "매니저번호",
  		 d.dname as "부서이름",
  		 d.loc as "근무지"
  from emp e, dept d
  where e.deptno = d.deptno) tmp
  where tmp.근무지='CHICAGO';
  ----------------------------------------------------
  select 문에 들어가는 서브쿼리(스칼라 서브쿼리)
  JOIN 이용해서, 사원정보 + 부서정보
  
    select ename "사원이름",
  (select d.dname 
  	from dept d
   where e.deptno = d.deptno
   ) "부서"
  	from emp e;	
  
  OUTER JOIN이랑 같은 결과가 나옴
  	select ename "사원",
  (select ename  
    from emp e2
    where e1.mgr = e2.empno
  ) "매니저"
   from emp e1;
   
   
   시험에 나옴
   1. emp테이블을 조회해서 직원들 중, 급여가 자신의 직급의 평균급여와
   	 같거나 많은 직원의 이름, 업무, 급여 출력
   	 
   	select e1.ename "이름", e1.job "업무", e1.sal "급여"
   		from emp e1 
    	where e1.sal >=(select floor(avg(e2.sal)) 
     	from emp e2
      	where e2.job = e1.job
       	group by job);
        
   2. emp 테이블을 조회하여 부서별 최대 연봉을 가지는 직원의 이름과
   연봉 출력[where (칼럼1, 칼럼2) in (서브쿼리 컬럼1, 컬럼2)]
   
   //부서별 최대 연봉
   select max(e1.sal), deptno
   	from emp e1
   	group by e1.deptno
   	
   	
   	답)
   	select  e.ename, e.sal
   		from emp e
   	where (e.sal, e.deptno) in (select max(e1.sal), deptno
   							from emp e1
   							group by e1.deptno);
   							
   							
   	//부서이름까지 출력하기
        select  e.ename, e.sal, d.dname
   		from emp e,dept d
        where (e.sal, e.deptno) in (select max(e1.sal), deptno
   							from emp e1
   							group by e1.deptno)
                            and e.deptno = d.deptno;
     
                            
     emp 테이블을 조회하여 각 부서별 입사일이 가장 오래된 사원의 이름, 입사일, 부서번호, 부서명을 출력
     (단, 부서번호 오름차순)
     
     부서별 입사일이 가장 오래된 사원의 입사 날짜
        select min(hiredate), deptno
     		from emp
     		group by deptno;
     	
        select e.ename, e.hiredate, e.deptno,d.dname
     		from emp e,dept d
     		where e.deptno = d.deptno;
   
		답)     	
     	select e.ename, e.hiredate, e.deptno,d.dname
     		from emp e,dept d
     		where e.deptno = d.deptno
        	and (e.hiredate,d.deptno) in (select min(hiredate), deptno
     		from emp
     		group by deptno);
   
   
   
   
   
   
   
  						
  
  
  