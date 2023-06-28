--SELECT
--SELECT
/*
장문주석
*/
--계정이소유한 테이블목록
select * from tab;


--테이블컬럼구조
desc dept;    --Oracle 데이터베이스의 dept 테이블의 구조를 설명하는 SQL 명령
desc emp;


--모든컬럼 selection
select * from dept; //부서테이블
select * from emp; //사원테이블

-- 원하는 칼럼만 selection
SELECT empno, ename, job, hiredate FROM emp; //사원 테이블의 번호 이름 직급 고용일 기준으로 선택

/*
오라클 리터럴
    1. 숫자: 90,1.234
    2. 문자: '문자','ABC','a'
*/




--컬럼연산(숫자,산술연산)
SELECT '강사', '김경호' from dual;
    --오라클 데이터베이스의 dual 테이블에서 강사와 김경호 라는 두 개의 문자열을 선택하는 SQL 명령입니다.
    -- dual 테이블은 가상 테이블로, 항상 한 행과 한 열을 포함합니다. 따라서 이 명령은 강사와 김경호 라는 두 개의 문자열을 반환합니다.
SELECT 1111 + 56, 23*45.78 from dual;

SELECT empno,ename,sal, sal*1.1 FROM emp;
select empno, ename, sal*12 from emp;



--컬럼별칭(alias)
select empno as "사원번호",ename as "사원이름",sal as "사원급여" ,sal * 12 as "사원연봉"  from emp;
select empno "사원번호",ename  "사원이름",sal  "사원급여" ,sal * 12  "사원연봉"  from emp;
select empno  사원번호,ename  사원이름,sal  사원급여 ,sal * 12  사원연봉  from emp;
select deptno, dname, loc from dept;

        -- AS를 사용하지 않을 경우, 컬럼별칭 앞에 공백을 넣거나 문자열 표시를 해주면 됩니다

-- as생략가능

select empno  "사원번호",ename  "사원이름",sal "사원급여" ,sal * 12  "사원연봉"  from emp;
select empno  사원번호,ename  사원이름,sal  사원급여,sal * 12 사원연봉 from emp;
select deptno "부서번호", dname "부서이름", loc"부서위치" from dept;



--null값의 연산결과는 null(????)
select empno, ename, sal, comm,sal+comm "총급여" from emp;


--컬럼연산(문자열 연산  || )
select '김'||'경호' from dual; --dual 테이블에서 김과 경호 두 개의 문자열을 연결하여 김경호라는 문자열을 반환하는 SQL 명령
                                           --  || 는 문자열 연결 연산자입니다            
select 1234 || '문자열' from dual;


/*
'SMITH' 님의 급여는 800 입니다
*/
select ''''||ename || ''''   ||' 님의 급여는' ||SAL|| '입니다.' from emp;    --  ||는 연산자는 두 문자열을 연결하는 데 사용됩니다 그니까 + 대신 사용한다고 생각하자

/*
사번 7900님의 지급은 MANAGER 입니다.
*/

select  '사번'||empno||'님의 직급은 '|| job||'입니다.' from emp;
desc dual;  --dual 테이블의 구조를 설명하는 SQL 명령
select * from dual;

select '''''김경호''''' from dual;                                       -- ''가 '로 표현됌, 그리고 기본적으로 문자열은 ' '안에 있어야함  따라서 ''김경호''나옴
select 60 * 60 * 24 * 365 "일년을 초로환산" from dual;

--DISTINCT(중복행제거)

select distinct job from emp;

/*******************
데이타 제한과 정렬
*******************/
--where
select * from emp where 1 =1; -- 다나옴
select * from emp where 1 =2; 
select * from emp where deptno = 30;
select * from emp where job = 'SALESMAN';
select * from emp where empno = 7839;
select * from emp where hiredate = '1981/12/03';

--비교연산자
--숫자비교
select * from emp where sal = 3000;
select * from emp where sal >= 3000;
select * from emp where sal < 3000;
select * from emp where sal != 3000;
select * from emp where sal <> 3000; --  sal (급여)열의 값이 3000과 같지 않은 모든 행을 선택하는 SQL 명령
select * from emp where sal ^= 3000;  -- sal (급여) 열의 값이 3000과 같지 않거나 NULL인 모든 행을 선택하는 SQL 명령

