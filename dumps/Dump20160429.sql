CREATE DATABASE  IF NOT EXISTS `treesupershop` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `treesupershop`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: localhost    Database: treesupershop
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `createlogin`
--

DROP TABLE IF EXISTS `createlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `createlogin` (
  `Name` varchar(20) NOT NULL,
  `FatherName` varchar(45) NOT NULL,
  `Distric` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Phone` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Image` varchar(60) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`Password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `createlogin`
--

LOCK TABLES `createlogin` WRITE;
/*!40000 ALTER TABLE `createlogin` DISABLE KEYS */;
INSERT INTO `createlogin` VALUES ('Rabiul','Nuruli','Bogra','Male','01989211528','rabiul@gmail.com','C:UsersRabiulDesktop7-4-2016200.jpg','rabiul@tree.com','1020304050'),('Rabiul','Nururl','Bogra','Male','01989211528','rabiul@gmail.com','C:Users\robiDesktopMY_ProjectSuperShopmypic200.jpg','rrr@rrr.rrr','112233445566'),('gvdfgdf','dfgdfg','Bogra','Male','11111122222','dfgdfg@dfsdf.fff','C:UsersRabiulDesktop200.jpg','ewww@dfdf.ccc','12112121212'),('Rabiul Islam','Nurul Islam','Borishal','Male','12345678912','asghdf@jhg.vvv','200.jpg','sdgh@fjk.vvv','1235222221'),('rabiul islam','errwerw','Rajshahi','Male','11111111111','asds@dfs.ddd','200.jpg','aaa@cdf.sdf','14125282'),('hdfjgdjhg','dkfhgkhdfk','Pabna','Male','01321550123','dfggsz@dsdf.hjh','C:Users\robiDesktop7-4-2016SuperShopmypic200.jpg','aaa@gmai.vvv','2222222222'),('rabiul','nuruli','Rajshahi','Male','01989211528','aaa@bbb.ccc','C:Users\robiDesktopMY_ProjectSuperShopmypic200.jpg','aaa@bbb.ccc','987654321'),('ruyeui','sdfsduify','Khulna','Male','11111111111','werwer@dssd.gdf','C:UsersRabiulDesktop200.jpg','werwer@dssd.gdf','sdfasdadfsfsdf'),('ieyirwuey','sdfd','Bogra','Male','qweqwe234','weqwe','dfgdgdfg','sdfsdfsdf','srrrr43'),('dkfjygiuertre','sdfddffdf','Khulna','Male','dfgdfg','weqwe','C:UsersRabiulDesktop200.jpg','sdfsdfrtert','srrrr43343333534');
/*!40000 ALTER TABLE `createlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `Id` int(30) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Purchase_Date` date NOT NULL,
  `Quantity` int(30) NOT NULL,
  `Price` double NOT NULL,
  `Category` varchar(45) NOT NULL,
  `Type` varchar(45) NOT NULL,
  `Country` varchar(45) NOT NULL,
  `Images` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (201,'Lux','2016-01-28',50,40,'Soap','Soap','India','LuxSoap.jpg'),(501,'Dano','2016-01-28',50,300,'SELECT CATEGORY','Milk powder','Australia','DANO-SLIM-NON-FAT-MILK-POWDER350GM-tk.293.jpg'),(601,'Parasut oil','2016-01-28',100,100,'OTHERS','oil','Bangladesh','parasutOil.jpg'),(701,'Head&Sholdires','2016-01-28',200,200,'OTHERS','Shampoo','India','head&SholdersShampoo.jpg'),(801,' Shankar Umbrella','2016-01-28',200,400,'OTHERS','Umbrella','Bangladesh','Umbrela.jpg');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales` (
  `Sales_Id` int(11) NOT NULL,
  `Pro_Id` int(11) NOT NULL,
  `Pro_Name` varchar(45) NOT NULL,
  `Price` double NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Net_Price` double NOT NULL,
  `Discount` double NOT NULL,
  `Vat` double NOT NULL,
  `Total_Price` double NOT NULL,
  `Purchase_Date` date NOT NULL,
  `Sales_Date` date NOT NULL,
  `Product_picture` varchar(60) NOT NULL,
  PRIMARY KEY (`Sales_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (1,201,'Lux',40,2,80,20,5,67.2,'2016-01-28','2016-01-28','LuxSoap.jpg'),(2,501,'Dano',300,1,300,10,5,283.5,'2016-01-28','2016-01-28','DANO-SLIM-NON-FAT-MILK-POWDER350GM-tk.293.jpg'),(3,601,'Parasut oil',100,2,200,5,5,199.5,'2016-01-28','2016-01-28','parasutOil.jpg');
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `treeemployee`
--

DROP TABLE IF EXISTS `treeemployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `treeemployee` (
  `Id` int(20) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `JobTitle` varchar(45) NOT NULL,
  `Department` varchar(45) NOT NULL,
  `Salary` double NOT NULL,
  `Phone` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Image` varchar(60) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `treeemployee`
--

LOCK TABLES `treeemployee` WRITE;
/*!40000 ALTER TABLE `treeemployee` DISABLE KEYS */;
INSERT INTO `treeemployee` VALUES (101,'Md. Rabiul Islam','Male','Accounts Manager','Sales',40000,'01989211528','rabiul11@gmail.com','Rabiul.jpg'),(102,'Md. Ratul Jannat','Male','Sales Manager','Sales',20000,'01919211308','rtuljannt1986@gmail.com','ratul pic.jpg'),(103,'Md. Shadat Hossain','Male','Production Superviser','Production',20000,'01729351688','sahadat222@gmail.com','sahadat.jpg'),(104,'Md. Foysal Ahmmed','Male','Sales Manager','Sales',40000,'01729351792','fosal@yhoo.com','Foysal.png'),(105,' Asma binte joti','Female','Accounts Manager','Sales',40000,'01629351632','asamjoti@gmail.com','Asma joti.jpg'),(106,'Md. Zillur Rahman saon','Male','Superviser','Sales',10000,'01989333891','saon@gmail.com','Saoun.jpg');
/*!40000 ALTER TABLE `treeemployee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-29  0:34:54
