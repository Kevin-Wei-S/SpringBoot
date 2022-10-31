/*
Navicat MySQL Data Transfer

Source Server			: 本地
Source Server Version	:	
Source Host				: 192.168.1.110:3306
Source Database			: mybatis

Target Server Type		: MySQL
Target Server Version	:
File Encoding			: UTF-8

Date: 2022-10-03 19:28:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------

DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
	id int(11) NOT NULL AUTO_INCREMENT,
	lastName varchar(255) DEFAULT NULL,
	email varchar(255) DEFAULT NULL,
	gender int(2) DEFAULT NULL,
	d_id int(11) DEFAULT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8