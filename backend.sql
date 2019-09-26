CREATE TABLE IF NOT EXISTS `account` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
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

CREATE TABLE IF NOT EXISTS `audio` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `course` int(11) DEFAULT NULL COMMENT '课程id',
  `duration` int(11) DEFAULT NULL COMMENT '时长',
  `title` varchar(128) DEFAULT NULL COMMENT '标题',
  `url` varchar(64) DEFAULT NULL COMMENT '链接',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='音频';

CREATE TABLE IF NOT EXISTS `blog` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `read_num` int(11) DEFAULT NULL COMMENT '阅读数',
  `summary` varchar(128) NOT NULL COMMENT '摘要',
  `title` varchar(50) NOT NULL COMMENT '标题',
  `url` varchar(64) NOT NULL COMMENT '链接',
  `content` varchar(4096) DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COMMENT='文章';

CREATE TABLE IF NOT EXISTS `categoty` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(50) DEFAULT NULL COMMENT '标题',
  `sub_title` varchar(50) DEFAULT NULL COMMENT '子标题',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2109 DEFAULT CHARSET=utf8 COMMENT='分类';

CREATE TABLE IF NOT EXISTS `collect` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `course` int(11) DEFAULT NULL COMMENT '课程id',
  `user_id` varchar(64) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='收藏';

CREATE TABLE IF NOT EXISTS `comment` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `content` varchar(256) DEFAULT NULL COMMENT '评论内容',
  `course` int(11) DEFAULT NULL COMMENT '课程id',
  `level` int(11) DEFAULT NULL COMMENT '星级',
  `user_id` varchar(64) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='评论';

CREATE TABLE IF NOT EXISTS `picture` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `filename` varchar(64) DEFAULT NULL COMMENT '文件名称',
  `height` varchar(8) DEFAULT NULL COMMENT '高度',
  `size` varchar(8) DEFAULT NULL COMMENT '大小',
  `width` varchar(8) DEFAULT NULL COMMENT '宽度',
  `url` varchar(64) DEFAULT NULL COMMENT '链接',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='图片';

CREATE TABLE IF NOT EXISTS `star` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `course` int(11) DEFAULT NULL COMMENT '课程id',
  `user_id` varchar(64) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2016 DEFAULT CHARSET=utf8 COMMENT='点赞';

CREATE TABLE IF NOT EXISTS `tag` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(16) DEFAULT NULL COMMENT '标签名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2004 DEFAULT CHARSET=utf8 COMMENT='标签';

CREATE TABLE IF NOT EXISTS `video` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `course` int(11) DEFAULT NULL COMMENT '课程id',
  `duration` int(11) DEFAULT NULL COMMENT '时长',
  `title` varchar(128) DEFAULT NULL COMMENT '名称',
  `url` varchar(64) DEFAULT NULL COMMENT '链接',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2012 DEFAULT CHARSET=utf8 COMMENT='视频';

CREATE TABLE IF NOT EXISTS `course` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '唯一id，自动生成',
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(128) DEFAULT NULL COMMENT '名称',
  `summary` varchar(128) DEFAULT NULL COMMENT '摘要',
  `desc` varchar(128) DEFAULT NULL COMMENT '描述',
  `sub_title` varchar(128) DEFAULT NULL COMMENT '子标题',
  `cover_image` varchar(128) DEFAULT NULL COMMENT '封面url',
  `category` int(11) DEFAULT NULL COMMENT '分类id',
  `realPrice` int(11) DEFAULT NULL COMMENT '实际价格',
  `price` int(11) DEFAULT NULL COMMENT '市场价格',
  `buyCount` int(11) DEFAULT NULL COMMENT '购买人数',
  `grade` int(11) DEFAULT NULL COMMENT '评分',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `category_name` varchar(128) DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2019 DEFAULT CHARSET=utf8 COMMENT='课程';


