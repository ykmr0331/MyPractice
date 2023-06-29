--단일행함수@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
--문자함수@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
select upper('kim'), lower('kim'), initcap('tom') from dual;
select empno, ename, upper(ename), lower(ename), initcap(ename) from emp; -- initcap은 첫번째만 대문자 그 외에는 소문자
select concat(concat(concat(ename,'님의 직급은 '),job),'입니다.') from emp;
    -- concat은 두 개 이상의 문자열을 하나의 문자열로 결합하는 것을 의미합니다. 
select ename || '님의 직급은' || job|| '입니다.' from emp;


--substr(index,size)@@@@@@@@@@@@@@@@@@@@@@@@
--index 1,2,3,4,5@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',6,1) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',6,2) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',6,3) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',6,3,700) from dual;

select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',-3) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',-3,1) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',-3,2) from dual;
select 'ABCDEFGHIJK', substr('ABCDEFGHIJK',-3,3) from dual;

select empno, ename, job, substr(job,6), substr(job,6,3) from emp;
 -- ----------------------------- 23.06.29-------------------------------------------------------------------------------------------------
 ---------------------------------------------------------------------------------------------------------------------------------------------
 ---------------------------------------------------------------------------------------------------------------------------------------------
 
 
--length@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
select length('오라클'), length('오라클') from dual;
select empno, ename, length(ename),job,length(job) from emp;
select empno, ename, length(ename) from emp where length(ename)>=5 order by length(ename);

select empno, ename, length(ename) "이름글자수" from emp where length(ename) >= 5  order by "이름글자수";

--instr@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

 /*첫 번째 인수는 찾을 문자열이고 두 번째 인수는 찾을 문자열입니다. 
 그러나 INSTR() 함수는 세 번째 인수를 선택적으로 사용할 수 있습니다.
 세 번째 인수는 찾은 문자열의 시작 위치를 ​​지정합니다.*/
SELECT 'ABADAFG' ,
        INSTR('ABADAFG', ' A'),     --0
        INSTR('ABADAFG', 'A',1,1),  --1
        INSTR('ABADAFG', 'A',1,2),  --3  2번째 A는 3번째에 있다.   
        INSTR('ABADAFG', 'A',1,3),  --5  3번째 A는 5번째에 있다.       
        INSTR('ABADAFG', 'A',1,4),  --0  4번째 A는 없다.
        INSTR('ABADAFG', 'A',2,1),  --3  2번째부터 시작하는 기준으로 첫번째 A는 3번째에 있다.
        INSTR('ABADAFG', 'A',2,2)   --5  2번째부터 시작하는 기준으로 2번째 A는 5번쨰에 있다.
from dual; 


/*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
SUBSTR() 함수는 문자열에서 지정된 위치부터 지정된 길이의 문자열을 추출하는 함수입니다.
SUBSTR(문자열, 시작 위치, 추출할 길이)
*/
select 'guard@naver.com' ,
    instr('guard@naver.com', '@'),
    substr('guard@naver.com', 1, instr('guard@naver.com', '@')-1) from dual; // 첫번째부터 6글자 짤라내라
    --       guard@naver.com            6
 

--lpad,rpad  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 
           --한마디로 왼쪽이나 오른쪽에 원하는 문자로 채우는거임~~~~~~~~~
/*
PAD()와 LPAD() 함수는 SQL에서 문자열의 왼쪽 또는 오른쪽에 특정 문자열을 채우는 데 사용되는 함수입니다. 
RPAD() 함수는 문자열의 오른쪽에 특정 문자열을 채우고, LPAD() 함수는 문자열의 왼쪽에 특정 문자열을 채웁니다.

RPAD() 함수는 세 개의 인수를 사용합니다
. 
첫 번째 인수는 채울 문자열이고 
두 번째 인수는 채울 문자열의 길이이고 
세 번째 인수는 채울 문자열입니다.

LPAD() 함수는 세 개의 인수를 사용합니다. 

첫 번째 인수는 채울 문자열이고
두 번째 인수는 채울 문자열의 길이이고 
세 번째 인수는 채울 문자열입니다.
*/
select empno, ename,  lpad(ename,8,'-'), rpad(ename, 8, '@'), sal, lpad(sal, 6, '0'), rpad(sal, 6, '*') from emp;


