-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.6.16 - MySQL Community Server (GPL)
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- Copiando dados para a tabela japa.cliente: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
REPLACE INTO `cliente` (`cli_id`, `cli_nome`, `cli_data_nascimento`, `cli_rg`, `cli_cpf`, `cli_cnpj`, `cli_nome_fantasia`, `cli_razao_social`, `cli_inscricao_estadual`, `cli_rua`, `cli_numero`, `cli_bairro`, `cli_cidade`, `cli_cep`, `cli_telefone1`, `cli_telefone2`, `cli_celular`, `cli_id_nextel`, `cli_email`, `cli_nome_responsavel`, `cli_data_cadastro`, `cli_porcentagem_desconto`, `cli_limite_compra`, `cli_observacoes`, `fk_ram_id`) VALUES
	(2, 'Matheus Henrique dos Santos', '18/11/2015', '383891334', '123123123', '11.111.111/1111-11', 'WebChrnos', 'WebChronos TI', '123', 'Rua Jose Pacini', 137, 'Topolandia', 'Sao Sebastiao', '11600-000', '(12)9976-4452', '(12)1111-1111', '(11)1111-1111', '12qs', 'matherique@gmail.com', 'Matheus', '10/06/2015', '10%', 100, 'SEILKSDASKDKASDKASDASDASDASD', 1),
	(4, 'Matheus Henrique', '18/11/2015', '383891334', '123123', '11.111.111/1111-11', 'WebChrnos', 'WebChronos TI', '123', 'Rua Jose Pacini', 137, 'Topolandia', 'Sao Sebastiao', '11600-000', '(12)9976-4452', '(12)1111-1111', '(11)1111-1111', '12qs', 'matherique@gmail.com', '', '', '10%', 100, 'SEILKSDASKDKASDKASDASDASDASD', 1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Copiando dados para a tabela japa.fornecedor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;

-- Copiando dados para a tabela japa.usuario: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
REPLACE INTO `usuario` (`usu_id`, `usu_nome`, `usu_usuario`, `usu_senha`, `usu_setor`, `usu_acesso`) VALUES
	(6, 'Ana Paula', 'ana', '12345', 'Diretoria', '1'),
	(8, 'Henrique Nunweiler', 'nunweiler', '12345', 'Invicta', '1'),
	(9, 'Julio Cesar', 'julio', '12345', 'Programação', '1'),
	(10, 'Matheus Henrique', 'matherique', '12345', 'Programação', '1');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
