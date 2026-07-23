EXPLAIN
SELECT c.country,
       c.confirmed,
       v.total_vaccinated
FROM covid_cases c
JOIN vaccine_data v
ON c.country = v.country
WHERE c.country = 'India';

EXPLAIN
SELECT *
FROM covid_cases
WHERE country='India'
AND report_date='2022-01-01';