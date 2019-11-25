-- 2019.11.25


-- CROSS JOIN : 테이블을 단순히 붙여준다.
-- JOIN -> 테이블을 집합으로 보고 집합의 곱 연산의 결과이다 -> N*M ( 결과 행이다 )
select *
from emp, dept
;

-- equi join
select *
from emp, dept
where emp.deptno=dept.deptno
;

-- 이름이 'SCOTT' 인 사원의 소속부서의 이름을 사원이름과 함께 출력하자
select ename, dname, d.deptno
from emp e, dept d
where e.deptno=d.deptno
    and ename='SCOTT'
;


select e.sal, s.losal, s.hisal, e.ename, s.grade
from emp e, salgrade s
where sal BETWEEN s.losal and s.hisal
order by s.grade
;

select mgr
from emp
where ename='SMITH'
;
select ename
from emp
where empno=7902;

select e1.ename, e2.ename, d.dname
from emp e1, emp e2, dept d
where e1.mgr=e2.empno and e1.deptno=d.deptno
order by e2.ename
;

select e.ename, m.ename
from emp e, emp m
where e.mgr=m.empno(+)
;


-- ANSI JOIN
-- CORSS JOIN
select * from emp, dept;
select * from emp cross join dept; -- mysql, ms-sq1, oracle

-- inner join
select * from emp e, dept d where e.deptno=d.deptno;
select * from emp e inner join dept d on e.deptno=d.deptno;
select * from emp inner join dept on emp.deptno=dept.deptno;

-- USING
select * from emp inner join dept using(deptno);
--                                on emp.deptno=dept.deptno

-- natural join
select * from emp NATURAL JOIN dept;

-- left|right|full outer join
select * from emp e, emp m where e.mgr=m.empno(+);
select * from emp e inner join emp m on e.mgr=m.empno;
select * from emp e left outer join emp m on e.mgr=m.empno;



select * from dept d, emp e where d.deptno=e.deptno(+);
select distinct(dname) from dept d, emp e where d.deptno=e.deptno(+);
select * from emp e, dept d where d.deptno=e.deptno(+);
