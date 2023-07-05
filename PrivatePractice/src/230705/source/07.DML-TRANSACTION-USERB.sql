--userb

--scott이 가지고 있는 emp와 dept select

select * from  scott.emp;
select * from scott.dept;



/*
--usera가 Transaction 중에 변경한 sal값이 아닌 
    이전값(5000)을 읽게(select)된다.
--usera가 Transaction을 종료하면 종료 이후에 
    반영된 값을 읽게(select)된다.
*/
select sal from scott.emp where ename = 'KING';

-----------------lock-----------------
/*
--Transaction시 변경행에 lock이 걸려있으므로 
--변경(update,delete )불가
wait
*/

--Transaction    
    
select * from scott.emp;            
update scott.emp set comm = comm* 2 where ename =  'ALLEN';

select * from scott.emp;
select * from scott.emp where ename ='ALLEN';
COMMIT;

---------------------------insert---------------------------
select * from scott.dept;




























