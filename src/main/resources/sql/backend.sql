CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `jwt` varchar(255) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `vip` bit(1) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `audio` (
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

CREATE TABLE `blog` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `read_num` int(11) DEFAULT NULL,
  `summary` varchar(128) NOT NULL,
  `title` varchar(50) NOT NULL,
  `url` varchar(255) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `categoty` (
  `id` int(11) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  `delete_flag` bit(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sub_title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

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


