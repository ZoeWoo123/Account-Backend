create table user(
id INT NOT NULL AUTO_INCREMENT,
firstName VARCHAR(250),
lastName VARCHAR(250),
phoneNum VARCHAR(250),
emailAdd VARCHAR(250),
password VARCHAR(250),
PRIMARY KEY (id));
insert into user (firstName, lastName, phoneNum, emailAdd, password) values('Peter', 'Pan', '1111111111', '12345@gmail.com','1qaz@WSX');