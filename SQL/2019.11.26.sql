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







