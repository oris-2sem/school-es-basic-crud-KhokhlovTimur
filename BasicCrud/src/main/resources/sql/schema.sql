create table if not exists teachers
(
    id         bigserial primary key,
    first_name varchar(20),
    last_name  varchar(20),
    age        int,
    experience int
);

create table if not exists parents
(
    id         bigserial primary key,
    password varchar(20),
    login varchar (20)
);

create table if not exists groups
(
    id                bigserial primary key,
    date_of_admission date,
    letter            varchar(1),
    teacher_id        bigint references teachers (id)
);

create table if not exists students
(
    id         bigserial primary key,
    first_name varchar(20) not null,
    last_name  varchar(20) not null,
    age        int,
    class_id   bigint references groups (id),
    parent_id bigint references parents(id),
    password varchar(20),
    login varchar (20)
);

create table if not exists lessons
(
    id           bigserial primary key,
    subject      varchar(30),
    theme        varchar(100)
);

create table if not exists timetable_rows
(
    id         bigserial primary key,
    start_time time,
    class_id   bigint references groups (id),
--     №123.б-2?
    room       varchar(10),
    teacher_id bigint references teachers (id),
    lesson_id bigint references lessons(id)
);

create table if not exists tasks
(
    id          bigserial primary key,
    comment     varchar(255),
    description varchar(255),
    mark        varchar,
    lesson_id   bigint references lessons (id),
    student_id  bigint references students (id)
);