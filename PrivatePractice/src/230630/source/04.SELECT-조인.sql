/****************SELECT문실행순서************************
- FROM, JOIN > WHERE, GROUP BY, HAVING > SELECT > ORDER BY

1.FROM과 JOIN
    JOIN이 먼저 실행되어 데이터가 SET으로 모아지게 됌.
    여기에는 서브쿼리도 함께 포함되어 임시적인 테이블을 만들 수 있게 도와줌.
2.WHERE
    데이터셋을 형성하게 되면 WHERE의 조건이 개별 행에 적용이 된다. 
    이 WHERE절의 제약 조건은 FROM절로 가져온 테이블에 적용이 될 수 있다.
3.GROUP BY
    WHERE의 조건 적용 후 나머지 행은 GROUP BY절에 지정된 열의 공통 값을 기준으로 그룹화된다. 
    쿼리에 집계 기능이 있는 경우에만 이 기능을 사용해야 한다.
4.HAVING
    GROUP BY 절이 쿼리에 있을 경우 HAVING 절의 제약조건이 그룹화된 행에 적용됌.
5.SELECT
    SELECT에 표현된 식이 마지막으로 적용됌.
6.DISTINCT
    표현된 행에서 중복된 행은 삭제됌
7.ORDER BY
    지정된 데이터를 기준으로 오름차순, 내림차순을 지정
*******************************************************************************/

--JOIN[ANSI,SQL3,SQL1999]
--CROSS JOIN
select * from emp cross join dept;
--table alias( as 를 사용하지않는다)
select e.empno,e.ename,e.job,e.sal,e.deptno,d.deptno,d.dname,d.loc from emp e cross join dept d;
--NATURAL JOIN(emp.deptno,dept.deptno 사용불가능):같은이름을가진 컬럼을 조인조건으로사용
select e.empno,e.ename,deptno,d.dname,d.loc from emp e natural join dept d;
--join ~ using 이용한 Join: 동일이름의 컬럼이 여러 개인 경우 조인 컬럼을 지정

--join ~ on 을 이용한조인

/*
   inner join:조인조건에만족하는     행만출력
   outer join:조인조건에만족하지않는 행도출력
*/
/******************************************************************************
inner join[조인조건에만족하는     행만출력]
******************************************************************************/
select e.empno,e.ename,e.job,e.sal,e.deptno "사원부서번호(FK)",d.deptno "부서부서번호(PK)",d.dname,d.loc
from emp e inner join dept d 
on  e.deptno=d.deptno;

--table alias( as를 사용하지않는다)

/*************************************************************************
left outer join
    - 조인조건에만족하지않는 왼쪽테이블의행도출력
    - 부서번호를 가지지않은 사원도 출력(부서를 배정받지 못한사원도 출력)
************************************************************************/
--smith부서번호 --> null
select e.empno,e.ename,e.job,e.sal,e.deptno "사원부서번호(FK)",d.deptno "부서부서번호(PK)",d.dname,d.loc
from emp e  left outer join dept d 
on  e.deptno=d.deptno;


/*************************************************************************
right outer join
    - 조인조건에만족하지않는 오른쪽테이블의행도출력
    - 사원이소속되어있지않은 부서정보도출력
************************************************************************/


/*************************************************************************
full outer join
    - 조인조건에만족하지않는 왼쪽,오른쪽테이블의행도출력
    - 부서번호를 가지지않은 사원도 출력(부서를 배정받지 못한사원도 출력)
    - 사원이소속되어있지않은 부서정보도출력
************************************************************************/

-- on절 (조인조건)

--temp(dept_code),tdept(dept_code)


--student(deptno1),department(deptno)


--student(deptno1,deptno2),department(deptno)



--emp(sal) + salgrade(losal,hisal)

--3개테이블조인
--emp(sal,deptno) + salgrade(losal,hisal)+ dept(deptno)

--3개테이블조인
--student(profno,deptno1) + professor(profno) + department(deptno)
/*
join순서
  1. student 와 professor조인
  2. student 와 professor조인결과 set(테이블) 과 professor테이블조인
*/


--self join
/*
사원과 매니져이름 출력
inner join(매니져가 존재하는사원)
*/


/*
사원과 매니져이름 출력
left outer join(매니져가 존재하지않는사원도출력)
*/


/*
사원과 매니져이름 출력
right outer join(사원이 참조하지않는매니져도출력)
select e.empno "사원번호",
       e.ename "사원이름",
       e.mgr   "사원매니져번호",
       m.empno "매니져사원번호",
       m.ename  "매니져사원이름"
from emp e 
right outer join emp m 
on e.mgr = m.empno ;
*/
--계층형질의


/*******************
on조인조건에서 filtering 하는경우와
where 구문에서 filtering 하는경우
outer join시에 차이가발생
********************/

--inner join

--outer join










