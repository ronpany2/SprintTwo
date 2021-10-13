CREATE SCHEMA `hangardb` ;
USE hangardb;

CREATE TABLE `hangardb`.`hangar` (
  `idhangar` INT NOT NULL AUTO_INCREMENT,
  `alto` VARCHAR(45) NOT NULL,
  `largo` VARCHAR(45) NOT NULL,
  `ancho` VARCHAR(45) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idhangar`));

CREATE TABLE `hangardb`.`cliente` (
  `idcliente` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcliente`));

CREATE TABLE `hangardb`.`avion` (
  `idavion` INT NOT NULL,
  `alto` VARCHAR(45) NOT NULL,
  `largo` VARCHAR(45) NOT NULL,
  `ancho` VARCHAR(45) NOT NULL,
  `idcliente` INT NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idavion`));

ALTER TABLE `hangardb`.`avion` 
ADD INDEX `fk_idcliente_idx` (`idcliente` ASC) VISIBLE;
;
ALTER TABLE `hangardb`.`avion` 
ADD CONSTRAINT `fk_idcliente`
  FOREIGN KEY (`idcliente`)
  REFERENCES `hangardb`.`cliente` (`idcliente`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
