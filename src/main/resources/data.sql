DROP TABLE IF EXISTS students;

CREATE TABLE students (
                           id INT AUTO_INCREMENT  PRIMARY KEY,
                           first_name VARCHAR(250) NOT NULL,
                           last_name VARCHAR(250) NOT NULL,
                           school_year VARCHAR(20) NOT NULL,
                           student_group VARCHAR(20) NOT NULL

);

INSERT INTO students (first_name, last_name, school_year, student_group) VALUES
                                                                  ('John', 'DOE', 'ING1', 'GI4'),
                                                                  ('Sophie', 'DUPONT', 'PréING', 'MI1'),
                                                                  ('Bob', 'MICHAEL', 'ING2', 'GSI2');