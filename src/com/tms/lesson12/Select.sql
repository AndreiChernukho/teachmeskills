-- Вывести всех людей старше какого-либо возраста
select *
from people
where birthday > '2003-01-01';

-- Вывести сколько людей каждого пола есть в бд
select sex, count(*) as sex_count
from people
group by sex;

-- Вывести информацию о людях и их хобби
select people.name, people.sex, people.birthday, hobby.hobby_name people
from people
         join people_hobby on people.id = people_hobby.people_id
         join hobby on people_hobby.hobby_id = hobby.id;

-- Вывести список людей у которых более одного хобби
select people.name
from people
         join people_hobby on
    people.id = people_hobby.people_id
group by people.name
having count(people.name) > 1;

-- Вывести список людей у которых только пассивные хобби
select people.name from people
                            join people_hobby on
        people.id = people_hobby.people_id
                            join hobby on hobby.id = people_hobby.hobby_id
                            join hobby_type on hobby_type.id = hobby.hobby_type_id
where hobby_type.hobby_type = 'calm'
  and people.name not in (select people.name from people
                                                      join people_hobby on
        people.id = people_hobby.people_id
                                                      join hobby on hobby.id = people_hobby.hobby_id
                                                      join hobby_type on hobby_type.id = hobby.hobby_type_id
                          where hobby_type.hobby_type = 'active') group by people.name;

-- Вывести какое количество активных хобби и пассивных хобби есть в бд
select hobby_type.hobby_type, COUNT(*)
from hobby
         join hobby_type
              on hobby.hobby_type_id = hobby_type.id
GROUP BY hobby_type.hobby_type;

-- Вывести информацию какое хобби активное а какое пассивное
select hobby.hobby_name as name, hobby_type.hobby_type as type
from hobby
         join hobby_type
              on hobby.hobby_type_id = hobby_type.id;