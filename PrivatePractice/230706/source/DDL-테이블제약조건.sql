--테이블제약조건(contraint)
/*
1 . not null
2 . unique
3 . primary key(unique + not null)
4 . foreign key(다른테이블의 primary key컬럼의 데이타만저장가능)
5 . check(컬럼의 값제한)
*/
/**********************************
1.not null(컬럼수준에서만 정의가능)
**********************************/
drop table sawon1;
create table sawon1(
    no number(4),
    name varchar2(50) not null,
    hiredate date constraint sawon1_hiredate_nn  not null
);
desc sawon1;
select * from sawon1;
insert into sawon1 values (1,'홍길동',sysdate);

--SQL 오류: ORA-01400: NULL을 ("SCOTT"."SAWON1"."NAME") 안에 삽입할 수 없습니다.
insert into sawon1 values (2,null,sysdate);

--SQL 오류: ORA-01400: NULL을 ("SCOTT"."SAWON1"."HIREDATE") 안에 삽입할 수 없습니다
insert into sawon1 values (3,'홍길남',null);

insert into sawon1(no,name) values (4,'홍길북');
--ORA-01400: NULL을 ("SCOTT"."SAWON1"."HIREDATE") 안에 삽입할 수 없습니다



/**********************************
2.unique(중복값허용안함,null은허용)
***********************************/
--컬럼수준(컬럼정의할때 선언)
drop table sawon2;
create table sawon2(
    no number(4) primary key,
    id varchar2(10) unique not null,
    name varchar2(50) not null,
    email varchar2(50) constraint sawon2_email_uq  unique
);
select * from sawon2;
insert into sawon2 values(1,'guard','일순신','aaa@gmail.com');
insert into sawon2 values(2,'guard','둘순신','bbb@gmail.com');-- guard가 unique의 조건에서 어긋난다.
--ORA-00001: 무결성 제약 조건(SCOTT.SYS_C008465)에 위배됩니다
insert into sawon2 values(3,'apple','삼순신','aaa@gmail.com');-- 주소가 unique의 조건에 어긋난다.
--ORA-00001: 무결성 제약 조건(SCOTT.SAWON2_EMAIL_UQ)에 위배됩니다
insert into sawon2 values(4,null,'사순신','ccc@gmail.com');
--SQL 오류: ORA-01400: NULL을 ("SCOTT"."SAWON2"."ID") 안에 삽입할 수 없습니다
 
insert into sawon2 values(5,'tomato','오순신',null);
insert into sawon2 values(6,'melon','육순신',null);

--테이블수준(컬럼정의한후 테이블레벨에서선언)
drop table sawon3;

create table sawon3(
    no number(4) primary key,
    id varchar2(10) not null,
    name varchar2(50) not null,
    email varchar2(50),
    unique(id),
    constraint sawon3_email_uq unique(email)
);-----------여기부터

select * from sawon3;
insert into sawon3 values(1,'guard','일순신','aaa@gmail.com');
insert into sawon3 values(2,'guard','둘순신','bbb@gmail.com');
--ORA-00001: 무결성 제약 조건(SCOTT.SYS_C008470)에 위배됩니다

insert into sawon3 values(3,'apple','삼순신','aaa@gmail.com');
--ORA-00001: 무결성 제약 조건(SCOTT.SAWON3_EMAIL_UQ)에 위배됩니다

insert into sawon3 values(4,null,'사순신','ccc@gmail.com');
--SQL 오류: ORA-01400: NULL을 ("SCOTT"."SAWON3"."ID") 안에 삽입할 수 없습니다

insert into sawon3 values(5,'tomato','오순신',null);
insert into sawon3 values(6,'melon','육순신',null);

/*********************************
3. primary key (unique + not null)
    - 테이블당 한개의 priamry key만 설정
********************************/
--컬럼 레벨
drop table sawon4; 

create table sawon4(
    no number(4) primary key,
    name varchar2(50),
    sal number(10,1) default 0 not null
    -- 데이터의 최대 정수 자릿수는 10이고, 소수 자릿수는 1입니다
    -- 기본값으로 0이 설정되어 있으며, 비어 있지 않아야 합니다(not null).
);

drop table sawon5;

