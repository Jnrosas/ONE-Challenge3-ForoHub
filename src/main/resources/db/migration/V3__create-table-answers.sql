create table answers(
    id bigint not null auto_increment,
    id_topic bigint not null,
    message varchar(300) not null,
    date datetime not null,
    id_author bigint not null,
    solution boolean not null,

    primary key (id),
    foreign key (id_topic) references topics(id),
    foreign key (id_author) references authors(id)
);