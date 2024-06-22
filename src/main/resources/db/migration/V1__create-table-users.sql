create table users(
    id bigint not null auto_increment,
    name varchar(100),
    email varchar(100),
    password varchar(100),
--    topics varchar(1000),

    primary key (id)

);