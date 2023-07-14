CREATE TABLE `userinfo` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `province` varchar(255) DEFAULT NULL COMMENT '省份',
  `city` varchar(255) DEFAULT NULL COMMENT '城市',
  `district` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `contact_confirmed_cases` varchar(20) DEFAULT NULL,
  `coresident` varchar(20) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `health` varchar(50) DEFAULT NULL,
  `health_code` varchar(50) DEFAULT NULL,
  `living_conditions` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `number` varchar(50) DEFAULT NULL,
  `temperature` varchar(50) DEFAULT NULL,
  `through_risk_areas` varchar(50) DEFAULT NULL,
  `vaccine` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci