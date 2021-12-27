create table connection_info
(
    id       int auto_increment comment 'id'
        primary key,
    name     varchar(10)  not null comment '连接标志',
    url      varchar(255) not null comment '连接地址',
    username varchar(20)  not null comment '数据库用户名',
    password varchar(20)  not null comment '数据库密码',
    driver   varchar(40)  not null comment '驱动类',
    comment  varchar(255) null comment '备注'
)
    comment '数据库连接信息';
INSERT INTO connection_info (id, name, url, username, password, driver, comment) VALUES (1, '本机', 'jdbc:mysql://124.71.145.65:3306/mybatis_test', 'root', 'HengYu@2021', 'com.mysql.cj.jdbc.Driver', '本机数据库, 测试着玩');
INSERT INTO connection_info (id, name, url, username, password, driver, comment) VALUES (2, '本机2', 'jdbc:mysql://124.71.145.65:3306/sdhy-boot-test', 'root', 'HengYu@2021', 'com.mysql.cj.jdbc.Driver', '本机数据库2, 测试着玩');
INSERT INTO connection_info (id, name, url, username, password, driver, comment) VALUES (3, '本机3', 'jdbc:mysql://124.71.145.65:3306/bubble', 'root', 'HengYu@2021', 'com.mysql.cj.jdbc.Driver', '本机数据库3, 测试着玩');