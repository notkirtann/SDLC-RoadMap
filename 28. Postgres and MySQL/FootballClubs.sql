Create DATABASE FootballClubs;

USE FootballClubs;

CREATE TABLE football_teams (
    team_id INT AUTO_INCREMENT PRIMARY KEY,        -- Unique identifier for each team
    team_name VARCHAR(100) NOT NULL,              -- Name of the football team
    city VARCHAR(100) NOT NULL,                   -- City the team is based in
    country VARCHAR(100) NOT NULL,                -- Country the team is from
    stadium_name VARCHAR(100),                    -- Name of the team's stadium
    championships_won INT DEFAULT 0              -- Number of championships won
);

INSERT INTO football_teams (team_name, city, country, stadium_name, championships_won) VALUES
('Manchester United', 'Manchester', 'England', 'Old Trafford', 20),
('Real Madrid', 'Madrid', 'Spain', 'Santiago Bernabéu', 36),
('Barcelona', 'Barcelona', 'Spain', 'Camp Nou', 26),
('Paris Saint-Germain', 'Paris', 'France', 'Parc des Princes', 11),
('Bayern Munich', 'Munich', 'Germany', 'Allianz Arena', 33),
('Juventus', 'Turin', 'Italy', 'Allianz Stadium', 36),
('Chelsea', 'London', 'England', 'Stamford Bridge', 6),
('Liverpool', 'Liverpool', 'England', 'Anfield', 19),
('Inter Milan', 'Milan', 'Italy', 'San Siro', 19),
('Ajax', 'Amsterdam', 'Netherlands', 'Johan Cruyff Arena', 36);

insert into football_teams values (10,'Arsenal','London','England','Emirates',13);

CREATE TABLE players (
    player_id INT AUTO_INCREMENT PRIMARY KEY,   -- Unique identifier for each player
    team_id INT,                                -- Foreign key to the football_teams table
    player_name VARCHAR(100) NOT NULL,          -- Name of the player
    position VARCHAR(50) NOT NULL,              -- Player's position (e.g., Forward, Midfielder)
    nationality VARCHAR(100) NOT NULL,          -- Player's nationality
    goals_scored INT DEFAULT 0,                 -- Total goals scored by the player
    assists INT DEFAULT 0,                      -- Total assists by the player
    FOREIGN KEY (team_id) REFERENCES football_teams(team_id) -- Foreign key constraint
    on update cascade
    on delete cascade
);

INSERT INTO players (team_id, player_name, position, nationality, goals_scored, assists) VALUES
(1, 'Bruno Fernandes', 'Midfielder', 'Portugal', 35, 45),
(1, 'Marcus Rashford', 'Forward', 'England', 80, 35),
(2, 'Karim Benzema', 'Forward', 'France', 250, 90),
(2, 'Luka Modric', 'Midfielder', 'Croatia', 25, 60),
(3, 'Lionel Messi', 'Forward', 'Argentina', 672, 268),
(3, 'Pedri', 'Midfielder', 'Spain', 10, 20),
(4, 'Kylian Mbappé', 'Forward', 'France', 250, 50),
(4, 'Neymar Jr.', 'Forward', 'Brazil', 200, 100),
(5, 'Thomas Müller', 'Midfielder', 'Germany', 150, 200),
(5, 'Joshua Kimmich', 'Defender', 'Germany', 40, 60),
(6, 'Cristiano Ronaldo', 'Forward', 'Portugal', 450, 120),
(6, 'Paul Pogba', 'Midfielder', 'France', 40, 80),
(7, 'Raheem Sterling', 'Forward', 'England', 100, 70),
(7, 'Enzo Fernández', 'Midfielder', 'Argentina', 15, 25),
(8, 'Mohamed Salah', 'Forward', 'Egypt', 200, 90),
(8, 'Virgil van Dijk', 'Defender', 'Netherlands', 20, 10),
(9, 'Lautaro Martínez', 'Forward', 'Argentina', 100, 50),
(9, 'Hakan Çalhanoğlu', 'Midfielder', 'Turkey', 50, 80),
(10, 'Dusan Tadic', 'Forward', 'Serbia', 150, 100),
(10, 'Ryan Gravenberch', 'Midfielder', 'Netherlands', 20, 30);

