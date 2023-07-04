--in line view subquery
--view(논리적테이블)
/*
ORA-01031: insufficient privileges
*/
create or replace view emp10_view
as
select empno,ename,job,sal 
from emp
where deptno=10;
--view
select * from emp10_view;
--in line view(임시뷰)
select * from (select empno,ename,job,sal 
                from emp
                where deptno=10) emp10;
/*
select * from (select * 
                from (select * 
                       from emp
                     )
              );
*/



/**********************************************************
부서별로 최소연봉을 가진직원의 사번,이름,연봉을 읽어오세요
**********************************************************/
/*
select  empno,ename,sal,deptno,(select min(sal) "min_sal" 
                                from emp e1 
                                where e1.deptno=e2.deptno 
                                group by deptno ) "부서별최소연봉" 
from emp e2
where sal= (select min(sal) "min_sal" 
            from emp e1 
            where e1.deptno=e2.deptno 
            group by deptno );


select * from (select  empno,ename,sal,deptno,(select min(sal) "min_sal" 
                                from emp e1 
                                where e1.deptno=e2.deptno 
                                group by deptno ) "부서별최소연봉" 
                from emp e2)
where sal="부서별최소연봉";
*/

--부서별 최소연봉(in line view)
/*
  DEPTNO    MIN_SAL
---------- ----------
        30        950
        20        800
        10       1300
*/
select deptno,min(sal) "min_sal" from emp group by deptno; 

--직원의 사번,이름,연봉테이블
/*
     EMPNO ENAME             SAL     DEPTNO
---------- ---------- ---------- ----------
      7369 SMITH             800         20
      7499 ALLEN            1600         30
      ...
*/
select empno,ename,sal from emp;


select * from emp e1 
        join (select deptno,min(sal) "min_sal"
                from emp group by deptno) e2 
        on e1.deptno=e2.deptno and e1.sal=e2."min_sal";
 
--바로 위에랑 같은 결과 나옴 
select *
from emp e1 cross join 
    (select deptno, min(sal) "min_sal" 
    from emp
    group by deptno) e2
where e1.deptno = e2.deptno and e1.sal = e2."min_sal";

select *
from emp e1  join 
    (select deptno, min(sal) "min_sal" 
    from emp
    group by deptno) e2
    on e1.deptno = e2.deptno and e1.sal = e2."min_sal";


/********************************************************
동일한직급을가진 사원의 평균연봉보다 연봉이 높은 사원들출력
*********************************************************/
--1.직급별 사원 평균연봉 테이블


/*
JOB        job_avg_sal
--------- -----------
CLERK          1037.5
SALESMAN         1400
PRESIDENT        5000
MANAGER       2758.33
ANALYST          3000
*/

select job, round(avg(sal)) "job_avg_sal" 
from emp
group by job;


--2.사원테이블

/*
 EMPNO ENAME      JOB              MGR HIREDATE          SAL       COMM     DEPTNO
---------- ---------- --------- ---------- ---------- ---------- ---------- ----------
 7369 SMITH      CLERK           7902 1980/12/17        800                    20
 ...
*/

select * from emp;

select * from emp e1  join (select job, round(avg(sal)) "job_avg_sal"
                                    from emp
                                    group by job) e2 
on e1.job = e2.job and e1.sal >= e2."job_avg_sal";
                                    

--rank()함수,dense_rank()함수
select empno,
        ename,
        job,
        sal,
rank() over (order by sal desc) "급여순위" 
from emp;

select empno,
ename,
job,
sal,
rank() over(partition by job order by sal desc) "직급별 급여순위"
from emp;

select empno,
ename,
deptno,
job,
sal,
rank() over(partition by deptno order by sal desc) "부서별 급여순위"
from emp;

--2795 sal값의 순위 
select rank(2975) within group(order by sal desc) "2975급여순위" --rank() ~~group()  하나의 공식같은거 
from emp;

--사원테이블에서 입사일의 순위
select empno, ename, hiredate, rank() over (order by hiredate asc) "입사일순위" from emp;
--1981/09/28일 입사한사원의 순위
select rank(to_date('1981/09/28','YYYY/MM/DD')) within  group (order by hiredate asc) from emp;

select  empno, ename, sal, rank() over(order by sal desc) "급여순위"from emp ;

select * from (select  empno, ename, sal, rank() over(order by sal desc) "급여순위"from emp) e
where e."급여순위" <= 3; 

--row_number()

select empno, ename, job , sal, row_number() over(order by sal desc) "급여순위"from emp;
                                                 --ROW_NUMBER(): 각 행에 대한 일련번호를 생성하는 함수입니다.
                                                 --OVER: 함수가 특정 행 집합에 작용한다는 것을 나타냅니다.
        
--rownum
/*
 rownum (pseudo(유사) column)
    - 오라클에서만 사용가능한컬럼
    - select시에 조건에맞는 행에 순차적부여
    - where 조건문에서 1번을 포함하는범위조건내에서는 사용가능
    - where 조건문에서 1번을 포함하지않는 범위조건내에서는 사용불가능
*/

select rownum, empno, ename, job, sal from emp;  -- rownum은 여기서는 empno의 오름차순식으로 부여함
select rownum, empno, ename, job, sal from emp order by sal desc;
                                                    -- rownum은 여기서는 empno의 오름차순식으로 부여함
select rownum "rn", e. * from (select * from emp order by sal desc) e;     -- 근데 여기서는 sal과 job으로 내림차순
select * from (select rownum "rn", e.* from (select * from emp order by sal desc) e)
where "rn" >=3 and "rn" <=5;              -- 필터링한거임

-- fetch rows
--oracle 12 부터추가

--offset 0 base 9(10번째이후~)

--offset 0 base 9(10번째이후 2 row)
--select rownum,empno,ename,job,sal from emp  where rownum = 1;(XXXX)







    





