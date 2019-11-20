-- -----------------------------------------------------
-- Schema kundenverwaltungDb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `kundenverwaltungdb`;
CREATE SCHEMA IF NOT EXISTS `kundenverwaltungdb` DEFAULT CHARACTER SET utf8;
USE `kundenverwaltungdb`;


-- -----------------------------------------------------
-- Table `Kunde`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Kunde`;

CREATE TABLE IF NOT EXISTS `Kunde`
(
    `ku_id`         INT UNSIGNED        NOT NULL AUTO_INCREMENT,
    `ku_vorname`    VARCHAR(20)         NOT NULL,
    `ku_nachname`   VARCHAR(30)         NOT NULL,
    `ku_anrede`     VARCHAR(10)         NULL,
    `ku_alter`      TINYINT(3) UNSIGNED NOT NULL,
    `ku_geschlecht` VARCHAR(15)         NOT NULL,
    PRIMARY KEY (`ku_id`),
    UNIQUE INDEX `id_UNIQUE` (`ku_id` ASC)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Adresse`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Adresse`;

CREATE TABLE IF NOT EXISTS `Adresse`
(
    `ad_id`         INT UNSIGNED         NOT NULL AUTO_INCREMENT,
    `ad_fk_kundeId` INT UNSIGNED         NOT NULL,
    `ad_strasse`    VARCHAR(45)          NOT NULL,
    `ad_hausnummer` SMALLINT(3) UNSIGNED NOT NULL,
    `ad_plz`        INT(5) UNSIGNED      NOT NULL,
    `ad_ort`        VARCHAR(45)          NOT NULL,
    `ad_land`       VARCHAR(45)          NULL,
    PRIMARY KEY (`ad_id`),
    UNIQUE INDEX `id_UNIQUE` (`ad_id` ASC),
    UNIQUE INDEX `kundeId_UNIQUE` (`ad_fk_kundeId` ASC),
    CONSTRAINT `ad_FK_kundeId`
        FOREIGN KEY (ad_fk_kundeId)
            REFERENCES `Kunde` (ku_id)
            ON DELETE CASCADE
            ON UPDATE CASCADE
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Kontakt`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Kontakt`;

CREATE TABLE IF NOT EXISTS `Kontakt`
(
    `ko_id`               INT UNSIGNED     NOT NULL AUTO_INCREMENT,
    `ko_fk_kundeId`       INT UNSIGNED     NOT NULL,
    `ko_emailAdresse`     VARCHAR(45)      NOT NULL,
    `ko_telefonHandy`     INT(15) UNSIGNED NOT NULL,
    `ko_telefonPrivat`    INT(15) UNSIGNED NULL,
    `ko_telefonGeschaeft` INT(15) UNSIGNED NOT NULL,
    `ko_socialNetwork1`   VARCHAR(45)      NULL,
    `ko_socialNetwork2`   VARCHAR(45)      NULL,
    PRIMARY KEY (`ko_id`),
    UNIQUE INDEX `id_UNIQUE` (`ko_id` ASC),
    UNIQUE INDEX `ko_kundeId_UNIQUE` (`ko_FK_kundeId` ASC),
    CONSTRAINT `ko_FK_kundeId`
        FOREIGN KEY (ko_fk_kundeId)
            REFERENCES `Kunde` (ku_id)
            ON DELETE CASCADE
            ON UPDATE CASCADE
)
    ENGINE = InnoDB;