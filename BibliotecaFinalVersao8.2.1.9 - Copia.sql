-- phpMyAdmin SQL Dump
-- version 4.7.1
-- https://www.phpmyadmin.net/
--
-- Host: sql10.freemysqlhosting.net
-- Tempo de geração: 15/09/2017 às 01:39
-- Versão do servidor: 5.5.53-0ubuntu0.14.04.1
-- Versão do PHP: 7.0.22-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sql10193673`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `aluno`
--

CREATE TABLE `aluno` (
  `id_aluno` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `cpf` char(15) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `aluno`
--

INSERT INTO `aluno` (`id_aluno`, `nome`, `idade`, `cpf`, `endereco`) VALUES
(2, 'Erik Gay', 24, '12345678911', 'Teste de endereço'),
(7, 'Erik Gay', 19950215, '12345678911', 'Teste de endereço'),
(8, 'Erik Gay', 21, '12345678911', 'Teste de endereço'),
(9, 'Erik Gay', 20, '12345678911', 'Teste de endereço'),
(68, 'meyr fernando da silva', 21, '008.778.631-13', 'jransnlaksndlkasdklj'),
(69, 'meyr fernando da silva', 21, '008.778.631-13', 'jransnlaksndlkasdklj'),
(72, 'meyr silva', 21, '020.202.020-20', 'asjkdjaksjdlk'),
(100, 'PEDRO', 11, '111.111.111-11', 'teste333');

-- --------------------------------------------------------

--
-- Estrutura para tabela `emprestimo`
--

CREATE TABLE `emprestimo` (
  `id_emprestimo` int(11) NOT NULL,
  `id_aluno` int(11) NOT NULL,
  `id_livro` int(11) NOT NULL,
  `dataemprestimo` date DEFAULT NULL,
  `datadevolucao` date DEFAULT NULL,
  `multa` double(7,2) DEFAULT '0.00',
  `id_funcionario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `emprestimo`
--

INSERT INTO `emprestimo` (`id_emprestimo`, `id_aluno`, `id_livro`, `dataemprestimo`, `datadevolucao`, `multa`, `id_funcionario`) VALUES
(2, 8, 3, '2017-01-12', '2017-08-15', 3.99, NULL),
(3, 9, 3, '2017-01-12', '2017-08-15', 3.99, NULL),
(5, 100, 2, '2001-01-01', NULL, 3.99, NULL),
(6, 8, 2, '1991-10-10', NULL, 3.99, 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cpf` char(15) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `salario` int(11) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `funcionario`
--

INSERT INTO `funcionario` (`id_funcionario`, `nome`, `cpf`, `endereco`, `salario`, `idade`) VALUES
(1, 'meyr dois', '234523452435', 'aqui', 1000, 1),
(2, 'meyr dois', '234523452435', 'aqui', 1000, 1),
(3, 'meyr dois', '234523452435', 'aqui', 1000, 1),
(4, 'ERIK', '333.333.333-33', 'UFMT', 50000, 24);

-- --------------------------------------------------------

--
-- Estrutura para tabela `livro`
--

CREATE TABLE `livro` (
  `id_livro` int(11) NOT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `editora` varchar(255) DEFAULT NULL,
  `edicao` int(11) DEFAULT NULL,
  `datalancamento` int(11) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `livro`
--

INSERT INTO `livro` (`id_livro`, `autor`, `editora`, `edicao`, `datalancamento`, `titulo`) VALUES
(2, 'Naruto', 'Meyr Corporation', 1, 20071124, 'As Aventuras de Meyr'),
(3, 'Naruto', 'Editora do Meyr Doido', 1, 20071124, 'As Aventuras de Meyr'),
(4, 'tesouro', 'ja era', 2, 20160101, 'reliquia'),
(5, 'de pijama', 'sense8', 30, 2018, 'banana'),
(6, 'teste', 'teste', 1, 100, 'teste');

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`id_aluno`);

--
-- Índices de tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  ADD PRIMARY KEY (`id_emprestimo`),
  ADD KEY `fk_emprestimo_aluno` (`id_aluno`),
  ADD KEY `fk_emprestimo_livro` (`id_livro`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_funcionario`);

--
-- Índices de tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`id_livro`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `aluno`
--
ALTER TABLE `aluno`
  MODIFY `id_aluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;
--
-- AUTO_INCREMENT de tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  MODIFY `id_emprestimo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `id_livro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `emprestimo`
--
ALTER TABLE `emprestimo`
  ADD CONSTRAINT `fk_emprestimo_aluno` FOREIGN KEY (`id_aluno`) REFERENCES `aluno` (`id_aluno`),
  ADD CONSTRAINT `fk_emprestimo_livro` FOREIGN KEY (`id_livro`) REFERENCES `livro` (`id_livro`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
