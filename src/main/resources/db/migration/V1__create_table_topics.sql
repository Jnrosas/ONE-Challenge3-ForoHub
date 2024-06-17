create table topics(
    id bigint not null auto_increment primary key,
    title varchar(100) not null,
    message varchar(500) not null,
    topicDate datetime not null,
    course varchar(100) not null,
    status boolean not null,
    author_name varchar(100) not null,
    author_email varchar(100) not null,
    author_password varchar(100) not null,
    answer_topic varchar(100) not null,
    answer_message varchar(300) not null,
    answerDate datetime not null,
    answer_author varchar(100) not null,
    solution boolean not null
);