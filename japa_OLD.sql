-- phpMyAdmin SQL Dump
-- version 3.3.9.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Jun 12, 2015 as 02:35 PM
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
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `usu_id` int(11) NOT NULL AUTO_INCREMENT,
  `usu_nome` varchar(45) DEFAULT NULL,
  `usu_usuario` varchar(50) NOT NULL,
  `usu_senha` varchar(50) NOT NULL,
  `usu_setor` varchar(20) DEFAULT NULL,
  `usu_acesso` char(1) DEFAULT NULL COMMENT '0 = Administrativo    -       1 = Gerente',
  PRIMARY KEY (`usu_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`usu_id`, `usu_nome`, `usu_usuario`, `usu_senha`, `usu_setor`, `usu_acesso`) VALUES
(8, 'Henrique Nunweiler', 'nunweiler', '12345', 'Invicta', '1'),
(10, 'Matheus Henrique', 'matherique', '12345', 'Programação', '1'),
(11, 'Viviane', 'viviane', '12345', 'Financeiro', '1');