--trim  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
select 'ssupersmans',trim(leading 's' from 'ssupersmans') from dual;  --왼쪽에 있는 s 모두 삭제
select 'ssupersmans',trim(trailing 's' from 'ssupersmans') from dual; ----오른쪽에 있는 s 모두 삭제
select 'ssupersmans',trim(both 's' from 'ssupersmans') from dual; --양쪽에 있는 s 모두 삭제
 -- ORA---30001: 트림 설정은 하나 문자만 가지고 있어야 한다.
 SELECT length('   guard   '), 
    length(trim(leading ' ' from '   guard   ')),
    length(trim(trailing ' ' from '   guard   ')),
    length(trim(both ' ' from '   guard   '))
 from dual;

select empno, ename, job,
    trim(leading 'S' from job),
    trim(trailing 'N' from job),
    trim(both 'M' from job)
from emp;


--replace@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
select empno, ename, job, replace(job, 'MAN', 'WOMAN') from emp; -- MAN을 WOMAN으로 바꾸는거다 JOB에서

/*
자동정렬
ctrl + f7

alt + ' 
*/
--숫자함수


--round@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
-- 숫자의 소수점 반올림 ROUND(숫자, 소수점 자리수)
select 45.6789,
    round(45.6789),    -- 46
    round(45.6789,0),  -- 46
    round(45.6789,1), -- 소수점 1번째 자리까지 나오게 즉 2번쨰 반올림
    round(45.6789,2), 
    round(45.6789,3), -- 소수점 3번쨰 자리까지 나오게 즉 4번째 반올림
    round(45.6789,-1) -- 50이 나오는데 이렇게하면 1자리에서 반올림해서 그런듯
from dual;

--trunc @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
--숫자의 소수점 버림 TRUNC(숫자, 소수점 자리수)
select 45.6789, 
    trunc(45.6789,0),
    trunc(45.6789,1), -- 소수점 1번째 자리까지만 나타내고 2번짜 자리부터는 잘라버려, 반올림도 안함
    trunc(45.6789,2),
    trunc(45.6789,3),
    trunc(45.6789,-1) -- 1번쨰 자리까지 잘라버려  
from dual;  

--ceil,floor@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

/*
ceil() 함수는 특정 숫자보다 @@크거나@@ 같은 가장 작은 정수를 반환합니다.
floor() 함수는 특정 숫자보다 @@작거나@@ 같은 가장 큰 정수를 반환합니다. 
예를 들어, ceil(3.1)는 4를 반환하고 floor(3.1)는 3을 반환합니다.
*/
select 15.3, ceil(15.3), floor(15.8) from dual;
select 15.3, ceil(15.3324234234), floor(15.9898) from dual; 

--조편성3명
select 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 from dual;
select ceil(1/3), ceil(2/3), ceil(3/3), ceil(4/3), ceil(5/3), ceil(6/3), ceil(7/3), ceil(8/3), ceil(9/3), ceil(10/3) from dual;
--날짜함수
-- 현재 시간 반환 함수
select sysdate, systimestamp from dual;

--날짜+숫자 -->날짜
--날짜-날짜 -->숫자(일수)

/*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 Oracle SQL 문법을 사용하여, 현재 날짜(sysdate)에 7일을 더한 날짜를 조회하는 SQL 문입니다.
*/
select sysdate+7 "7일 후 " from dual;
select sysdate-7 "7일 전 " from dual;

select sysdate - to_date('2000/01/02') "살아온날 " from dual;
select trunc(sysdate - to_date('2000/01/02')) "살아온날 " from dual;

