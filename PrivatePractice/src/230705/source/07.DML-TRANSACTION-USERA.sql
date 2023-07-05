--usera

--scott이 가지고 있는 emp와 dept select

select * from  scott.emp;
select * from scott.dept;

/*
usera
<<transaction>>
*/
select sal from 
scott.emp where ename ='KING';

----------------------read consistency[읽기일관성]----------------------

--Transaction시작(DML --> insert delete update)
update scott.emp set sal = 6000
where ename = 'KING'; -- 얘를 실행하는 순간 transaction 시작임

select sal from scott.emp where ename = 'KING';
--Transaction 종료
commit;
select sal from scott.emp where ename = 'KING';

---------------------------lock[행잠금]---------------------------
--Transaction 시작(DML --> insert delete update)
--모든 행에 lock이 걸림, 다른 사용자가 수정이 불가능
update scott.emp set sal = sal*1.1;

select * from scott.emp;
-- Transaction종료
--모든 행에 lock이 풀림, 다른 사용자가 수정이 가능
commit;

select * from scott.emp where ename ='ALLEN';



---------------------------insert---------------------------
--Transaction시작(DML--> insert delete update)
insert into scott.dept values(60,'기획팀','제주');
insert into scott.dept values(70,'영업팀','청주');
select * from scott.dept;
commit;


















