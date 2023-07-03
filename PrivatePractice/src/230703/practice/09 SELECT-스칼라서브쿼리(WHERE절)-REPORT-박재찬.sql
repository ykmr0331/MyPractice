/*
1. 사원 테이블에서 BLAKE보다 급여가 많은 사원들의 사번, 이름, 급여를 검색하시오.
*/
select e1.empno "사번",
       e1.ename "이름",
       e1.sal "급여"        
from emp e1
where sal > (select e2.sal                   
            from emp e2
            where e2.ename = 'BLAKE');
/*
2. 사원 테이블에서 MILLER보다 늦게 입사한 사원의 사번, 이름, 입사일을 검색하시오.
*/
select e1.empno "사번",
       e1.ename "이름",
       e1.hiredate "입사일"        
from emp e1
where e1.hiredate > (select e2.hiredate    -- MILLER의 입사날짜가 나와야한다.        
            from emp e2
            where e2.ename = 'MILLER');

/*
3. 사원테이블에서 사원 전체 평균 급여보다 급여가 많은 사원들의 사번, 이름, 급여를 검색하시오.
*/
select e1.empno "사번",
       e1.ename "이름",
       e1.sal "급여"        
from emp e1 where sal >  (select avg(sal)
                            from emp) ;
  
/*
4. 사원 테이블에서 CLARK와 같은 부서이며, 사번이 7698인 직원의 급여보다 많은 급여를 받는


   사원들의 사번, 이름 , 급여를 검색하시오.
*/
select e1.empno "사번",
       e1.ename "이름",
       e1.sal "급여"        
from emp e1 
where e1.deptno  =  (select e2.deptno          -- CLARK과 같은 부서이며  
from emp e2
 where e2.ename = 'CLARK')
 and e1.sal > ( select e3.sal          --사번이 7698인 직원의 급여                                  
                    from emp e3
                    where e3.empno = 7698);
   
/*
5. 사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여를 검색하시오.
*/


select empno "사번",
       ename "이름",
       deptno "부서코드",
       sal "급여"        
from emp  
where sal in (select max(sal)
                from emp
                group by deptno);