select studno, name , birthday, 
    trunc(sysdate- birthday) "생존일수" , 
     trunc((sysdate- birthday)/7) "생존주수" 
from student;


 -- 현재날짜를 기준으로 
select  sysdate, 
        sysdate+3 "3일 후 날짜",
        add_months(sysdate,6)  "6개월 후",   
       trunc( months_between(sysdate, to_date('2000/01/01'))) "살아온 달수",
       -- months_between(sysdate, to_date('2000/01/01')): 현재 날짜와 2000년 1월 1일 사이의 월 차이를 반환합니다.
       next_day(sysdate, '화') "다음 화요일날짜", -- next_day():지정된 날짜의 다음 요일을 반환하는 함수
       last_day(sysdate) "이번달 마지막날짜"          --last_day():  지정된 날짜의 마지막 날짜를 반환하는 함수
from dual;    

select studno, name, birthday,
    trunc(months_between(sysdate, birthday)) "태어난 후 경과달수",
    add_months(birthday,6) "태어난 후 6개월 뒤의 날짜",
    next_day(birthday,'금')"태어난 후 화요일",
    last_day(birthday) "태어난 달의 마지막날짜"
from student;


--extract function(날짜로부터 -->년,월,일,시,분,초(숫자))
--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
select sysdate,
        extract(year from sysdate) "년(숫자)",
        extract(month from sysdate) "월(숫자)",
        extract(day from sysdate) "일(숫자)"
from dual;
/*
select empno, ename, hiredate, 
        extract(year from hiredate) "년",
        extract(month from hiredate) "월",
        extract(day from hiredate) "일"
from emp where extract(year from hiredate) >= 1982 order by "년", "월", "일";
*/

--systimestamp @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
   /*Oracle 데이터베이스에서 현재 날짜와 시간을 반환하는 함수입니다.
     함수는 날짜와 시간의 타입인 TIMESTAMP를 반환합니다.*/
select systimestamp, 
    extract(hour from systimestamp) "시",        -- 추출되는 시간은 한국시간보다 9시간 느리다. 즉그리니치 천문대 시간기준
    extract(minute from systimestamp) "분",
    extract(second from systimestamp) "초"    
from dual;     


--localtimestamp @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
/*
차이점은
systimestamp 함수는 데이터베이스 시간대를 반환하는 반면
localtimestamp 함수는 세션 시간대를 반환한다는 것입니다.
*/
select localtimestamp, 
    extract(hour from localtimestamp) "시",
    extract(minute from localtimestamp) "분",
    extract(second from localtimestamp) "초"
from dual;



select * from emp where extract(month from hiredate) >= 6  and extract(month from hiredate) <=12; 
-- 입사날짜 6월부터 12월까지인 사람들 추출하는것


--변환함수
--묵시적(자동)
select * from emp where hiredate >='1981/11/17';
-- select * from emp where hiredate >=to_date('1981/11/17','YYYY/MM/DD');
select * from emp where empno >= '7839';
-- select * from emp where empno >= to_number('7839');


--to_char() 날짜-->문자 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
--!!!!중요함!!!!!!!!!
    
    /*
    TO_CHAR(날짜, 포맷) 
    날짜는 시작 날짜를 지정하는 날짜 값입니다.
    포맷은 날짜를 표시하는 방법을 지정하는 문자열입니다.
    예를 들어, 다음 쿼리는 2023년 6월 1일의 날짜를 "2023-06-01" 형식으로 문자열로 변환합니다.
    SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD');
    */
