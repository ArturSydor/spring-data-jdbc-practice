create table if not exists authors
(
    id            bigserial primary key,
    first_name    varchar(255) not null,
    last_name      varchar(255) not null,
    age           int          not null,
    awards_number int          not null
);

insert into authors(first_name, last_name, age, awards_number)
values ('Test FirstName', 'Test LastName', 50, 10);