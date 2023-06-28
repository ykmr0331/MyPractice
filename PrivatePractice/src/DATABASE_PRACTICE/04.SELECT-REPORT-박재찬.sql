/*
1) TEMP 테이블에서 SALARY(연봉)을 이용하여 월 급여를 알아보는 SQL을 작성하시요.
	월 급여는 연봉을 18로 나누어 홀수 달에는 연봉의 1/18 이 지급되고,
    짝수 달에는 연봉의 2/18 가 지급된다고 가정했을 때 홀수 달과 짝수 달에 받을 금액을 SELECT 해 보세요.
*/
SELECT EMP_NAME, ROUND((SALARY*(1/18)),2) as "SALARY/18",ROUND((SALARY*(2/18)),2) as "SALARY2/18" from TEMP; 

/*
2) 위에서 구한 월 급여에 교통비가 10만원씩 지급된다면 (짝수 달은20만원)
   위의 문장이 어떻게 바뀔 지 작성해 보세요.
*/
SELECT EMP_NAME, ROUND((SALARY*(1/18)),2)+100000 AS "SALARY/18", ROUND((SALARY*(2/18)),2)+200000 as "SALARY2/18" from TEMP; 

/*
3) TEMP 의 자료 중 EMP_ID 와 EMP_NAME 을 각각 ‘사번’,‘성명’
  으로 표시되어DISPLAY 되도록 COLUMN ALIAS를 부여하여 SELECT 하시오.
*/

SELECT EMP_ID AS "사번", EMP_NAME AS "성명" FROM TEMP;

/*
4) TEMP 에서 성명을 보여줄 때 직급을 괄호 안에 함께 보여주는 SQL을 작성하시요.
*/


SELECT emp_name||'('||lev||')' as "성명" from temp;
SELECT emp_name||''''||lev||'''' as "성명" from temp;

/*
5) TEMP 테이블에서 HOBBY(취미) 가 NULL 이 아닌 사람의 
   성명을 읽어오는 SQL을 작성하시요.
*/

SELECT EMP_NAME AS EMP_NAME FROM TEMP WHERE HOBBY != 'NULL';


/*
6) TEMP테이블에서 성명과 생년월일을 작은따옴표로 묶어서 
   하나의 문자열로 보여주는 SQL을 작성하시요.
*/
select ''''||emp_name||BIRTH_DATE||'''' as "NAME_BIRTH" from TEMP;


/*
7)TEMP 테이블을 이용해서 취미가 있는 사람 중 
  직급이 과장인 사람의 사번, 성명, 취미를 읽어오는
  SQL을 작성 하시오.
*/

SELECT EMP_ID, EMP_NAME, HOBBY FROM TEMP WHERE HOBBY != 'NULL' and LEV = '과장'; 

