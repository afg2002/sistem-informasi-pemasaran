-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jul 23, 2023 at 05:12 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pemasaran`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('user1', 'pass1'),
('user2', 'pass2'),
('user3', 'pass3'),
('user4', 'pass4'),
('user5', 'pass5');

-- --------------------------------------------------------

--
-- Table structure for table `partnership`
--

CREATE TABLE `partnership` (
  `id_mitra_kerja` int NOT NULL,
  `nama_manajemen_pemasaran` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `telepon` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `alamat` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `partnership`
--

INSERT INTO `partnership` (`id_mitra_kerja`, `nama_manajemen_pemasaran`, `telepon`, `email`, `alamat`) VALUES
(1001, 'PT Abadi Jaya', '085156283645', 'afghanekapangestu@gmail.com', 'jl. merdeka no1'),
(1002, 'cv makmur sejahtera', '087654321098', 'makmursejahtera@example.com', 'jl. raya maju jaya no. 25'),
(1003, 'pt sejahtera bersama', '082345678912', 'sejahterabersama@example.com', 'jl. jaya abadi no. 15'),
(1004, 'cv sejahtera maju', '085678901234', 'sejahteramaju@example.com', 'jl. maju raya no. 8');

-- --------------------------------------------------------

--
-- Table structure for table `pemasaran`
--

CREATE TABLE `pemasaran` (
  `id_mitra_kerja` int DEFAULT NULL,
  `jenis_layanan` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nama_brand` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `periode` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `barang_masuk` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `barang_keluar` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `stok_tersisa` int DEFAULT NULL,
  `analisa_pasar` text COLLATE utf8mb4_general_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pemasaran`
--

INSERT INTO `pemasaran` (`id_mitra_kerja`, `jenis_layanan`, `nama_brand`, `periode`, `tanggal`, `barang_masuk`, `barang_keluar`, `stok_tersisa`, `analisa_pasar`) VALUES
(1001, 'test', 'test', 'test', '2023-07-06', '1', '1', 1, 'test	'),
(1002, 'testa', 'testa', 'testa', '2023-07-20', '12', '11', 111, 'test');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `partnership`
--
ALTER TABLE `partnership`
  ADD PRIMARY KEY (`id_mitra_kerja`);

--
-- Indexes for table `pemasaran`
--
ALTER TABLE `pemasaran`
  ADD KEY `FK_pemasaran_partnership` (`id_mitra_kerja`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `partnership`
--
ALTER TABLE `partnership`
  MODIFY `id_mitra_kerja` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1009;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pemasaran`
--
ALTER TABLE `pemasaran`
  ADD CONSTRAINT `FK_pemasaran_partnership` FOREIGN KEY (`id_mitra_kerja`) REFERENCES `partnership` (`id_mitra_kerja`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
