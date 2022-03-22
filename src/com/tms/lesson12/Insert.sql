insert into people (name,sex, birthday)
values
('Vasya','male','2000-01-01'),
('Kostja','male','2001-01-01'),
('Misha','male','2002-01-01'),
('Jan','male','2003-01-01'),
('Aleksandr','male','2004-01-01'),
('Nina','female','2005-01-01'),
('Masha','female','2006-01-01'),
('Alena','female','2007-01-01'),
('Alesja','female','2008-01-01'),
('Irina','female','2009-01-01');

insert into hobby_type (hobby_type)
values
('active'),
('calm');

insert into hobby (hobby_name, hobby_type_id)
values
('football',1),
('hockey',1),
('reading',2),
('chess',2);

insert into people_hobby (people_id, hobby_id )
values
(1,1),
(1,2),
(1,3),
(1,4),
(2,1),
(3,2),
(5,2),
(5,4),
(6,3),
(6,4),
(7,1),
(7,2),
(8,2),
(9,1),
(9,3),
(10,2);
