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

insert into ANDCHAT values('����','ũ��������', sysdate);
insert into ANDCHAT values('����','���Ļ���', sysdate);
insert into ANDCHAT values('�Ĵ�','����', sysdate);
insert into ANDCHAT values('����','��', sysdate);
insert into ANDCHAT values('ȭ��','û��', sysdate);

commit



