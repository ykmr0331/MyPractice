/*
DML
*/
desc dept;
select * from dept;
-- insert는 한번에 1행씩만 가능하다.
-- 한 행이 insert 될 때 한 행의 모든 컬럼에 데이터가 필요하다.
insert into dept(deptno, dname, loc) values(90, '인사과', '서울');
insert into dept( loc, deptno, dname) values('제주', 91, '개발');
insert into dept values(92,'홍보과', '인천');
--null값 입력
insert into dept(deptno, dname, loc) values(93,null,null);
insert into dept(deptno, dname) values (94,'생산1과');
insert into dept(deptno) values (95);

/*
insert 시 오류나는 경우
*/

--primary key가 중복되는 경우
 insert into dept(deptno, dname, loc) values(96, '마케팅','LA');
ORA-00001: 무결성 제약 조건(SCOTT.PK_DEPT)에 위배됩니다
 
-- primary key 가 null인 경우
insert into dept(deptno, dname, loc) values (null,'마케팅2과','충주');
 --SQL 오류: ORA-01400: NULL을 ("SCOTT"."DEPT"."DEPTNO") 안에 삽입할 수 없습니다
 

--데이터가 큰 경우
insert into dept(deptno, dname, loc) values(100,'총무과', 'CA');
--SQL 오류: ORA-01438: 이 열에 대해 지정된 전체 자릿수보다 큰 값이  들어올려고해서 안된다고
insert into dept(deptno, dname, loc) values(97,'미래비전팀', '공주');
--SQL 오류: ORA-12899: "SCOTT"."DEPT"."DNAME" 열에 대한 값이 너무 큼(실제: 15, 최대값: 14)

--타입이 일치하지 않는 경우
insert into dept(deptno, dname, loc) values (98, 50000, '광주');
--숫자는 문자화돼서 삽입된다.
insert into dept(deptno, dname, loc) values ('구십구', '개발팀', '오산');
-- SQL 오류: ORA-01722: 수치가 부적합합니다

insert into dept(deptno, dname, loc) values('99', '개발팀','오산');
--문자는 숫자화돼서 삽입된다.(o)
commit;

desc emp;

/*
이름       널?       유형           
-------- -------- ------------ 
EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2) 
*/
select * from emp;
insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) 
        values(9000,'강감찬','MANAGER', 7839, to_date('2023/07/02', 'YYYY/MM/DD'), 2000, 0, 70);
        
insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
            values(9001, '홍길동', 'MANAGER', null, sysdate, 2000, null, 40);
            
insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
            values(9002, '이순신', null, null, null, null, null, null);            
            
insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
            values(9003, null, null, null, null, null, null, null);             
            
insert into emp(empno)
            values(9004);            
            
/*
insert 시  오류나는 경우
*/

insert into emp values(9005, '누구게', null, null, null, null,null); -- emp 뒤에 컬럼을 기술하지 않았기 때문에 무조건 8개 다써야된다.
--SQL 오류: ORA-00947: 값의 수가 충분하지 않습니다            
insert into emp values(9006, '아무개', null,null,null,null,null,33);
--ORA-02291: 무결성 제약조건(SCOTT.FK_DEPTNO)이 위배되었습니다- 부모 키가 없습니다

commit;
/*COMMIT은 트랜잭션의 변경 내용을 영구적으로 저장하는 명령입니다.
트랜잭션이란 데이터베이스 작업의 논리적인 단위로, 
  여러 개의 SQL 문을 하나의 논리적 작업으로 묶는 것을 말합니다. 
 */           
            
--UPDATE

select * from dept;
update dept set dname = '인사팀',loc = 'LA' where deptno = 90;
 -- 1개 행 이(가) 업데이트되었습니다.
update dept set dname = '인사팀',loc = 'LA' where deptno = 33;
 -- 0개 행 이(가) 업데이트되었습니다.  조건에 만족하는 행이 없기 때문          
update dept set loc = '제주' where dname = '홍보과'; 
 -- 1 행 이(가) 업데이트되었습니다.                            
update dept set loc = 'SEOUL' where loc is null;       
 -- 3개 행 이(가) 업데이트되었습니다.


--dname xx과 --> xx팀

update dept set dname = replace(dname, '과','팀') where dname like '%과'; --  __과를 __팀으로 바꾼다.
--2개 행 이(가) 업데이트되었습니다.



--loc SEOUL --> 서울
update dept set loc = '서울' where loc = 'SEOUL';

--dname --> loc || deptno || '팀'
update dept set dname = loc||deptno||'팀' where deptno = 98;

--PK update
update dept set deptno = 97 where deptno = 96;
update dept set deptno = 11 where deptno = 10; -- 참조번호를 바꾸면   다른것들은 어떻게 하려고..
--ORA-02292: 무결성 제약조건(SCOTT.FK_DEPTNO)이 위배되었습니다- 자식 레코드가 발견되었습니다
commit;
select * from emp; 

update emp set ename = '최영', job ='ANALYST', mgr = 7839, 
                hiredate = to_date('2000-12-12', 'YYYY-MM-DD'), 
                sal = 90000, comm =1000, deptno =90
                where empno = 9003
                ;
    --1 행 이(가) 업데이트되었습니다.    
    
update emp set hiredate = hiredate + 7, sal = sal*1.1 where empno = 9000;
update emp set sal = 2000 where sal is null;
        --2개 행 이(가) 업데이트되었습니다.
update emp set hiredate -sysdate where hiredate is null;
    --SQL 오류: ORA-00927: 누락된 등호
update emp set mgr = 7839 where mgr is null and empno != 7839;  
    --3개 행 이(가) 업데이트되었습니다.

update emp set comm = 0 where comm is null;  
    --13개 행 이(가) 업데이트되었습니다.
update emp set deptno = 40 where deptno is null;
    --2개 행 이(가) 업데이트되었습니다.
update emp set job = 'SALESMAN' where job is null;
    --2개 행 이(가) 업데이트되었습니다.
update emp set ename = user where empno = (select max(empno) from emp);    
    --1 행 이(가) 업데이트되었습니다.
commit;




--  delete    
delete from dept where deptno = 10; --10번을 참조하는 애들이 있어서 그럼
    --ORA-02292: 무결성 제약조건(SCOTT.FK_DEPTNO)이 위배되었습니다- 자식 레코드가 발견되었습니다
delete from emp where deptno = 90;    -- emp에서 이렇게 먼저 날려야
delete from dept where deptno = 90;   -- deptno 90도 날라간다.
delete from dept where deptno = 91;

    --1 행 이(가) 삭제되었습니다.
    

delete dept where dname is null;    
    --2개 행 이(가) 삭제되었습니다.
delete from dept where deptno > 40;
    --5개 행 이(가) 삭제되었습니다.
delete from emp where empno = 9004;
    --1개 행 이(가) 삭제되었습니다.
delete from emp where empno >= 9000;
commit;


delete emp;
    --14개 행 이(가) 삭제되었습니다
delete dept;
    --4개 행 이(가) 삭제되었습니다
rollback;


















 
    
    
            
            
            
            
            
            
            
            






