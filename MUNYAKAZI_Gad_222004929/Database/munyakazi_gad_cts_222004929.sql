-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 11:05 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `munyakazi_gad_cts_222004929`
--

-- --------------------------------------------------------

--
-- Table structure for table `cam001`
--

CREATE TABLE `cam001` (
  `country` varchar(50) NOT NULL,
  `province` varchar(50) NOT NULL,
  `district` varchar(50) NOT NULL,
  `sector` varchar(50) NOT NULL,
  `village` varchar(50) NOT NULL,
  `cell` varchar(50) NOT NULL,
  `wrfrom` varchar(50) NOT NULL,
  `wrto` varchar(50) NOT NULL,
  `attribute` varchar(50) NOT NULL,
  `nearbypolicestation` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `cam001`
--

INSERT INTO `cam001` (`country`, `province`, `district`, `sector`, `village`, `cell`, `wrfrom`, `wrto`, `attribute`, `nearbypolicestation`) VALUES
('Rwanda', 'Eastern', 'District', 'Mwurire', 'Kabare', 'Gasake', 'Kigali', 'Ngoma', 'Kigali - Tanzania', 'Kayonza Police station'),
('Rwanda', 'Southern', 'District', 'Karembure', 'Kabeza', 'Kanzenze', 'Rulindo', 'Nyagatare', 'Kigali-Nyagatare', 'Musanze Police Station'),
('ASDFASDF', 'ASDFASDF', 'District', 'ASDFA', 'ASDFA', 'ASDF', 'ASDF', 'ASDFAS', 'DFASD', 'ADSF');

-- --------------------------------------------------------

--
-- Table structure for table `criminal_info`
--

CREATE TABLE `criminal_info` (
  `id` int(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `picture` varchar(50) NOT NULL,
  `crime` varchar(50) NOT NULL,
  `residential_address` varchar(50) NOT NULL,
  `province` varchar(50) NOT NULL,
  `district` varchar(50) NOT NULL,
  `sector` varchar(50) NOT NULL,
  `village` varchar(50) NOT NULL,
  `cell` varchar(50) NOT NULL,
  `father_name` varchar(50) NOT NULL,
  `mother_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `firstname` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`firstname`, `password`) VALUES
('MUNYAKAZI', '1234567890'),
('ISHIMWE', '1234567890'),
('', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