INSERT INTO players ( player_name, position, nationality, goals_scored, assists) VALUES 
('Erling Haaland','Forward','Norway',180,67);

set sql_safe_updates = 0;

update football_teams set team_id = 11 where city = "Amsterdam"; -- cascade method 
																 -- used to change data in every table where it is common eg. Foreign Key 
select * from players;

alter table players add column age INT default 18;
alter table players drop column age;
alter table players rename to players_data;
select * from players_data;
alter table players_data rename to players;
alter table players change column age player_age INT;
alter table players modify player_age float;
alter table players drop column player_age;
alter table football_teams change column championships_won League_Title INT;
-- truncate table players;

-- JOINS \
-- 1) Inner Join 
-- 2) Outer Join 
-- 	  a) Right outer join 
--    b) Left Outer Join 
--    c) FULL OUTER JOIN[Combo right+left Union)  
 select * 
 from players as ply -- alias == means short forms for bigger table
 inner join  football_teams as FTeam 
 on FTeam.team_id = ply.team_id;
 
 
 select * 
 from players as ply -- alias == means short forms for bigger table
 left join  football_teams as FTeam 
 on FTeam.team_id = ply.team_id;
 
 
  select * 
  from players as ply -- alias == means short forms for bigger table
  right join  football_teams as FTeam 
  on ply.team_id = FTeam.team_id;
  
  
select * 
	from players as ply -- alias == means short forms for bigger table
	left join  football_teams as FTeam 
	on FTeam.team_id = ply.team_id
                   UNION -- LEFT JOIN + RIGHT JOIN == FULL JOIN / FULL OUTER JOIN
select * 
	from players as ply -- alias == means short forms for bigger table
	right join  football_teams as FTeam 
	on ply.team_id = FTeam.team_id;
    
select * 
 from players as ply 
 left join  football_teams as FTeam        -- left EXCLUSIVE JOIN 
 on FTeam.team_id = ply.team_id
 where FTeam.team_id is null;

select * 
 from players as ply 
 RIGHT join  football_teams as FTeam        -- RIGHT EXCLUSIVE JOIN 
 on FTeam.team_id = ply.team_id
 where ply.team_id is null;

select * 
 from players as ply 
 left join  football_teams as FTeam        
 on FTeam.team_id = ply.team_id
 where FTeam.team_id is null
		UNION								-- FULL EXCLUSICE (jo sirf table and table b me solo solo ho
select * 
 from players as ply 
 RIGHT join  football_teams as FTeam        
 on FTeam.team_id = ply.team_id
 where ply.team_id is null;

select a.player_name, b.team_id
from players as a
join players as b
on a.player_id = b.team_id;

select player_name, goals_scored from players				-- subqueries in WHERE
where goals_scored > (select avg(goals_scored) from players);

select player_name, goals_scored
from players																		-- subqueries in WHERE
where goals_scored in (select goals_scored from players where goals_scored %2=1);

select player_name,goals_scored
from (select * from players where position = 'Midfielder') as tmp
where goals_scored = (select max(goals_scored) from(select * from players where position = 'Midfielder') as tmp2);

select (select max(goals_scored) from players where position = 'Forward'),player_name
from (select * from players where position = 'Forward') as def
where goals_scored = (select max(goals_scored) from players where position = 'Forward');



 -- VIEWS in SQL are virtual table can use ever sql function in it.
 
 create or replace view Player_Stats as
 select player_name, goals_scored,assists from players;
 
 select * from Player_Details;
 
 create or replace view Player_Team as
 select player_name, position ,FTeam.team_id, team_name,country 
 from players as ply 
 inner join  football_teams as FTeam 
 on FTeam.team_id = ply.team_id;
 
 select * from Player_Team;
 
 
 
