CREATE DATABASE  IF NOT EXISTS `jctx`  DEFAULT CHARACTER SET utf8 ;
USE `jctx`;

/*用户信息表*/
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(100) DEFAULT NULL COMMENT '用户名-手机号登录',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `user_type` varchar(50) DEFAULT NULL COMMENT '用户类型：A超级管理员/B平台业务员/C家族管理员/D家族成员',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '用户信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭成员信息表*/
DROP TABLE IF EXISTS `household_member`;
CREATE TABLE `household_member` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `member_surname` varchar(50) DEFAULT NULL COMMENT '家庭成员姓',
  `member_name` varchar(50) DEFAULT NULL COMMENT '家庭成员名',
  `gender` int(2) DEFAULT NULL COMMENT '性别，1：男，2：女',
  `main_flag` int(2) DEFAULT NULL COMMENT '主干成员标识，0：非主干，1：主干',
  `phone` varchar(100) DEFAULT NULL COMMENT '手机号',
  `birthday_time` varchar(50) DEFAULT NULL COMMENT '出生日期',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `household_name` varchar(100) DEFAULT NULL COMMENT '家庭的名称',
  `head_img_url` varchar(2048) DEFAULT NULL COMMENT '头像地址',
  `member_detail` varchar(2048) DEFAULT NULL COMMENT '内容详情',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `father_id` int(11) DEFAULT NULL COMMENT '父亲id',
  `father_name` varchar(100) DEFAULT NULL COMMENT '父亲的名称',
  `mother_id` int(11) DEFAULT NULL COMMENT '母亲id',
  `mother_name` varchar(100) DEFAULT NULL COMMENT '母亲的名称',
  `spouse_id` int(11) DEFAULT NULL COMMENT '配偶id',
  `spouse_name` varchar(100) DEFAULT NULL COMMENT '配偶的名称',
  `married` int(2) DEFAULT '0' COMMENT '结婚标志，0：未成家，1：成家，默认为0',
  `relation_list` varchar(100) DEFAULT NULL COMMENT '关系路由，记录一层层父级的id，以“-”分割，如 5-3-1',
  `household_badge` varchar(2048) DEFAULT NULL COMMENT '家徽',
  `surname_id` int(11) DEFAULT NULL COMMENT '姓氏id',
  `account_id` int(11) DEFAULT NULL COMMENT '业务员id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭成员表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭成员关系表*/
DROP TABLE IF EXISTS `household_relationship`;
CREATE TABLE `household_relationship` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `ma_id` int(11) DEFAULT NULL COMMENT '家庭成员A的id',
  `mb_id` int(11) DEFAULT NULL COMMENT '家庭成员B的id',
  `relationship_type` int(4) DEFAULT NULL COMMENT '关系类型，1：子与父；2：配与主；3：子与母',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭成员关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭信息表*/
DROP TABLE IF EXISTS `household_info`;
CREATE TABLE `household_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `household_name` varchar(100) DEFAULT NULL COMMENT '家庭的名称',
  `household_detail` varchar(2048) DEFAULT NULL COMMENT '家庭的描述',
  `head_id` int(11) DEFAULT NULL COMMENT '家庭户主的id',
  `head_name` varchar(100) DEFAULT NULL COMMENT '户主的名称',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*文章表*/
DROP TABLE IF EXISTS `article_info`;
CREATE TABLE `article_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `article_title` varchar(100) DEFAULT NULL COMMENT '文章的标题',
  `hm_id` int(11) DEFAULT NULL COMMENT '作者的id',
  `article_writer` varchar(100) DEFAULT NULL COMMENT '文章的作者',
  `article_content` text  COMMENT '文章详细内容',
  `type_id` int(4) DEFAULT '0' COMMENT '文章类型id',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '文章表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*帖子表*/
DROP TABLE IF EXISTS `post_info`;
CREATE TABLE `post_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `post_name` varchar(100) DEFAULT NULL COMMENT '帖子的名称',
  `hm_id` int(11) DEFAULT NULL COMMENT '作者的id',
  `post_writer` varchar(100) DEFAULT NULL COMMENT '帖子的作者',
  `post_content` text  COMMENT '帖子的内容',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '帖子表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*评论表*/
DROP TABLE IF EXISTS `comment_info`;
CREATE TABLE `comment_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `comment_content` varchar(2048) DEFAULT NULL COMMENT '评论的内容',
  `hm_id` int(11) DEFAULT NULL COMMENT '评论人的id',
  `comment_writer` varchar(100) DEFAULT NULL COMMENT '评论人',
  `replier_id` int(11) DEFAULT NULL COMMENT '回复某人的id',
  `replier_name` varchar(100) DEFAULT NULL COMMENT '回复某人的姓名',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '评论表' ENGINE=InnoDB DEFAULT CHARSET=utf8;



/*姓氏信息表*/
DROP TABLE IF EXISTS `surname_info`;
CREATE TABLE `surname_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '姓氏ID',
  `surname` varchar(50) DEFAULT NULL COMMENT '姓氏名称',
  `surname_pinyin` varchar(100) DEFAULT NULL COMMENT '姓氏拼音',
  `word_num` int(4) DEFAULT NULL COMMENT '姓氏字数',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '姓氏信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*数字资产表*/
DROP TABLE IF EXISTS `digital_assets`;
CREATE TABLE `digital_assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '姓氏ID',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `household_member_id` int(11) DEFAULT NULL COMMENT '家庭成员id',
  `assets_type` int(4) DEFAULT '1' COMMENT '类型：1文章2书3影集，默认为1',
  `order_num` int(11) DEFAULT '1' COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '数字资产表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*影集表*/
DROP TABLE IF EXISTS `album_info`;
CREATE TABLE `album_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '姓氏ID',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `household_member_id` int(11) DEFAULT NULL COMMENT '家庭成员id',
  `album_type` int(4) DEFAULT '1' COMMENT '类型：1个人2夫妻3家庭，默认为1',
  `title` varchar(300) DEFAULT NULL COMMENT '标题',
  `cover` varchar(1024) DEFAULT NULL COMMENT '封面图',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '影集表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*文件表*/
DROP TABLE IF EXISTS `file_info`;
CREATE TABLE `file_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '姓氏ID',
  `original_name` varchar(300) DEFAULT NULL COMMENT '原名',
  `suffix` varchar(100) DEFAULT NULL COMMENT '后缀',
  `path` varchar(1024) DEFAULT NULL COMMENT '路径',
  `file_type` int(11) DEFAULT '1' COMMENT '文件类型：1杂2图片3word文档4excel5pdf，默认为1',
  `entity_id` int(11) DEFAULT NULL COMMENT '实体id',
  `entity_type` int(4) DEFAULT '1' COMMENT '实体类型：1杂2影集，默认为1',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '文件表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `surname_info` (`id`,`surname`,`surname_pinyin`,`word_num`,`order_num`,`create_time`,`update_time`) VALUES (1,'胡','HU',1,NULL,'2019-01-24 13:14:02','2019-01-24 13:14:02');
INSERT INTO `surname_info` (`id`,`surname`,`surname_pinyin`,`word_num`,`order_num`,`create_time`,`update_time`) VALUES (2,'余','YU',1,NULL,'2019-01-24 13:59:53','2019-01-24 13:59:53');
