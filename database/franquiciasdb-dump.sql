CREATE DATABASE  IF NOT EXISTS `franquiciasdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `franquiciasdb`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: franquiciasdb
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE USER 'franquiciasapp'@'localhost' IDENTIFIED BY 'xkHyuo-02okhY-87jiyf';
commit;

GRANT ALL PRIVILEGES ON franquiciasdb.* TO 'franquiciasapp'@'localhost';
commit;

--
-- Table structure for table `franquicias`
--

DROP TABLE IF EXISTS `franquicias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `franquicias` (
  `id_franquicia` int NOT NULL AUTO_INCREMENT,
  `nombre_franquicia` varchar(1000) NOT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `fecha_modificacion` datetime DEFAULT NULL,
  PRIMARY KEY (`id_franquicia`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `franquicias`
--

LOCK TABLES `franquicias` WRITE;
/*!40000 ALTER TABLE `franquicias` DISABLE KEYS */;
INSERT INTO `franquicias` VALUES (1,'Franquicia Alfa','2024-01-01 00:00:00',NULL),(2,'Franquicia Beta','2024-01-02 00:00:00',NULL),(3,'Franquicia Gamma','2024-01-03 00:00:00',NULL),(4,'Franquicia Delta','2024-01-04 00:00:00',NULL),(5,'Franquicia Epsilon','2024-01-05 00:00:00',NULL),(6,'Franquicia Zeta','2024-01-06 00:00:00',NULL),(7,'Franquicia Eta','2024-01-07 00:00:00',NULL),(8,'Franquicia Theta','2024-01-08 00:00:00',NULL),(9,'Franquicia Iota','2024-01-09 00:00:00',NULL),(10,'Franquicia Kappa','2024-01-10 00:00:00',NULL);
/*!40000 ALTER TABLE `franquicias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id_producto` int NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(1000) NOT NULL,
  `id_sucursal` int NOT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `fecha_modificacion` datetime DEFAULT NULL,
  `stock` int DEFAULT '0',
  PRIMARY KEY (`id_producto`),
  KEY `fk_sucursal_idx` (`id_sucursal`),
  CONSTRAINT `fk_sucursal` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursales` (`id_sucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Laptop Ultrabook X-Pro',1,'2024-03-01 00:00:00',NULL,99),(2,'Smartphone Galaxy Neo',1,'2024-03-02 00:00:00',NULL,98),(3,'Smartwatch FitTrack 5',1,'2024-03-03 00:00:00',NULL,97),(4,'Audifonos Inalambricos SoundWave',1,'2024-03-04 00:00:00',NULL,96),(5,'Monitor Gaming 4K VisionMax',1,'2024-03-05 00:00:00',NULL,95),(6,'Teclado Mecanico HyperType RGB',1,'2024-03-06 00:00:00',NULL,94),(7,'Mouse Inalambrico PrecisionPro',1,'2024-03-07 00:00:00',NULL,93),(8,'Camara de Seguridad SmartView',1,'2024-03-08 00:00:00',NULL,92),(9,'Cargador Rapido TurboCharge 65W',1,'2024-03-09 00:00:00',NULL,91),(10,'Altavoz Inteligente Echo Sound',1,'2024-03-10 00:00:00',NULL,90),(11,'Laptop Ultrabook X-Pro',2,'2024-03-11 00:00:00',NULL,89),(12,'Smartphone Galaxy Neo',2,'2024-03-12 00:00:00',NULL,88),(13,'Smartwatch FitTrack 5',2,'2024-03-13 00:00:00',NULL,87),(14,'Audifonos Inalambricos SoundWave',2,'2024-03-14 00:00:00',NULL,86),(15,'Monitor Gaming 4K VisionMax',2,'2024-03-15 00:00:00',NULL,85),(16,'Teclado Mecanico HyperType RGB',2,'2024-03-16 00:00:00',NULL,84),(17,'Mouse Inalambrico PrecisionPro',2,'2024-03-17 00:00:00',NULL,83),(18,'Camara de Seguridad SmartView',2,'2024-03-18 00:00:00',NULL,82),(19,'Cargador Rapido TurboCharge 65W',2,'2024-03-19 00:00:00',NULL,81),(20,'Altavoz Inteligente Echo Sound',2,'2024-03-20 00:00:00',NULL,80),(21,'Laptop Ultrabook X-Pro',3,'2024-03-12 00:00:00',NULL,79),(22,'Smartphone Galaxy Neo',3,'2024-03-13 00:00:00',NULL,78),(23,'Smartwatch FitTrack 5',3,'2024-03-14 00:00:00',NULL,77),(24,'Audifonos Inalambricos SoundWave',3,'2024-03-15 00:00:00',NULL,76),(25,'Monitor Gaming 4K VisionMax',3,'2024-03-16 00:00:00',NULL,75),(26,'Teclado Mecanico HyperType RGB',3,'2024-03-17 00:00:00',NULL,74),(27,'Mouse Inalambrico PrecisionPro',3,'2024-03-18 00:00:00',NULL,73),(28,'Camara de Seguridad SmartView',3,'2024-03-19 00:00:00',NULL,72),(29,'Cargador Rapido TurboCharge 65W',3,'2024-03-20 00:00:00',NULL,71),(30,'Altavoz Inteligente Echo Sound',3,'2024-03-21 00:00:00',NULL,70),(31,'Laptop Ultrabook X-Pro',4,'2024-03-22 00:00:00',NULL,69),(32,'Smartphone Galaxy Neo',4,'2024-03-23 00:00:00',NULL,68),(33,'Smartwatch FitTrack 5',4,'2024-03-24 00:00:00',NULL,67),(34,'Audifonos Inalambricos SoundWave',4,'2024-03-25 00:00:00',NULL,66),(35,'Monitor Gaming 4K VisionMax',4,'2024-03-26 00:00:00',NULL,65),(36,'Teclado Mecanico HyperType RGB',4,'2024-03-27 00:00:00',NULL,64),(37,'Mouse Inalambrico PrecisionPro',4,'2024-03-28 00:00:00',NULL,63),(38,'Camara de Seguridad SmartView',4,'2024-03-29 00:00:00',NULL,62),(39,'Cargador Rapido TurboCharge 65W',4,'2024-03-30 00:00:00',NULL,61),(40,'Altavoz Inteligente Echo Sound',4,'2024-03-31 00:00:00',NULL,60);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursales`
--

DROP TABLE IF EXISTS `sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sucursales` (
  `id_sucursal` int NOT NULL AUTO_INCREMENT,
  `nombre_sucursal` varchar(1000) NOT NULL,
  `id_franquicia` int NOT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `fecha_modificacion` datetime DEFAULT NULL,
  `sucursalescol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_sucursal`),
  KEY `FK_FRANQUICIA_idx` (`id_franquicia`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk_franquicia` FOREIGN KEY (`id_franquicia`) REFERENCES `franquicias` (`id_franquicia`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursales`
--

LOCK TABLES `sucursales` WRITE;
/*!40000 ALTER TABLE `sucursales` DISABLE KEYS */;
INSERT INTO `sucursales` VALUES (1,'Alfa Sucursal 1',1,'2024-02-01 00:00:00',NULL,NULL),(2,'Alfa Sucursal 2',1,'2024-02-02 00:00:00',NULL,NULL),(3,'Alfa Sucursal 3',1,'2024-02-03 00:00:00',NULL,NULL),(4,'Alfa Sucursal 4',1,'2024-02-04 00:00:00',NULL,NULL),(5,'Alfa Sucursal 5',1,'2024-02-05 00:00:00',NULL,NULL),(6,'Alfa Sucursal 6',1,'2024-02-06 00:00:00',NULL,NULL),(7,'Alfa Sucursal 7',1,'2024-02-07 00:00:00',NULL,NULL),(8,'Alfa Sucursal 8',1,'2024-02-08 00:00:00',NULL,NULL),(9,'Alfa Sucursal 9',1,'2024-02-09 00:00:00',NULL,NULL),(10,'Alfa Sucursal 10',1,'2024-02-10 00:00:00',NULL,NULL),(11,'Beta Sucursal 1',2,'2024-02-11 00:00:00',NULL,NULL),(12,'Beta Sucursal 2',2,'2024-02-12 00:00:00',NULL,NULL),(13,'Beta Sucursal 3',2,'2024-02-13 00:00:00',NULL,NULL),(14,'Beta Sucursal 4',2,'2024-02-14 00:00:00',NULL,NULL),(15,'Beta Sucursal 5',2,'2024-02-15 00:00:00',NULL,NULL),(16,'Beta Sucursal 6',2,'2024-02-16 00:00:00',NULL,NULL),(17,'Beta Sucursal 7',2,'2024-02-17 00:00:00',NULL,NULL),(18,'Beta Sucursal 8',2,'2024-02-18 00:00:00',NULL,NULL),(19,'Beta Sucursal 9',2,'2024-02-19 00:00:00',NULL,NULL),(20,'Beta Sucursal 10',2,'2024-02-20 00:00:00',NULL,NULL),(21,'Gamma Sucursal 1',3,'2024-02-21 00:00:00',NULL,NULL),(22,'Gamma Sucursal 2',3,'2024-02-22 00:00:00',NULL,NULL),(23,'Gamma Sucursal 3',3,'2024-02-23 00:00:00',NULL,NULL),(24,'Gamma Sucursal 4',3,'2024-02-24 00:00:00',NULL,NULL),(25,'Gamma Sucursal 5',3,'2024-02-25 00:00:00',NULL,NULL),(26,'Gamma Sucursal 6',3,'2024-02-26 00:00:00',NULL,NULL),(27,'Gamma Sucursal 7',3,'2024-02-27 00:00:00',NULL,NULL),(28,'Gamma Sucursal 8',3,'2024-02-28 00:00:00',NULL,NULL),(29,'Gamma Sucursal 9',3,'2024-02-29 00:00:00',NULL,NULL),(30,'Gamma Sucursal 10',3,'2024-03-01 00:00:00',NULL,NULL),(31,'Delta Sucursal 1',4,'2024-03-02 00:00:00',NULL,NULL),(32,'Delta Sucursal 2',4,'2024-03-03 00:00:00',NULL,NULL),(33,'Delta Sucursal 3',4,'2024-03-04 00:00:00',NULL,NULL),(34,'Delta Sucursal 4',4,'2024-03-05 00:00:00',NULL,NULL),(35,'Delta Sucursal 5',4,'2024-03-06 00:00:00',NULL,NULL),(36,'Delta Sucursal 6',4,'2024-03-07 00:00:00',NULL,NULL),(37,'Delta Sucursal 7',4,'2024-03-08 00:00:00',NULL,NULL),(38,'Delta Sucursal 8',4,'2024-03-09 00:00:00',NULL,NULL),(39,'Delta Sucursal 9',4,'2024-03-10 00:00:00',NULL,NULL),(40,'Delta Sucursal 10',4,'2024-03-11 00:00:00',NULL,NULL);
/*!40000 ALTER TABLE `sucursales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-26  1:34:21
