-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 06-Jul-2015 às 18:35
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `japa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `cli_id` int(11) NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(30) NOT NULL,
  `cli_data_nascimento` varchar(10) DEFAULT NULL,
  `cli_rg` varchar(15) DEFAULT NULL,
  `cli_cpf` varchar(15) NOT NULL,
  `cli_cnpj` varchar(20) DEFAULT NULL,
  `cli_nome_fantasia` varchar(45) DEFAULT NULL,
  `cli_razao_social` varchar(45) DEFAULT NULL,
  `cli_inscricao_estadual` varchar(25) NOT NULL,
  `cli_rua` varchar(30) DEFAULT NULL,
  `cli_numero` int(11) DEFAULT NULL,
  `cli_bairro` varchar(30) DEFAULT NULL,
  `cli_cidade` varchar(30) DEFAULT NULL,
  `cli_cep` varchar(10) DEFAULT NULL,
  `cli_telefone1` varchar(20) DEFAULT NULL,
  `cli_telefone2` varchar(20) DEFAULT NULL,
  `cli_celular` varchar(20) DEFAULT NULL,
  `cli_id_nextel` varchar(10) DEFAULT NULL,
  `cli_email` varchar(45) DEFAULT NULL,
  `cli_nome_responsavel` varchar(30) NOT NULL,
  `cli_data_cadastro` varchar(10) NOT NULL,
  `cli_porcentagem_desconto` varchar(5) DEFAULT NULL,
  `cli_limite_compra` double DEFAULT NULL,
  `cli_observacoes` varchar(100) DEFAULT NULL,
  `fk_ram_id` int(11) DEFAULT NULL COMMENT 'Chave estrangeira de ramos de atividade da tabela ramo_atividade.',
  PRIMARY KEY (`cli_id`,`cli_cpf`,`cli_nome_responsavel`,`cli_data_cadastro`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`cli_id`, `cli_nome`, `cli_data_nascimento`, `cli_rg`, `cli_cpf`, `cli_cnpj`, `cli_nome_fantasia`, `cli_razao_social`, `cli_inscricao_estadual`, `cli_rua`, `cli_numero`, `cli_bairro`, `cli_cidade`, `cli_cep`, `cli_telefone1`, `cli_telefone2`, `cli_celular`, `cli_id_nextel`, `cli_email`, `cli_nome_responsavel`, `cli_data_cadastro`, `cli_porcentagem_desconto`, `cli_limite_compra`, `cli_observacoes`, `fk_ram_id`) VALUES
(2, 'Matheus Henrique', '18/11/2015', '383891334', '123123123', '11.111.111/1111-11', 'WebChrnos', 'WebChronos TI', '123', 'Rua Jose Pacini', 137, 'Topolandia', 'Sao Sebastiao', '11600-000', '(12)9976-4452', '(12)1111-1111', '(11)1111-1111', '12qs', 'matherique@gmail.com', 'Matheus', '10/06/2015', '10%', 100, 'SEILKSDASKDKASDKASDASDASDASD', 1),
(4, 'Matheus Henrique', '18/11/2015', '383891334', '123123', '11.111.111/1111-11', 'WebChrnos', 'WebChronos TI', '123', 'Rua Jose Pacini', 137, 'Topolandia', 'Sao Sebastiao', '11600-000', '(12)9976-4452', '(12)1111-1111', '(11)1111-1111', '12qs', 'matherique@gmail.com', '', '', '10%', 100, 'SEILKSDASKDKASDKASDASDASDASD', 1);

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
  `for_numero` varchar(10) NOT NULL,
  `for_bairro` varchar(20) NOT NULL,
  `for_cidade` varchar(30) NOT NULL,
  `for_estado` varchar(15) NOT NULL,
  `for_cep` varchar(15) NOT NULL,
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
  `for_nome_banco_3` varchar(10) NOT NULL,
  `for_agencia_3` varchar(10) NOT NULL,
  `for_conta_corrente_3` varchar(10) NOT NULL,
  `for_vendedor` varchar(15) NOT NULL,
  `for_telefone_vendedor` varchar(20) NOT NULL,
  `for_email_vendedor` varchar(30) NOT NULL,
  `for_observacoes` varchar(100) NOT NULL,
  PRIMARY KEY (`for_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`usu_id`, `usu_nome`, `usu_usuario`, `usu_senha`, `usu_setor`, `usu_acesso`) VALUES
(6, 'Ana Paula', 'ana', '12345', 'Diretoria', '1'),
(8, 'Henrique Nunweiler', 'nunweiler', '12345', 'Invicta', '1'),
(9, 'Julio Cesar', 'julio', '12345', 'Programação', '1'),
(10, 'Matheus Henrique', 'matherique', '12345', 'Programação', '1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
