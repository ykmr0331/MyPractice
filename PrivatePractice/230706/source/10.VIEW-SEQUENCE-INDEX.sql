--view

--단순 view

create or replace view dept10_view
as
select deptno,dname,loc from dept
where deptno = 10;

select * from dept10_view;

select * from (select deptno, dname, loc
                from dept
                where deptno = 10);

create or replace view dept_no_name_view 
as 
select deptno "부서번호", dname "부서이름" from dept;

select * from dept_no_name_view;
desc dept_no_name_view;
/*
이름   널?       유형           
---- -------- ------------ 
부서번호 NOT NULL NUMBER(2)    
부서이름          VARCHAR2(14) 
*/

select deptno, dname from dept_no_name_view;
-- ORA-00904: "DNAME": 부적합한 식별자

select 부서번호,부서이름 from dept_no_name_view;--이렇게해야 나옴

select 부서번호,부서이름, loc from dept_no_name_view;
--ORA-00904: "LOC": 부적합한 식별자 -- 없으니까


create or replace view emp_account_view
as
select empno, ename, sal, hiredate from emp
where deptno = 10;

desc emp_account_view;
select * from emp_account_view;

--복합 view(base table 여러개)

create or replace view emp_dept_view
as
select e.empno, e.ename, e.job, e.sal, d.deptno,d.dname, d.loc
from emp e join dept d
on e.deptno = d.deptno;


desc emp_dept_view;

/*
이름     널?       유형           
------ -------- ------------ 
EMPNO  NOT NULL NUMBER(4)    
ENAME           VARCHAR2(10) 
JOB             VARCHAR2(9)  
SAL             NUMBER(7,2)  
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 
*/

select * from emp_dept_view;


--view 삭제
drop view emp_dept_view;


--sequence
drop sequence test_seq1;
create sequence test_seq1;

drop sequence test_seq2;
create sequence test_seq2
    start with 1        --시퀀스의 시작값을 1로 지정
    maxvalue 99999999   --시퀀스가 생성할 수 있는 최대값을 99999999로 지정
    increment by 1      -- 시퀀스가 생성할 값의 증가값을 1로 지정    
    nocycle             --시퀀스가 최대값을 초과하여 다시 처음으로 돌아가지 않습니다.
    nocache;            /*시퀀스 값을 캐시하지 않도록 설정합니다. 
                             이는 시퀀스 값을 증가시킬 때마다 디스크 I/O를 발생시키지 않고 
                            메모리에 값을 저장하지 않으며, 
                            성능 측면에서 디스크 액세스를 줄이는 역할을 합니다.*/
    
    
--sequence 생성

/*SQL에서 시퀀스(Sequence)는 순차적으로 증가하는 값을 생성하는 객체.
시퀀스는 주로 고유한 식별자 값을 생성하기 위해 사용되며,
    주로 기본 키(primary key) 열의 값을 자동으로 생성하는 데에 활용됩니다.*/

select test_seq1.nextval "발생시퀸스값" from dual;
select test_seq1.currval "발생시퀸스값" from dual;

select test_seq1.nextval "발생시퀸스값1", test_seq1.nextval"발생시퀸스값2" from dual; --??

select test_seq1.nextval "발생시퀸스값", test_seq1.currval" 현재시퀸스값" from dual;


/*시퀸스 객체생성이후에 nextval을 한번도 호출하지 않은 경우 currval을 사용하지 못함*/

select test_seq2.nextval from dual;
select test_seq2.currval from dual;
--ORA-08002: 시퀀스 TEST_SEQ2.CURRVAL은 이 세션에서는 정의 되어 있지 않습니다
--그 위에것을 실행해야(nextval)을 호출해야 된다.

drop table freeboard;
create table freeboard(
    b_no number(10) primary key,
    b_title varchar2(100),
    b_content varchar2(2048),
    b_read_count number(10) default 0
);

drop sequence freeboard_b_no_seq;

create sequence freeboard_b_no_seq 
                start with 1
                increment by 1
                nocycle 
                nocache;

insert into freeboard(b_no,b_title,b_content) -- 괄호안은 freeboard 테이블 안에 있는 컬럼
            values(freeboard_b_no_seq.nextval, -- B_NO가 1 2 3 4 이렇게 증가함
                    '제목'||freeboard_b_no_seq.currval,-- B_TITLE이 제목1 제목2 제목3 ... 증가함
                     '내용'||freeboard_b_no_seq.currval);-- B_CONTENT가 내용1 내용2 내용3 ... 증가함
 
select * from freeboard;

drop table jumun;
create table jumun(
    j_code varchar2(20) primary key,
    j_title varchar2(100),
    j_price number(10),
    j_date date default sysdate
    
);

drop sequence jumun_code_seq;
create sequence jumun_code_seq;

insert into jumun(j_code, j_title,j_price)
            values(to_char(sysdate, 'YYYY-MM-DD')|| -- 현재 날짜를 'YYYY-MM-DD' 형식의 문자열로 변환하는 것
                            lpad(to_char(jumun_code_seq.nextval),4,'0'),/*jumun_code_seq.nextval 값을 문자열로 변환한 후, 
                                                                         lpad 함수를 사용하여 왼쪽에 0을 채워서 총 4자리로 만드는 것을 의미합니다.*/
                 '아이패드외 3종...',
                  890000); 
            
select * from jumun;            
 
 --index
 
 create index emp_name_idx on emp(ename);
 drop index emp_name_idx;
   
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 