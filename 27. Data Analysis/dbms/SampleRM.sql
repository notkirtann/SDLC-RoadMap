create database RMCF;
use RMCF;

create table RealMadrid (
	JNo int primary key,
    name varchar(30),
    position varchar(20),
    country varchar(20),
    Goals int,
    Assit int
);

insert into RealMadrid values -- Midfilders
	(10,"Luka Modric","Midfilder","Crotia",15,90),  
    (5,"Bellingam","Midfilder","England",45,57),
    (6,"Camavinga","Midfilder","France",6,20),
    (14,"Touchemni","Midfilder","France",10,14),
    (8,"Valverde","Midfilder","Uruguay",37,78),
    (15,"Arda Guler","Midfilder","Turkey",23,42),
    (19,"Cellabos","Midfilder","Spain",23,42);

insert into RealMadrid values -- Forward
	(7,"Vini Jr.","Forward","Brazil",92,97),  
    (9,"Mbappe","Forward","France",324,107),
    (11,"Rodrygoes","Forward","Brazil",87,72),
    (21,"Brahim Diaz","Forward","Morrco",83,42),
    (16,"Endrick","Forward","Brazil",42,19);
    
INSERT INTO RealMadrid VALUES -- Defender
    (2, "Carvajal", "Defender", "Spain", 45, 95),
    (3, "Fran Garcia", "Defender", "Spain", 6,15),
    (4, "Alaba", "Defender", "Austria", 25, 42),
    (23, "Mendy", "Defender", "France", 12,18),
    (18, "Jesus Val", "Defender", "Spain", 5,16),
    (22, "Rüdiger", "Defender", "Germany", 15, 18),
    (20, "Fran Garcia", "Defender", "Spain", 11,13),
    (17, "Lucas Vasquez", "Defender", "Spain", 19,29);

INSERT INTO RealMadrid VALUES -- Goalkeeper
    (1, "Thibaut Courtois", "Goalkeeper", "Belgium", 0, 7),
    (13, "Andriy Lunin", "Goalkeeper", "Ukraine", 0, 2),
    (26, "Fran Gonzalez", "Goalkeeper", "Spain", 0, 1);
    
UPDATE RealMadrid
SET name = "Milito",country="Brazil",Goals=13,Assit = 18
WHERE JNo = 3;

UPDATE RealMadrid
SET Goals=43,Assit = 68
WHERE JNo = 2;

UPDATE RealMadrid
SET Goals=43
WHERE JNo =10;

select * from RealMadrid;
select name, country from RealMadrid;
select distinct country from RealMadrid;
select * from RealMadrid where country="Spain";
select * from RealMadrid where country in ("France","Spain");
select * from RealMadrid where country not in ("France","Spain","Brazil") limit 5;
select * from RealMadrid where Goals+Assit between 50 and 100;
select * from RealMadrid where Goals+Assit >100;

select * from RealMadrid order by Goals desc limit 5;

select avg(Goals) from RealMadrid; -- count max min ;

select country,position, count(name) from RealMadrid group by country,position;

select country,count(position) from RealMadrid group by country;

select country, avg(goals) from RealMadrid group by country order by avg(goals) desc;

select country, sum(goals) from RealMadrid group by country having sum(goals)>100;

select country, sum(goals) from RealMadrid group by country having max(goals)>90; -- kisi ek ne max/min 90 goals solo maare hona chaiye

select country, sum(goals+assit) from RealMadrid group by country having sum(goals+assit)>100;
