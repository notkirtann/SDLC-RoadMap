create database Student_Database;
use Student_Database;

-- Creating the Student Table
CREATE TABLE Student (
    STUDENT_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    GPA DECIMAL(4, 2),
    ENROLLMENT_DATE DATETIME,
    MAJOR VARCHAR(50)
);

-- Inserting data into the Student Table
INSERT INTO Student (STUDENT_ID, FIRST_NAME, LAST_NAME, GPA, ENROLLMENT_DATE, MAJOR) VALUES
(201, 'Shivansh', 'Mahajan', 8.79, '2021-09-01 09:30:00', 'Computer Science'),
(202, 'Umesh', 'Sharma', 8.44, '2021-09-01 08:30:00', 'Mathematics'),
(203, 'Rakesh', 'Kumar', 5.60, '2021-09-01 10:00:00', 'Biology'),
(204, 'Radha', 'Sharma', 9.20, '2021-09-01 12:45:00', 'Chemistry'),
(205, 'Kush', 'Kumar', 7.85, '2021-09-01 08:30:00', 'Physics'),
(206, 'Prem', 'Chopra', 9.56, '2021-09-01 09:24:00', 'History'),
(207, 'Pankaj', 'Vats', 9.78, '2021-09-01 02:30:00', 'English'),
(208, 'Navleen', 'Kaur', 7.00, '2021-09-01 06:30:00', 'Mathematics');

-- Creating the Program Table
CREATE TABLE Program (
    STUDENT_REF_ID INT,
    PROGRAM_NAME VARCHAR(50),
    PROGRAM_START_DATE DATETIME,
    FOREIGN KEY (STUDENT_REF_ID) REFERENCES Student(STUDENT_ID)
);

-- Inserting data into the Program Table
INSERT INTO Program (STUDENT_REF_ID, PROGRAM_NAME, PROGRAM_START_DATE) VALUES
(201, 'Computer Science', '2021-09-01 00:00:00'),
(202, 'Mathematics', '2021-09-01 00:00:00'),
(208, 'Mathematics', '2021-09-01 00:00:00'),
(205, 'Physics', '2021-09-01 00:00:00'),
(204, 'Chemistry', '2021-09-01 00:00:00'),
(207, 'Psychology', '2021-09-01 00:00:00'),
(206, 'History', '2021-09-01 00:00:00'),
(203, 'Biology', '2021-09-01 00:00:00');

-- Creating the Scholarship Table
CREATE TABLE Scholarship (
    STUDENT_REF_ID INT,
    SCHOLARSHIP_AMOUNT DECIMAL(10, 2),
    SCHOLARSHIP_DATE DATETIME,
    FOREIGN KEY (STUDENT_REF_ID) REFERENCES Student(STUDENT_ID)
);

-- Inserting data into the Scholarship Table
INSERT INTO Scholarship (STUDENT_REF_ID, SCHOLARSHIP_AMOUNT, SCHOLARSHIP_DATE) VALUES
(201, 5000.00, '2021-10-15 00:00:00'),
(202, 4500.00, '2022-08-18 00:00:00'),
(203, 3000.00, '2022-01-25 00:00:00'),
(201, 4000.00, '2021-10-15 00:00:00');
alter table Student Drop COMPLETE_NAME;
-- 1
select upper(FIRST_NAME) AS STUDENT_NAME from Student;
-- 2
select MAJOR from Student group by MAJOR;
select distinct MAJOR from Student;
-- 3
select substr(FIRST_NAME,1,3) FROM Student;
-- 4
select instr(FIRST_NAME,'a') from Student where FIRST_NAME = 'Shivansh';
-- 5
select MAJOR, length(MAJOR) FROM Student  group by MAJOR;
-- 6
select replace(FIRST_NAME,'a','A') from Student;
-- 7
select concat(FIRST_NAME,' ',LAST_NAME) AS COMPLETE_NAME from Student;
-- 8
select * from Student order by FIRST_NAME asc, MAJOR desc;
-- 9
select * FROM Student WHERE FIRST_NAME IN ('Prem','Shivansh');
-- 10
select * FROM Student WHERE FIRST_NAME NOT IN ('Prem','Shivansh');
-- 11
select * FROM Student where FIRST_NAME like '%a';
-- 12
select * FROM Student where FIRST_NAME like '____a';
-- 13
select * from Student where GPA between 9.0 and 9.99;
-- 14
select MAJOR,count(MAJOR) from Student WHERE MAJOR='Computer Science' group by MAJOR;
-- or
select MAJOR,COUNT(*) as Total_Count from Student WHERE MAJOR='Computer Science';
-- 15
select concat(FIRST_NAME,' ',LAST_NAME) as FULL_NAME from Student WHERE GPA between 8.5 and 9.5;
-- 16
select MAJOR,count(MAJOR) FROM Student GROUP BY MAJOR ORDER BY COUNT(MAJOR) DESC;
-- 17
select 
	Stu.FIRST_NAME,
    Stu.LAST_NAME,
    Sch.SCHOLARSHIP_AMOUNT,
    Sch.SCHOLARSHIP_DATE 
FROM Student as Stu
inner JOIN Scholarship as Sch
on Stu.STUDENT_ID = Sch.STUDENT_REF_ID;
-- 18
select * from Student where STUDENT_ID %2!=0;
-- 19
select * from Student where STUDENT_ID %2!=1;

-- 20
select * 
FROM Student as Stu
LEFT JOIN Scholarship as Sch
on Stu.STUDENT_ID = Sch.STUDENT_REF_ID;

-- 21
select * from Student order by GPA desc limit 5 ;
-- 22
select * from Student order by GPA desc limit 5,1 ;

-- 23
		select * 
		from Student s1 
		where 4 = ( select distinct count(s2.GPA) 
					from Student s2 				-- NOT UNDERSTOOD
					where s2.GPA>s1.GPA
		);

-- 24
select s1.* FROM Student s1,Student s2 where s1.GPA=s2.GPA and s1.STUDENT_ID!=s2.STUDENT_ID; 

-- 25
SELECT FIRST_NAME,GPA FROM Student where GPA = (SELECT MAX(GPA) FROM Student WHERE GPA Not in (SELECT MAX(GPA)FROM Student));

-- 26
select * from Student union all select * from Student order by STUDENT_ID;

-- 27
select Student_id,First_name from Student where Student_id Not in (select Student_ref_id from Scholarship);
 
-- 28
SELECT * 										-- NOT WORKING
FROM Student 
LIMIT (SELECT COUNT(*) FROM Student AS C)/ 2;

-- 29
SELECT MAJOR, COUNT(MAJOR) AS MAJOR_COUNT FROM Student GROUP BY MAJOR HAVING COUNT(MAJOR) < 4;
-- 30
SELECT MAJOR, COUNT(MAJOR) AS ALL_MAJOR FROM Student GROUP BY MAJOR;