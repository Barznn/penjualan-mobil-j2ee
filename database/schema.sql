-- Create Database
CREATE DATABASE IF NOT EXISTS db_penjualan_mobil;
USE db_penjualan_mobil;

-- Create Table User
CREATE TABLE IF NOT EXISTS user (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nama VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    no_telp VARCHAR(15),
    alamat TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    INDEX idx_email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Create Table Mobil
CREATE TABLE IF NOT EXISTS mobil (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nama VARCHAR(100) NOT NULL,
    merk VARCHAR(50) NOT NULL,
    harga BIGINT NOT NULL,
    tahun INT NOT NULL,
    warna VARCHAR(30) NOT NULL,
    transmisi VARCHAR(20) NOT NULL,
    deskripsi TEXT,
    gambar VARCHAR(255),
    status ENUM('tersedia', 'terjual') DEFAULT 'tersedia',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    INDEX idx_merk (merk),
    INDEX idx_status (status),
    INDEX idx_harga (harga)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Create Table Pembelian
CREATE TABLE IF NOT EXISTS pembelian (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    mobil_id INT NOT NULL,
    harga_pembelian BIGINT NOT NULL,
    tanggal_pembelian TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status_pembayaran ENUM('pending', 'berhasil', 'dibatalkan') DEFAULT 'pending',
    FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE,
    FOREIGN KEY (mobil_id) REFERENCES mobil(id) ON DELETE CASCADE,
    INDEX idx_user_id (user_id),
    INDEX idx_mobil_id (mobil_id),
    INDEX idx_status_pembayaran (status_pembayaran)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Insert Sample Data Mobil
INSERT INTO mobil (nama, merk, harga, tahun, warna, transmisi, deskripsi, status) VALUES
('Avanza 1.3 G AT', 'Daihatsu', 150000000, 2023, 'Putih', 'Otomatis', 'Mobil keluarga yang ekonomis dan nyaman untuk perjalanan sehari-hari', 'tersedia'),
('CR-V 2.0 i-VTEC', 'Honda', 450000000, 2023, 'Hitam', 'Otomatis', 'SUV premium dengan fitur lengkap dan performa mesin yang responsif', 'tersedia'),
('City 1.5 CVT', 'Honda', 200000000, 2022, 'Silver', 'Otomatis', 'Sedan kompak yang efisien bahan bakar dan cocok untuk perkotaan', 'tersedia'),
('Xenia 1.0 Manual', 'Daihatsu', 120000000, 2021, 'Merah', 'Manual', 'MPV terjangkau dengan kapasitas penumpang yang besar', 'tersedia'),
('Ertiga 1.5 Manual', 'Suzuki', 180000000, 2023, 'Biru', 'Manual', 'Mobil niaga yang handal dengan konsumsi bahan bakar hemat', 'tersedia'),
('Swift 1.2 Automatic', 'Suzuki', 160000000, 2022, 'Putih', 'Otomatis', 'Hatchback modern dan sporty dengan desain futuristik', 'tersedia'),
('Pajero Sport 2.4', 'Mitsubishi', 500000000, 2023, 'Coklat', 'Otomatis', 'SUV tangguh untuk petualangan off-road maupun jalan raya', 'tersedia'),
('Innova 2.4 Diesel', 'Toyota', 380000000, 2022, 'Abu-abu', 'Manual', 'MPV legendaris dengan mesin diesel yang bertenaga dan irit', 'tersedia');
