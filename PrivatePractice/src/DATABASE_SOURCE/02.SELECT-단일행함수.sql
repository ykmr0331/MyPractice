--단일행함수
--문자함수
select upper('kim'), lower('kim'), initcap('tom') from dual;
select empno, ename, upper(ename), lower(ename), initcap(ename) from emp; -- initcap은 첫번째만 대문자 그 외에는 소문자
select concat(concat(concat(ename,'님의 직급은 '),job),'입니다.') from emp;
    -- concat은 두 개 이상의 문자열을 하나의 문자열로 결합하는 것을 의미합니다. 
select ename || '님의 직급은' || job|| '입니다.' from emp;


--substr(index,size)
--index 1,2,3,4,5

select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',6,1) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',6,2) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',6,3) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',6,3,700) from dual;

select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',-3) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',-3,1) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',-3,2) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',-3,3) from dual;

select empno, ename, job, substr(job,6), substr(job,6,3) from emp;
--length

--instr






--lpad,rpad


--trim



--replace


/*
자동정렬
ctrl + f7

alt + ' 
*/
--숫자함수

--round

--trunc


--ceil,floor


--조편성3명


--날짜함수


--날짜+숫자 -->날짜
--날짜-날짜 -->숫자(일수)



--extract function(날짜로부터 -->년,월,일,시,분,초)



--systimestamp 

--localtimestamp 


--변환함수
--묵시적(자동)


--to_char() 날짜-->문자



--to_char()  숫자-->문자




--to_number() 문자 --> 숫자



--to_date()  문자-->날짜


--insert into emp values(9999,'김경호','MANAGER',7788,to_date('2022/03/04','YYYY/MM/DD'),9000,900,30);
select * from emp;
--일반함수
--nvl,nvl2


--decode



--case문





