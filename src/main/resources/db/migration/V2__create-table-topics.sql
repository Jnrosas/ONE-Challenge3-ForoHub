create table topics(
    id bigint not null auto_increment,
    title varchar(100),
    message varchar(300),
    date datetime,
    status boolean,
    author_id bigint,
    course varchar(100),
--    responses varchar(1000),

    primary key (id)

);