--sys
/*
<<sys계정>>
*/

--XE 21c버전에서 계정이름 기존방법대로 생성
create user usera identified by usera;

alter session set "_ORACLE_SCRIPT"=true;
        /*는 오라클 데이터베이스에서 사용되는 세션 레벨의 매개변수 설정입니다.
        이 설정은 특정 세션에서 오라클 스크립트를 실행할 때 필요한 매개변수를
        설정하는 데 사용됩니다.*/
        
--user 생성        
create user usera identified by usera;        
create user userb identified by userb;
            /* 사용자 "usera"와 "userb"를 생성하고, 
            각 사용자의 비밀번호를 "usera"와 "userb"로 설정*/

--user 권한부여
grant connect, resource, unlimited tablespace to usera;
grant connect, resource, unlimited tablespace to userb;
            /*오라클 데이터베이스에서 사용자에게 권한을 부여하는 명령입니다.
            usera 와 userb 사용자에게 "connect", "resource", 
            그리고 "unlimited tablespace" 권한을 부여 */
/*
usera, userb 에 scott계정이 가지고 있는 emp, dept
테이블 접근 권한 부여(select, update, delete, insert)
*/

grant all on scott.emp to usera;
            --"scott" 스키마의 "emp" 테이블에 대한 모든 권한을 "usera" 사용자에게 부여하는 명령
grant all on scott.dept to usera;

grant all on scott.emp to userb;
grant all on scott.dept to userb;








/*
DML

데이터베이스에서 @@데이터@@를 조회, 삽입, 수정, 삭제하는 작업을 수행하는 SQL 명령어의 집합
예:SELECT INSERT UPDATE DELETE  MERGE
 

DDL

데이터베이스 @@구조@@를 정의하거나 수정하기 위해 사용되는 SQL의 하위 언어
예: CREATE  ALTER  DROP  TRUNCATE


DCL

 데이터베이스@@ 관리 시스템(DBMS)@@에서 데이터베이스 객체에 대한 액세스 권한을 제어하는 명령어를 포함하는 SQL의 하위 언어

예: GRANT REVOKE DENY
*/












