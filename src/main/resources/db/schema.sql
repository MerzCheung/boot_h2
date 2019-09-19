drop table if exists `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(32) default NULL COMMENT '名称',
  `age` int(2) default NULL COMMENT '年龄',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_user_id` (`id`)
);