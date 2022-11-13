-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2022 at 05:52 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `homeautomationdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `sensorvalues`
--

CREATE TABLE `sensorvalues` (
  `id` int(11) NOT NULL,
  `temperature` float NOT NULL,
  `humidity` int(11) NOT NULL,
  `moisture` int(11) NOT NULL,
  `date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sensorvalues`
--

INSERT INTO `sensorvalues` (`id`, `temperature`, `humidity`, `moisture`, `date`) VALUES
(1, 35, 45, 56, '2022-11-07 09:43:14'),
(2, 45, 34, 44, '2022-11-07 10:03:14');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sensorvalues`
--
ALTER TABLE `sensorvalues`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sensorvalues`
--
ALTER TABLE `sensorvalues`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