select sysdate,
    to_char(sysdate, 'YYYY/MM/DD') "YYYY/MM/DD",
    to_char(sysdate, 'YYYY-MM-DD') "YYYY-MM-DD",
    to_char(sysdate, 'YYYYMMDD') "YYYYMMDD",
    to_char(sysdate, 'YYYY MM DD ') "YYYY MM DD",
    to_char(sysdate, 'YYYY/MM/DD AM HH24:MI:SS') "YYYY/MM/DD AM HH24: MI: SS",
    to_char(sysdate, 'YEAR -MONTH-DAY') "YEAR-MONTH-DAY",
    to_char(sysdate, 'YEAR -MON-DY') "YEAR-MON-DY"

from dual;    

select sysdate,
    to_char(sysdate, 'YYYY') "YYYY",
    to_char(sysdate, 'MM') "MM",
    to_char(sysdate, 'DD') "DD",
    to_char(sysdate, 'HH') "HH",
    to_char(sysdate, 'MI') "MI",
    to_char(sysdate, 'SS') "SS",
    to_char(sysdate, 'AM') "AM",
    to_char(sysdate, 'DAY') "DAY",
    to_char(sysdate, 'YEAR') "YEAR",
    to_char(sysdate, 'MONTH') "MONTH" 
from dual;    

select * from temp where to_char(birth_date, 'MM') = '12';
select * from temp where extract(month from birth_date)=12;
select * from temp where to_char(birth_date, 'DAY') = '금요일';
select * from temp where to_char(birth_date, 'YYYY') >='1975';
-- select * from temp where extract(year from birth_date) >='1975';



--to_char()  숫자-->문자 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    /*
    TO_CHAR(숫자, 포맷)
    숫자는 시작 숫자를 지정하는 숫자 값입니다.
    포맷은 숫자를 표시하는 방법을 지정하는 문자열입니다.
    예를 들어, 다음 쿼리는 123을 "123" 형식으로 문자열로 변환합니다.
    SELECT TO_CHAR(123, '999');
    
    TO_CHAR() 함수는 숫자를 다양한 형식으로 변환하는 데 사용할 수 있습니다. 다음은 몇 가지 예입니다.

    999 - 숫자를 세 자리로 표시합니다.
    999.99 - 숫자를 소수점 둘째 자리까지 표시합니다.
    $999,999.99 - 숫자를 달러 기호와 함께 표시합니다.
    */
    
select 1234567.8888,
    to_char(1234567.8888, '9,999,999.9999'), -- 소수점 위의자리가 9가 7개 미만이 되면 ##로 표시된다....
    to_char(1234567.8888, '99,999,999.999'), -- 소수점 마지막 한자리 부족한거 반올림된다.
    to_char(1234567.8888, '099,999,999.9999990'), -- 0붙어있으면 나머지 부분은 0으로 채운다.
    to_char(1234567.8888, 'L99,999,999.99'),   -- 소수점 자리가 부족하면 반올림해서 채운다. 그리고 앞에 L있으면 원단위 붙는다.
    to_char(1234567.8888, '$99,999,999.99')
from dual;

select emp.*,to_char(sal, '999,999,999.9') from emp;
select temp.*,to_char(salary, '$999,999,999.999') "연봉"from temp;


--to_number() 문자 --> 숫자 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

select * from emp where sal >=to_number('1000');

    /*
    TO_NUMBER(문자열, 포맷)
    문자열은 시작 문자열을 지정하는 문자열 값입니다.
    포맷은 문자열을 숫자로 변환하는 방법을 지정하는 문자열입니다.
    예를 들어, 다음 쿼리는 "123"을 숫자 123으로 변환합니다.
    SELECT TO_NUMBER('123');
    */

--to_date()  문자-->날짜 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    /*
    TO_DATE(문자열, 포맷)
    문자열은 시작 문자열을 지정하는 문자열 값입니다.
    포맷은 문자열을 날짜로 변환하는 방법을 지정하는 문자열입니다.
    
    YYYY-MM-DD - 년-월-일 형식입니다.
    YYYY-MM-DD HH24:MI:SS - 년-월-일 시:분:초 형식입니다.
    YYYY년 MM월 DD일 - 년년 월월 일일 형식입니다.
    */
