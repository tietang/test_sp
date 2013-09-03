/*
Navicat MySQL Data Transfer

Source Server         : po
Source Server Version : 50527
Source Host           : localhost:4000
Source Database       : spruce

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2013-07-25 21:31:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for photo
-- ----------------------------
DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo` (
  `id_photo` bigint(20) unsigned NOT NULL,
  `id_user` int(11) unsigned NOT NULL,
  `nice_name` varchar(64) DEFAULT NULL,
  `title` varchar(32) DEFAULT 'Untitled',
  `desc` varchar(256) DEFAULT NULL,
  `category` varchar(32) DEFAULT NULL,
  `create_at` int(11) unsigned DEFAULT '0',
  `create_at_gmt` datetime DEFAULT NULL,
  `update_at` bigint(11) unsigned DEFAULT NULL,
  `comment_count` int(11) unsigned DEFAULT NULL,
  `adult` tinyint(4) unsigned DEFAULT '1',
  `copyright` tinyint(4) unsigned DEFAULT NULL,
  `tags` varchar(256) DEFAULT NULL,
  `make` varchar(64) DEFAULT NULL,
  `model` varchar(64) DEFAULT NULL,
  `lens` varchar(64) DEFAULT NULL,
  `aperture` varchar(6) DEFAULT NULL,
  `shutter` varchar(10) DEFAULT NULL,
  `iso` varchar(10) DEFAULT NULL,
  `focus` varchar(6) DEFAULT NULL,
  `ev` varchar(6) DEFAULT NULL,
  `original_at` varchar(20) DEFAULT NULL,
  `white_balance` tinyint(4) DEFAULT NULL,
  `software` varchar(64) DEFAULT NULL,
  `flash` smallint(6) DEFAULT NULL,
  `color_space` tinyint(4) DEFAULT NULL,
  `metering_mode` tinyint(4) DEFAULT NULL,
  `exposure_mode` tinyint(4) DEFAULT NULL,
  `exposure_program` tinyint(4) DEFAULT NULL,
  `gps_latitude` double DEFAULT NULL,
  `gps_longitude` double DEFAULT NULL,
  `gps_altitude` double DEFAULT NULL,
  `gps_origin` tinyint(4) DEFAULT '-1' COMMENT '0=photo or 1=google map or 2=baidu map',
  `ip` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_photo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
