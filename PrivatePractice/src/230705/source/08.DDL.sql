--DDL(Data Definition Language)
create table dept(
    deptno number(2),
    dname varchar2(50),
    loca varchar2(50)
);
--00955. 00000 -  "name is already used by an existing object"
create table dept2(
    deptno number(2),
    dname varchar2(50),
    loc varchar2(50)
);

create table scott.dept3(
    deptno number(2),
    dname varchar2(50),
    loc varchar2(50)
);

insert into dept2 values(10,'개발팀','서울');
insert into dept3 values(10,'기획팀','부산');

--default

create table default_table (
    num number(2) default null,
    writer varchar2(50) default null,
    write_day date default null
);
    
select * from default_table;
insert into default_table(num,writer,write_day) values(1,'강수지',sysdate);
insert into default_table(num) values(2);
insert into default_table(writer) values('김수지');

create table default_table2(
    num number(2),
    writer varchar2(50),
    write_day date
    );
select * from default_table2;
insert into default_table2(num,writer,write_day) values(1,'강수지',sysdate);
insert into default_table2(num) values(2);
insert into default_table2(writer) values('김수지');

drop table default_table3;

create table default_table3(
    num number(2) default 0,
    writer varchar2(50) default 'guest',
    write_day date default sysdate
    );
    
select * from default_table3;

insert into default_table3(num, writer,write_day) values(1,'김수한', to_date('2023/06/06','YYYY/MM/DD'));
insert into default_table3(num) values(2);
insert into default_table3(num, writer) values(3,'김우수');
insert into default_table3(num,writer,write_day) values (null,null,null);
insert into default_table3(num,writer,write_day) values (5,'김우우', sysdate-1);


drop table default_board;
create table default_board(
        no number(4) primary key,
        title varchar2(100),
        content varchar2(1000),
        write_day date default sysdate,
        read_count number(5) default 0,
        is_secret varchar2(1) default 'F',
        write_user varchar(30) default '익명'
);

select * from default_board;
insert into default_board(no,title,content)values(1,'오늘은 월요일','ㅠㅠㅠㅠㅠ');
insert into default_board(no,title,content)values(2,'오늘은 화요일','아마도~~~');
insert into default_board(no,title,content,write_day,read_count,is_secret,write_user)
    values(3,'오늘은 수요일','희망이 보여요', sysdate,1,'T','guard');
    
        
--  column date type  

drop table data_type;

create table data_type(
    no number(4,0) primary key,
    name varchar2(20),
    gender char(1) default 'M',
    height number(5,2),
    weight number(4,1)
);

desc data_type;
select * from data_type;

insert into data_type values(1234,'김경호','M',185.32,75.3);


--소수점 이하 자리수는 반올림 후 삽입
insert into data_type values(1234.9999,'김경호','M',185.32999999999999,75.399999999999);


--소수점 이상 자리수는 삽입 에러
        --SQL 오류: ORA-01438: 이 열에 대해 지정된 전체 자릿수보다 큰 값이 허용됩니다.
insert into data_type values(12345,'김경호','M',1754  ,7559  );

--[varchar2]
        --SQL 오류: ORA-12899: "SCOTT"."DATA_TYPE"."NAME" 열에 대한 값이 너무 큼(실제: 22, 최대값: 20)
insert into data_type values(2344, '김경호는 강사다', 'M', 181.36,56.8);

--[char]
        --SQL 오류: ORA-12899: "SCOTT"."DATA_TYPE"."GENDER" 열에 대한 값이 너무 큼(실제: 4, 최대값: 1)
insert into data_type values(1212,'김경호', 'MALE', 181.36,56.8);

--DATE, TIMESTAMP
drop table date_time;

create table date_time(
    day1 date default sysdate,
    day2 timestamp(6) default systimestamp, 
                -- timestamp()는  SQL에서 현재 시간과 날짜를 반환하는 함수
    day3 timestamp(9) default systimestamp
    );

select * from date_time;

desc date_time;

select to_char(day1,'YYYY/MM/DD HH24:MI:SS'),
       to_char(day2,'YYYY/MM/DD HH24:MI:SS.FF6'),  --FF6: 6자리 마이크로초 (예: 123456)
       to_char(day3,'YYYY/MM/DD HH24:MI:SS.FF9')
from date_time;        

insert into date_time values(sysdate, systimestamp, systimestamp);

insert into date_time values(to_date('2002/05/12 05:35:45', 'YYYY/MM/DD HH24:MI:SS'),
                             to_timestamp('2020/05/05 02:34:59.123456', 'YYYY/MM/DD HH12:MI:SS,FF6'),
                             to_timestamp('2020/05/05 02:34:59.123456789', 'YYYY/MM/DD HH12:MI:SS,FF9')
                             );

commit;
--서브쿼리를 이용한 테이블생성(CTAS: Create Tabel As Select)

create table depta
as
select deptno, dname, loc from dept;  --이 select문을 보고 depta테이블을 만든다.

select * from depta;



create table deptb
as
select deptno, dname from dept;  --이 select문을 보고 depta테이블을 만

select * from deptb;



create table deptc(no,name)
as
select deptno, dname from dept;  --이 select문을 보고 depta테이블을 만

select * from deptc;

--table만 생성
create table deptd
as
select * from dept where 1=2; -- 이러면 dept로부터 아무것도 뽑히지 않음


--ITAS(InsertTable as Select)
        -- ITAS는 SELECT 문의 결과를 기반으로 새로운 테이블에 데이터를 삽입하는 기능을 제공

create table empa
as
select * from emp where 1 =2;

insert into empa
select * from emp;

select * from empa;



































