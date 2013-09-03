/*
Navicat MySQL Data Transfer

Source Server         : po
Source Server Version : 50525
Source Host           : localhost:4000
Source Database       : spruce

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2013-08-09 09:36:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_camera
-- ----------------------------
DROP TABLE IF EXISTS `user_camera`;
CREATE TABLE `user_camera` (
  `id_user` int(11) unsigned NOT NULL,
  `equipment` varchar(64) NOT NULL,
  `type` varchar(16) NOT NULL COMMENT 'camera,lens,tripod,filter',
  `id_camera` int(11) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_camera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
