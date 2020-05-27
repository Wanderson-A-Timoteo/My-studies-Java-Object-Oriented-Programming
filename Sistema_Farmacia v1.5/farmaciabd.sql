-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 29-Ago-2019 às 21:19
-- Versão do servidor: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `farmaciabd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(120) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome`, `cpf`, `idade`, `endereco`) VALUES
(1, 'wanderson', '123.456.789-10', 25, 'Rua da Paz'),
(2, 'Jivago', '098.765.432.01', 40, 'Rua das Violetas'),
(3, 'Ryan', '433.765.343-76', 18, 'Rua das Orquideas'),
(4, 'João Paulo', '018.192.745-00', 29, 'Rua do Flamengo'),
(5, 'Jeane', '008.192.745-23', 18, 'Rua São Paulo'),
(6, 'Fabiane', '444.555.666-77', 29, 'Rua das Esmeraldas'),
(7, 'Beatriz', '434.546.124-66', 18, 'Av. Miguel Sutil');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL,
  `nome` varchar(120) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `salario` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_funcionario`, `nome`, `cpf`, `idade`, `endereco`, `salario`) VALUES
(1, 'Roberto', '534.668.123-09', 20, 'Rua Brasilia', 2000),
(2, 'Gloria', '102.394.756-11', 25, 'Rua das Margaridas', 1500),
(3, 'Sebastião', '456.210.369-87', 44, 'Rua Doze', 2300),
(4, 'Ana Clara', '000.111.222-77', 22, 'Rua Beijaflor', 1200),
(5, 'Waldemar', '432.532.764-00', 55, 'Rua California', 2300);

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `id_login` int(11) NOT NULL,
  `nome_login` varchar(120) DEFAULT NULL,
  `nick_login` varchar(120) DEFAULT NULL,
  `senha_login` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`id_login`, `nome_login`, `nick_login`, `senha_login`) VALUES
(1, 'Admin', 'Admin', 'Admin');

-- --------------------------------------------------------

--
-- Estrutura da tabela `medicamento`
--

CREATE TABLE `medicamento` (
  `id_medicamento` int(11) NOT NULL,
  `nome_medicamento` varchar(120) DEFAULT NULL,
  `preco_custo` double DEFAULT NULL,
  `preco_venda` double DEFAULT NULL,
  `fornecedor_lab` varchar(120) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `medicamento`
--

INSERT INTO `medicamento` (`id_medicamento`, `nome_medicamento`, `preco_custo`, `preco_venda`, `fornecedor_lab`) VALUES
(1, 'Aspirina', 5, 7, 'MedLab'),
(2, 'DorFlex', 8, 10, 'Medlim');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_funcionario`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_login`);

--
-- Indexes for table `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`id_medicamento`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id_login` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `medicamento`
--
ALTER TABLE `medicamento`
  MODIFY `id_medicamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
