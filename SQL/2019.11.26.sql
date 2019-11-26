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
insert into emp07 (empno, ename, sal) values (1000, 'son', 30000);
insert into emp07 (empno, ename, sal) values (1000, 'son', 3000);

select * from emp07;



