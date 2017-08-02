create table board(
	num number(5) primary key,
	pass varchar2(30),
	name varchar2(30),
	email varchar2(30),
	title varchar2(30),
	content varchar2(1000),
	readcount number(4)	default 0,
	writedate date default sysdate
);

insert into board(num, name, email, pass, title, content) values(board_seq.nextval, 'Sinichi', 'sinichi7@gmail.com', '1234', '1빠', '1빠 ㅋㅋㅋㅋ');
insert into board(num, name, email, pass, title, content) values(board_seq.nextval, 'Riku', 'rikukun@gmail.com', '1234', '2빠', '2빠 ㅋㅋㅋㅋ');
insert into board(num, name, email, pass, title, content) values(board_seq.nextval, 'Izumi', 'zard@gmail.com', '1234', '1빠', '3빠 ㅋㅋㅋㅋ');
insert into board(num, name, email, pass, title, content) values(board_seq.nextval, 'Aiuchi', 'aiuchi13@gmail.com', '1234', '오 이런', '4빠 ㅋㅋㅋㅋ');
insert into board(num, name, email, pass, title, content) values(board_seq.nextval, 'Hamasaki', 'hamahama@gmail.com', '1234', '맙소사', '5빠 ㅋㅋㅋㅋ');