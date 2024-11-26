CREATE DATABASE hardware_devices;

USE hardware_devices;

CREATE TABLE devices (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    type VARCHAR(100) NOT NULL,
    description TEXT
);

INSERT INTO devices (name, type, description) VALUES
('Keyboard', 'Input', 'A device to input text and commands'),
('Monitor', 'Output', 'A device to display output to the user'),
('Hard Drive', 'Storage', 'A device to store data');
