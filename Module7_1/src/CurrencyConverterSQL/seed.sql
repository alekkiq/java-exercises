DROP DATABASE IF EXISTS currency_converter;
CREATE DATABASE currency_converter;
USE currency_converter;

DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'apppassword';
GRANT SELECT, INSERT, DELETE, DROP, CREATE ON currency_converter.* TO 'appuser'@'localhost';
FLUSH PRIVILEGES;

CREATE TABLE currency (
    id INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(3) NOT NULL UNIQUE,
    name VARCHAR(50) NOT NULL,
    rate_to_eur DECIMAL(10, 5) NOT NULL
);

INSERT INTO currency (code, name, rate_to_eur) VALUES
    ("EUR", "Euro", 1.0),
    ("USD", "United States Dollar", 0.86),
    ("GBP", "British Pound", 1.14),
    ("JPY", "Japanese Yen", 0.0057),
    ("AUD", "Australian Dollar", 0.56),
    ("CAD", "Canadian Dollar", 0.61),
    ("CHF", "Swiss Franc", 1.07),
    ("CNY", "Chinese Yuan", 0.12),
    ("SEK", "Swedish Krona", 0.09),
    ("NZD", "New Zealand Dollar", 0.49);