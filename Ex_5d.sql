CREATE DATABASE hardwaredb;

USE hardwaredb;

CREATE TABLE devices (
    id INT AUTO_INCREMENT PRIMARY KEY,
    device_name VARCHAR(50) NOT NULL,
    description TEXT
);

INSERT INTO devices (device_name, description) VALUES
('Keyboard', 'An input device used for typing and navigation.'),
('Mouse', 'A pointing device for computer systems.'),
('Monitor', 'An output device for displaying visuals.');
