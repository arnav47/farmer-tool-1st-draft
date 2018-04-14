/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - dm_former_help_tool
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `dm_former_help_tool`;

USE `dm_former_help_tool`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `dist_wise_crops` */

DROP TABLE IF EXISTS `dist_wise_crops`;

CREATE TABLE `dist_wise_crops` (
  `si_no` int(255) NOT NULL auto_increment,
  `district` varchar(50) default NULL,
  `kharif` varchar(150) default NULL,
  `rabi` varchar(150) default NULL,
  `summer` varchar(150) default NULL,
  PRIMARY KEY  (`si_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dist_wise_crops` */

insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (1,'Bangalore (U)','Ragi, Paddy, Avare, Maize','Horsegram','Paddy, Ragi, Maize');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (2,'Bangalore (R)','Ragi, Paddy, Avare, Maize, Groundnut, Castor, Niger, Horsegram','Horsegram','Paddy, Ragi, Maize,');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (3,'Kolar','Ragi, Groundnut, Avare, Maize, Paddy, Castor, Niger, Horsegram','Horsegram','Paddy, Ragi, Maize, Groundnut');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (4,'Tumkur','Ragi, Groundnut, Avare, Maize, Tur, Paddy, Castor, Niger, Horsegram, Greengram, Sunflower','Paddy, Horsegram, Sunflower','Paddy, Ragi, Groundnut');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (5,'Shimoga','Paddy, Ragi, Maize, Groundnut, Cotton, Sugarcane','Horsegram','Paddy, Groundnut, Balckgram, Greengram, Cowpea');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (6,'Chitradurga','Groundnut, Ragi, Maize, Jowar, Sunflower, Tur, Avare, Paddy, Sesamum, Horsegram, Cotton','Jowar, Sunflower, Horsegram','Paddy, Groundnut, Sunflower, Ragi');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (7,'Davanagere','Maize,Paddy, Jowar, Ragi, Groundnut, Sunflower, Tur, Cotton','Jowar, Horsegram, Sunflower','Paddy, Groundnut, Sunflower');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (8,'Mysore','Paddy, Ragi, Jowar, Maize, Tur, Horsegram, Cowpea, Avare, Groundnut, Sesamum, Sunflower, Castor, Niger, Cotton, Tobacco, Sugarcane','Ragi, Maize,Horsegram, Cowpea','Paddy, Ragi,');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (9,'Chamarajanagar','Jowar, Paddy, Ragi,Maize, Tur, Horsegram, Cowpea, Avare, Groundnut, Sesamum, Sunflower, Castor, Niger, Cotton, Sugarcane','Ragi, Maize,Horsegram, Cowpea','Paddy, Ragi,');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (10,'Mandya','Ragi, Paddy, Horsegram, Groundnut, Sesamum,Castor, Niger, Cowpea, Avare, Sugarcane','Horsegram, Ragi','Paddy, Ragi');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (11,'Kodagu','Paddy, Maize','Paddy, Maize','Paddy');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (12,'Hassan','Ragi, Paddy, Maize, Jowar, Tur, Horsegram, Cowpea, Avare, Castor, Niger, Sunflower, Sesamum, Groundnut, Cotton, Tobacco, Sugarcane','Ragi, Horsegram, Paddy, Sunflower, Bengalgram,','Paddy,Groundnut,');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (13,'Chickmagalur','Ragi, Paddy, Jowar, Avare, Sunflower, Groundnut, Sesamum, Cotton, Sugarcane','Jowar, Bengalgram, Horsegram','Paddy,Groundnut,');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (14,'D.Kannada','Paddy','Paddy, Blackgram,','Paddy');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (15,'Udupi','Paddy','Paddy, Blackgram, Horsegram','Paddy, Groundnut');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (16,'Dharwad','Paddy, Jowar, Maize, Greengram, Groundnut, Soyabean, Tur, Cotton','Jowar, Wheat, Bengalgram, Sunflower, Safflower','Groundnut');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (17,'Gadag','Groundnut, Maize, Jowar, Sunflower, Greengram, Cotton','Jowar, Wheat, Bengalgram, Sunflower, Safflower','Groundnut, Sunflower');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (18,'Haveri','Maize, Paddy, Jowar, Groundnut, Cotton, Greengram, Tur,Cowpea, Sunflower, M.Millets','Jowar, Cotton, Horsegram, Sunflower, Safflower, Wheat','Groundnut, Sunflower, Paddy, Sugarcane, Cowpea');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (19,'U.Kannada','Paddy, Cotton, Sugarcane','Paddy, Blackgram, Greengram,','Paddy, Groundnut, Cowpea');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (20,'Belgaum','Groundnut, Jowar, Maize, Paddy, Cotton, Sugarcane, Tobacco, Bajra, Tur, Sunflower, Soyabean, Greengram, Horsegram, Avare, M.Millets, Cowpea','Jowar, Wheat, Maize,Bengalgram,Sunflower, Safflower,Linseed, Horsegram','Groundnut, Maize, Sunflower');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (21,'Bijapur','Bajra, Sunflower, Groundnut, Maize, Horsegram, Tur, Cotton, Sugarcane','Jowar, Sunflower, Wheat, Bengalgram. Safflower, Linseed, Cotton,','Groundnut, Sunflower, Maize');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (22,'Bagalkote','Bajra, Maize, Sunflower, Jowar, Groundnut, Sesamum, Soyabean, Greengram, Horsegram, Cotton, Sugarcane','Jowar, Sunflower, Wheat, Ben.gram, Maize, Safflower, Linseed, Horsegram','Groundnut, Sunflower, Maize');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (23,'Raichur','Bajra, Paddy, Sunflower, Tur, Groundnut, Greengram, Sesamum,Cotton, Jowar, M.Millets','Jowar, Sunflower, Bengalgram, Safflower, Cotton,Wheat, Horsegram','Paddy, Groundnut, Sunflower');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (24,'Koppal','Bajra, Paddy, Groundnut, Sunflower, Jowar, Sesamum, Greengram, Horsegram, Cowpea, M.Millets, Cotton, Tur, Castor, Niger','Jowar, Wheat, Sunflower, Bengalgram, Cotton, Safflower,Linseed','Paddy, Groundnut, Sunflower');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (25,'Bellary','Groundnut, Sunflower, Jowar, Maize, Bajra, Ragi, Cotton, Tur,Horsegram, M.Millets, Niger, Sesamum,','Jowar, Sunflower, Bengalgram, Wheat, Horsegram, Cotton, Safflower','Paddy, Groundnut, Sunflower,Sugarcane, Cowpea, Jowar');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (26,'Gulbarga','Tur, Sunflower, Groundnut, Bajra, Greengram, Blackgram, Sesamum, Jowar, Cotton, Sugarcane','Jowar, Bengalgram, Sunflower, Wheat, Safflower, Linseed','Groundnut, Sunflower, Paddy Jowar');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (27,'Bidar','Jowar, Blackgram, Greengram, Tur, Bajra, Sunflower, Sesamum, Niger, Paddy, M.Millets, Sugarcane','Bengalgram, Jowar, WheatSunflower, Safflower, Linseed','Groundnut, Sunflower');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (28,'Chikballapur','Ragi, Groundnut, Avare, Maize, Paddy, Castor, Niger, Horsegram','Horsegram','Paddy, Ragi, Maize, Groundnut');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (29,'yadagiri','Tur, Sunflower, Groundnut, Bajra, Greengram, Blackgram, Sesamum, Jowar, Cotton, Sugarcane','Jowar, Bengalgram, Sunflower, Wheat, Safflower, Linseed','Groundnut, Sunflower, Paddy Jowar');
insert into `dist_wise_crops` (`si_no`,`district`,`kharif`,`rabi`,`summer`) values (30,'Ramanagara','Ragi, Paddy, Avare, Maize, Groundnut, Castor, Niger, Horsegram','Horsegram','Paddy, Ragi, Maize,');

/*Table structure for table `m_adhar_record` */

DROP TABLE IF EXISTS `m_adhar_record`;

CREATE TABLE `m_adhar_record` (
  `ad_si_no` int(10) NOT NULL auto_increment,
  `ad_no` varchar(100) default NULL,
  `name` varchar(100) default NULL,
  `contact` varchar(50) default NULL,
  `address` varchar(100) default NULL,
  `DOB` varchar(50) default NULL,
  PRIMARY KEY  (`ad_si_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_adhar_record` */

insert into `m_adhar_record` (`ad_si_no`,`ad_no`,`name`,`contact`,`address`,`DOB`) values (1,'15875558541','durgesh','7795204296','kunigal','1/21/91');
insert into `m_adhar_record` (`ad_si_no`,`ad_no`,`name`,`contact`,`address`,`DOB`) values (2,'15875548542','shashi','7795204296','kunigal','1/21/91');
insert into `m_adhar_record` (`ad_si_no`,`ad_no`,`name`,`contact`,`address`,`DOB`) values (3,'15874788541','sundra','7795204296','kunigal','1/21/91');

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `admin_id` int(10) NOT NULL auto_increment,
  `admin_name` varchar(100) default NULL,
  `password` varchar(100) default NULL,
  PRIMARY KEY  (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`admin_id`,`admin_name`,`password`) values (1,'admin','123');

/*Table structure for table `m_crop_demand` */

DROP TABLE IF EXISTS `m_crop_demand`;

CREATE TABLE `m_crop_demand` (
  `crop_id` int(50) NOT NULL auto_increment,
  `crop_name` varchar(100) default NULL,
  `d_2008` varchar(100) default NULL,
  `d_2009` varchar(100) default NULL,
  `d_2010` varchar(100) default NULL,
  `d_2011` varchar(100) default NULL,
  `d_2012` varchar(100) default NULL,
  `d_2013` varchar(100) default NULL,
  `d_2014` varchar(100) default NULL,
  `d_2015` varchar(100) default NULL,
  `d_2016` varchar(100) default NULL,
  `d_2017` varchar(100) default NULL,
  `status` varchar(10) default 'false',
  `new_demand` varchar(100) default NULL,
  PRIMARY KEY  (`crop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_crop_demand` */

insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (1,'Rice','630.0','720.0','790.0','830.0','890.0','950.0','995.0','1025.0','1060.0','1123.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (2,'Jowar','630.0','635.0','640.0','642.0','650.0','654.0','660.0','663.0','650.0','670.0','true','666.7999999999993');
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (3,'Ragi','1020.0','980.0','950.0','920.0','880.0','830.0','790.0','760.0','720.0','690.0','true','648.0');
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (4,'Maize','420.0','430.0','430.0','450.0','460.0','470.0','490.0','510.0','515.0','520.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (5,'Bajra','690.0','730.0','760.0','820.0','870.0','930.0','980.0','1040.0','1110.0','1180.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (6,'Wheat','1020.0','980.0','950.0','920.0','880.0','830.0','790.0','760.0','720.0','690.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (7,'Tur','270.0','290.0','320.0','390.0','390.0','420.0','450.0','490.0','530.0','570.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (8,'Bengal gram','240.0','250.0','280.0','310.0','330.0','350.0','350.0','370.0','390.0','420.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (9,'Horse gram','270.0','290.0','320.0','390.0','390.0','420.0','450.0','490.0','530.0','570.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (10,'Black gram','80.0','85.0','89.0','92.0','94.0','95.0','97.0','99.0','101.0','102.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (11,'Green gram','67.0','70.0','73.0','75.0','76.0','79.0','82.0','85.0','89.0','91.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (12,'Avare','240.0','250.0','280.0','310.0','330.0','350.0','350.0','370.0','390.0','420.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (13,'Groundnut','72.0','74.0','76.0','79.0','82.0','83.0','85.0','87.0','90.0','93.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (14,'Sesamum','56.0','59.0','63.0','67.0','69.0','73.0','76.0','79.0','82.0','85.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (15,'Sunflower','80.0','85.0','89.0','92.0','94.0','95.0','97.0','99.0','101.0','102.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (16,'Castor','56.0','59.0','63.0','67.0','69.0','73.0','76.0','79.0','82.0','85.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (17,'Niger','56.0','59.0','63.0','67.0','69.0','73.0','76.0','79.0','82.0','85.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (18,'Mustard','67.0','70.0','73.0','75.0','76.0','79.0','82.0','85.0','89.0','91.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (19,'Soyabean','80.0','85.0','89.0','92.0','94.0','95.0','97.0','99.0','101.0','102.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (20,'Safflower','67.0','70.0','73.0','75.0','76.0','79.0','82.0','85.0','89.0','91.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (21,'Linseed','56.0','59.0','63.0','67.0','69.0','73.0','76.0','79.0','82.0','85.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (22,'Cotton','240.0','250.0','280.0','310.0','330.0','350.0','350.0','370.0','390.0','420.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (23,'Sugarcane','223.0','254.0','273.0','305.0','323.0','346.0','372.0','399.0','429.0','461.0','false',NULL);
insert into `m_crop_demand` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (24,'Horsegram','420.0','430.0','430.0','450.0','460.0','470.0','490.0','510.0','515.0','520.0','true','524.7272727272757');

/*Table structure for table `m_crop_yield` */

DROP TABLE IF EXISTS `m_crop_yield`;

CREATE TABLE `m_crop_yield` (
  `crop_id` int(50) NOT NULL auto_increment,
  `crop_name` varchar(100) default NULL,
  `d_2008` varchar(100) default NULL,
  `d_2009` varchar(100) default NULL,
  `d_2010` varchar(100) default NULL,
  `d_2011` varchar(100) default NULL,
  `d_2012` varchar(100) default NULL,
  `d_2013` varchar(100) default NULL,
  `d_2014` varchar(100) default NULL,
  `d_2015` varchar(100) default NULL,
  `d_2016` varchar(100) default NULL,
  `d_2017` varchar(100) default NULL,
  PRIMARY KEY  (`crop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_crop_yield` */

insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (1,'Rice','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (2,'Jowar','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (3,'Ragi','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (4,'Maize','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (5,'Bajra','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (6,'Wheat','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (7,'Minor Millets','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (8,'Tur','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (9,'Bengal gram','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (10,'Horse gram','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (11,'Black gram','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (12,'Green gram','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (13,'Cowpea & others','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (14,'Avare','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (15,'Groundnut','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (16,'Sesamum','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (17,'Sunflower','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (18,'Castor','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (19,'Niger','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (20,'Mustard','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (21,'Soyabean','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (22,'Safflower','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (23,'Linseed','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (24,'Cotton','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (25,'Sugarcane','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');
insert into `m_crop_yield` (`crop_id`,`crop_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (26,'Horsegram','5.0','5.0','5.0','6.0','6.0','7.0','8.0','8.0','9.0','9.0');

/*Table structure for table `m_phani_record` */

DROP TABLE IF EXISTS `m_phani_record`;

CREATE TABLE `m_phani_record` (
  `phahni_id` int(100) NOT NULL auto_increment,
  `ad_no` varchar(100) default NULL,
  `survey_no` varchar(50) default NULL,
  `soil_type` varchar(100) default NULL,
  `total_land` int(50) default NULL,
  `district` varchar(50) default NULL,
  `rain_fall` varchar(50) default NULL,
  `land_remain` varchar(50) default NULL,
  PRIMARY KEY  (`phahni_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_phani_record` */

insert into `m_phani_record` (`phahni_id`,`ad_no`,`survey_no`,`soil_type`,`total_land`,`district`,`rain_fall`,`land_remain`) values (1235,'15875558541','1257/35','Red',10,'Bangalore (U)','','0');
insert into `m_phani_record` (`phahni_id`,`ad_no`,`survey_no`,`soil_type`,`total_land`,`district`,`rain_fall`,`land_remain`) values (4787,'15875548542','123/33','Black',20,'Bidar','','15');
insert into `m_phani_record` (`phahni_id`,`ad_no`,`survey_no`,`soil_type`,`total_land`,`district`,`rain_fall`,`land_remain`) values (12458,'15874788541','127/333','red',30,'Bangalore (U)','','30');
insert into `m_phani_record` (`phahni_id`,`ad_no`,`survey_no`,`soil_type`,`total_land`,`district`,`rain_fall`,`land_remain`) values (1458788,'15875558541','124/33','Black',40,'Bidar','','30');

/*Table structure for table `m_soil_type` */

DROP TABLE IF EXISTS `m_soil_type`;

CREATE TABLE `m_soil_type` (
  `soil_id` int(150) NOT NULL auto_increment,
  `soil_name` varchar(500) default NULL,
  PRIMARY KEY  (`soil_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_soil_type` */

insert into `m_soil_type` (`soil_id`,`soil_name`) values (1,'Alluvial soils');
insert into `m_soil_type` (`soil_id`,`soil_name`) values (2,'Black soils');
insert into `m_soil_type` (`soil_id`,`soil_name`) values (3,'Red and Yellow soils');
insert into `m_soil_type` (`soil_id`,`soil_name`) values (4,'Laterite soils');
insert into `m_soil_type` (`soil_id`,`soil_name`) values (5,'Arid and desert soils');
insert into `m_soil_type` (`soil_id`,`soil_name`) values (6,'Saline and alkaline soils');
insert into `m_soil_type` (`soil_id`,`soil_name`) values (7,'Peaty and marshy soils');
insert into `m_soil_type` (`soil_id`,`soil_name`) values (8,'Forest and mountain soils');

/*Table structure for table `m_user` */

DROP TABLE IF EXISTS `m_user`;

CREATE TABLE `m_user` (
  `u_id` int(10) NOT NULL auto_increment,
  `user_name` varchar(100) default NULL,
  `password` varchar(100) default NULL,
  `email` varchar(100) default NULL,
  `address_ad` varchar(100) default NULL,
  `adhar_id` varchar(100) default NULL,
  `user_sex` varchar(100) default NULL,
  `otp` varchar(50) default NULL,
  PRIMARY KEY  (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_user` */

insert into `m_user` (`u_id`,`user_name`,`password`,`email`,`address_ad`,`adhar_id`,`user_sex`,`otp`) values (1,'durgesh','durgesh','bharath@gmail.com','kunigal','15875558541','male','8710');
insert into `m_user` (`u_id`,`user_name`,`password`,`email`,`address_ad`,`adhar_id`,`user_sex`,`otp`) values (2,'shashi','shashi','bharath@gmail.com','kunigal','15875548542',NULL,NULL);
insert into `m_user` (`u_id`,`user_name`,`password`,`email`,`address_ad`,`adhar_id`,`user_sex`,`otp`) values (3,'Mahesh','mahesh','null','kunigal','158558447855',NULL,NULL);
insert into `m_user` (`u_id`,`user_name`,`password`,`email`,`address_ad`,`adhar_id`,`user_sex`,`otp`) values (4,'Murgesh','murgesh','null','banglore','1587555854155',NULL,'1745');

/*Table structure for table `m_vegetable` */

DROP TABLE IF EXISTS `m_vegetable`;

CREATE TABLE `m_vegetable` (
  `vegetable_id` int(10) NOT NULL auto_increment,
  `vegetable_name` varchar(100) default NULL,
  `harvestingmonth` int(12) default NULL,
  PRIMARY KEY  (`vegetable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_vegetable` */

insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (2,'Bhendi',4);
insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (3,'Beet root',5);
insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (4,'Beans',3);
insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (5,'Brinjal',2);
insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (6,'Carrot',3);
insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (7,'Cauliflower',4);
insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (8,'Potato',5);
insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (9,'Onion',3);
insert into `m_vegetable` (`vegetable_id`,`vegetable_name`,`harvestingmonth`) values (10,'Tomato',3);

/*Table structure for table `m_vegitable_demand` */

DROP TABLE IF EXISTS `m_vegitable_demand`;

CREATE TABLE `m_vegitable_demand` (
  `veg_id` int(50) NOT NULL auto_increment,
  `veg_name_id` int(11) default NULL,
  `month` varchar(100) default NULL,
  `d_2008` varchar(100) default NULL,
  `d_2009` varchar(100) default NULL,
  `d_2010` varchar(100) default NULL,
  `d_2011` varchar(100) default NULL,
  `d_2012` varchar(100) default NULL,
  `d_2013` varchar(100) default NULL,
  `d_2014` varchar(100) default NULL,
  `d_2015` varchar(100) default NULL,
  `d_2016` varchar(100) default NULL,
  `d_2017` varchar(100) default NULL,
  `status` varchar(50) default 'false',
  `new_demand` varchar(100) default NULL,
  PRIMARY KEY  (`veg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_vegitable_demand` */

insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (1,9,'jan','18.0','24.0','32.0','40.0','58.0','72.0','80.0','93.0','102.0','118.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (2,9,'feb','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (3,9,'mar','26.0','36.0','46.0','56.0','66.0','76.0','86.0','96.0','106.0','116.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (4,9,'apr','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','100.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (5,9,'may','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','104.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (6,9,'jun','13.0','23.0','33.0','43.0','53.0','63.0','73.0','83.0','93.0','103.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (7,9,'jul','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','true','107.86666666666679');
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (8,9,'aug','18.0','24.0','32.0','40.0','58.0','72.0','80.0','93.0','102.0','118.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (9,9,'sep','15.0','25.0','35.0','45.0','55.0','65.0','75.0','85.0','95.0','105.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (10,9,'oct','13.0','23.0','33.0','43.0','53.0','63.0','73.0','83.0','93.0','103.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (11,9,'nov','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','100.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (12,9,'dec','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (13,8,'jan','18.0','24.0','32.0','40.0','58.0','72.0','80.0','93.0','102.0','118.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (14,8,'feb','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (15,8,'mar','26.0','36.0','46.0','56.0','66.0','76.0','86.0','96.0','106.0','116.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (16,8,'apr','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','100.0','true','100.0');
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (17,8,'may','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','104.0','true','111.59999999999854');
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (18,8,'jun','13.0','23.0','33.0','43.0','53.0','63.0','73.0','83.0','93.0','103.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (19,8,'jul','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (20,8,'aug','18.0','24.0','32.0','40.0','58.0','72.0','80.0','93.0','102.0','118.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (21,8,'sep','15.0','25.0','35.0','45.0','55.0','65.0','75.0','85.0','95.0','105.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (22,8,'oct','13.0','23.0','33.0','43.0','53.0','63.0','73.0','83.0','93.0','103.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (23,8,'nov','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','100.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (24,8,'dec','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (25,10,'jan','18.0','24.0','32.0','40.0','58.0','72.0','80.0','93.0','102.0','118.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (26,10,'feb','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','true','100.27272727272793');
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (27,10,'mar','26.0','36.0','46.0','56.0','66.0','76.0','86.0','96.0','106.0','116.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (28,10,'apr','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','100.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (29,10,'may','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','104.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (30,10,'jun','13.0','23.0','33.0','43.0','53.0','63.0','73.0','83.0','93.0','103.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (31,10,'jul','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (32,10,'aug','18.0','24.0','32.0','40.0','58.0','72.0','80.0','93.0','102.0','118.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (33,10,'sep','15.0','25.0','35.0','45.0','55.0','65.0','75.0','85.0','95.0','105.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (34,10,'oct','13.0','23.0','33.0','43.0','53.0','63.0','73.0','83.0','93.0','103.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (35,10,'nov','10.0','20.0','30.0','40.0','50.0','60.0','70.0','80.0','90.0','100.0','false',NULL);
insert into `m_vegitable_demand` (`veg_id`,`veg_name_id`,`month`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`,`status`,`new_demand`) values (36,10,'dec','36.0','42.0','48.0','53.0','59.0','65.0','72.0','85.0','93.0','108.0','false',NULL);

/*Table structure for table `m_vegitable_yield` */

DROP TABLE IF EXISTS `m_vegitable_yield`;

CREATE TABLE `m_vegitable_yield` (
  `veg_id` int(50) NOT NULL auto_increment,
  `veg_name` varchar(100) default NULL,
  `d_2008` varchar(100) default NULL,
  `d_2009` varchar(100) default NULL,
  `d_2010` varchar(100) default NULL,
  `d_2011` varchar(100) default NULL,
  `d_2012` varchar(100) default NULL,
  `d_2013` varchar(100) default NULL,
  `d_2014` varchar(100) default NULL,
  `d_2015` varchar(100) default NULL,
  `d_2016` varchar(100) default NULL,
  `d_2017` varchar(100) default NULL,
  PRIMARY KEY  (`veg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_vegitable_yield` */

insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (1,'Amaranthus','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (2,'Annual moringa','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (3,'Ash gourd','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (4,'Beet root','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (5,'Bhendi','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (6,'Bitter gourd','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (7,'Bottle gourd','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (8,'Brinjal','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (9,'Beans','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (10,'Carrot','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (11,'Cauliflower','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (12,'Cerely','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (13,'Chakravarthikeerai','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (14,'Chilli','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (15,'Coccinia','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (16,'Coleus','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (17,'Colocasia','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (18,'Cowpea','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (19,'Cucumber','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (20,'Dolichos bean','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (21,'French beans','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (22,'Garlic','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (23,'Greater yam','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (24,'Moringa beans','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (25,'Onion','10.0','10.0','10.0','10.0','8.0','15.0','15.0','10.0','8.0','8.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (26,'Palak','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (27,'Peas','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (28,'Potato','10.0','10.0','10.0','8.0','7.0','6.0','6.0','8.0','8.0','7.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (29,'Pumpkin','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (30,'Radish','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (31,'Ribbed gourd','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (32,'Snake gourd','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (33,'Spinach','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (34,'Sweet potato','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (35,'Tapioca','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (36,'Tomato','5.0','6.0','10.0','10.0','6.0','5.0','4.0','5.0','6.0','5.0');
insert into `m_vegitable_yield` (`veg_id`,`veg_name`,`d_2008`,`d_2009`,`d_2010`,`d_2011`,`d_2012`,`d_2013`,`d_2014`,`d_2015`,`d_2016`,`d_2017`) values (37,'Watermelon','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0','5.0');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
