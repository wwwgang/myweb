-- auto-generated definition
create table user
(
    id       int auto_increment primary key comment 'id',
    username varchar(20) not null comment '用户名',
    password varchar(20) not null comment '密码',
    constraint user_id_uindex
        unique (id),
    constraint user_user_uindex
        unique (username)
)
    comment '用户表';