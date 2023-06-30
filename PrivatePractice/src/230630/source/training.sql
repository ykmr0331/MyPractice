select * from tab

desc dept;
desc emp;

select * from dept;

select * from emp;

select empno, ename, job, hiredate from emp;

select '강사', '김경호' from dual;

select 1111 + 56, 23 * 45.78 from dual;

select empno, ename, sal, sal * 1.1 from emp;
select empno, ename, sal * 12 from emp;

select empno as "사원번호", ename as 사원이름, sal as 사원급여, sal * 12 as 사원연봉 from emp;
select empno "사원번호", ename "사원이름", sal "사원급여", sal * 12 "사원연봉" from emp;
select empno 사워번호, ename 사원이름, sal 사원급여, sal *12 사원연봉 from emp;


select empno 사원번호, ename 사원이름, sal 사원급여, sal * 12 사원연봉 from emp;
select deptno "부서번호", dname "부서이름", loc "부서위치" from dept;

select empno, ename, sal, comm, sal + comm "총급여" from emp;

select '김'||'경호' from dual;

select 1234||'문자열' from dual;
select ''''||ename|| ''''  ||' 님의 급여는' ||sal|| '입니다.' from emp; 

select '사번' ||empno||'님의 직급은 '||job||'입니다.' from emp;
desc dual;
select * from dual;

select '''''김경호''''' from dual;
select 60* 60* 24 *365 from dual;

select distinct job from emp;

select * from emp where 1= 1;
select * from emp where 1 =2;
select * from emp where deptno = 30;

select * from emp where job = 'SALESMAN';
select * from emp where empno = 7839;
select * from emp where hiredate = '1981/12/03';

select * from emp where sal = 3000;
select * from emp where sal >= 3000;
select * from emp where sal < 3000;
select * from emp where sal != 3000;
select * from emp where sal <>3000;
select * from emp where sal ^=3000;

select * from emp where job = 'SALESMAN';
select * from emp where job != 'SALESMAN';
select * from emp where job ^= 'SALESMAN';


select empno, ename, sal comm from emp where comm is null;
select empno, ename, sal comm from emp where comm is  not null;

select * from emp where sal between 1000 and 2000;
select * from emp where sal>=1000 and sal  <=2000;

select * from emp where empno in(7369,7788,7839);
select * from emp where empno =7369 or empno = 7788 or empno = 7839;

select * from emp where job in('SALESMAN','CLERK');
select * from emp where job  ='SALESMAN' or job ='CLERK';


select empno, ename, sal from emp where ename like 'SMITH';
select empno, ename, sal from emp where ename like '_____';
select empno, ename, sal from emp where ename like 's____'; 
select empno, ename, sal from emp where ename like '_l___'; 

select empno, ename, sal from emp where ename like 'A%';
select empno, ename, sal from emp where ename like '%T%';
select empno, ename, sal from emp where ename like '%_T_%';
select empno, ename, sal from emp where ename like '%__L%';

select empno, ename, sal from emp where ename like '%\%%' escape '\';
select empno, ename, sal from emp where ename like '\_%%%%%%%%%%' escape '\';
select empno, ename, sal from emp where ename like '*_%' escape '*';

select empno, ename, sal, hiredate from emp where hiredate like '____/12/__';

select * from temp where hobby is not null;
desc temp;



select * from emp where job = 'SALESMAN' and sal >=1500;
select * from emp where sal >=2001 and sal <=3000;
select * from emp where sal >=2001 and sal <=3000 and job ='MANAGER';
select * from emp where sal >=2001 and sal <=3000 or job ='MANAGER';
select * from emp where  job = 'SALESMAN' or job = 'CLERK';
select * from emp where comm is not null;


select * from emp where 1 =1 order by empno;
select * from emp where 1 =1 order by empno asc;
select * from emp where 1 =1 order by empno desc;

select empno, ename, job, sal from emp where 1 =1 order by sal desc;
select empno, ename, job, sal*12 from emp order by sal*12 desc;
select empno, ename, job, sal*12 from emp order by 4 asc;
select empno, ename, job, sal*12 "연봉" from emp order by "연봉" desc;


select empno, ename, sal from emp order by ename asc;
select empno, ename, sal from emp order by ename desc;

select * from temp order by birth_date asc;
select * from temp order by hiredate desc;

select * from emp order by sal desc, empno asc;
















