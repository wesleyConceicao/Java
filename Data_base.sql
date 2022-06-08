-- MySQL Script generated by MySQL Workbench
-- Mon Oct 25 06:02:38 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`tbl_cadastro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`tbl_cadastro` (
  `idtbl_cadastro` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NULL,
  `idade` INT NULL,
  `data_nascimento` DATE NULL,
  `sexo` VARCHAR(1) NULL,
  PRIMARY KEY (`idtbl_cadastro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tbl_login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`tbl_login` (
  `idtbl_login` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtbl_login`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;