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
        hiredate  date constraint sawon1_hiredate_nn  not null
);
desc sawon1;

insert into sawon1 values(1,'홍길동',sysdate);
insert into sawon1 values(2,null,sysdate);
        --SQL 오류: ORA-01400: NULL을 ("SCOTT"."SAWON1"."NAME") 안에 삽입할 수 없습니다
insert into sawon1 values(3,'홍길남',null);
        --SQL 오류: ORA-01400: NULL을 ("SCOTT"."SAWON1"."HIREDATE") 안에 삽입할 수 없습니다
insert into sawon1 values(4,'홍길북');
        --SQL 오류: ORA-00947: 값의 수가 충분하지 않습니다

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
insert into sawon2 values(2,'guard','둘순신','bbb@gmail.com');
--ORA-00001: 무결성 제약 조건(SCOTT.SYS_C008465)에 위배됩니다
insert into sawon2 values(3,'apple','삼순신','aaa@gmail.com');
--ORA-00001: 무결성 제약 조건(SCOTT.SAWON2_EMAIL_UQ)에 위배됩니다
insert into sawon2 values(4,null,'사순신','ccc@gmail.com');
--SQL 오류: ORA-01400: NULL을 ("SCOTT"."SAWON2"."ID") 안에 삽입할 수 없습니다

insert into sawon2 values(5,'tomato','오순신',null);
insert into sawon2 values(6,'melon','육순신',null);     
        
--테이블수준(컬럼정의한후 테이블레벨에서선언)

/*********************************
3. priamry key (unique + not null)
    - 테이블당 한개의 pk만설정
********************************/
--컬럼레벨

--테이블레벨

/*************테이블생성 이후에 primary key 추가 제거************/

--primary key추가

--primary key제거


/***********************************
primary key 복합키인경우
    -컬럼 여러개가 primary key인경우
***********************************/






/********************************************
4.foreign key(외래키)
    parent table(dept):부모(parent)테이블,참조되는 테이블
    child  table(emp) :자식(child) 테이블,참조하는 테이블(foreign key column)
    
   - null허용 
   - 중복허용 
*********************************************/
/****case1 컬럼레벨*******/
--parent table(pk)


--child table(fk)




/*****case2테이블레벨****/
--parent table


--child table(fk)

/**********************************************************************************************************************
FOREIGN KEY OPTION
  1. NO ACTION	       : 부모 테이블(dept)의 행을 참조하는 자식 테이블(emp)의 행이존재하면 
                         부모테이블행을 삭제불가능하다.
  2. ON DELETE CASCADE : 부모 테이블(dept)의 행이 삭제되면 자식 테이블(emp)의 관련 행도 
                         삭제된다. 
  3. ON DELETE SET NULL: 부모 테이블(dept)의 행이 삭제되면 자식 테이블(emp)의 관련 행의 
                         속성(deptno)값을 NULL로 변경한다.
**********************************************************************************************************************/
--1.foreign key option(on delete cascade)
--parent table


--child table(fk)





--2.foreign key option(on delete set null)
--parent table


--child table(fk)




/*************테이블생성이후에 foreign key 추가제거*************/

--pk add(설정)

--fk add(설정)

--fk drop(삭제)

--pk drop(삭제)



/************************
5. check constraint
*************************/



/*
drop :테이블을 삭제하는 명령어(DDL) -복구할수없다
*/






