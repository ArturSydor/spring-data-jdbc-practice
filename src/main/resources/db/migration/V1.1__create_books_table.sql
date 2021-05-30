create table if not exists books(
    id bigserial primary key,
    name varchar(255) not null,
    description varchar(1024),
    author_id bigint not null
);

alter table books
    add foreign key (author_id)
        references authors (id);

insert into books(name, description, author_id)
values ('Test Book', null, 1);