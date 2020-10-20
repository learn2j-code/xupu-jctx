
INSERT INTO `surname_info` (`id`,`surname`,`surname_pinyin`,`word_num`,`order_num`,`create_time`,`update_time`) VALUES (1,'胡','HU',1,NULL,'2019-01-24 13:14:02','2019-01-24 13:14:02');
INSERT INTO `surname_info` (`id`,`surname`,`surname_pinyin`,`word_num`,`order_num`,`create_time`,`update_time`) VALUES (2,'余','YU',1,NULL,'2019-01-24 13:59:53','2019-01-24 13:59:53');

INSERT INTO `service_center` (`id`,`icon_address`,`service_no`,`service_code`,`service_name`,`service_pay_type`,`service_intro`,`price_unit`,`time_unit`,`measure_unit`,`discount`,`price`,`conf_type`,`conf_framework`,`internal_flag`,`use_flag`,`create_time`,`update_time`) VALUES (1,'imp\\uploadBDPImage\\servicecenter\\微信图片_20190122120527-20190124171311.png','FS20190124171435','collectioncharge','代收费服务',NULL,'为家族提供代收费服务，即每个家庭每个人需要交纳一定费用到家族理事会','1','6','1','1','11','1','',1,1,'2019-01-24 17:14:35','2019-01-28 20:39:57');
INSERT INTO `service_center` (`id`,`icon_address`,`service_no`,`service_code`,`service_name`,`service_pay_type`,`service_intro`,`price_unit`,`time_unit`,`measure_unit`,`discount`,`price`,`conf_type`,`conf_framework`,`internal_flag`,`use_flag`,`create_time`,`update_time`) VALUES (2,'imp\\uploadBDPImage\\servicecenter\\微信图片_20190122120538-20190124181536.png','FS20190124181702','multiplecharge','小传字数收费',NULL,'每个家庭成员的小传字数收费，由家族理事会制定收费规则','1','6','1','1','0','2','',1,0,'2019-01-24 18:17:02','2019-01-28 20:40:19');


INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (1,NULL,1,NULL,NULL,NULL,'血缘','greatgrandfather','嫁娶','胡','富貴','','山西省太原市杏花岭区',NULL,'原名貴二 明永樂十二年甲午三月十一日卯時生歿未詳葬芋河港三日雷驚出遷葬青龍橋甲山庚向墓碑有圖',1,1,NULL,NULL,'曾祖父',2,'','360302198805122323','1968-1-19 0',NULL,'1968',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 19:36:47','2019-01-24 19:36:47');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (2,NULL,1,NULL,NULL,NULL,'血缘','greatgreatgrandfather','嫁娶','胡','明七','松宇','',NULL,'原名明七字松宇 明洪武二十二年已巳正月十六卯時生宣德十年乙卯三月初一日寅時歿葬九都十甲大塘彎亥山巳向石礦有碑圖 子一',1,1,NULL,NULL,'高祖父',1,'','36032548745112123','1989-1-26 0',NULL,'1989',NULL,'2014-1-26 0',NULL,'2014',NULL,'山东省济南市历下区九都十甲大塘彎亥山巳向石礦有碑圖',0,0,'2019-01-24 19:39:41','2019-01-24 19:39:41');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (3,NULL,1,NULL,NULL,NULL,'血缘','grandfather','嫁娶','胡','八一','海润','河南省郑州市中原区',NULL,'原名顺淇字本合 清乾隆二十九年甲申十二月十七日酉时生道光二十四年甲辰三月二十八日未时殁壽八十一葬團山嶺附父冢同向合碑',1,1,NULL,NULL,'祖父',3,'','3265445555555555','2004-3-26 0',NULL,'2004',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 19:52:04','2019-01-24 19:52:04');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (4,NULL,1,NULL,NULL,NULL,'血缘','father','嫁娶','胡','国仁','达达','',NULL,'一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十',1,1,NULL,NULL,'父亲',4,'','321321321321321','2012-1-21 0',NULL,'2012',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 19:54:02','2019-01-24 19:54:02');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (5,NULL,1,NULL,NULL,NULL,'血缘','myself','','胡','郭子','','广东省广州市荔湾区',NULL,'',1,1,NULL,NULL,'自己',5,'','345345345345345','2017-1-24 0',NULL,'2017',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 19:55:22','2019-01-24 19:55:47');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (6,NULL,1,NULL,NULL,NULL,'血缘','greatgranduncle','','胡','曾一','','湖北省武汉市江岸区',NULL,'',1,1,NULL,NULL,'曾叔祖父',2,'','789789789789789789','1992-1-24 0',NULL,'1992',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 20:00:02','2019-01-24 20:00:02');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (7,NULL,1,NULL,NULL,NULL,'血缘','greatgranduncle','','胡','曾九','','江苏省南京市玄武区',NULL,'',1,1,NULL,NULL,'曾叔祖父',2,'','987987987987987987','1995-1-24 0',NULL,'1995',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 20:03:39','2019-01-24 20:03:39');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (8,NULL,1,NULL,NULL,NULL,'血缘','ant','','胡','久久','','北京市北京市东城区',NULL,'',1,2,NULL,NULL,'姑姑',4,'','999999999999999999','2002-1-24 0',NULL,'2002',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 20:04:32','2019-01-24 20:04:32');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (9,NULL,1,NULL,NULL,NULL,'','spouse','嫁娶','李','欣雨','','',NULL,'俺的沙发沙发沙发沙发斯蒂芬',1,2,NULL,NULL,'配偶',5,'','878787878787878787','2002-1-24 0',NULL,'2002',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 20:05:40','2019-01-24 20:05:40');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (10,NULL,1,NULL,NULL,NULL,'血缘','son','','胡','小小','','海南省海口市秀英区',NULL,'俺的沙发发大水发大水发斯蒂芬阿萨德阿斯蒂芬阿斯蒂芬阿斯顿发生发斯蒂芬啊',1,1,NULL,NULL,'儿',6,'','2222222222222222','2016-1-24 0',NULL,'2016',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 20:06:34','2019-01-24 20:06:34');
INSERT INTO `household_member` (`id`,`household_member_code`,`household_id`,`household_code`,`father_name`,`spouse_name`,`relation_name`,`relation_code`,`relation_del`,`member_surname`,`member_name`,`sec_personal_name`,`native_place`,`member_detail`,`member_story`,`member_story_level`,`member_gender`,`head_image`,`generation_num`,`generation_level`,`generation_level_code`,`generation_word`,`identity_no`,`birthday_time`,`birthday_time_tra`,`birthday_year`,`birthday_year_tra`,`deathday_time`,`deathday_time_tra`,`deathday_year`,`deathday_year_tra`,`buried_location`,`rel_flag`,`alive_status`,`create_time`,`update_time`) VALUES (11,NULL,1,NULL,NULL,NULL,'血缘','daughter','','胡','赫赫','','贵州省贵阳市南明区',NULL,'阿斯顿发送到噶十多个阿斯蒂芬阿斯蒂芬阿斯蒂芬阿道夫发多少阿斯顿发送到发士大夫阿斯顿发送到发阿斯蒂芬阿斯蒂芬阿斯顿发士大夫阿斯顿发阿斯顿发阿斯顿发',1,2,NULL,NULL,'女',7,'','6666666666666666','2019-1-24 20',NULL,'2019',NULL,'',NULL,'',NULL,'',0,1,'2019-01-24 20:07:37','2019-01-24 20:07:37');