-- pms_brand definition

CREATE TABLE `pms_brand` (
                             `brand_id` bigint NOT NULL AUTO_INCREMENT COMMENT '品牌id',
                             `name` char(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '品牌名',
                             `logo` varchar(2000) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '品牌logo地址',
                             `description` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '介绍',
                             `show_status` tinyint DEFAULT NULL COMMENT '显示状态[0-不显示；1-显示]',
                             `first_letter` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '检索首字母',
                             `sort` int DEFAULT NULL COMMENT '排序',
                             PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='品牌';