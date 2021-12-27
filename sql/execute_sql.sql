DROP TABLE IF EXISTS `execute_sql`;
CREATE TABLE `execute_sql`
(
    id            int auto_increment primary key comment 'id',
    `sql_content` text not null comment 'sql内容'
) comment 'sql内容';