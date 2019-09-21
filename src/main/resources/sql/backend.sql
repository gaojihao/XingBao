CREATE TABLE IF NOT EXISTS `account` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `img_url` varchar(64) DEFAULT NULL COMMENT '头像url',
  `jwt` varchar(64) DEFAULT NULL COMMENT 'jwt',
  `level` int(11) DEFAULT NULL COMMENT '级别',
  `nick_name` varchar(64) DEFAULT NULL COMMENT '昵称',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `vip` bit(1) DEFAULT NULL COMMENT 'VIP标识',
  `user_id` varchar(64) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='账户';

CREATE TABLE `audio` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `course` int(11) DEFAULT NULL COMMENT '课程id',
  `duration` int(11) DEFAULT NULL COMMENT '时长',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `url` varchar(255) DEFAULT NULL COMMENT '链接',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='音频';

CREATE TABLE `blog` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `read_num` int(11) DEFAULT NULL COMMENT '阅读数',
  `summary` varchar(128) NOT NULL COMMENT '摘要',
  `title` varchar(50) NOT NULL COMMENT '标题',
  `url` varchar(255) NOT NULL COMMENT '链接',
  `content` varchar(4096) DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COMMENT='文章';

CREATE TABLE IF NOT EXISTS `categoty` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(50) DEFAULT NULL COMMENT '标题',
  `sub_title` varchar(255) DEFAULT NULL COMMENT '子标题',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2109 DEFAULT CHARSET=utf8 COMMENT='分类';

CREATE TABLE `collect` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `course` int(11) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `course` int(11) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `picture` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `filename` varchar(255) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  `width` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `star` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `course` int(11) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `tag` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `video` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `course` int(11) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


