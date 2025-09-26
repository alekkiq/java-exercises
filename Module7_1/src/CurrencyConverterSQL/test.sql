SELECT * FROM currency;

SELECT * FROM currency WHERE code = "EUR";

SELECT COUNT(*) as "Total currencies" FROM currency;

SELECT MAX(rate_to_eur) as "Highest rate to EUR", name FROM currency;
