/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : airplane_ticket_system

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 08/11/2019 11:26:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_administrator
-- ----------------------------
DROP TABLE IF EXISTS `t_administrator`;
CREATE TABLE `t_administrator`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_administrator
-- ----------------------------
INSERT INTO `t_administrator` VALUES (1, 'root', 'root');

-- ----------------------------
-- Table structure for t_air_ticket
-- ----------------------------
DROP TABLE IF EXISTS `t_air_ticket`;
CREATE TABLE `t_air_ticket`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT COMMENT '飞机座位价钱编号',
  `first_rate_price` double(4, 0) NOT NULL,
  `business_price` double(4, 0) NOT NULL,
  `economy_price` double(4, 0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_air_ticket
-- ----------------------------
INSERT INTO `t_air_ticket` VALUES (1, 500, 400, 300);

-- ----------------------------
-- Table structure for t_airplane
-- ----------------------------
DROP TABLE IF EXISTS `t_airplane`;
CREATE TABLE `t_airplane`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `airplane_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '飞机编号',
  `max_sail_length` int(4) NOT NULL COMMENT '最大航程',
  `first_class_seats` tinyint(3) NOT NULL COMMENT '头等舱座位数',
  `business_class_seats` tinyint(3) NOT NULL COMMENT '公务舱座位数',
  `economy_class_seats` tinyint(3) NOT NULL COMMENT '经济舱座位数',
  `ticket_price_id` tinyint(11) NOT NULL COMMENT '座位价钱编号',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `airplane_id`(`airplane_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_airplane
-- ----------------------------
INSERT INTO `t_airplane` VALUES (1, 'CA1550', 1000, 100, 100, 100, 1);
INSERT INTO `t_airplane` VALUES (2, 'MU9710', 1000, 100, 50, 100, 1);

-- ----------------------------
-- Table structure for t_airport
-- ----------------------------
DROP TABLE IF EXISTS `t_airport`;
CREATE TABLE `t_airport`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `airport_code` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机场代码',
  `city` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '城市',
  `airport_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机场名字',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `unique`(`airport_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_airport
-- ----------------------------
INSERT INTO `t_airport` VALUES (1, 'SHA1', '上海', '虹桥国际机场');
INSERT INTO `t_airport` VALUES (2, 'BJS1', '北京', '大兴国际机场');
INSERT INTO `t_airport` VALUES (3, 'SHA2', '上海', '浦东国际机场');
INSERT INTO `t_airport` VALUES (4, 'BJS2', '北京', '首都国际机场');

-- ----------------------------
-- Table structure for t_boss
-- ----------------------------
DROP TABLE IF EXISTS `t_boss`;
CREATE TABLE `t_boss`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_boss
-- ----------------------------
INSERT INTO `t_boss` VALUES (1, 'boss', 'boss');

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `customer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `sex` tinyint(4) NOT NULL,
  `age` tinyint(4) NOT NULL,
  `id_card` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES (1, 'zhangsan', '123456', '张三', 1, 12, '142623199712081234x');
INSERT INTO `t_customer` VALUES (2, 'wangwu', '123456', '王五', 0, 22, '14262319989123');

-- ----------------------------
-- Table structure for t_flight_information
-- ----------------------------
DROP TABLE IF EXISTS `t_flight_information`;
CREATE TABLE `t_flight_information`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `departure_id` tinyint(4) NOT NULL COMMENT '航班编号',
  `flight_id` tinyint(4) NOT NULL COMMENT '计划航班编号',
  `airport_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机场编号',
  `departure_date` datetime(0) NOT NULL COMMENT '出发日期',
  `first_class_remain_seats` tinyint(3) NOT NULL COMMENT '头等舱剩余座位数',
  `business_class_remain_seats` tinyint(3) NOT NULL COMMENT '公务舱剩余座位数',
  `economy_class_remain_seats` tinyint(3) NOT NULL COMMENT '经济舱剩余座位数',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `unique`(`departure_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_flight_information
-- ----------------------------
INSERT INTO `t_flight_information` VALUES (1, 1, 1, 'SHA1', '2019-11-15 00:00:00', 22, 24, 10);
INSERT INTO `t_flight_information` VALUES (2, 2, 2, 'BJS1', '2019-11-07 23:24:05', 24, 26, 11);

-- ----------------------------
-- Table structure for t_flight_scheduler
-- ----------------------------
DROP TABLE IF EXISTS `t_flight_scheduler`;
CREATE TABLE `t_flight_scheduler`  (
  `id` tinyint(4) NOT NULL,
  `flight_id` tinyint(6) NOT NULL COMMENT '计划航班编号',
  `start_date` datetime(0) NOT NULL COMMENT '开始日期',
  `end_date` datetime(0) NOT NULL COMMENT '结束日期',
  `from_city` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '出发地机场',
  `to_city` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '目的地机场',
  `departure_time` datetime(0) NOT NULL COMMENT '离港时间',
  `arrival_time` datetime(0) NOT NULL COMMENT '到港时间',
  `airplane_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '飞机编号',
  `scheduler` varchar(7) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班期',
  `sail_length` int(4) NOT NULL COMMENT '航程',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `flight_id`(`flight_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_flight_scheduler
-- ----------------------------
INSERT INTO `t_flight_scheduler` VALUES (1, 1, '2019-11-07 23:04:07', '2019-11-08 23:04:12', 'SHA1', 'BJS1', '2019-11-07 23:04:34', '2019-11-07 23:04:39', 'CA1550', '1', 1000);
INSERT INTO `t_flight_scheduler` VALUES (2, 2, '2019-11-07 23:22:09', '2019-11-07 23:22:12', 'SHA2', 'BJS2', '2019-11-07 23:22:25', '2019-11-07 23:22:29', 'MU9710', '2', 1000);

-- ----------------------------
-- Table structure for t_order_information
-- ----------------------------
DROP TABLE IF EXISTS `t_order_information`;
CREATE TABLE `t_order_information`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '机票编号',
  `departure_id` tinyint(4) NOT NULL COMMENT '航班编号',
  `passenger_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '乘客姓名',
  `certification_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '证件号码',
  `seat_class` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '座位类型',
  `seat_number` tinyint(4) NOT NULL COMMENT '座位号',
  `price` double(10, 2) NOT NULL COMMENT '机票价钱',
  `order_date` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '出票日期',
  `customer_id` tinyint(4) NULL DEFAULT NULL COMMENT '用户编号',
  `website_id` int(11) NULL DEFAULT NULL COMMENT '网点编号',
  `shop_assistant_id` int(11) NULL DEFAULT NULL COMMENT '营业员编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order_information
-- ----------------------------
INSERT INTO `t_order_information` VALUES (1, 1, 'zhangsan', '142623199712081234', 'A', 10, 500.00, '2019-11-07 23:19:54', 1, NULL, NULL);
INSERT INTO `t_order_information` VALUES (2, 2, 'lisi', '14262319981208123x', 'C', 50, 300.00, '2019-11-07 23:19:58', NULL, 2, 2);

-- ----------------------------
-- Table structure for t_shop_assistant
-- ----------------------------
DROP TABLE IF EXISTS `t_shop_assistant`;
CREATE TABLE `t_shop_assistant`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `assistant_id` tinyint(4) NOT NULL COMMENT '营业员编号',
  `assistant_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '营业员姓名',
  `website_id` tinyint(4) NOT NULL COMMENT '网点编号',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `unique`(`username`, `assistant_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_shop_assistant
-- ----------------------------
INSERT INTO `t_shop_assistant` VALUES (1, 'assistant001', '123456', 1, '营业员001', 1);
INSERT INTO `t_shop_assistant` VALUES (2, 'assistant002', '123456', 2, '营业员002', 2);

-- ----------------------------
-- Table structure for t_website
-- ----------------------------
DROP TABLE IF EXISTS `t_website`;
CREATE TABLE `t_website`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `website_id` tinyint(4) NOT NULL COMMENT '网点编号',
  `website_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '网点名称',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地址',
  `telephone` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话',
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份',
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '城市',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `unique`(`username`, `website_id`, `website_name`, `telephone`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_website
-- ----------------------------
INSERT INTO `t_website` VALUES (1, 'website001', '123456', 1, '上海国际', '上海', '12345', '上海', '上海');
INSERT INTO `t_website` VALUES (2, 'website002', '123456', 2, '北京国际', '北京', '23456', '北京', '北京');

SET FOREIGN_KEY_CHECKS = 1;
