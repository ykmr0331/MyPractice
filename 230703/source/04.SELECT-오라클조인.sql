--ORCLE JOIN

--cross join(catesian product) 

select * from emp e, dept d;


--equi join(동등조인)

/*
 inner join : 조인조건에 만족하는     행만 출력
 outer join : 조인조건에 만족하지않는 행도 출력
*/


/*
inner join :
    - 조인조건에 만족하는     행만 출력
    - 부서번호를 가진사원만출력(부서를 배정받은사원출력)
*/
select * from emp e, dept d
where e.deptno = d.deptno
;

/*
left outer join :
    - 조인조건에 만족하지않는 왼쪽테이블의 행도 출력
    - 부서번호를 가지지않는 사원도출력(부서를 배정받지못한사원도출력)
*/

select * from emp e, dept d
where e.deptno(+) = d.deptno;
-- BOSTON은 dept테이블에는 있지만 emp테이블에는 없다.


/*
right outer join :
    - 조인조건에 만족하지않는 오른쪽테이블의 행도 출력
    - 사원이소속되있지않은 부서정보도출력
*/
select * from emp e, dept d
where e.deptno = d.deptno(+);





/*
full outer join:
    - 조인조건에 만족하지않는 오른쪽,왼쪽 테이블의 행도 출력
    - 부서번호를 가지지않는 사원도출력(부서를 배정받지못한사원도출력)
    - 사원이소속되있지않은 부서정보도출력
*/

select *
from emp e, dept d
where e.deptno = d.deptno(+)

union

select *
from emp e, dept d
where e.deptno(+) = d.deptno;

--non-equi-join(비동등조인)

select e.empno,
e.ename,
e.sal, 
g.losal, 
g.hisal, 
g.grade 
from emp e, salgrade g 
where e.sal >=g.losal and e.sal <= g.hisal;

--3개 테이블조인
--student + prefessor + department
select 

s.studno,
s.name,
p.name,
p. position,
d1.dname "주전공",
d2.dname "부전공"

from  student s,
professor p,
department d1,
department d2
where s.profno = p.profno and s.deptno1 = d1.deptno and s.deptno2 = d2.deptno ;



select s.studno, s.name , p.name, p.position, d1.dname"주전공", d2.dname"부전공"
from student s, professor p, department d1, department d2
where s.profno = p.profno(+) and s.deptno1 = d1.deptno(+) and s.deptno2 = d2.deptno(+);
--모두 right outer join




--self join

--inner join
 select e.empno,
    e.ename,
    e.mgr "사원매니저번호",
    m.empno "매니저의 사원번호",
    m.ename "매니저의 이름"
 from emp e, emp m
 where e.mgr = m.empno;
 
 
--left outer join(매니져가없는 사원도 출력)
 select e.empno,
        e.ename,
        e.mgr "사원매니저번호",
         m.empno "매니저의 사원번호", 
        m.ename "매니저의 이름"
from emp e, emp m
 where e.mgr(+) = m.empno;
 --mgr에 없는 empno는   매니저역할을 하지 않는 사원이다

/*
--right outer join(사원이없는 매니져도 출력)????

*/








