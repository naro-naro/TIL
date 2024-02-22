CREATE TABLE students (
	name VARCHAR(255) NOT NULL, 
	age INT NOT NULL,
	address VARCHAR(255) NOT NULL);

INSERT INTO students (name, age, address) VALUES
('이황', 28, '경상북도'),
('정약용', 29, '경기도'),
('김정호', 30, '전라북도'),
('박지원', 31, '전라북도'),
('김홍도', 32, '경기도'),
('신윤복', 33, '서울특별시'),
('김광균', 34, '서울특별시'),
('한용운', 35, '경상남도'),
('박두진', 36, '경기도');


SELECT * FROM students;

CREATE TABLE classes (
	name VARCHAR(255) NOT NULL,
	class_name VARCHAR(255) NOT NULL);

INSERT INTO classes (name, class_name) VALUES
('이황', '데이터베이스'),
('이황', '알고리즘'),
('정약용', '데이터베이스'),
('김정호', '자료구조'),
('박지원', '데이터베이스'),
('김홍도', '알고리즘'),
('신윤복', '자료구조'),
('신윤복', '알고리즘'),
('김광균', '데이터베이스'),
('김광균', '자료구조'),
('김광균', '알고리즘');

SELECT * FROM classes;