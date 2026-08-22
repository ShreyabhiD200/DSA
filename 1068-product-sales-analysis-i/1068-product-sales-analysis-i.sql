# Write your MySQL query statement below
SELECT t1.product_name, t2.year, t2.price FROM Product t1 LEFT JOIN  Sales t2 ON t1.product_id = t2.product_id WHERE t2.price IS NOT NULL;