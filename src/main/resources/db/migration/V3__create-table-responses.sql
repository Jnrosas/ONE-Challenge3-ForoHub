create table responses(
    id bigint not null auto_increment,
    message varchar(300),
    date datetime,
    solution boolean,
    topic_id bigint,
    author_id bigint,

    primary key (id)
--    foreign key (id_topic) references topics(id),
--    foreign key (id_author) references users(id)
);