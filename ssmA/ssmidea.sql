/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : ssmidea

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 31/05/2020 12:38:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'huang', 20);
INSERT INTO `user` VALUES (2, 'lin', 20);
INSERT INTO `user` VALUES (3, 'test', 5);
INSERT INTO `user` VALUES (4, 'test', 5);
INSERT INTO `user` VALUES (5, 'test6', 56);

SET FOREIGN_KEY_CHECKS = 1;