create table sawon5(
    no number(4) constraint sawon5_no_pk primary key,/*sawon5_no_pk"라는 이름의 주키(primary key) 제약 조건(constraint)으로 설정되었습니다.
                             주키는 테이블에서 각 행을 고유하게 식별하는 역할을 합니다.(테이블의 중복된 값을 방지)*/
    name varchar2(50),   
                    --varchar() :가변 길이의 문자열을 저장할 수 있는 데이터 타입
    sal number(10,1) default 0 not null
);


insert into sawon5 values(1,'일소라',200000.9);
insert into sawon5 values(2,'이소라',450000.9);
insert into sawon5 values(3,'삼소라',430000.9);
insert into sawon5 values(3,'세소라',780000.9); --(number)가 primary key라서 그럼
--ORA-00001: 무결성 제약 조건(SCOTT.SAWON5_NO_PK)에 위배됩니다
insert into sawon5 values(null,'사소라',880000.9);--primary key는 not null임
--ORA-01400: NULL을 ("SCOTT"."SAWON5"."NO") 안에 삽입할 수 없습니다
--테이블레벨
drop table sawon6;
create table sawon6(
    no number(4) ,
    name varchar2(50),
    sal number(10,1) default 0 not null,
    primary key(no)
);
drop table sawon7;
create table sawon7(
    no number(4) ,
    name varchar2(50),
    sal number(10,1) default 0 not null,
    constraint sawon7_no_pk primary key(no)
);

/*************테이블생성 이후에 primary key 추가 제거************/
drop table sawon8;
create table sawon8(
    no number(4) ,
    name varchar2(50),
    sal number(10,1) default 0 not null
);
--primary key추가
alter table sawon8 add constraint sawon8_no_pk primary key(no);
--primary key제거
alter table sawon8 drop constraint sawon8_no_pk;

/*
ALTER TABLE 테이블명
ADD CONSTRAINT 제약조건명 제약조건유형 (열 또는 열의 그룹);
*/


/***********************************
primary key 복합키인경우
    -컬럼 여러개가 primary key인경우
***********************************/
drop table student_locker;
create table student_locker(
    ban number(2),
    locker_no number(2),
    name varchar2(20),
    constraint student_locker_pk primary key(ban,locker_no) -- 제약조건유형의 괄호 안에 컬럼은 순서대로 쓴다.
                                            --즉 같은 반과 사물함 번호를 가진 학생이 중복되지 않도록 제약을 가합니다
);

insert into student_locker values(1,1,'KIM');
insert into student_locker values(1,2,'LIM');
insert into student_locker values(1,3,'MIM');

insert into student_locker values(2,1,'PIM');
insert into student_locker values(2,2,'JIM');
insert into student_locker values(2,3,'HIM');

insert into student_locker values(3,1,'AIM');
insert into student_locker values(3,2,'SIM');
insert into student_locker values(3,3,'XIM');
select * from student_locker;

insert into student_locker values(3,3,'TIM');
--ORA-00001: 무결성 제약 조건(SCOTT.STUDENT_LOCKER_PK)에 위배됩니다
--같은 반과 사물함 번호를 가진 학생이 중복되지 않도록

insert into student_locker values(3,null,'TIM');
--ORA-01400: NULL을 ("SCOTT"."STUDENT_LOCKER"."LOCKER_NO") 안에 삽입할 수 없습니다
--STUDENT_LOCKER는 primary key때문에 null 안돼

insert into student_locker values(null,3,'TIM');
--ORA-01400: NULL을 ("SCOTT"."STUDENT_LOCKER"."BAN") 안에 삽입할 수 없습니다
--ban은 primary key인데 null이라서 안돼

insert into student_locker values(null,null,'TIM');
--ORA-01400: NULL을 ("SCOTT"."STUDENT_LOCKER"."BAN") 안에 삽입할 수 없습니다
--ban과 STUDENT_LOCKER은 primary key인데 null이라서 안돼







/********************************************
4.foreign key(외래키)
    parent table(dept):부모(parent)테이블,참조되는 테이블
    child  table(emp) :자식(child) 테이블,참조하는 테이블(foreign key column)
    
   - null허용 
   - 중복허용 
*********************************************/



/****case1 컬럼레벨*******/


