-- -----------------------------------------------------
-- Schema kundenverwaltungDb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `kundenverwaltungdb` ;
CREATE SCHEMA IF NOT EXISTS `kundenverwaltungdb` DEFAULT CHARACTER SET utf8 ;
USE `kundenverwaltungdb` ;


-- -----------------------------------------------------
-- Table `Kunde`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Kunde` ;

CREATE TABLE IF NOT EXISTS `Kunde` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `vorname` VARCHAR(20) NOT NULL,
  `nachname` VARCHAR(30) NOT NULL,
  `anrede` VARCHAR(10) NULL,
  `alter` TINYINT(3) UNSIGNED NOT NULL,
  `geschlecht` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Adresse`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Adresse` ;

CREATE TABLE IF NOT EXISTS `Adresse` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `kundeId` INT UNSIGNED NOT NULL,
  `strasse` VARCHAR(45) NOT NULL,
  `hausnummer` SMALLINT(3) UNSIGNED NOT NULL,
  `plz` INT(5) UNSIGNED NOT NULL,
  `ort` VARCHAR(45) NOT NULL,
  `land` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `kundeId_UNIQUE` (`kundeId` ASC),
  CONSTRAINT `adresseFk_kundeId`
    FOREIGN KEY (kundeId)
    REFERENCES `Kunde` (id)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Kontakt`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Kontakt` ;

CREATE TABLE IF NOT EXISTS `Kontakt` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `kundeId` INT UNSIGNED NOT NULL,
  `emailAdresse` VARCHAR(45) NOT NULL,
  `telefonHandy` INT(15) UNSIGNED NOT NULL,
  `telefonPrivat` INT(15) UNSIGNED NULL,
  `telefonGeschaeft` INT(15) UNSIGNED NOT NULL,
  `socialNetwork1` VARCHAR(45) NULL,
  `socialNetwork2` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `kundeId_UNIQUE` (`kundeId` ASC),
  CONSTRAINT `kontaktFk_kundeId`
    FOREIGN KEY (kundeId)
    REFERENCES `Kunde` (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;