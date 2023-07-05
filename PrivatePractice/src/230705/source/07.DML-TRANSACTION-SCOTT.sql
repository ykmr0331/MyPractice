--scott 
---DML TRANSACTION
/*

    <<Transaction>>
    트랜잭션의 정의
        -하나의 논리적기능(업무)를 실행하기 위한 작업단위
        -데이터베이스 상태를 변화시키는  1개 여러개 DML(update, delete, insert) 문으로 구성
        
*/
-- transaction 시작(DML전송)
delete emp where empno >= 7000;
update dept set dname ='영업팀';

select * from emp;
select * from dept;

--transaction 종료(commit, roll back)
rollback;


--transaction 시작(DML전송)
delete emp where empno = 7369;
update dept set dname = '회계팀' where deptno = 10;

select * from emp;
select * from dept;

--transaction 종료(commit, roll back)
commit;
