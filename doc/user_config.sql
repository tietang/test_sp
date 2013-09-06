/*
Navicat MySQL Data Transfer

Source Server         : po
Source Server Version : 50525
Source Host           : localhost:4000
Source Database       : spruce

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2013-09-06 15:54:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_config
-- ----------------------------
DROP TABLE IF EXISTS `user_config`;
CREATE TABLE `user_config` (
  `id_user` int(10) unsigned NOT NULL,
  `dir_size` int(10) unsigned DEFAULT '20',
  `license` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user_config
-- ----------------------------
INSERT INTO `user_config` VALUES ('24', '9', null);
