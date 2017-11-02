create database todo_db;

CREATE TABLE `todo_db`.`apptasks` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NULL,
  `priority` VARCHAR(45) NULL,
  `status` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  
  
insert into todo_db.apptasks values
(2, 'Wash a car','MEDIUM','TODO'),
(3, 'Prepare for intreview','HIGH','DONE'),
(4, 'Write a bot','HIGH','DONE'),
(5, 'Wash a car','MEDIUM','TODO'),
(6, 'Wash a car','MEDIUM','TODO'),
(7, 'Wash a car','MEDIUM','TODO'),
(8, 'Wash a car','MEDIUM','TODO'),
(9, 'Wash a car','MEDIUM','TODO')