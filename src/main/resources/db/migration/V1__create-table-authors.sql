create table authors(
    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null,
    password varchar(100) not null,
    topics varchar(1000),
    answers varchar(1000),

    primary key (id)
);