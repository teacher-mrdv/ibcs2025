-- ==================================================
-- Use ctrl-enter or shift-enter to execute sqlite3
-- shell commands and SQL.
-- If a subset of the text is currently selected,
-- only that part is executed.
-- ==================================================
.nullvalue NULL
.headers on
.mode box

DROP TABLE IF EXISTS HBStudent;
DROP TABLE IF EXISTS HBTeacher;

PRAGMA foreign_keys = ON;

CREATE TABLE HBTeacher(
TeacherID INT NOT NULL,
TeacherName TEXT NOT NULL,
Classroom TEXT NOT NULL,
PRIMARY KEY (TeacherID)
);

PRAGMA table_info(HBTeacher); -- optional, shows table structure

INSERT INTO HBTeacher(TeacherID, TeacherName, Classroom)
VALUES
	(32963, 'Fisher Eli', 'S06-97'),
	(29788, 'Rogers Xavier', 'S70-56'),
	(34999, 'Shaw Oliver', 'S27-87'),
	(33881, 'Neela Kamala', 'S46-12'),
	(25457, 'Jana Maya', 'S33-85'),
	(36484, 'Cameron Zachary', 'S57-52'),
	(33732, 'Reid Mila', 'S18-11'),
	(48142, 'Robinson Emma', 'S12-87');

-- shows all records from the table
SELECT * FROM HBTeacher;

CREATE TABLE HBStudent(
StudentID INT NOT NULL,
StudentName TEXT NOT NULL,
StudentGender CHAR CHECK(StudentGender IN ('M', 'F')),
Grade INT CHECK(Grade > 8 AND Grade < 13),
TeacherID INT NOT NULL,
PRIMARY KEY (StudentID),
FOREIGN KEY (TeacherID) REFERENCES HBTeacher(TeacherID)
);

PRAGMA table_info(HBStudent);

INSERT INTO HBStudent(StudentID, StudentName, StudentGender,
Grade, TeacherID)
VALUES
	(77224, 'Fisher Adeline', 'M', 9, 36484),
	(85067, 'Colling Aria', 'F', 9, 36484),
	(56357, 'Rajan Prasenjit', 'F', 9, 36484),
	(70285, 'Poon Tara', 'M', 9, 36484),
	(89025, 'Brown Ali', 'M', 9, 36484),
	(76308, 'Sharma Vishnu', 'M', 9, 33732),
	(68614, 'Graham James', 'F', 9, 33732),
	(85574, 'Ali Hazel', 'F', 9, 33732),
	(87419, 'Koh Dominic', 'F', 9, 33732),
	(53238, 'Ross Austin', 'M', 10, 48142),
	(59083, 'Phillips Emma', 'M', 10, 48142),
	(59119, 'Anand Nitya', 'M', 10, 48142),
	(64988, 'Malhotra Pallav', 'F', 10, 48142),
	(51494, 'Tao Vivian', 'F', 10, 48142),
	(55633, 'Shen Min', 'M', 10, 48142),
	(53322, 'Gibson Pippa', 'M', 10, 48142),
	(75210, 'Edwards Ellie', 'F', 10, 48142),
	(58924, 'Rastogi Tushar', 'M', 10, 25457),
	(57254, 'Edwards Jacob', 'F', 10, 25457),
	(62858, 'Harvey Maddison', 'F', 10, 25457),
	(66038, 'Madan Sukhdeep', 'M', 10, 25457),
	(63965, 'Clarke Harriet', 'F', 10, 25457),
	(71723, 'Johnston Benjamin', 'F', 10, 25457),
	(52842, 'Cooper Adeline', 'M', 10, 25457),
	(77043, 'Goh Gen', 'M', 10, 25457),
	(78307, 'Choo Andrew', 'M', 10, 25457),
	(74287, 'Hall Riley', 'M', 10, 25457),
	(77661, 'Rastogi Nishat', 'M', 11, 33881),
	(53937, 'Xie Amoleka', 'M', 11, 33881),
	(83281, 'Mehta Suman', 'F', 11, 33881),
	(74937, 'Adams Logan', 'M', 11, 33881),
	(50865, 'Adams Leon', 'F', 11, 33881),
	(65044, 'Ryan Finn', 'F', 11, 33881),
	(59743, 'Wu Isaac', 'F', 11, 33881),
	(57658, 'Jia Jaime', 'M', 11, 33881),
	(89237, 'Yee Grantdy', 'M', 11, 33881),
	(62483, 'Poh Mai', 'M', 11, 34999),
	(80613, 'Dutta Hasan', 'M', 11, 34999),
	(78256, 'Manju Zaman', 'F', 11, 34999),
	(81976, 'Sethi Kishor', 'M', 11, 34999),
	(85821, 'Harrison Delilah', 'F', 11, 34999),
	(81953, 'Jai Swapan', 'M', 11, 34999),
	(55378, 'Leung Cheong', 'F', 11, 34999),
	(62770, 'Lui Jasmine', 'M', 11, 34999),
	(70566, 'Chandrasekar Ajit', 'F', 11, 34999),
	(79015, 'Man Andrew', 'M', 11, 34999),
	(51405, 'Young Maeve', 'F', 12, 32963),
	(66361, 'Samuel Shresth', 'F', 12, 32963),
	(78719, 'Wilson Noah', 'M', 12, 32963),
	(69132, 'Ge Chen', 'F', 12, 32963),
	(83091, 'Lwin Jess', 'F', 12, 32963),
	(85545, 'Anand Amandeep', 'M', 12, 29788),
	(72906, 'Allen Mason', 'M', 12, 29788),
	(83321, 'Yu Giselle', 'M', 12, 29788),
	(54638, 'Qin Tyris', 'F', 12, 29788);

-- shows all records from the table
SELECT * FROM HBStudent;

-- Now all that is left are the queries:

-- Now all that is left are the queries:
-- a. Grade 9 and 10 students' full names and grade sorted in descending order by grade.

-- b. Records (all student-related fields, including homebase teacher name and classroom) of all grade 12 students.

-- c. Grade 10 female students' full names, grade, HB teacher and HB classroom, sorted in ascending order by Homebase Teacher Surname.

-- d. Names, gender, and number of male and female students in grade 11. Challenge: do it using only one query!

