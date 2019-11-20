-- 2019.11.20

-- 사용자의 소유 테이블 정보
select * from tab;

-- 테이블 구조 확인
desc emp;

-- 테이블의 데이터 조회( 검색, 질의 )
select *
from emp
;
select * from dept;


-- 사원의 이름과 직급 급여 출력하자
select ename, job, sal
from emp;

-- 사칙연산 : + - * /
select ename, sal, sal*12
from emp;

-- NULL : 아직 정해지지않은 데이터, 연산은 불가능 -> 결과는 null
select ename, sal, sal*12, comm,  sal*12+comm
from emp
;

-- NULL 값을 치환하는 함수 : NVL(컬럼, 기본값)
select ename, sal, sal*12, nvl(comm,0)  comm,  sal*12+nvl(comm,0) as ySal
from emp
;

-- 문자열의 연산(+) --> ||
select ename || ' is a ' || job from emp;

-- DISTINCT : 중복 데이터 출력하지 않는다.
select deptno from emp;
select DISTINCT deptno from emp;
select DISTINCT job from emp;

-- 특정 행 선택 : where ( 조건식 ) 절 이용
select ename, job, sal
from emp
where sal >= 3000
;

-- 조건식 : =
select * 
from emp 
where deptno=10;

-- 문자열 비교 : 문자열은 작은 따움표 사용, 대소분자 구별한다.
select * from emp where ename='scott';
select * from emp where ename='SCOTT';

-- 날짜 비교 : 작은 따움표 사용
select * from emp where hiredate='87/04/19';
select * from emp where hiredate<'87/04/19';
select * from emp where hiredate>'87/04/19';
select * from emp where hiredate>='81/01/01' and hiredate <='81/12/31';

-- BETWEEN a AND b
select *
from emp
where sal BETWEEN 2000 and 3000;

select * from emp where hiredate>'81/01/01' and hiredate<'81/12/31';
select * 
from emp
where hiredate between '81/01/01' and '81/12/31'
;


