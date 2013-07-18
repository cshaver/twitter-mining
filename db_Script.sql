SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `twitter_data` DEFAULT CHARACTER SET latin1 ;
USE `twitter_data` ;

-- -----------------------------------------------------
-- Table `twitter_data`.`airline_data`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `twitter_data`.`airline_data` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `tweet_id` VARCHAR(45) NOT NULL ,
  `flightNumber` VARCHAR(10) NULL DEFAULT NULL ,
  `Type` VARCHAR(15) NULL DEFAULT NULL ,
  `origin_airport` VARCHAR(10) NULL DEFAULT NULL ,
  `origin_city` VARCHAR(45) NULL DEFAULT NULL ,
  `dest_airport` VARCHAR(10) NULL DEFAULT NULL ,
  `dest_city` VARCHAR(45) NULL DEFAULT NULL ,
  `departure_time` VARCHAR(45) NULL DEFAULT NULL ,
  `arrival_time` VARCHAR(45) NULL DEFAULT NULL ,
  `Metric` INT(20) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `twitter_data`.`airline_tweets`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `twitter_data`.`airline_tweets` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT ,
  `Tweet` VARCHAR(160) NOT NULL ,
  `Date` VARCHAR(45) NOT NULL ,
  `Location` VARCHAR(45) NULL DEFAULT NULL ,
  `Username` VARCHAR(15) NOT NULL ,
  `Sentiment_Type` VARCHAR(45) NOT NULL ,
  `Keywords` VARCHAR(45) NOT NULL ,
  `Num_Follower` INT(20) NOT NULL ,
  PRIMARY KEY (`ID`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

USE `twitter_data` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
