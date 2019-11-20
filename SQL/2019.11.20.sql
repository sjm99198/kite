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

-- OR 연산의 코드를 줄이는 IN 연산자
select ename, comm from emp where comm=300 or comm=500 or comm=1400;
select ename, comm from emp where comm in(300, 500, 1400);


-- 패턴 검색 :  컬럼 이름 LIKE 패턴식
select ename from emp where ename LIKE 'S%';
select ename from emp where ename LIKE '%S';
select ename from emp where ename LIKE '%A%'; 

-- 자리수 고정 패턴 : _ 이용
select ename from emp where ename like '_A%';
select ename from emp where ename like '__A%';

select ename from emp where ename not like '%A%';

-- NULL 연산자 : IS NULL, IS NOT NULL
select ename, comm from emp where comm is null;
select ename, comm from emp where comm is not null;

-- 결과 데이터 행의 정렬 : order by 컬럼명 asc(오름차순)/desc(내림차순)
-- 숫자
select ename, sal from emp order by sal asc;
select ename, sal from emp order by sal;
select ename, sal from emp order by sal desc;

-- 날짜
select ename, hiredate from emp order by hiredate;
select ename, hiredate from emp order by hiredate desc;

-- 문자열
select ename from emp order by ename;
select ename 
from emp 
order by ename desc;

-- 중복의 정렬조건
select ename, sal from emp order by sal desc;
select ename, sal from emp order by sal desc, ename asc;
select ename, sal, hiredate from emp order by sal desc, hiredate desc;



-- 함수

-- 변환함수 : 날짜 -> 문자열 , TO_CHAR(날짜 , '패턴')
select sysdate, to_char(sysdate,'YYYY.MM.DD DAY (DY) AM HH24:MI:SS') as "날짜"
from dual;

select ename, hiredate, to_char(hiredate, 'YYYY.MM.DD DAY ') hiredate1
from emp
ORDER BY hiredate
;

-- 변환함수 : 숫자 -> 문자열 , TO_CHAR(숫자 , '패턴')
select to_char(12345, 'L0,000,000'), to_char(12345, 'L9,999,999'), to_char(12345.67, '00,000.00')
from dual;

select ename, sal, to_char(sal, 'L9,999,999'), to_char(sal*1000, 'L9,999,999'), to_char(sal*1000*12+nvl(comm, 0)*1000, 'L999,999,999')
from emp
order by sal desc
;

-- 변환함수 : to_date(문자열/숫자, '패턴')
select trunc(sysdate-to_date('2019/01/01', 'YYYY/MM/DD'))
from dual;

-- 변환함수 : to_number(문자열, '패턴')
select to_number('20,000', '999,999') - to_number('10,000', '999,999')
from dual;

-- 8. 직급에 따라 급여를 인상하도록 하자. 
-- 직급이 'ANAlYST'인 사원은 5%, 
-- 'SALESMAN'인 사원은 10%, 
-- 'MANAGER'인 사원은 15%, 
-- 'CLERK'인 사원은 20%인 인상한다.
select empno, ename, job, sal, 
        decode(job, 'ANALYST', sal + sal*0.05,
                    'SALESMAN', sal + sal*0.1,
                    'MANAGER', sal + sal*0.15,
                    'CLERK', sal + sal*0.2
        ) upsal
from emp
order by job
;

-- 집합함수
select sum(sal) as "월 총급여", 
       trunc(avg(sal)) as "월 평균 급여",
       count(*) as "총 사원의 수",
       max(sal) as "최고 급여",
       min(sal) as "최저 급여",
       sum(comm) as "총 상여금",
       avg(comm) as "상여금 평균",
       count(comm) as "상여금 책정 인원"
from emp
where deptno=30
;

select * from emp order by deptno;

-- group by : 그룹핑 -> 그룹별 집합 함수 표현
select deptno, count(*), sum(sal), trunc(avg(sal))
from emp
group by deptno
having avg(sal) > 2000
;









