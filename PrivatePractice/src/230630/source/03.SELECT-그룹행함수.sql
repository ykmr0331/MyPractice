
--그룹함수
--emp테이블(전체사원그룹)
select sum(sal) "사원전체급여합", 
       min(sal) "사원전체최소급여" ,
       max(sal) "사원전체최대급여",
       trunc(avg(sal)) "사원급여평균",
       avg(comm) "null제외평균커미션???",
       trunc(avg(nvl(comm,0))) "평균커미션",
       count(empno) "사원수",
       count(comm) "커미션받는 사원수???",
       count(*) "사원수(null포함)"
from emp;







--부서별로 그룹핑(emp테이블안에서)
select  deptno,
        count(*) "부서별사원수",
        round(avg(sal)) "부서별급여평균",
        min(sal) "부서별최소급여",
        max(sal) "부서별최대급여",
        sum(sal) "부서별급여합"
from emp
where 1=1
group by deptno
order by deptno;









--부서별인원수 5명이하인 부서출력
--having(grouping  이후 filtering)

select  deptno,
        count(*) "부서별사원수" 
from emp
where 1=1
group by deptno
having count(*)<=5
order by deptno;








--부서별 평균급여가 2000 이상인 부서의 부서번호,부서별평균급여 출력
select  deptno,
        round(avg(sal)) "부서별평균급여"
from emp
group by deptno
having avg(sal)>=2000
order by "부서별평균급여" asc;








--직급별로 그룹핑
select job,
        count(*) "직급별인원수",
        round(avg(sal)) "직급별급여평균",
        sum(sal) "직급별 급여합"
from emp
group by job
order by "직급별인원수";






--직급별급여평균이 3000이상인 직급,직급별급여평균,직급별사원수 출력

select job,round(avg(sal)) "직급별급여평균",count(*) "직급별사원수"
from emp
group by job
having avg(sal)>=3000
order by "직급별급여평균" asc;









--사원테이블에서 부서별 부서내에서 직급별 인원수(급여평균,급여합계) 출력
select deptno,job,
       count(*) "부서내직급별인원수",
       avg(sal) "부서내직급별평균급여",
       sum(sal) "부서내직급별급여합"
from emp
group by deptno,job
order by deptno asc,job asc;









--가로출력
/*
    DEPTNO   SUM(SAL)
---------- ----------
        10       8750
        20      10875
        30       9400
*/

select deptno,sum(sal) 
from emp
group by deptno
order by deptno asc;












/*
        10         20         30     
---------- ---------- ---------- 
      8750      10875       9400  
*/
select  sum(decode(deptno,10,sal)) "10",
        sum(decode(deptno,20,sal)) "20",
        sum(decode(deptno,30,sal)) "30" 
from emp;












/*
JOB         SUM(SAL)
--------- ----------
CLERK           4150
SALESMAN        5600
PRESIDENT       5000
MANAGER         8275
ANALYST         6000
*/
select job, 
        sum(sal) 
from emp 
group by job;














/*
CLERK   SALESMAN  PRESIDENT    MANAGER    ANALYST    급여총합
------ ---------- ---------- ---------- ---------- ----------
4150     5600       5000        8275        6000      29025
*/
select  sum(decode(job,'CLERK',sal)) "CLERK", 
        sum(decode(job,'SALESMAN',sal)) "SALESMAN", 
        sum(decode(job,'PRESIDENT',sal)) "PRESIDENT",
        sum(decode(job,'MANAGER',sal)) "MANAGER", 
        sum(decode(job,'ANALYST',sal)) "ANALYST", 
        sum(sal) "급여총합" 
from emp;







--rollup
/*
JOB         SUM(SAL)
--------- ----------
ANALYST         6000
CLERK           4150
MANAGER         8275
PRESIDENT       5000
SALESMAN        5600
               29025
*/
--rollup()함수:총계산출
select job ,sum(sal) from emp
group by rollup(job);











select deptno,job ,sum(sal) 
from emp
group by rollup(deptno,job)
order by deptno,job;












--cube()함수:총계산출
select job ,sum(sal) from emp
group by cube(job);










select deptno,job ,sum(sal) 
from emp
group by cube(deptno,job)
order by deptno,job;
/*
   DEPTNO JOB         SUM(SAL)
---------- --------- ----------
        10 CLERK           1300
        10 MANAGER         2450
        10 PRESIDENT       5000
        20 ANALYST         6000
        20 CLERK           1900
        20 MANAGER         2975
        30 CLERK            950
        30 MANAGER         2850
        30 SALESMAN        5600
*/










/*
   DEPTNO      CLERK   SALESMAN  PRESIDENT    MANAGER    ANALYST       급여총합
---------- ---------- ---------- ---------- ---------- ---------- ----------
        10       1300                  5000       2450                  8750
        20       1900                             2975       6000      10875
        30        950       5600                  2850                  9400
*/
--listagg() : 가로출력함수(그룹함수)

select listagg(ename||'('||job||')',',') from emp;
select listagg(ename||'('||job||')',',') within group(order by ename asc) from emp;

select deptno, listagg(ename||',')  "부서원들", count(*) "부서원수"  from emp group by deptno;

select deptno,job,listagg(ename|| ',') 
from emp
group by deptno,job;

select job,sum(sal),listagg(ename||'('||sal||')',',') 
from emp
group by job;











