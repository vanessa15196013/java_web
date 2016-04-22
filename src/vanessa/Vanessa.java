-- MySQL dump 10.11
--
-- Host: localhost    Database: vanessa
-- ------------------------------------------------------
-- Server version	5.0.91-community-nt

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `POSTALCODE` varchar(255) NOT NULL,
  `NICKNAME` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `STATEOFADDRESS` varchar(100) NOT NULL,
  `NUMBER` int(11) NOT NULL,
  `COUNTRY` varchar(255) NOT NULL,
  `userOf` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_ADDRESS_userOf` (`userOf`),
  CONSTRAINT `FK_ADDRESS_userOf` FOREIGN KEY (`userOf`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (501,'80240-240','Home','Carneiro Lobo','PR',255,'BRASIL',251);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bonus`
--

DROP TABLE IF EXISTS `bonus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bonus` (
  `id` int(11) NOT NULL,
  `cupom` varchar(255) NOT NULL,
  `percent` int(11) default NULL,
  `value` decimal(38,0) default NULL,
  `PRODUCT_id` int(11) default NULL,
  UNIQUE KEY `uidx_cupom` (`cupom`),
  KEY `FK_BONUS_PRODUCT_id` (`PRODUCT_id`),
  CONSTRAINT `FK_BONUS_PRODUCT_id` FOREIGN KEY (`PRODUCT_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bonus`
--

LOCK TABLES `bonus` WRITE;
/*!40000 ALTER TABLE `bonus` DISABLE KEYS */;
INSERT INTO `bonus` VALUES (1376,'1313aaef68c5a591e002fa5632738815',0,'10',202),(1706,'1684231ac7cec1ba00c3b280239392c',0,'10',202),(1387,'1ab4f04fc3cb52d3887ec01b9e1b5408',0,'10',202),(1302,'1b2c7657bf64c0fa2133d52d933cc8d5',0,'10',202),(1552,'1b335ee37fd8ef7fa0fda1f2a90e5cc9',0,'10',202),(1967,'1c012ae329b69194166994e4b68847a7',0,'10',202),(1378,'1e1eeceef002d7f413a32695502233b9',0,'10',202),(1379,'21754e4fd878f07e20683bbdab1b22ec',0,'10',202),(1801,'25e1f7743b564d43abc2388c66a81db0',0,'10',202),(1707,'25fab13ae378332ce39b4e03b90ac2a2',0,'10',202),(1374,'2713c70df8a460c021cef0695f31bb2f',0,'10',202),(1956,'2df6ed9bbdb0d08daeb9f9f8a3e4e7cf',0,'10',202),(1959,'303da6cd03c22e5870a331413a56f5cc',0,'10',202),(2001,'32d3ef67410dc7323215e30644606216',0,'10',202),(1390,'33e2cd25c7027f336f022e5d7b86ecc4',0,'10',202),(1601,'340d2deaf8e4a03ad1374b3d8d28ab17',0,'10',202),(1380,'34cc43939015621a1108c10315f03e05',0,'10',202),(1851,'352a06ba6a08deddb8ce0bff3f0fadd8',0,'10',202),(1371,'358465225981f799e5da3aac7ebd2137',0,'10',202),(1357,'35f66040464f36babda7692d9ca419a3',0,'10',202),(901,'3eba3313a3e0c6ff241d5531879ba060',0,'40',101),(2151,'40f719ff8f4e861bc3899a5ad96fd06c',0,'10',202),(1151,'444d6fe9adfa02c4e2dbe7c6ef9fbb20',15,'0',NULL),(1363,'4497efaf98d282859f8c3730f420b5e1',0,'10',202),(1701,'458941d9742126fb68f0ec8faecc7cc2',0,'10',202),(1385,'48bba07fb384a5bdcfa041a5797719bb',0,'10',202),(1353,'4a9b9b425a143a25299f08ca388a42fd',0,'10',202),(1351,'4b1b6eb3e8278711b0fe31803fbab10a',0,'10',202),(2051,'4faa464922075afa904537bb7266191b',0,'10',202),(2351,'4ffb03570e5f7a980c539430501083fc',0,'10',202),(2103,'52930815839b1e9ca4ae4b5abb1e2f99',0,'10',202),(1901,'52f74aca980e1b94ba77cd38ea06db46',0,'10',202),(1401,'537b4682482539afbd119679c8a7ea9c',0,'10',202),(1201,'5417216b07e5404cdc90db60fbd11409',0,'50',NULL),(1396,'545f941110c18b1b5ebb34a51589721a',0,'10',202),(1301,'54a9b98c447985c4c672330ef2970ef2',0,'10',202),(1382,'54cd735b42e0e9e5d1f81dc462ff57b2',0,'10',202),(1384,'5517f4eb00e7b54c87c5412db4e6df3e',0,'10',202),(1958,'571e6c58b57a9bb29675c0b0c1759fa2',0,'10',202),(1358,'58d7eb75445d917bca21880e9e343bfe',0,'10',202),(1386,'5dad15ec4546ebbf420090143652de08',0,'10',202),(1356,'5e9510d9b34a581325e88b013e2b587b',0,'10',202),(1952,'5fb06e65e147d0c2f74d1139b00d7dfc',0,'10',202),(1373,'605796077dc2309323542a5f0667e259',0,'10',202),(1389,'6486e8aba9aa0d8ab0908f7afa27ec07',0,'10',202),(1752,'662473ffce493aa2ae48844f4b0e0e19',0,'10',202),(2002,'66717d25f39957bb245486824cca8f61',0,'10',202),(1651,'69b63cf5cb23ef808c838a37b255ad85',0,'10',202),(1369,'6b81a0fb1c3a555e06cf981f4401e0d',0,'10',202),(1702,'6cc47d492923336f6adffbe89ff020aa',0,'10',202),(1362,'6d6bd4aded55dff3943e7d5866a70cf5',0,'10',202),(1365,'6f9c8504f04e06e1ce8e36c8fab430f4',0,'10',202),(951,'7012497310cd44f765e5c55869453a24',25,'0',401),(2052,'7083d1223981fbdefe494289788a7b2a',0,'10',202),(1955,'70ae55f1dbea9a3b6df76c50a5f2fff4',0,'10',202),(1355,'7132d732d937b2dc3a29900b0e64ff48',0,'10',202),(1553,'74d07f1ff8105ffb53e599951b3b4624',0,'10',202),(1383,'77a6d8037f18436388a4b76de333230',0,'10',202),(1705,'787120597fee7dabcf6e7d1d5584d1b5',0,'10',202),(1372,'7a8160dd727cb36c7a839a51adcf8122',0,'10',202),(1400,'7b6de729c53ba6aa1004d5ff33cf9960',0,'10',202),(1366,'7b750360af604e791970727d9d6f13ba',0,'10',202),(1501,'7bf23ddcc9d2f6abe8a4d27fa063cd65',0,'10',202),(1392,'7fa41e73ba7994691f8b0c5521176cc6',0,'10',202),(952,'80923eacb1de1b5f98a68e16d4ab73ee',0,'3',202),(1393,'82cd915c1cb885a7198c075eda5d39da',0,'10',202),(1709,'8ad9db78d456877d794246a003092776',0,'10',202),(1403,'8b265f483ccb7a3fc77eea95fe1722b5',0,'10',202),(2102,'8d457ce67b2e9da1ba399aac0669c507',0,'10',202),(1961,'8de5742f2754e02787b4a337b08ae457',0,'10',202),(1395,'8dfd90108380fa84e7212ef4e3fa881a',0,'10',202),(1354,'8ef608a34ac6fdbc61c9f35b980d512f',0,'10',202),(1962,'8f1645ab6ee7f51e2b1027c0b1d40802',0,'10',202),(1381,'90d1ecf5b87cf0778bd9b5a5597e0a7b',0,'10',202),(1361,'95705833f7b7bedbde79150020c14204',0,'10',202),(1391,'95e9c3faff84dd27d00268180e7a33aa',0,'10',202),(1399,'a0a93b1d46773d640889a226a6ad295a',0,'10',202),(1965,'a1b1c0d46b14971a1f395746e0a50bdd',0,'10',202),(1394,'a40afa0fa87bbf2293752f13a8e721f1',0,'10',202),(1251,'a52ac0797eda34b7217e0589776280c2',0,'10',202),(1964,'a5aa1319848a62030bbf2fc061867df3',0,'10',202),(1751,'a5be3a8517f6a7e0d4b533fab2fa324a',0,'10',202),(1452,'a6a882c4c0582c66fcec6a2a93f93223',0,'10',202),(2104,'a7b37ad476f23bc5bb398114a489a1a5',0,'10',202),(1703,'a7ca00a66411c875908a3da4465da2a0',0,'10',202),(1951,'a90038596e5548acbee2f7a37b5c5c55',0,'10',202),(1375,'aa91e7e8a67f6123e7b6c9185a251f27',0,'10',202),(1966,'ab089fe2ba6f44b92195904a733d729b',0,'10',202),(1802,'abff97b272c502d045e7e9721af8d513',0,'10',202),(1968,'acea341342657d3afbd1534547d2e6',0,'10',202),(1704,'aeaead6b18329635713ab1ac3e4bce99',0,'10',202),(1367,'afa1889f6621dfbacce19f29ef023f19',0,'10',202),(1388,'bcc1b15272fa26e3eb5dcf077de7fe3a',0,'10',202),(1710,'bdd6529c66fd576f8b6b242986ed7664',0,'10',202),(1711,'c1906110853de1d664d014e7f710077',0,'10',202),(1252,'c22d2c94669b05057b81a5074f9f6c8a',0,'10',202),(1712,'c3327ff6fc977c41dc40e062d735752d',0,'10',202),(1360,'c3d46bf02107f7c8360528acef5e2ae0',0,'10',202),(2152,'c408154f26f9cc4faaaaa759e0627092',0,'10',202),(1969,'c6367801b671f5841afc15a0e2907e35',0,'10',202),(1001,'c99a3a757bb34e3a6d56f3e0dd495765',50,'0',301),(1402,'cb2cbe59985007d09f720e12ad14497c',0,'10',202),(1957,'cf2c16a1c28ea37ea276a072bc20af07',0,'10',202),(1554,'d028a12a56bca44a68f521eb91879e19',0,'10',202),(1352,'d53905f097ae28502df24992c21fe0e6',0,'10',202),(1954,'d76b7615d5ca909490cac0eaf122c3a9',0,'10',202),(1451,'d8661b8ab81da98357b86a6077ab1c4b',0,'10',202),(2101,'d97f1fb1c01df6b12c9efb02a5c9f394',0,'10',202),(1953,'da3a4a82c397a034d99888b24feeba34',0,'10',202),(1551,'daedd5d5d677fc8c5f122c1d77926d2d',0,'10',202),(1970,'e1ae1379ae85159418ae39c72e534149',0,'10',202),(2352,'eb00febd8d194f406470c05c6efd205e',0,'10',202),(1368,'eb9ebbbbb199579bed86584cef815f',0,'10',202),(1963,'ec7fba66c83ae27cecb87d6076c77572',0,'10',202),(1359,'efcb0b6f935889e960a89eb1a64c0cbb',0,'10',202),(1708,'f16c5c32d19cf0a1d980b943cae8047b',0,'10',202),(1398,'fbcb4e93ae39d1c7f79ec1139c4f9bc5',0,'10',202),(1370,'fbea49e6a8a625ed500dfead2836095f',0,'10',202),(1960,'fdfdf2e06e6a23e1c7d86f57644bafd8',0,'10',202),(1364,'fea213e76a9db3b80c81bb4d5ae90b47',0,'10',202),(1397,'ff31d156553abf80d42da7c68c6e456',0,'10',202),(1377,'ff4374d95202cbbf8962520bb55cae67',0,'10',202);
/*!40000 ALTER TABLE `bonus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `callonavaliable`
--

DROP TABLE IF EXISTS `callonavaliable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `callonavaliable` (
  `id` int(11) NOT NULL,
  `EMAIL` varchar(255) default NULL,
  `CALLED` tinyint(1) default '0',
  `PRODUCT_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_CALLONAVALIABLE_PRODUCT_id` (`PRODUCT_id`),
  CONSTRAINT `FK_CALLONAVALIABLE_PRODUCT_id` FOREIGN KEY (`PRODUCT_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `callonavaliable`
--

LOCK TABLES `callonavaliable` WRITE;
/*!40000 ALTER TABLE `callonavaliable` DISABLE KEYS */;
INSERT INTO `callonavaliable` VALUES (402,'teste.vanessa@teste.com.br',1,401),(451,'teste.vanessa@teste.com.br',0,201);
/*!40000 ALTER TABLE `callonavaliable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `ACTIVE` tinyint(1) default '0',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Pet',1),(2,'Doctors',1),(3,'Eletronic',1),(4,'Cell Phones',1);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `creditcard`
--

DROP TABLE IF EXISTS `creditcard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `creditcard` (
  `id` int(11) NOT NULL,
  `FLAG` varchar(255) NOT NULL,
  `TIMES` int(11) NOT NULL,
  `DATEOFVALIDATION` date NOT NULL,
  `NAMEOFCARDOWNER` varchar(255) NOT NULL,
  `NUMBER` varchar(255) NOT NULL,
  `USEROF_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_CREDITCARD_USEROF_id` (`USEROF_id`),
  CONSTRAINT `FK_CREDITCARD_USEROF_id` FOREIGN KEY (`USEROF_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `creditcard`
--

LOCK TABLES `creditcard` WRITE;
/*!40000 ALTER TABLE `creditcard` DISABLE KEYS */;
INSERT INTO `creditcard` VALUES (752,'MASTERCARD',10,'1982-01-11','DYEGO CARMO','9182731987321',NULL),(803,'VISA',10,'2012-01-11','DYEGO CARMO','9182731987321',NULL);
/*!40000 ALTER TABLE `creditcard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `letter`
--

DROP TABLE IF EXISTS `letter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `letter` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `email` varchar(255) default NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2302 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `letter`
--

LOCK TABLES `letter` WRITE;
/*!40000 ALTER TABLE `letter` DISABLE KEYS */;
INSERT INTO `letter` VALUES (2252,'Maria do Carmo','teste.vanessa@teste.com.br'),(2253,'Joana Joaquina','teste.vanessa@teste.com.br'),(2254,'Carlos Moura','teste.vanessa@teste.com.br'),(2301,'Kiko das Neves','teste.vanessa@teste.com.br');
/*!40000 ALTER TABLE `letter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `SPEC` varchar(255) NOT NULL,
  `STOCK` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `COST` decimal(38,0) NOT NULL,
  `CATEGORY_id` int(11) default NULL,
  `photourl` text,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `NAME` (`NAME`),
  KEY `FK_PRODUCT_CATEGORY_id` (`CATEGORY_id`),
  CONSTRAINT `FK_PRODUCT_CATEGORY_id` FOREIGN KEY (`CATEGORY_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (101,'Cell phone with Linux OS',1000,'Motorola A210','100',4,'http://img.gsmarena.com/vv/pics/amoi/amoi_a210_00.jpg'),(102,'A bio bone is a natural bone for your pet and the cost is very low',5000,'Bio Bone 500g','5',1,'http://ilex.cbs.dk/corporatedk/CorporateDK/img/dog_bone.gif'),(201,'A food to your dog experiment a new way to kill the hungry.',0,'Master Food 1,5 kg','30',1,NULL),(202,'Please  use this to save the GREEN with GREEN PEACE !',40,'Save Green T-shirt','15',2,'http://images1.cpcache.com/product/358275981v1_480x480_Front_Color-Green.jpg'),(301,'The perfect place for your DOG !',1,'Dog Place','15',1,'http://www.thefishandpetpad.co.uk/acatalog/place_mat_check.jpg'),(401,'The Perfect TV to see the Record TV !',10,'LCD 40\" TV','5000',3,'http://www.our-picks.com/wp-content/uploads/2007/08/sharp_lcd_tv.jpg');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sell`
--

DROP TABLE IF EXISTS `sell`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sell` (
  `id` int(11) NOT NULL,
  `TOTAL` decimal(38,0) NOT NULL,
  `STATUS` varchar(255) NOT NULL,
  `CLOSED` tinyint(1) default '0',
  `DATEOFSELL` date NOT NULL,
  `USEROF_id` int(11) default NULL,
  `CREDITCARD_id` int(11) default NULL,
  `ADDRESSTOSEND_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_SELL_ADDRESSTOSEND_id` (`ADDRESSTOSEND_id`),
  KEY `FK_SELL_CREDITCARD_id` (`CREDITCARD_id`),
  KEY `FK_SELL_USEROF_id` (`USEROF_id`),
  CONSTRAINT `FK_SELL_ADDRESSTOSEND_id` FOREIGN KEY (`ADDRESSTOSEND_id`) REFERENCES `address` (`id`),
  CONSTRAINT `FK_SELL_CREDITCARD_id` FOREIGN KEY (`CREDITCARD_id`) REFERENCES `creditcard` (`id`),
  CONSTRAINT `FK_SELL_USEROF_id` FOREIGN KEY (`USEROF_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sell`
--

LOCK TABLES `sell` WRITE;
/*!40000 ALTER TABLE `sell` DISABLE KEYS */;
INSERT INTO `sell` VALUES (551,'5','DONE',0,'2010-08-01',251,NULL,501),(601,'20','INPROGRESS',0,'2010-08-01',251,NULL,501),(651,'115','SENDED',0,'2010-08-01',251,NULL,501),(701,'115','INPROGRESS',0,'2010-08-01',251,NULL,501),(751,'15','INPROGRESS',0,'2010-08-02',251,752,501),(801,'15','INPROGRESS',0,'2010-08-02',251,803,501),(1051,'30','INPROGRESS',0,'2010-08-02',251,NULL,501),(1101,'15','INPROGRESS',0,'2010-08-02',251,NULL,501);
/*!40000 ALTER TABLE `sell` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellitem`
--

DROP TABLE IF EXISTS `sellitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sellitem` (
  `id` int(11) NOT NULL,
  `QNT` int(11) NOT NULL,
  `SELL_id` int(11) default NULL,
  `PRODUCT_id` int(11) default NULL,
  `BONUS_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_SELLITEM_PRODUCT_id` (`PRODUCT_id`),
  KEY `FK_SELLITEM_SELL_id` (`SELL_id`),
  KEY `idxbonus` (`BONUS_id`),
  CONSTRAINT `FK_SELLITEM_PRODUCT_id` FOREIGN KEY (`PRODUCT_id`) REFERENCES `product` (`id`),
  CONSTRAINT `FK_SELLITEM_SELL_id` FOREIGN KEY (`SELL_id`) REFERENCES `sell` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellitem`
--

LOCK TABLES `sellitem` WRITE;
/*!40000 ALTER TABLE `sellitem` DISABLE KEYS */;
INSERT INTO `sellitem` VALUES (552,1,551,102,NULL),(602,1,601,202,NULL),(603,1,601,102,NULL),(652,1,651,101,NULL),(653,1,651,301,NULL),(702,1,701,202,NULL),(703,1,701,101,NULL),(753,1,751,202,NULL),(802,1,801,301,NULL),(1052,1,1051,301,NULL),(1053,1,1051,202,NULL),(1102,1,1101,301,1001);
/*!40000 ALTER TABLE `sellitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sequence`
--

DROP TABLE IF EXISTS `sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) default NULL,
  PRIMARY KEY  (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequence`
--

LOCK TABLES `sequence` WRITE;
/*!40000 ALTER TABLE `sequence` DISABLE KEYS */;
INSERT INTO `sequence` VALUES ('SEQ_GEN','2400');
/*!40000 ALTER TABLE `sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `USERNAME` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(32) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (251,'vanessa','teste.vanessa@teste.com.br','Vanessa dos Santos Alves','123'),(252,'keiti','teste.vanessa@teste.com.br','Keiti Santos','123123');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

