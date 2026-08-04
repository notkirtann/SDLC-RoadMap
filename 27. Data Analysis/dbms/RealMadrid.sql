create database RealMadrid;
use RealMadrid ;

create table Players (
    Jersey INT primary key,
    Player varchar(30)
);

insert into Players (Jersey,Player) values
(10,"Modric"),
(2,"Carjaval"),
(7,"Vini Jr.");

insert into Players (Jersey,Player) values
(8,"Valverde"),
(6,"Camavinga"),
(9,"Mbappe");

insert into Players values (5,"Bellingam");

create table PlayerDetail(
	JerseyNo int,
    Position varchar(20) not null,
    Nationality varchar(30) not null,
    foreign key (JerseyNo) references Players(Jersey)
);

insert into PlayerDetail (JerseyNo,Position,Nationality) values
(8,"Midfilder","Uruguay"),
(6,"Midfilder","France"),
(9,"Forward","France");

insert into PlayerDetail (JerseyNo,Position,Nationality) values
(10,"Midfilder","Crotia"),
(2,"Midfilder","Spain"),
(7,"Forward","Brazil");

insert into Players values (5,"Midfilder","England");


select * from Players, PlayerDetail where jerseyNo=  8 and jersey = 8  ;

select * from Players;