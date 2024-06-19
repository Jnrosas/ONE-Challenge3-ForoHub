create table topics(
    id bigint not null auto_increment,
    title varchar(100) not null,
    message varchar(300) not null,
    date datetime not null,
    status boolean not null,
    id_author bigint not null,
    course varchar(100) not null,
    answers varchar(1000),

    primary key (id),
    foreign key (id_author) references authors(id)
);