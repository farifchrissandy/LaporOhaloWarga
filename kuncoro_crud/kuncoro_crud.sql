/*
SQLyog Ultimate v10.42 
MySQL - 5.5.5-10.1.9-MariaDB : Database - kuncoro_crud
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kuncoro_crud` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `kuncoro_crud`;

/*Table structure for table `biodata` */

DROP TABLE IF EXISTS `biodata`;

CREATE TABLE `biodata` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `biodata` */

insert  into `biodata`(`id`,`nama`,`alamat`) values (1,'Dedy Kuncoro','Demak'),(2,'Ismi Andriani','Pekalongan'),(3,'Triyono','Demak'),(4,'Nur Wiguna Pangestika','Demak'),(5,'Purbayu','Semarang'),(6,'Lutfil','Kendal'),(7,'Ahmad Rifai','Katonsari');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
