DROP TABLE IF EXISTS `music`;
CREATE TABLE IF NOT EXISTS `music`
(
  `id`           INTEGER      NOT NULL
  ,`artist`      VARCHAR(30)  NOT NULL
  ,`song_title`  VARCHAR(30)  NOT NULL
  ,`album`       VARCHAR(30)  NOT NULL
  ,`description` VARCHAR(255) NOT NULL
  ,`genre`       VARCHAR(30)  NOT NULL
  ,`rate`        INTEGER      NOT NULL
  ,PRIMARY KEY(`id`)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;