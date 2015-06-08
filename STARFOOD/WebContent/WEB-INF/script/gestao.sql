-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: gestao
-- ------------------------------------------------------
-- Server version	5.6.24-log

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
-- Table structure for table `tb_caixa`
--

DROP TABLE IF EXISTS `tb_caixa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_caixa` (
  `Id_Caixa` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Produto` int(11) DEFAULT NULL,
  `Qtd_Produto` int(11) DEFAULT NULL,
  `Val_Venda` decimal(6,2) DEFAULT NULL,
  `Id_Form_Pag` int(11) DEFAULT NULL,
  `Data_Venda` datetime DEFAULT NULL,
  `Id_Funcionario` int(11) DEFAULT NULL,
  `Id_Solicitante` int(11) DEFAULT NULL,
  `Id_Pedido` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id_Caixa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_caixa`
--

LOCK TABLES `tb_caixa` WRITE;
/*!40000 ALTER TABLE `tb_caixa` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_caixa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_form_pag`
--

DROP TABLE IF EXISTS `tb_form_pag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_form_pag` (
  `Id_Form_Pag` int(11) NOT NULL AUTO_INCREMENT,
  `Descricao` varchar(10) DEFAULT NULL,
  `Taxa` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id_Form_Pag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_form_pag`
--

LOCK TABLES `tb_form_pag` WRITE;
/*!40000 ALTER TABLE `tb_form_pag` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_form_pag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_fornecedor`
--

DROP TABLE IF EXISTS `tb_fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_fornecedor` (
  `Id_Fornecedor` int(11) NOT NULL AUTO_INCREMENT,
  `Razao_Social` varchar(50) DEFAULT NULL,
  `Data_Cadastro` datetime DEFAULT NULL,
  `End_Fornecedor` varchar(70) DEFAULT NULL,
  `Tel_Fornecedor` int(9) DEFAULT NULL,
  `Cel_Fornecedor` int(9) DEFAULT NULL,
  `Email_Fornecedor` varchar(45) DEFAULT NULL,
  `CNPJ` int(14) DEFAULT NULL,
  `Inscr_Estadual` int(8) DEFAULT NULL,
  `Obs_Fornecedor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id_Fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_fornecedor`
--

LOCK TABLES `tb_fornecedor` WRITE;
/*!40000 ALTER TABLE `tb_fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_funcao`
--

DROP TABLE IF EXISTS `tb_funcao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_funcao` (
  `Id_Funcao` int(11) NOT NULL AUTO_INCREMENT,
  `Descricao` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`Id_Funcao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_funcao`
--

LOCK TABLES `tb_funcao` WRITE;
/*!40000 ALTER TABLE `tb_funcao` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_funcao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_funcionario`
--

DROP TABLE IF EXISTS `tb_funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_funcionario` (
  `Id_Funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `Nome_Funcionario` varchar(50) DEFAULT NULL,
  `Endereco_Func` varchar(60) DEFAULT NULL,
  `Tel_Funcionario` int(9) DEFAULT NULL,
  `Cel_Funcionario` int(9) DEFAULT NULL,
  `Email_Funcionario` varchar(70) DEFAULT NULL,
  `Data_Entrada` datetime DEFAULT NULL,
  `Data_Saida` datetime DEFAULT NULL,
  `Id_Funcao` int(11) DEFAULT NULL,
  `Password` varchar(10) DEFAULT NULL,
  `RG` int(9) DEFAULT NULL,
  `CPF` int(11) DEFAULT NULL,
  `Data_Nasc` datetime DEFAULT NULL,
  `Estado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id_Funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_funcionario`
--

LOCK TABLES `tb_funcionario` WRITE;
/*!40000 ALTER TABLE `tb_funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_id_pedido`
--

DROP TABLE IF EXISTS `tb_id_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_id_pedido` (
  `Id_Pedido` int(11) NOT NULL AUTO_INCREMENT,
  `Status` int(1) DEFAULT NULL,
  PRIMARY KEY (`Id_Pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_id_pedido`
--

LOCK TABLES `tb_id_pedido` WRITE;
/*!40000 ALTER TABLE `tb_id_pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_id_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_produtos`
--

DROP TABLE IF EXISTS `tb_produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_produtos` (
  `Id_Produtos` int(11) NOT NULL AUTO_INCREMENT,
  `Descri_Produto` varchar(45) DEFAULT NULL,
  `Qtd_Produto` int(11) DEFAULT NULL,
  `Volumetria` varchar(5) DEFAULT NULL,
  `Id_Fornecedor` int(11) DEFAULT NULL,
  `Dt_Compra` datetime DEFAULT NULL,
  `Dt_Validade` datetime DEFAULT NULL,
  `Val_Compra` decimal(6,2) DEFAULT NULL,
  `Val_Venda` decimal(6,2) DEFAULT NULL,
  `Barra_Produto` int(13) DEFAULT NULL,
  `Barra_Interna` int(13) DEFAULT NULL,
  `Copa_Cozinha` int(1) DEFAULT NULL,
  PRIMARY KEY (`Id_Produtos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_produtos`
--

LOCK TABLES `tb_produtos` WRITE;
/*!40000 ALTER TABLE `tb_produtos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_solicitante`
--

DROP TABLE IF EXISTS `tb_solicitante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_solicitante` (
  `Id_Solicitante` int(11) NOT NULL AUTO_INCREMENT,
  `Descricao` varchar(15) DEFAULT NULL,
  `Status` int(1) DEFAULT NULL,
  `Data_Pedido` datetime DEFAULT NULL,
  PRIMARY KEY (`Id_Solicitante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_solicitante`
--

LOCK TABLES `tb_solicitante` WRITE;
/*!40000 ALTER TABLE `tb_solicitante` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_solicitante` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-06 10:37:41