select * from student where birthday >= to_date('1977/01/01', 'YYYY/MM/DD');

select * from student where birthday >= to_date('1977/01/01', 'YYYY/MM/DD');
 
--insert into emp values(9999,'김경호','MANAGER',7788,to_date('2022/03/04','YYYY/MM/DD'),9000,900,30);
select * from emp;


--일반함수 
--nvl,nvl2 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
/*
 nvl:  NULL 값을 다른 값으로 대체하는 함수
    NVL(값, 대체값)
    값은 NULL 값을 대체할 값입니다.
    대체값은 NULL 값이 아닌 값입니다.

 nvl2: NULL 값을 다른 값으로 대체하고, NULL이 아닌 값을 다른 값으로 대체하는 함수
    NVL2(값, 첫 번째 대체값, 두 번째 대체값)
    값은 NULL 값을 대체할 값입니다.
    첫 번째 대체값은 NULL 값이면 반환할 값입니다.
    두 번째 대체값은 NULL 값이 아니면 반환할 값입니다.
*/
select empno,ename,sal,comm ,sal+comm "총급여" from emp; --???

select empno,ename,sal,comm,nvl(comm,0) "nvl", sal + nvl(comm,0) "총급여" from emp;

select empno,ename,sal,comm,nvl2(comm,comm,0) "nvl2", nvl2(comm,comm+sal,sal)  "총급여" from emp;


--decode @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
/*
decode: 조건에 따라 값을 반환하는 함수
decode(값, 조건1, 값1, 조건2, 값2, ..., 기본값)
    값은 조건을 비교할 값입니다.
    조건1, 조건2, ... 은 조건입니다.
    값1, 값2, ... 은 조건이 참일 때 반환할 값입니다.
    기본값은 조건이 모두 거짓일 때 반환할 값입니다
*/

select decode('KIM', 'KIM', 1000, 'LEE', 2000, 'PARK',3000,5000) FROM DUAL;
select decode('LEE', 'KIM', 1000, 'LEE', 2000, 'PARK',3000,5000) FROM DUAL;
select decode('PARK', 'KIM', 1000, 'LEE', 2000, 'PARK',3000,5000) FROM DUAL;
select decode('HONG', 'KIM', 1000, 'LEE', 2000, 'PARK',3000,5000) FROM DUAL;

select emp.*,decode(job,
                    'CLERK', sal*1.1,
                    'MANAGER',sal*1.2,
                    'SALESMAN',sal*1.5,
                    'analyst', sal * 1.7,
                    'president', sal*2.0,
                    sal) "직급별 급여" 
from emp;

select emp.*, decode(sal,800,'F',3000,'C',5000,'A') "급여등급" from emp;
--case문

select empno, ename, sal job,
    ( 
        case 
            when job ='CLERK' then sal * 1.1
            when job ='MANAGER' then sal * 1.2
            when job ='SALESMAN' then sal * 1.5
            when job ='ANALYST' then sal * 1.7
            when job ='PRESIDENT' then sal * 2.0
            ELSE SAL
        end
    )"직급별계산급여"
from emp;

select empno, ename, sal,  
    (
        case
            when sal >=1000 and sal <2000 then 'E'
            when sal >=2000 and sal <3000 then 'D'
            when sal >=3000 and sal <4000 then 'C'
            when sal >=4000 and sal <5000 then 'B'
            when sal >=5000 and sal <6000 then 'A'
            ELSE 'X'
        end
    
    )
    "급여등급"
from emp;
/*
조건에 따라 값을 반환하는 문

CASE
WHEN 조건1 THEN 값1
WHEN 조건2 THEN 값2
...
ELSE 기본값
END

    조건1, 조건2, ... 은 조건입니다.
    값1, 값2, ... 은 조건이 참일 때 반환할 값입니다.
    기본값은 조건이 모두 거짓일 때 반환할 값입니다.
*/




