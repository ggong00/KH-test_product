drop table product;
create table product(
                        pid  number(10),
                        pname       varchar(30),
                        count    number(10),
                        price       number(10)
);
--기본키
alter table product add constraint product_pid_pk primary key(pid);

--시퀀스생성
drop sequence product_pid_seq;
create sequence product_pid_seq;


--생성--
insert into product(pid,pname,count,price)
values(product_pid_seq.nextval, '컴퓨터', 5, 1000000);

--조회--
select pid, pname, count, price
from product
where pid = 1;

--수정--
update product
set pname = '컴퓨터',
    count = 10,
    price = 1200000;

--삭제
delete from product where pid = 1;

--전체조회-
select pid,pname,count,price from product;

commit;