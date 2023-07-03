/*
<<< 06.단일 함수.pdf >>>

1. 사원테이블에서 입사일이 12월인 사원의 사번, 사원명, 입사일 검색하시오
*/
select empno, ename, hiredate from emp where to_char(hiredate, 'MM') ='12';
-- hiredate는 날짜형식임


/*
2. 다음과 같은 결과를 검색할 수 있는 SQL 문장을 작성하시오.
*/
select empno, ename, lpad(sal, 10, '*') "급여" from emp;

/*
3 다음과 같은 결과를 검색할 수 있는 SQL 문장을 작성하시오.
*/
select empno, ename, to_char(hiredate, 'YYYY-MM-DD') "입사일" from emp;

/*
4 . 사원 테이블에서 급여에 따라 사번, 이름, 급여, 등급을 검색하는 SQL 문장을 작
성하시오 ( CASE 함수 이용)
*/
select empno, ename, sal,
    (
        case
             when sal >=0 and sal<1000then 'E'
            when sal >=1001 and sal <2000 then 'D'
            when sal >=2001 and sal <3000 then 'C'
            when sal >=3001 and sal <4000 then 'B'
            when sal >=4001 and sal <5000 then 'A'
            
        end     

    )"등급"
from emp;


