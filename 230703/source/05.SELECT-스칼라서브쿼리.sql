--scalar subquery(where 절)
select sal from emp where ename='SMITH';--800
select sal from emp where ename='SCOTT';--3000;

select * from emp where sal > 3000;

select * from emp where sal > (select sal 
                                from emp 
                                where ename='SCOTT');

select * from emp where sal> 800 and sal< 3000;

select * from emp where sal> (select sal 
                                from emp 
                                where ename='SMITH') 
                        and sal< (select sal
                                from emp 
                                where ename='SCOTT');
--scalar subquery(column)
 select e.empno,e.ename, e.deptno,
        (select dname
            from dept
         where e.deptno=dept.deptno) "부서이름",
         (select loc 
         from dept
         where e.deptno=dept.deptno) "부서위치"
from emp e;   

--join

select e.empno,e.ename,e.deptno,d.dname,d.loc 
from emp e 
join dept d 
on e.deptno=d.deptno;

--단일행이반환되는 서브쿼리
--단일행연산자(=,!=,>,<)

select empno,
ename,
job,
sal from emp where sal >= (select min(sal) 
                                                from emp 
                                                where deptno=20);

--scalar subquery(having)
select deptno,min(sal) 
from emp
group by deptno
having min(sal) > (select min(sal)
                    from emp 
                    where deptno=20);

--복수행이 반환되는 서브쿼리
--복수행연산자(in,any,all)
--in    

select min(sal) from emp group by deptno;
select * from emp where sal in(950,800,1300);

select * from emp where sal in(select min(sal)
                                from emp 
                                group by deptno);


/****************all********************/
select sal from emp where job='MANAGER';
/*
2975
2850
2450
*/
--모든MANAGER보다 월급이 적은사원들
select * from emp where sal< all(2975,2850,2450);
select * from emp where sal<2975 and sal<2850 and sal<2450;
select * from emp where sal<all(select sal 
                                from emp 
                                where job='MANAGER');

--모든MANAGER보다 월급이 많은사원들
select * from emp where sal > all(2975,2850,2450);
select * from emp where sal > 2975 and sal>2850 and sal>2450;
select * from emp where sal > all(select sal 
                                from emp 
                                where job='MANAGER');

/***************any*********************/

--모든MANAGER보다 월급이 적은사원들
select * from emp where sal< all(2975,2850,2450);
select * from emp where sal<2975 and sal<2850 and sal<2450;
select * from emp where sal<all(select sal 
                                from emp 
                                where job='MANAGER');

--모든MANAGER보다 월급이 많은사원들
select * from emp where sal > all(2975,2850,2450);
select * from emp where sal > 2975 and sal>2850 and sal>2450;
select * from emp where sal > all(select sal 
                                from emp 
                                where job='MANAGER');

                                    
                                 
