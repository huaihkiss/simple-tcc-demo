CREATE DATABASE `tcc_demo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */

use tcc_demo;
-- tcc_demo.NewTable definition

CREATE TABLE `user_account` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL COMMENT '用户id',
  `acc_type` int NOT NULL DEFAULT '1' COMMENT '账户类型',
  `balance` bigint NOT NULL COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `inx_user_id_type` (`user_id`,`acc_type`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO user_account
(id, user_id, acc_type, balance)
VALUES(1, 1, 1, 1000);

CREATE TABLE `user_info` (
	id bigint primary key NOT NULL AUTO_INCREMENT COMMENT '用户id',
	user_name varchar(100) NOT NULL COMMENT '账户',
	reward_points bigint DEFAULT 0 NOT NULL COMMENT '奖励积分'
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

INSERT INTO user_info
(id, user_name, reward_points)
VALUES(1, 'huaihkiss', 1000);