--parent table(pk)
drop table dept2;
create table dept2(
    deptno number(4) primary key, -- 부서번호
    dname varchar2(30) not null,  -- 이름  
    loc varchar2(100)             -- 위치  
);
insert into dept2 values(10,'인사','서울');
insert into dept2 values(20,'생산','울산');
insert into dept2 values(30,'영업','산청');
insert into dept2 values(40,'홍보','청주');
--child table(fk)
drop table emp2;
create table emp2(
    empno number(4) primary key,
    ename varchar2(50),
    sal number(10),
    deptno number(4) constraint emp2_deptno_fk  references dept2(deptno)
            /*emp2_deptno_fk" 제약 조건은 "deptno" 열을 외래 키로 지정하고, 
            해당 열이 "dept2" 테이블의 "deptno" 열과 일치해야 함을 명시*/
);



/*****case2테이블레벨****/
--parent table(pk)
drop table dept3;
create table dept3(
    deptno number(4) primary key,
    dname varchar2(30) not null,
    loc varchar2(100)
);
insert into dept3 values(10,'인사','서울');
insert into dept3 values(20,'생산','울산');
insert into dept3 values(30,'영업','산청');
insert into dept3 values(40,'홍보','청주');

--child table(fk)
drop table emp3;
create table emp3(
    empno number(4) primary key,
    ename varchar2(50),
    sal number(10),
    deptno number(4),
    constraint emp3_deptno_fk foreign key(deptno) references dept3(deptno)
             /*emp3_deptno_fk" 제약 조건은 "deptno" 열을 외래 키로 지정하고, 
            해당 열이 "dept3" 테이블의 "deptno" 열과 일치해야 함을 명시*/
);
insert into emp3 values(1111,'KIM',3000,10);
insert into emp3 values(2222,'LIM',5000,10);
insert into emp3 values(3333,'VIM',8000,10);

insert into emp3 values(4444,'AIM',7000,20);
insert into emp3 values(5555,'LIM',2000,20);

insert into emp3 values(6666,'CIM',9000,30);
insert into emp3 values(7777,'BIM',1000,30); 

insert into emp3 values(8888,'EIM',9000,null);

insert into emp3 values(9999,'NIM',1000,33);
--ORA-02291: 무결성 제약조건(SCOTT.EMP3_DEPTNO_FK)이 위배되었습니다- 부모 키가 없습니다

/**********************************************************************************************************************
FOREIGN KEY OPTION
  1. NO ACTION	       : 부모 테이블(dept)의 행을 참조하는 자식 테이블(emp)의 행이존재하면 
                         부모테이블행을 삭제불가능하다.
  2. ON DELETE CASCADE : 부모 테이블(dept)의 행이 삭제되면 자식 테이블(emp)의 관련 행도 
                         삭제된다. 
  3. ON DELETE SET NULL: 부모 테이블(dept)의 행이 삭제되면 자식 테이블(emp)의 관련 행의 
                         속성(deptno)값을 NULL로 변경한다.
**********************************************************************************************************************/
delete from dept3 where deptno = 40;
    --1 행 이(가) 삭제되었습니다.
    
--부서10번삭제시 소속된 사원이존재할때 삭제불가 
delete from dept3 where deptno=10;
--ORA-02292: 무결성 제약조건(SCOTT.EMP3_DEPTNO_FK)이 위배되었습니다- 자식 레코드가 발견되었습니다

--1.foreign key option(on delete cascade)
--parent table(pk)
drop table dept4;
create table dept4(
    deptno number(4) primary key,
    dname varchar2(30) not null,
    loc varchar2(100)
);
insert into dept4 values(10,'인사','서울');
insert into dept4 values(20,'생산','울산');
insert into dept4 values(30,'영업','산청');
insert into dept4 values(40,'홍보','청주');
--child table(fk)
drop table emp4;
create table emp4(
    empno number(4) primary key,
    ename varchar2(50),
    sal number(10),
    deptno number(4),
    constraint emp4_deptno_fk foreign key(deptno) references dept4(deptno) on delete cascade
);
insert into emp4 values(1111,'KIM',3000,10);
insert into emp4 values(2222,'LIM',5000,10);
insert into emp4 values(3333,'VIM',8000,10);

