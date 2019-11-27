-- 2019.11.26

-- check, default 제약조건
drop table emp07;
create table emp07 (
    empno number(4) CONSTRAINT emp07_empno_pk PRIMARY KEY,
    ename varchar2(20) CONSTRAINT emp07_ename_nn not null,
    sal number(7,2) CONSTRAINT emp07_sal_chk check ( sal between 500 and 5000 ),
    --sal number(7,2) CONSTRAINT emp07_sal_chk check ( sal >= 500 and sal <= 5000 ),
    regdate DATE default sysdate
);
create table emp07 (
    empno number(4),
    ename varchar2(20) not null,
    sal number(7,2),
    regdate DATE default sysdate,
    deptno number(2),
    constraint emp07_empno_pk primary key (EMPNO),
    constraint emp07_deptno_fk  FOREIGN KEY(deptno) REFERENCES dept(deptno),
    constraint emp07_sal_chk check ( sal between 500 and 5000 )

);




desc emp07;

-- 입력
-- insert into 테이블 이름 (컬럼,...)   values ( data, . ....)
insert into emp07 (empno, ename, sal) values (null, null, 300);
insert into emp07 (empno, ename, sal) values (1000, null, 300);
insert into emp07 (empno, ename, sal) values (1000, 'son', 5001);
insert into emp07 (empno, ename, sal) values (1000, 'son', 3000);

select * from emp07;

-- 데이터 입력 
-- insert into 테이블 이름 (행단위 입력에서 입력하고자 하는 컬럼들을 기술 ) values (기술된 컬럼에 입력할 데이터 들을 기술)
-- 입력할 컬럼의 개수와 입력할 데이터의 개수가 같아야 한다. 타입도 같아야 한다

create table dept01
as
select * from dept where 1=0;

insert into dept01 (depno, dname, loc) 
            values (10, 'dev', 'seoul');

desc dept01;
insert into dept01 values (20, 'design', 'jeju');
insert into dept01 values ('design', 20, 'jeju'); -- 오류 


-- 데이터의 변경
-- UPDATE 테이블 이름 SET 변경 컬럼=새로운 DATA,... WEHRE 조건식 ( 행선택 )
DROP TABLE EMP01;
CREATE TABLE EMP01
AS
SELECT * FROM EMP;
SELECT * FROM EMP01;

UPDATE EMP01 SET DEPTNO=20 WHERE ENAME='SCOTT';

-- 급여가 3000 이상인 사원만 급여를 10% 인상
UPDATE EMP01
SET SAL=SAL*1.1
WHERE SAL>=3000;

-- 1987년에 입사한 사원의 입사일을 오늘 날짜로 변경 , 87/01/03
UPDATE EMP01
SET hiredate = SYSDATE
WHERE SUBSTR(HIREDATE,1,2)='87'
--WHERE HIREDATE >= '87/01/01' AND HIREDATE <= '87/12/31'
;

-- SCOTT 사원의 
-- 부서번호를 10번으로 변경, 직급을 MANAGER변경, 입사일을 오늘날짜, 급여를 50, 커미션을 4000 으로 변경
UPDATE EMP01
SET DEPTNO=10, JOB='MANAGER', HIREDATE = SYSDATE, SAL=50, COMM=4000
WHERE ENAME='SCOTT';

DROP TABLE DEPT01;
CREATE TABLE DEPT01
AS
SELECT * FROM DEPT;

-- 20번 부서의 지역명을 40번 부서의 지역명으로 변경
SELECT LOC FROM DEPT01 WHERE DEPTNO=40;
SELECT LOC FROM DEPT01 WHERE DEPTNO=20;

UPDATE DEPT01
--SET LOC=(40번 부서의 지역명)
SET LOC=(SELECT LOC FROM DEPT01 WHERE DEPTNO=40)
WHERE DEPTNO=20;

-- 20번 부서의 부서이름과 지역을 40번부서의 이름과 지역명으로 변경, 부서이름/지역명
UPDATE DEPT01
SET 
    DNAME=(SELECT DNAME FROM DEPT01 WHERE DEPTNO=40), 
    LOC=(SELECT LOC FROM DEPT01 WHERE DEPTNO=40)
WHERE DEPTNO=20;
UPDATE DEPT01
SET (DNAME, LOC)=(SELECT DNAME, LOC FROM DEPT01 WHERE DEPTNO=40)
WHERE DEPTNO=20;

SELECT * FROM DEPT01;


-- 데이터의 삭제
-- DELETE FROM 테이블 이름 WHERE 행 선택조건 : 행단위 삭제

SELECT * FROM DEPT01;

DELETE FROM DEPT01 WHERE DEPTNO=10;
DELETE FROM DEPT01;

ROLLBACK;

-- VIEW : 기본 테이블을 기반으로 하는 가상테이블 ( select 의 결과를 테이블로 사용 )

select empno, ename, deptno from emp where deptno=30;
select * from emp_view30;
create or REPLACE view emp_view30
as
select empno, ename, deptno from emp where deptno=30
;
drop VIEW emp_view30;


-- 인라인 뷰
-- 입사일 빠른 5명을 순서대로 출력
select rownum, ename , hiredate from emp order by hiredate;

create or replace view emp_view_hire
as
select ename, hiredate from emp order by hiredate
;

select rownum, ename, hiredate from emp_view_hire where ROWNUM <=5;

select rownum, ename, hiredate 
from (select * from emp order by hiredate)
where rownum<=5
;

-- sequence : 자동 숫자 재생기
-- currval : 현재 시쿼스의 값을 반환
-- nextval : 새로운 번호를 생성해서 반환

create sequence dept_deptno_seq
start with 10
INCREMENT by 10;

drop sequence dept_deptno_seq;

select dept_deptno_seq.nextval from dual;

create table dept03
as
select * from dept where 1=0;

select * from dept03;

insert into dept03 values(dept_deptno_seq.nextval, 'dev', 'seoul');
insert into dept03 values(dept_deptno_seq.nextval, 'dev');

rollback;


-- 인덱스 : 검색을 빠르게 지원

create index idx_emp_ename 
on emp(ename)
;









