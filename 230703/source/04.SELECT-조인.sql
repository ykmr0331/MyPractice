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
select * from emp e cross join dept d;
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
내부 조인은 두 테이블에 모두 데이터가 있어야만 결과가 나온다~~~~~~~
******************************************************************************/

select e.empno,e.ename,e.job,e.sal,e.deptno "사원부서번호(FK)",d.deptno "부서부서번호(PK)",d.dname,d.loc
from emp e inner join dept d 
on  e.deptno=d.deptno;

--table alias( as를 사용하지않는다)






/*************************************************************************
left outer join
    - 조인조건에만족하지않는 왼쪽테이블의행도출력
    - 부서번호를 가지지않은 사원도 출력(부서를 배정받지 못한사원도 출력)

외부 조인은 한쪽에만 데이터가 있어도 결과가 나옵니다. ~~~~~~~~~~~~~~   
    
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
--40번부서 사원이참조하고있지않음
select e.empno,e.ename,e.job,e.sal,e.deptno "사원부서번호(FK)",d.deptno "부서부서번호(PK)",d.dname,d.loc
from emp e  right outer join dept d 
on  e.deptno=d.deptno;

/*************************************************************************
full outer join
    - 조인조건에만족하지않는 왼쪽,오른쪽테이블의행도출력
    - 부서번호를 가지지않은 사원도 출력(부서를 배정받지 못한사원도 출력)
    - 사원이소속되어있지않은 부서정보도출력
************************************************************************/
select *  
from emp e  full outer join dept d  
on e.deptno=d.deptno ;


--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



-- on절 (조인조건)


--temp(dept_code),tdept(dept_code)
select e.emp_id,
       e.emp_name,
       e.dept_code "사원부서코드",
       d.dept_code "부서부서코드",
       d.dept_name,
       d.area 
        from temp e 
        join tdept d 
on  e.dept_code=d.dept_code;
--ON 절은 두 테이블 간의 일치 기준을 지정하는 데 사용



--student(deptno1),department(deptno)
select * from student;
select * from department;

select s.studno,
    s.name,
    s.grade ,
    s.deptno1 "학생주전공번호" ,
    d.deptno "전공번호",
    d.dname "주전공"
from student s 
join department d
on s.deptno1=d.deptno;
    /*student 테이블과 department 테이블을 INNER JOIN하여
    두 테이블의 deptno1 열이 일치하는 행을 조회*/


--student(deptno1,deptno2),department(deptno)
--주전공과 부전공이있는 학생들만출력
select studno,
        name,
        s.deptno1 ,
        s.deptno2,
        d1.deptno ,
        d1.dname  "주전공",
        d2.dname "부전공"
        
from student s                  --학생테이블
join department d1              --   이건 전공        department테이블과 join   
on s.deptno1 = d1.deptno        --  student 테이블의 deptno1열과 department 테이블의  deptno열이 일치하는 경우

inner join department d2         -- 이건 부전공 (여기서 부전공이 없는 학생이 경우에 안나타남) 
on s.deptno2 = d2.deptno;        --  student 테이블의 deptno2열과 department 테이블의  deptno열이 일치하는 경우
     
      /*student 테이블과 department 테이블을 INNER JOIN하고, 
      department 테이블을 INNER JOIN하는 3중 조인*/

--모든학생들의 번호,이름,주전공과 부전공을출력
select studno,
        name,
        s.deptno1 "student 주전공번호",
        s.deptno2 "student 부전공번호 ",
        d1.deptno  "주전공번호",
        d1.dname  "주전공",
        d2.dname "부전공"
from student s
left outer join department d1  -- 이렇게하면  한쪽에만 있어도 데이터가 나옴(근데 어차피 다 주전공은 있기에 상관없음
on s.deptno1 = d1.deptno
left outer join department d2   -- 이렇게하면 한쪽에만 있어도 데이터가 나옴(여기서 차이발생, 부전공 없는 학생은 16명이나 되기 때문)
on s.deptno2 = d2.deptno;


--emp(sal) + salgrade(losal,hisal)
select e.empno,
        e.ename,
        e.sal,
        g.losal,    
        g.hisal,
        g.grade "급여등급" 
from emp e 
join salgrade g
on e.sal>=g.losal and e.sal<=g.hisal;


--3개테이블조인
--emp(sal,deptno) + salgrade(losal,hisal)+ dept(deptno)
select e.empno,
        e.ename,
        d.dname "dept 부서이름",
        e.sal    "empt sal",  
        g.losal "salgrade losal",
        g.hisal "salgrade hisal",
        g.grade "급여등급" 
from emp e 
left outer join salgrade g
on e.sal>=g.losal and e.sal<=g.hisal
left outer join dept d
on e.deptno=d.deptno;


--3개테이블조인
--student(profno,deptno1) + professor(profno) + department(deptno)


/*
join순서
  1. student 와 professor조인
  2. student 와 professor조인결과 set(테이블) 과 department테이블조인(deptno)
*/


--inner join
select s.studno "학생번호",
        s.name "학생이름" ,
        p.name "지도교수",
        d.dname "주전공"
from student s
inner join professor p
on s.profno=p.profno     -- 
inner join department d
on s.deptno1=d.deptno;


--outer join
select s.studno "학생번호",
        s.name "학생이름" ,
        p.name "지도교수",
        d.dname "주전공"
from student s

left outer join professor p
on s.profno=p.profno

left outer join department d
on s.deptno1=d.deptno;


--self join
/*
사원과 매니져이름 출력
inner join(매니져가 존재하는사원)
*/ 

select  e.empno "사원번호",
        e.ename "사원이름",
        e.mgr "사원매니져번호",
        m.empno "매니져사원번호",
        m.ename "매니져이름"
from emp e 
inner join emp m
on e.mgr=m.empno;


/*
사원과 매니져이름 출력
left outer join(매니져가 존재하지않는사원도출력)
*/
select  e.empno "사원번호",
        e.ename "사원이름",
        e.mgr "사원매니져번호",
        m.empno "매니져사원번호",
        m.ename "매니져이름"
from emp e 
left outer join emp m
on e.mgr=m.empno;


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

select *
from emp e
inner join dept d
on e.deptno = d.deptno and e.sal > 1000;


--outer join


select *
from emp e
left outer join dept d
on e.deptno = d.deptno and e.sal > 1000; -- e.sal > 1000이 안되는 _JAMES와 SMITH도 나옴 (위랑 아래와 다른점)

/*두 테이블의 deptno 열이 일치하는 행을 조회하기 때문에,
emp 테이블의 sal 열이 1000보다 크더라도 
dept 테이블에 해당하는 행이 없는 경우에도 
emp 테이블의 행을 조회합니다.*/




select *
from emp e
left outer join dept d
on e.deptno = d.deptno -- WHERE 보다 JOIN이 먼저 SQL순서이므로 여기서 이미 한번 걸러진다.
where  e.sal > 1000;
/*두 테이블의 deptno 열이 일치하는 행을 조회한 후, 
emp 테이블의 sal 열이 1000보다 큰 행을 조회하기 때문에, 
emp 테이블의 sal 열이 1000보다 크더라도 dept 테이블에 해당하는 행이 없는 경우에는
emp 테이블의 행을 조회하지 않습니다.*/