insert into emp4 values(4444,'AIM',7000,20);
insert into emp4 values(5555,'LIM',2000,20);

insert into emp4 values(6666,'CIM',9000,30);
insert into emp4 values(7777,'BIM',1000,30);
commit;
select * from dept4;
select * from emp4;
--부서10번삭제시 소속된 사원도 삭제
delete from dept4 where deptno=10;
delete from dept4 where deptno=20;
delete from dept4 where deptno=30;



--2.foreign key option(on delete set null)
--parent table(pk)
drop table dept5;
create table dept5(
    deptno number(4) primary key,
    dname varchar2(30) not null,
    loc varchar2(100)
);
insert into dept5 values(10,'인사','서울');
insert into dept5 values(20,'생산','울산');
insert into dept5 values(30,'영업','산청');
insert into dept5 values(40,'홍보','청주');
--child table(fk)
drop table emp5;
create table emp5(
    empno number(4) primary key,
    ename varchar2(50),
    sal number(10),
    deptno number(4),
    constraint emp5_deptno_fk foreign key(deptno) references dept5(deptno) on delete cascade
);
insert into emp5 values(1111,'KIM',3000,10);
insert into emp5 values(2222,'LIM',5000,10);
insert into emp5 values(3333,'VIM',8000,10);

insert into emp5 values(4444,'AIM',7000,20);
insert into emp5 values(5555,'LIM',2000,20);

insert into emp5 values(6666,'CIM',9000,30);
insert into emp5 values(7777,'BIM',1000,30);
commit;
select * from dept5;
select * from emp5;
--부서10번삭제시 소속된 사원도 삭제
delete from dept5 where deptno=10;
delete from dept5 where deptno=20;
delete from dept5 where deptno=30;




/*************테이블생성이후에 foreign key 추가제거*************/
drop table dept6;
create table dept6(
    deptno number(4) ,
    dname varchar2(30) not null,
    loc varchar2(100)
);

--child table(fk)
drop table emp6;
create table emp6(
    empno number(4),
    ename varchar2(50),
    sal number(10),
    deptno number(4)
);
--pk add(설정)
alter table dept6 add constraint dept6_deptno_pk primary key(deptno);
alter table emp6 add constraint emp6_empno_pk primary key(empno);
--fk add(설정)
alter table emp6 add constraint emp6_deptno_fk foreign key(deptno) references dept6(deptno);

--fk drop(삭제)
alter table emp6 drop constraint  emp6_deptno_fk;
--pk drop(삭제)
alter table dept6 drop constraint dept6_deptno_pk;
alter table emp6 drop constraint emp6_empno_pk;




/************************
5. check constraint
*************************/

drop table emp7;

create table emp7(
    empno number(4) primary key,
    ename varchar2(50) not null,
    sal number(10) constraint emp7_sal_ck check(sal>=500 and sal <=5000),
                     /*emp7_sal_ck" CHECK 제약 조건은 "emp7" 테이블의 "sal" 열 값이 특정 범위 내에 있는지 검증합니다. 
                    이 경우, 임금 값이 500에서 5000 사이인 경우에만 데이터의 무결성을 유지할 수 있습니다. */
    gender char(1),
    constraint emp7_gender_ck check(gender = 'm' or gender = 'f')
);    
select * from emp7;
insert into emp7 values(1,'KIM',800,'f');
insert into emp7 values(2,'GIM',800,'m');

insert into emp7 values(3,'VIM',6000,'m');
--ORA-02290: 체크 제약조건(SCOTT.EMP7_SAL_CK)이 위배되었습니다
-- sal값이 check제약 조건에 의해서 500에서 5000사이어야 한다.

insert into emp7 values(4, 'FIM',5000,'a');
--ORA-02290: 체크 제약조건(SCOTT.EMP7_GENDER_CK)이 위배되었습니다
--gender값이 check제약 조건에 의해서 m이나 f여야한다.

/* 
drop :테이블을 삭제하는 명령어(DDL) -복구할 수 없다
*/

create table emp8(
    empno number(4) primary key,
    ename varchar2(50) not null,
    sal number(10) ,
    gender char(1)
    
);    

drop table emp8;
rollback;




