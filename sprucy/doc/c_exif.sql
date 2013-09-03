/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : spruce

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-08-19 23:52:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `c_exif`
-- ----------------------------
DROP TABLE IF EXISTS `c_exif`;
CREATE TABLE `c_exif` (
  `pid` bigint(20) NOT NULL DEFAULT '0',
  `original_at` time DEFAULT NULL COMMENT ' Date/Time Original ',
  `make` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT 'Camera Maker Name ',
  `model` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT 'Camera Model Name',
  `aperture` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT 'Aperture/F Number',
  `shutter` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT 'shutter speed',
  `iso` varchar(8) COLLATE utf8_bin DEFAULT NULL,
  `lens` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `focus` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT 'Focal Length',
  `tags` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of c_exif
-- ----------------------------
