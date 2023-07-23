-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jul 23, 2023 at 09:53 PM
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
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` int NOT NULL,
  `nama_pelanggan` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `alamat` varchar(200) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `telepon` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `jenis_kelamin` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat`, `telepon`, `email`, `jenis_kelamin`, `tanggal_lahir`) VALUES
(1, 'Budi Santoso', 'Jl. Merdeka No. 123', '081234567890', 'budi@example.com', 'Laki-laki', '1990-05-15'),
(2, 'Ani Indriani', 'Jl. Pahlawan No. 45', '082345678901', 'ani@example.com', 'Perempuan', '1995-09-20'),
(3, 'Agus Wahyudi', 'Jl. Proklamasi No. 78', '085678901234', 'agus@example.com', 'Laki-laki', '1988-12-10'),
(4, 'Rini Fitriani', 'Jl. Diponegoro No. 56', '087890123456', 'rini@example.com', 'Perempuan', '1992-07-25'),
(5, 'Afghan Eka P', 'Jl.Bambu', '085156283645', 'afghanep@gmail.com', 'Laki-laki', '2002-03-19');

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

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` int NOT NULL,
  `id_pelanggan` int NOT NULL,
  `jumlah_bayar` int NOT NULL,
  `kembalian` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id_pembayaran`, `id_pelanggan`, `jumlah_bayar`, `kembalian`) VALUES
(1, 4, 85000, 10000),
(2, 1, 50000, 10000),
(3, 2, 75000, 20000),
(4, 3, 100000, 5000),
(5, 1, 120000, 15000),
(6, 4, 85000, 10000);

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
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `pemasaran`
--
ALTER TABLE `pemasaran`
  ADD KEY `FK_pemasaran_partnership` (`id_mitra_kerja`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD KEY `id_pelanggan` (`id_pelanggan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `partnership`
--
ALTER TABLE `partnership`
  MODIFY `id_mitra_kerja` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1009;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id_pelanggan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id_pembayaran` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pemasaran`
--
ALTER TABLE `pemasaran`
  ADD CONSTRAINT `FK_pemasaran_partnership` FOREIGN KEY (`id_mitra_kerja`) REFERENCES `partnership` (`id_mitra_kerja`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `ID Pelanggan` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