--문자비교
select * from emp where job = 'SALESMAN';
select * from emp where job != 'SALESMAN';
select * from emp where job ^= 'SALESMAN';
select * from emp where job <> 'SALESMAN';
-- select * from emp where job >= 'clerk';

--null 비교
    -- select empno, ename, sal, comm from emp where comm = null;(이렇게 하면 안됌)
select empno, ename, sal, comm from emp where comm is null;
select empno, ename, sal, comm from emp where comm is not null;

--between
 
 select * from emp where sal between 1000 and 2000; 
 select * from emp where sal >= 1000 and sal <= 2000; 
 
--in
select * from emp where empno in(7369,7788,7839);
select * from emp where empno =7369 or empno =7788 or empno =7839;

select * from emp where job in ('SALESMAN','clerk');
select * from emp where job ='SALESMAN' or job ='clerk';

--like 연산자[ %(0개이상) , _(1개) ] // %는 '모든 문자'라는 의미고, _는 '한 글자'라는 의미입니다
select empno, ename, sal from emp where ename like 'SMITH';
select empno, ename, sal from emp where ename like '_____'; // 5글자의 모든 이름을 찾는다.
select empno, ename, sal from emp where ename like 's____'; 
select empno, ename, sal from emp where ename like '_l___'; 

select empno, ename, sal from emp where ename like 'A%'; 
        --empno, ename, sal 열을 emp 테이블에서 선택하되, ename 열이 문자 "A"로 시작하는 행만 선택하세요.
select empno, ename, sal from emp where ename like '%T%'; 
select empno, ename, sal from emp where ename like '%_T_%'; -- 중간에 T가 들어가는 경우임 
select empno, ename, sal from emp where ename like '__L%';
/*
찾는문자열
MAR%TIN
_JAMES
*/
select empno, ename, sal from emp where ename like '%\%%' escape '\';  -- \'특수문자'  이건 특수문자 그대로 나오게 하기 위해서 
select empno, ename, sal from emp where ename like '\_%' escape '\'; --escape 문자는 like 연산자가 문자를 와일드카드로 인식하지 않도록 하는 특수 문자임
select empno, ename, sal from emp where ename like '*_%' escape '*';

    -- emp 테이블에서 ename 열에 밑줄()이 포함된 행의 empno, ename, sal 열을 선택하라는 의미입니다. 
    --escape는 특정 문자를 일반 문자로 처리하고자 할 때 사용하는 옵션입니다. 
    --이 경우 escape 문자는 *입니다. 따라서 like 연산자는 ename 열에 밑줄()이 포함된 모든 행을 일치시킵니다.

--입사월이 12월인 사원

select empno, ename, sal, hiredate from emp where hiredate like '____/12/__';

--취미가 null이아닌사원(temp)
select * from temp where hobby is not null;
desc temp;


--취미가있는 과장

--1996년도 입사한 사원중에서 과장이 아닌사원

--논리연산자(and or not)
select * from emp where job = 'SALESMAN' and sal >=1500;
select * from emp where sal >=2001 and sal <= 3000;
select * from emp where sal >= 2001 and sal <=3000 and job = 'MANAGER';
select * from emp where sal >= 2001 and sal <=3000 or job = 'CLERK';
select * from emp where job = 'SALESMAN' or job = 'CLERK';
select * from emp where comm is not null;

--정렬
select * from emp where 1=1 order by empno; -- order default asc
select * from emp where 1=1 order by empno asc;
select * from emp where 1=1 order by empno desc;

--숫자정렬
select empno, ename, job, sal from emp where 1=1 order by sal desc;
select empno, ename, job,sal*12 from emp order by sal*12 desc;
select empno, ename, job,sal*12 from emp order by 4 desc; -- 컬럼순서번호(1, 2, 3.....)
select empno, ename, job, sal*12 "연봉" from emp order by "연봉" desc;

--문자정렬
select empno, ename, sal from emp order by ename asc;
select empno, ename, sal from emp order by ename desc;

--날짜정렬(temp):현재와 가까운시간이 더크다
select * from temp order by birth_date asc;
select * from emp order by hiredate desc;

--2차정렬
select * from emp order by sal desc, empno asc;














