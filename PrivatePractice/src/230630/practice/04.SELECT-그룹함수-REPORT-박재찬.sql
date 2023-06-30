/*<<< 07.그룹 함수.pdf >>>*/









/*
1. 사원테이블에서 부서별 인원수가 6명 이상인 부서코드를 검색하시오.
*/
select 
    deptno
from emp
group by deptno
having count(*) >=6; --having 절은 조건을 지정합니다. 이 경우 count(*) >= 6 조건을 지정합니다. 즉, 그룹의 개수가 6개 이상인 경우만 출력합니다.










/*
2. 사원테이블로부터 부서번호, 업무별 급여합계를 계산하고자 한다.
   다음과 같은 결과를 출력할 수 있는 SQL문장을 작성하시오.*/
   
   
   
select deptno "DEPTNO", job "job", sum(sal)"SUM(SAL)"
from emp
group by deptno,job
order by deptno;
   /*
	--> 일반출력
      -----------------------------
      DEPTNO   JOB         SUM(SAL)
      ----------------------------
       10	    CLERK	       1300
       10	    MANAGER	     2450
       10	    PRESIDENT	   5000
       20	    ANALYST	     6000
       20	    CLERK	       1900
       20	    MANAGER	     2975
       30	    CLERK	        950
       30	    MANAGER	     2850
       30	    SALESMAN	    5600
       */
       
       
select 
        DEPTNO, 
        sum(decode(job,'CLERK',sal)) "CLERK",
        sum(decode(job,'MANAGER',sal)) "MANAGER",
        sum(decode(job,'PRESIDENT',sal)) "PRESIDENT",
        sum(decode(job,'ANALYST',sal)) "ANALYST",
        sum(decode(job,'SALESMAN',sal)) "SALESMAN"    
from emp
where 1=1
group by deptno
order by deptno;
    /*
    	--> 가로출력(과제아님)
	----------------------------------------------------
	DEPTNO  CLERK  MANAGER  PRESIDENT  ANALYST SALESMAN
	----------------------------------------------------
	   10     1300    2450      5000             
	   20     1900   2975               6000      
	   30     950    2850                         5600
       
       */
 
  /*
  3. 사원테이블로부터 년도별 , 월별 급여합계를 출력할 수 있는 SQL문장을 작성하시오.*/
  

       
select  extract(year from hiredate) as "년",
            extract(month from hiredate) as "월",
            sum(sal)as "급여합계"
from emp
group by extract(year from hiredate), extract(month from hiredate)
order by extract(year from hiredate);

  /*  그니까 입사 날짜 기준으로 그 사원의 봉급을 구하라
	-->일반출력

	년    월    SUM(SAL)
	---- -- ----------
	1980 12        800
	1981 02       2850
	1981 04       2975
	1981 05       2850
	1981 06       2450
	1981 09       2750
	1981 11       5000
	1981 12       3950
	1982 01       1300
	1987 04       3000
	1987 05       1100
    */
    
    
    
    
    
    
select  extract(year from hiredate) as "년",
            extract(month from hiredate) as "월",
            sum(sal)as "급여합계"
from emp
group by extract(year from hiredate), extract(month from hiredate)
order by extract(year from hiredate);

select extract(year from hiredate) as "연도",
        extract(month from hiredate) as "월",
/*
	----------------------------------------------------
	연도   1월    2월   3월   4월... 12월  연도별급여합
	---------------------------------------------------
	2018    10    20    40                       320
	2019
	2020
    */
    
    
    
    
    
    
    
/*
4. 사원테이블에서 부서별 comm(커미션) 을 포함하지 않은 연봉의 합과
   포함한 연봉의 합을 구하는 SQL을 작성하시오.
*/











/*
5. 사원테이블에서 SALESMAN을 제외한 JOB별 급여합계를 구하시오.     
  */     
       
       
       
       
       
       
       