-- phpMyAdmin SQL Dump
-- version 3.3.9.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Jun 10, 2015 as 04:11 AM
-- Versão do Servidor: 5.5.10
-- Versão do PHP: 5.3.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `japa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
  `for_id` int(11) NOT NULL AUTO_INCREMENT,
  `for_CNPJ` varchar(20) NOT NULL,
  `for_razao_social` varchar(50) NOT NULL,
  `for_nome_fantasia` varchar(40) NOT NULL,
  `for_inscricao_estadual` varchar(25) NOT NULL,
  `for_rua` varchar(25) NOT NULL,
  `for_numero` int(11) NOT NULL,
  `for_bairro` varchar(20) NOT NULL,
  `for_cidade` varchar(30) NOT NULL,
  `for_estado` varchar(15) NOT NULL,
  `for_email` varchar(30) NOT NULL,
  `for_telefone1` varchar(20) NOT NULL,
  `for_telefone2` varchar(20) NOT NULL,
  `for_celular` varchar(20) NOT NULL,
  `for_id_nextel` varchar(10) NOT NULL,
  `for_data_cadastro` varchar(10) NOT NULL,
  `for_nome_banco_1` varchar(10) NOT NULL,
  `for_agencia_1` varchar(10) NOT NULL,
  `for_conta_corrente_1` varchar(10) NOT NULL,
  `for_nome_banco_2` varchar(10) NOT NULL,
  `for_agencia_2` varchar(10) NOT NULL,
  `for_conta_corrente_2` varchar(10) NOT NULL,
  `for_vendedor` varchar(15) NOT NULL,
  `for_telefone_vendedor` varchar(20) NOT NULL,
  `for_email_vendedor` varchar(30) NOT NULL,
  `for_observacoes` varchar(100) NOT NULL,
  PRIMARY KEY (`for_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela `fornecedor`
--

