/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.18 : Database - shop
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE = '' */;

/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS */`shop` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION = 'N' */;

USE `shop`;

/*Table structure for table `shop_admin` */

DROP TABLE IF EXISTS `shop_admin`;

CREATE TABLE `shop_admin` (
  `aid`     int(11)     NOT NULL AUTO_INCREMENT,
  `aname`   varchar(50)          DEFAULT NULL,
  `aacount` varchar(50) NOT NULL,
  `apass`   varchar(64)          DEFAULT NULL,
  `astatus` smallint(6)          DEFAULT '1'
  COMMENT '1:代表正常使用',
  `aphone`  varchar(11)          DEFAULT NULL,
  PRIMARY KEY (`aid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 37
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_admin` */

insert into `shop_admin` (`aid`, `aname`, `aacount`, `apass`, `astatus`, `aphone`)
values (1, 'sdfdsf@qq.com', 'jack', '123123', 0, '18251844678'), (2, '我是小弟', 'zhouran', '123123', 0, '18251844678'),
  (3, '冉爹', '1', '1', 1, '13212341234'), (4, 't2', 'tom2', '666', 0, '13212341234'),
  (5, 't3', 'tom3', '666', 0, '13212341234'), (6, 't4', 'tom4', '123123', 1, '13212341234'),
  (7, 't5', 'tom5', '123123', 1, '13212341234'), (8, 't6', 'tom6', '123123', 1, '13212341234'),
  (9, 't7', 'tom7', '666', 1, '13212341234'), (10, 't88887777', 'tom8888滴滴滴滴', '123123', 1, '13212341234'),
  (11, 't9', 'tom9', '666', 1, '13212341234'), (12, 't10', 'tom10', '666', 1, '13212341234'),
  (13, 't11', 'tom11', '666', 1, '13212341234'), (14, 't12', 'tom12', '666', 1, '13212341234'),
  (15, 't13', 'tom13', '666', 1, '13212341234'), (16, 't14@qq.com', 'ttt', '123123', 1, '13366666666'),
  (31, 'dfdsf@qq.com', '234234', '123456', -1, '13333333335'),
  (32, '18251844678', '18251844678', '916096', 1, '18251844678'), (33, '松岛枫色', '123', '123123', -1, '18251844678'),
  (34, 'tlx123', '童凌霄大鸡鸡', '123123', 0, '13813844585'), (35, '123456', '123456', '123123', -1, '18251844678'),
  (36, 'jackc', 'jackc', '123123', 1, '18251844678');

/*Table structure for table `shop_admin_role` */

DROP TABLE IF EXISTS `shop_admin_role`;

CREATE TABLE `shop_admin_role` (
  `aid`    int(11)          DEFAULT NULL
  COMMENT '用户id',
  `rid`    int(11)          DEFAULT NULL
  COMMENT '角色id',
  `a_r_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`a_r_id`),
  KEY `rid` (`rid`),
  KEY `aid` (`aid`),
  CONSTRAINT `shop_admin_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `shop_role` (`rid`),
  CONSTRAINT `shop_admin_role_ibfk_3` FOREIGN KEY (`aid`) REFERENCES `shop_admin` (`aid`)
    ON DELETE CASCADE
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 119
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_admin_role` */

insert into `shop_admin_role` (`aid`, `rid`, `a_r_id`) values (3, 1, 117), (36, 1, 118);

/*Table structure for table `shop_auth` */

DROP TABLE IF EXISTS `shop_auth`;

CREATE TABLE `shop_auth` (
  `auid`   int(11) NOT NULL AUTO_INCREMENT,
  `auname` varchar(50)      DEFAULT NULL,
  `aupath` varchar(200)     DEFAULT NULL,
  `autype` smallint(6)      DEFAULT '2',
  `aupid`  int(11)          DEFAULT NULL
  COMMENT '依赖的父id',
  PRIMARY KEY (`auid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 25
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_auth` */

insert into `shop_auth` (`auid`, `auname`, `aupath`, `autype`, `aupid`)
values (1, '首页', '/index', 1, NULL), (2, '管理员列表', '/admin', 1, 1), (3, '角色管理', '/rolelist', 1, 1),
  (4, '权限管理', '/authlist', 1, 1), (5, '用户管理', '/list', 2, 2), (6, '添加用户', '/adminAdd', 2, 2), (7, '删除用户', '/del', 2, 2),
  (8, '修改用户', '/editAdmin', 2, 2), (9, '查询角色', '/roleList', 2, 3), (10, '添加角色', '/addRole', 2, 3),
  (11, '删除角色', '/delRole', 2, 3), (12, '修改角色', '/updRole', 2, 3), (13, '编辑用户', '/jumpEdit', 2, 2),
  (14, '新增用户', '/jumpAdd', 2, 2), (15, '', '', 2, 2), (16, '查询管理员用户列表', '/admin/list', 2, 2),
  (17, '删除管理员用户', '/admin/del', 2, NULL), (18, '添加管理员', '/admin/save', 2, NULL), (19, '修改管理员', '/admin/save', 2, NULL),
  (20, '管理员停用启用', '/admin/status', 2, NULL), (21, '根据id获取实体类', '/admin/getEntityById', 2, NULL), (22, '', '', 2, 3),
  (23, '获取所有角色信息', '/role/getAll', 2, NULL), (24, '角色列表', '/role/list', 2, NULL);

/*Table structure for table `shop_cart` */

DROP TABLE IF EXISTS `shop_cart`;

CREATE TABLE `shop_cart` (
  `id`          int(11) NOT NULL AUTO_INCREMENT
  COMMENT '购物车id',
  `goods_id`    varchar(11)      DEFAULT NULL
  COMMENT '商品id',
  `customer_id` int(11)          DEFAULT NULL
  COMMENT '用户id',
  `quantity`    int(11)          DEFAULT NULL
  COMMENT '数量',
  `date_time`   datetime         DEFAULT NULL
  COMMENT '创建时间',
  `status`      int(11)          DEFAULT NULL
  COMMENT '1展示',
  PRIMARY KEY (`id`),
  KEY `goods_cart_fk` (`goods_id`),
  KEY `customer_cart_fk` (`customer_id`),
  CONSTRAINT `customer_cart_fk` FOREIGN KEY (`customer_id`) REFERENCES `shop_customer` (`aid`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `goods_cart_fk` FOREIGN KEY (`goods_id`) REFERENCES `shop_goods` (`gid`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 141
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_cart` */

/*Table structure for table `shop_customer` */

DROP TABLE IF EXISTS `shop_customer`;

CREATE TABLE `shop_customer` (
  `aid`   int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(32)      DEFAULT NULL,
  `apass` varchar(32)      DEFAULT NULL,
  PRIMARY KEY (`aid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 9
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_customer` */

insert into `shop_customer` (`aid`, `aname`, `apass`)
values (1, 'ys', '520'), (2, 'rose', '123'), (3, '11111', '11111'), (4, '22222', '222222'), (5, '2222222222', '22'),
  (6, '2222', '2'), (7, '2323', '2323'), (8, 'zhouran', '916096467');

/*Table structure for table `shop_goods` */

DROP TABLE IF EXISTS `shop_goods`;

CREATE TABLE `shop_goods` (
  `gid`       varchar(32)  NOT NULL,
  `gname`     varchar(200) NOT NULL,
  `gimage`    varchar(200) DEFAULT NULL,
  `gprice`    float        DEFAULT NULL,
  `gtype`     int(11)      DEFAULT NULL
  COMMENT '商品类别表goods_type表的外键',
  `gdesc`     varchar(255) DEFAULT NULL,
  `gdiscount` float        DEFAULT '1'
  COMMENT '折扣字段;0.8:八折',
  `isdelete`  int(11)      DEFAULT '0'
  COMMENT '0:可用 1:删除',
  `glabel`    int(11)      DEFAULT '0'
  COMMENT '1:新品2:热销3:折扣',
  `gsex`      int(11)      DEFAULT '0'
  COMMENT '0:女装 1:男装 2:童装 3:lotita',
  PRIMARY KEY (`gid`),
  KEY `gtype` (`gtype`),
  CONSTRAINT `shop_goods_ibfk_1` FOREIGN KEY (`gtype`) REFERENCES `shop_goods_type` (`tid`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_goods` */

insert into `shop_goods` (`gid`, `gname`, `gimage`, `gprice`, `gtype`, `gdesc`, `gdiscount`, `isdelete`, `glabel`, `gsex`)
values ('10', '潮流背带裤', 'https://pic.qqtn.com/up/2019-3/15537364504032743.jpg', 888, 11, NULL, 1, 0, 0, 0),
  ('12', '乔碧萝小脚裤', 'images/product_1.jpg', 520, 11, NULL, 0.8, 0, 3, 0),
  ('13', '唐显生是十三路末班车第一任司机', 'images/product_9.jpg', 59, 11, NULL, 1, 0, 0, 1),
  ('14', '十年前就淹死了', 'images/product_7.jpg', 59, 12, NULL, 1, 0, 1, 1),
  ('15', '含笑半步癫', 'images/product_4.jpg', 49, 13, '杀人放火，居家旅行，必备良药', 0.8, 0, 2, 0),
  ('16', '牛包7', 'images/product_10.jpg', 150, 10, NULL, 1, 0, 2, 0),
  ('2', '牛山挎包', 'images/product_2.jpg', 77, 10, NULL, 1, 0, 1, 1),
  ('22', '卢本伟牛逼', 'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3270515378,642130648&fm=26&gp=0.jpg', 11, 1, NULL, 1, 0, 1, 0),
  ('23', '卢本伟的肯定', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2892882232,3432829263&fm=26&gp=0.jpg', 12, 1, NULL, 1, 0, 1, 0),
  ('24', '牛仔裤A款', 'images/product_1.jpg', 66, 11, NULL, 1, 0, 0, 1),
  ('25', '变强卡', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2651466156,1966797465&fm=26&gp=0.jpg', 14, 11, NULL, 1, 0, 1, 0),
  ('26', '三星 Galaxy A90 5G（SM-A9080）', 'https://img14.360buyimg.com/n0/jfs/t1/49042/15/15820/99252/5dcd1eb3E59798b1b/bb63f1f9baa33e7f.jpg', 3899, 14, '全息黑 疾速5G 骁龙855 8GB+128GB 全息3D格纹设计 双卡双待手机', 1, 0, 1, 4),
  ('27', '小吃锅巴', 'https://img14.360buyimg.com/n0/jfs/t1/102507/38/7169/161820/5df9d1e7E588dbcda/b32bb9a409c9f7f2.jpg', 9.6, 10, ' \r\n三只松鼠小贱麻辣味小米锅巴 休闲零食地方特产办公室小吃锅巴60g/袋', 1, 0, 1, 2),
  ('28', '风味零食小吃', 'https://img14.360buyimg.com/n0/jfs/t1/104380/25/7104/260582/5df8be45E31f69abc/a274271a886244ce.jpg', 14.8, 12, '良品铺子 香酥大麻花天津风味零食小吃传统糕点休闲食品小袋装160g', 1, 0, 1, 1),
  ('29', '和田红枣', 'https://img14.360buyimg.com/n0/jfs/t1/65449/2/13595/372062/5dad2625E18dd896f/a1125a0de5fc0b44.jpg', 43.9, 11, '楼兰蜜语 蜜饯果干 新疆特产 一等五星和田红枣500g*2袋 和田大枣可夹核桃 量贩装零食', 1, 0, 1, 4),
  ('3', '夹竹桃天下第一', 'images/product_3.jpg', 717, 11, NULL, 1, 0, 2, 0),
  ('30', '果脯水果干', 'https://img14.360buyimg.com/n0/jfs/t1/85311/40/7397/127949/5dfb57cdEf8c98d26/5bf54d9324cf1fdc.jpg', 9.6, 11, '三只松鼠芒果干 蜜饯果干芒果片休闲零食办公室小吃果脯水果干116g/袋', 1, 0, 1, 2),
  ('31', '每日坚果', 'https://img14.360buyimg.com/n0/jfs/t1/74076/6/12959/181846/5da3cfa7E4a02b909/d1f2abd61822ead8.jpg', 12.5, 11, '中粮我买网 时怡 休闲食品 坚果炒货 优选什锦混合果仁(960g)零食坚果每日坚果', 1, 0, 2, 1),
  ('32', 'Timberland', 'https://img14.360buyimg.com/n0/jfs/t1/37646/27/191/92163/5cac6a68E8d6a1334/1dc30edc6eecbd5c.jpg', 1999, 11, '\r\n【经典款】Timberland添柏岚户外徒步休闲鞋踢不烂男鞋防水经典黄靴10061', 1, 0, 2, 3),
  ('33', '玉兰油防晒液', 'https://img14.360buyimg.com/n0/jfs/t1/108942/33/882/386255/5df89870E6d407db9/60048c297a75cc15.jpg', 115, 11, '玉兰油OLAY防晒霜轻透倍护防晒液40ml（防晒小银瓶 轻薄控油 美白隔离 SPF50', 1, 0, 2, 4),
  ('34', '百雀羚套装', 'https://img14.360buyimg.com/n0/jfs/t1/107900/33/845/173880/5df88998E317fa47a/86107dfda3c8b95f.jpg', 499.9, 12, '百雀羚套装 抗皱紧致补水护肤化妆品套装女 肌初赋活致臻礼盒（水90ml+乳90ml+霜50g+眼霜、精华随机）', 1, 0, 2, 2),
  ('35', '麦芙迪男士', 'https://img14.360buyimg.com/n0/jfs/t1/99910/12/7193/99277/5df9a088Ea2381d60/5b1348b5118728c3.jpg', 118, 12, '【2支装】麦芙迪男士焕彩美白补水保湿洁面乳洗面奶 控油保湿补水祛痘印去黑头护肤品套装深层清洁 洗面奶', 1, 0, 3, 3),
  ('36', '妮维雅(NIVEA)男士', 'https://img14.360buyimg.com/n0/jfs/t1/33825/33/4657/82285/5cb82a17E1d295f0f/7b35ce53fdfed381.jpg', 59.9, 12, '妮维雅(NIVEA)男士净油精华抗痘洁面炭泥双支套装 150ml*2（洗面奶 控油清透毛孔）', 1, 0, 3, 4),
  ('37', '狼爪男士羽绒服', 'https://img14.360buyimg.com/n0/jfs/t1/99640/15/7280/168324/5dfa4f00E83faa0a8/b6337c0c1aba37ff.jpg', 1999, 12, 'Jack Wolfskin/狼爪男士秋冬户外防风透气保暖750蓬白鹅绒羽绒服5218072', 1, 0, 3, 0),
  ('38', '铁蛋五香味', 'https://img14.360buyimg.com/n0/jfs/t1/94599/10/7144/271784/5df8bdb8Ed730333b/b0b639403450333d.jpg', 22.8, 14, '良品铺子 鹌鹑蛋卤蛋铁蛋五香味熟食休闲零食小吃小袋独立包装128g', 1, 0, 3, 4),
  ('39', '鹌鹑蛋卤蛋', 'https://img14.360buyimg.com/n0/jfs/t3835/121/2096639631/238798/ff94782f/584e5d5fN4a5b102b.jpg', 26.5, 14, '良品铺子 鹌鹑蛋卤蛋铁蛋五香味熟食休闲零食小吃小袋独立包装128g', 1, 0, 3, 2),
  ('4', '挎包2', 'images/product_4.jpg', 23, 12, NULL, 1, 0, 3, 1),
  ('40', '休闲零食小吃', 'https://img14.360buyimg.com/n0/jfs/t1/42193/27/12868/389758/5d5fb8e9E96696c39/572cefc75e072d04.jpg', 26.2, 13, '卫龙 休闲零食小吃网红怀旧儿时辣条 办公室麻辣零食大礼包 小包装香辣味小面筋500g/袋 约20包', 1, 0, 3, 3),
  ('41', '麻辣零食大礼包', 'https://img14.360buyimg.com/n0/jfs/t1/76258/9/12725/344026/5da1c175E6c4214bc/81b53d52a7e6068b.jpg', 29.9, 14, '卫龙 休闲零食小吃网红怀旧儿时辣条 办公室麻辣零食大礼包 小包装香辣味小面筋500g/袋 约20包', 1, 0, 3, 4),
  ('42', '香辣味小面筋', 'https://img14.360buyimg.com/n0/jfs/t1/45818/26/9620/2701271/5d6e054dE7ee5f140/bd6364afc64b5100.jpg', 15.9, 11, '卫龙 休闲零食小吃网红怀旧儿时辣条 办公室麻辣零食大礼包 小包装香辣味小面筋500g/袋 约20包', 1, 0, 0, 1),
  ('43', '辣条豆干豆皮', 'https://img14.360buyimg.com/n0/jfs/t8008/32/1294907758/627727/66d07955/59b77b1fNaf553b51.jpg', 6.9, 11, '源氏 网红休闲零食 老式大辣片 辣条豆干豆皮 200g', 1, 0, 2, 1),
  ('44', '美式薯条', 'https://img14.360buyimg.com/n0/jfs/t1/103350/40/7264/156489/5df9d484Ee49b9da9/1a05c87808b81a59.jpg', 11.09, 11, '三只松鼠休闲零食膨化小吃薯条原味小贱美式薯条75g/袋', 1, 0, 1, 4),
  ('45', '面素食小吃', 'https://img14.360buyimg.com/n0/jfs/t1/87425/37/7293/175073/5df9f6dfEfad829ab/63753625dbf8a550.jpg', 10.09, 12, ' 三只松鼠休闲零食儿童大辣片刀肉零食特产面素食小吃约辣辣条200g/盒', 1, 0, 2, 2),
  ('46', '迷你移动电源', 'https://img14.360buyimg.com/n0/jfs/t1/91805/35/1258/139633/5dbbadcbEb9610177/5153adf99f1a2fd6.jpg', 66, 12, '台电 R10 充电宝超薄小巧10000毫安VIVO苹果华为手机迷你移动电源 浅蓝色', 1, 0, 1, 3),
  ('47', '台电', 'https://img14.360buyimg.com/n0/jfs/t1/47091/22/7533/135882/5d5130e9Ebab04373/ba9cee7b461f8268.jpg', 99, 12, '台电 10000毫安充电宝超薄小巧迷你1万毫安移动电源快充能量棒LED灯电量显示华为苹果小米通用 白色【口红般大小 10000毫安不虚标】', 1, 0, 0, 4),
  ('48', '充电宝', 'https://img14.360buyimg.com/n0/jfs/t1/63832/10/5780/122870/5d40ea4eE8896cee0/8318744aa63a4578.jpg', 99, 13, '台电 30000毫安大容量Type-C输入移动电源充电宝三USB输出快充适用苹果华为VIVO小米平板 白色【大容量|三口输出|不虚标】', 1, 0, 1, 3),
  ('49', '华为荣耀智慧屏', 'https://img14.360buyimg.com/n0/jfs/t1/91525/12/6488/325066/5df2e75fE7d45d9d0/5a11f16f84c32b58.jpg', 2999, 13, '华为荣耀智慧屏 55英寸 2G+16G 开关机无广告 远场语音 4K超高清人工智能液晶', 1, 0, 2, 0),
  ('5', '牛栏山挎包43', 'images/product_5.jpg', 412, 13, NULL, 1, 0, 2, 3),
  ('51', '荣耀V30', 'https://img14.360buyimg.com/n0/jfs/t1/91899/12/3477/339147/5de0c165Ed8e26935/ed48b2cf0a9d2056.jpg', 3299, 14, '荣耀V30 5G 双模 麒麟990 突破性相机矩阵 游戏手机 6GB+128GB 魅海星蓝 移动', 1, 0, 0, 0),
  ('52', '蛮腰麻花', 'https://img14.360buyimg.com/n0/jfs/t1/102610/19/5988/156436/5df0b30dE262a536d/2df4d5f274fab6cb.jpg', 5.8, 11, '三只松鼠休闲零食天津风味美食小吃小麻花黑糖味俏蛮腰麻花112g/108g（新老产品混发）', 1, 0, 0, 3),
  ('53', '雅马哈重锤P45电子智能钢琴', 'https://img14.360buyimg.com/n1/s546x546_jfs/t1/83330/2/12870/265656/5da2bb18E69f99331/21ab6c3bdf32d4ff.jpg', 3499, 11, '雅马哈（YAMAHA）电钢琴88键重锤P45电子智能数码钢琴专业成人儿童初学官方标配+双人琴凳+全套配件等', 1, 0, 1, 0),
  ('55', '雅马哈YAMAHA 二手钢琴 U系列立式钢琴',
   'https://img14.360buyimg.com/n0/jfs/t1/50022/18/14449/155498/5db3a6feEdad0581a/b99715d1f4ef651f.jpg', 19700, 13,
   '【二手A+】雅马哈YAMAHA 二手钢琴 U系列立式钢琴 U1H/U2H/U3H日本原装进口 U1H【家用考级-教学-专业演奏】 钢琴+超值豪华礼包全国送货入户', 1, 0, 0, 0),
  ('56', '雅马哈(YAMAHA)智能电钢琴P-125WH白色',
   'https://img14.360buyimg.com/n0/jfs/t1/25430/35/4623/131171/5c341718E454b5dbf/4dfdf5910859ac07.jpg', 4299, NULL,
   '雅马哈(YAMAHA)智能电钢琴P-125WH白色电子数码钢琴88键重锤 全新+琴架+三踏板配件大礼包', 1, 0, 0, 0),
  ('57', '京东JOY限量联名款', 'https://img14.360buyimg.com/n0/jfs/t16384/79/1314773804/149484/661799c3/5a519f33Ne1279274.jpg',
   498, 13, 'JDX （x） zuny 京东JOY限量联名款 台湾创意家居礼品 手工皮质书档 节日礼物 生日礼物 皮质摆件 白色', 1, 0, 0, 0), ('58', '羽绒服绒服男',
                                                                                       'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/104882/34/7409/197132/5dfb6646Ea109764d/4ada2d9ec26cf615.jpg!q80.dpg',
                                                                                       1599, 14,
                                                                                       'NPC潮牌 故宫系列乾隆骑马潮流保暖连帽冬季中长款羽绒服绒服男 黑色 S',
                                                                                       1, 0, 0, 0),
  ('59', '雅马哈（YAMAHA） YDP164印尼进口',
   'https://img14.360buyimg.com/n1/s546x546_jfs/t1/95834/33/6960/145399/5df70b25Eec0b2dd5/62f7f19b7db61e14.jpg', 11950,
   11, '雅马哈（YAMAHA） YDP164印尼进口升级款YDP184推盖立式智能电钢琴 原装标配+琴凳+礼包', 1, 0, 0, 0),
  ('6', '牛栏挎包54', 'images/product_6.jpg', 53, 14, NULL, 1, 0, 3, 0),
  ('7', '牛包5', 'images/product_7.jpg', 632, 13, NULL, 1, 0, 0, 1),
  ('8', '牛栏挎包6', 'images/product_8.jpg', 234.2, 12, NULL, 1, 0, 0, 3),
  ('9', '牛7', 'images/product_9.jpg', 11.1, 11, NULL, 1, 0, 0, 2);

/*Table structure for table `shop_goods_type` */

DROP TABLE IF EXISTS `shop_goods_type`;

CREATE TABLE `shop_goods_type` (
  `tid`    int(11) NOT NULL AUTO_INCREMENT,
  `tname`  varchar(200)     DEFAULT NULL
  COMMENT '商品类型名称',
  `tdesc`  varchar(255)     DEFAULT NULL,
  `timage` varchar(255)     DEFAULT NULL,
  PRIMARY KEY (`tid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 15
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_goods_type` */

insert into `shop_goods_type` (`tid`, `tname`, `tdesc`, `timage`)
values (1, '时尚夏季背包', NULL, 'images/box_1.jpg'), (10, '秋款休闲鞋', NULL, 'images/box_2.jpg'),
  (11, '牛仔商务爆款', NULL, 'images/box_3.jpg'), (12, '英伦头顶帽', NULL, NULL), (13, '渣渣辉', NULL, NULL), (14, '护腿', NULL, NULL);

/*Table structure for table `shop_order` */

DROP TABLE IF EXISTS `shop_order`;

CREATE TABLE `shop_order` (
  `oid`       varchar(255) NOT NULL,
  `aid`       int(11)  DEFAULT NULL,
  `addressId` int(11)  DEFAULT NULL,
  `ostatus`   int(11)  DEFAULT '1'
  COMMENT '1:未支付;2:已支付3:已发货;4:超时失效',
  `odate`     datetime DEFAULT NULL,
  `ototal`    float    DEFAULT NULL,
  `isdelete`  int(11)  DEFAULT '1'
  COMMENT '删除0  可见1',
  PRIMARY KEY (`oid`),
  KEY `aid` (`aid`),
  CONSTRAINT `shop_order_ibfk_1` FOREIGN KEY (`aid`) REFERENCES `shop_customer` (`aid`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_order` */

insert into `shop_order` (`oid`, `aid`, `addressId`, `ostatus`, `odate`, `ototal`, `isdelete`)
values ('810023931bead7ef20191219181907687', 1, 1, 2, '2019-12-19 18:19:08', 947, 1),
  ('88617c577ba5c24120191219211442361', 8, 1, 4, '2019-12-19 21:14:42', 1641.4, 1),
  ('887ae22d8ced9de520191219214245289', 8, 1, 2, '2019-12-19 21:42:45', 50.2, 1),
  ('887f6ddffa43249120191219181654519', 1, 1, 2, '2019-12-19 18:16:55', 39.2, 1),
  ('8893178f488b97de20191219205132361', 8, 1, 2, '2019-12-19 20:51:32', 59, 1),
  ('8aff9065bb1b671220191219211431726', 8, 1, 2, '2019-12-19 21:14:32', 212, 1),
  ('8cb0febc61bdd02120191219235103849', 8, 1, 4, '2019-12-19 23:51:04', 3949.2, 1),
  ('970d8b0dcec287eb20191219182154741', 1, 1, 2, '2019-12-19 18:21:55', 78, 1),
  ('98805e3b9a64994f20191219214317735', 8, 1, 2, '2019-12-19 21:43:18', 11, 1),
  ('9be3c124da83d8d420191219165918106', 1, 1, 4, '2019-12-19 16:59:18', 150, 1),
  ('9fdafe3c4072ac4820191219201446754', 1, 1, 4, '2019-12-19 20:14:47', 39.2, 1),
  ('a49844e8995d4aff20191219172952371', 1, 1, 2, '2019-12-19 17:21:52', 59, 1),
  ('ac5addb79d7ca6d220191219182811487', 1, 1, 2, '2019-12-19 18:28:11', 150, 1),
  ('ac7d514981ade8a120191219165647313', 1, 1, 3, '2019-12-19 02:56:47', 77, 1),
  ('ad343fd8fd98439020191219203013182', 1, 1, 4, '2019-12-19 20:30:13', 888, 1),
  ('af2b1ec984be945220191219182234617', 1, 1, 3, '2019-12-19 18:22:35', 88, 1),
  ('b4b9b451171d3f3d20191219201552472', 1, 1, 4, '2019-12-19 20:15:52', 59, 1),
  ('baac1cf4fb1b4b1f20191219214158384', 8, 1, 4, '2019-12-19 21:41:58', 484, 1),
  ('bb7c64f69719d4a020191219182710605', 1, 1, 2, '2019-12-19 18:27:11', 39.2, 1);

/*Table structure for table `shop_order_detail` */

DROP TABLE IF EXISTS `shop_order_detail`;

CREATE TABLE `shop_order_detail` (
  `odid`     varchar(255) NOT NULL,
  `oid`      varchar(255) DEFAULT NULL
  COMMENT '订单id',
  `gid`      varchar(255) CHARACTER SET utf8
  COLLATE utf8_general_ci DEFAULT '商品id'
  COMMENT '商品id',
  `odprice`  float        DEFAULT NULL
  COMMENT '成交单价',
  `odnumber` int(11)      DEFAULT NULL
  COMMENT '当前详情的数量',
  PRIMARY KEY (`odid`),
  KEY `oid` (`oid`),
  KEY `gid` (`gid`),
  CONSTRAINT `shop_order_detail_ibfk_1` FOREIGN KEY (`oid`) REFERENCES `shop_order` (`oid`),
  CONSTRAINT `shop_order_detail_ibfk_2` FOREIGN KEY (`gid`) REFERENCES `shop_goods` (`gid`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_order_detail` */

insert into `shop_order_detail` (`odid`, `oid`, `gid`, `odprice`, `odnumber`)
values ('868a3c3774f736ca20191219172952481', 'a49844e8995d4aff20191219172952371', '14', 59, 1),
  ('8751691904a9a11820191219182154967', '970d8b0dcec287eb20191219182154741', '23', 12, 1),
  ('887e0a15808bdf3a20191219182234867', 'af2b1ec984be945220191219182234617', '22', 11, 1),
  ('89cc85d5044e9c4820191219182155169', '970d8b0dcec287eb20191219182154741', '24', 66, 1),
  ('8aabe7b8bb93c6a320191219211442639', '88617c577ba5c24120191219211442361', '10', 888, 1),
  ('8abe515ebb4463ba20191219181907766', '810023931bead7ef20191219181907687', '10', 888, 1),
  ('8bd7beb64a923c2820191219214245373', '887ae22d8ced9de520191219214245289', '22', 11, 1),
  ('8c0dff4b4ad92ebb20191219214317801', '98805e3b9a64994f20191219214317735', '22', 11, 1),
  ('8c36db3d795569ba20191219235104078', '8cb0febc61bdd02120191219235103849', '22', 11, 1),
  ('9041ffbcd22e680220191219182710714', 'bb7c64f69719d4a020191219182710605', '15', 39.2, 1),
  ('90e37f030be07ce220191219214158473', 'baac1cf4fb1b4b1f20191219214158384', '14', 472, 8),
  ('9340fbc82ffefcb220191219235104312', '8cb0febc61bdd02120191219235103849', '34', 499.9, 1),
  ('938be58610fa049520191219235104235', '8cb0febc61bdd02120191219235103849', '31', 12.5, 1),
  ('93d0c80b6d10f70920191219235104390', '8cb0febc61bdd02120191219235103849', '49', 2999, 1),
  ('9550ec48623fa0e320191219214158564', 'baac1cf4fb1b4b1f20191219214158384', '23', 12, 1),
  ('96b4a7ec17c104e720191219182811587', 'ac5addb79d7ca6d220191219182811487', '16', 150, 1),
  ('96f0afefb52a64b020191219181907873', '810023931bead7ef20191219181907687', '14', 59, 1),
  ('9ae85613cef9110920191219214245479', '887ae22d8ced9de520191219214245289', '15', 39.2, 1),
  ('9aff7c9a7233108120191219181654609', '887f6ddffa43249120191219181654519', '15', 39.2, 1),
  ('9b1803d4f29df15120191219235103999', '8cb0febc61bdd02120191219235103849', '5', 412, 1),
  ('9db65b900428c9c820191219211442714', '88617c577ba5c24120191219211442361', '2', 616, 8),
  ('a35cdd966f040a6a20191219165647390', 'ac7d514981ade8a120191219165647313', '2', 77, 1),
  ('a6c387610670c76e20191219211442553', '88617c577ba5c24120191219211442361', '15', 78.4, 2),
  ('b40933f602b3e36d20191219201552693', 'b4b9b451171d3f3d20191219201552472', '14', 59, 1),
  ('b44bc425811d469b20191219201446827', '9fdafe3c4072ac4820191219201446754', '15', 39.2, 1),
  ('b5804cd63da543e320191219203013258', 'ad343fd8fd98439020191219203013182', '10', 888, 1),
  ('b6b6c3039c401ef920191219235104157', '8cb0febc61bdd02120191219235103849', '28', 14.8, 1),
  ('bc37c92cb30dfa1b20191219165918190', '9be3c124da83d8d420191219165918106', '16', 150, 1),
  ('bcffa8c8bedf252320191219205132431', '8893178f488b97de20191219205132361', '14', 59, 1),
  ('bd6066a2d1f8f2cc20191219211431803', '8aff9065bb1b671220191219211431726', '6', 212, 4),
  ('bd9ae9a27b26689b20191219182234738', 'af2b1ec984be945220191219182234617', '2', 77, 1),
  ('bfbe31656006c56320191219211442465', '88617c577ba5c24120191219211442361', '14', 59, 1);

/*Table structure for table `shop_role` */

DROP TABLE IF EXISTS `shop_role`;

CREATE TABLE `shop_role` (
  `rid`     int(11) NOT NULL AUTO_INCREMENT,
  `rname`   varchar(50)      DEFAULT NULL,
  `rdesc`   varchar(200)     DEFAULT NULL,
  `rstatue` int(11)          DEFAULT '1'
  COMMENT '禁用状态 1-可用 0禁用',
  PRIMARY KEY (`rid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 13
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_role` */

insert into `shop_role` (`rid`, `rname`, `rdesc`, `rstatue`)
values (1, '管理员', '所有权限', 1), (2, '老板', '所有权限', 1), (3, '经理', '部门的权限', 1), (4, '财务', '财政的权限', 1), (5, '大哥大', '打人', 1),
  (6, '王中王', '我是火腿肠', 1), (9, '弟中弟', '只有被打的权限', 0), (10, '干洗店', '洗衣服', 0), (12, '程序员', '敲代码', 1);

/*Table structure for table `shop_role_auth` */

DROP TABLE IF EXISTS `shop_role_auth`;

CREATE TABLE `shop_role_auth` (
  `rid`     int(11)          DEFAULT NULL,
  `auid`    int(11)          DEFAULT NULL,
  `r_au_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`r_au_id`),
  KEY `rid` (`rid`),
  KEY `auid` (`auid`),
  CONSTRAINT `shop_role_auth_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `shop_role` (`rid`),
  CONSTRAINT `shop_role_auth_ibfk_2` FOREIGN KEY (`auid`) REFERENCES `shop_auth` (`auid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 89
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_role_auth` */

insert into `shop_role_auth` (`rid`, `auid`, `r_au_id`)
values (1, 16, 81), (1, 17, 82), (1, 18, 83), (1, 19, 84), (1, 20, 85), (1, 21, 86), (1, 22, 87), (1, 24, 88);

/*Table structure for table `shop_shiro` */

DROP TABLE IF EXISTS `shop_shiro`;

CREATE TABLE `shop_shiro` (
  `sid`     int(11) NOT NULL AUTO_INCREMENT,
  `sname`   varchar(200)     DEFAULT NULL,
  `sfilter` varchar(20)      DEFAULT NULL,
  `sindex`  int(11)          DEFAULT NULL
  COMMENT '排序标识',
  `sstatus` int(11)          DEFAULT '1'
  COMMENT '1可用; 0失效',
  PRIMARY KEY (`sid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 13
  DEFAULT CHARSET = utf8;

/*Data for the table `shop_shiro` */

insert into `shop_shiro` (`sid`, `sname`, `sfilter`, `sindex`, `sstatus`)
values (1, '/images/**', 'anon', 1, 1), (2, '/static/**', 'anon', 2, 1), (3, '/js/**', 'anon', 3, 1),
  (4, '/css/**', 'anon', 4, 1), (5, '/login.jsp', 'anon', 5, 1), (6, '/index.jsp', 'anon', 6, 1),
  (7, '/login', 'anon', 7, 1), (8, '/logout2', 'logout', 8, 1), (9, '/goods.jsp', 'roles[dage]', 9, 1),
  (10, '/order.jsp', 'roles[xiaodi]', 10, 1), (11, '/list.jsp', 'roles[dage,xiaodi]', 11, 1),
  (12, '/**', 'authc', 99999, 1);

/*Table structure for table `t_admin` */

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (
  `aid`   int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(20)      DEFAULT NULL,
  `apass` varchar(20)      DEFAULT NULL,
  PRIMARY KEY (`aid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8;

/*Data for the table `t_admin` */

insert into `t_admin` (`aid`, `aname`, `apass`) values (1, 'jack', '123');

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;
