/*
Navicat MySQL Data Transfer

Source Server         : 32
Source Server Version : 50523
Source Host           : 172.17.20.72:3306
Source Database       : relationdb_edges

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2013-08-13 10:03:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for forward_1_edges
-- ----------------------------
DROP TABLE IF EXISTS `forward_1_edges`;
CREATE TABLE `forward_1_edges` (
  `source_id` int(11) unsigned NOT NULL,
  `destination_id` int(11) unsigned NOT NULL,
  `edge_type` char(1) COLLATE utf8_bin NOT NULL,
  `state` tinyint(4) NOT NULL,
  `created_at` int(11) unsigned NOT NULL,
  `updated_at` bigint(20) unsigned NOT NULL,
  `valid_time` int(11) unsigned NOT NULL,
  `expired_at` int(11) unsigned NOT NULL,
  PRIMARY KEY (`source_id`,`destination_id`,`edge_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
