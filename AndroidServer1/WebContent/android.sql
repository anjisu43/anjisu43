create table andMember(

	id varchar2(500),
	pw varchar2(500),
	nick varchar2(500),
	phone varchar2(500)

)

select * from ANDMEMBER

delete from andmember where id="hodu"

create table andChat(
	nick varchar2(500),
	content varchar2(500),
	day date
)

select * from ANDCHAT

delete ANDCHAT

insert into ANDCHAT values('경이','크리스마스', sysdate);
insert into ANDCHAT values('현이','음식사진', sysdate);
insert into ANDCHAT values('후니','지각', sysdate);
insert into ANDCHAT values('지수','집', sysdate);
insert into ANDCHAT values('화영','청하', sysdate);

commit



