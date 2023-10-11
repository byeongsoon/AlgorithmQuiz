/* Level 2 - 중복 제거하기 */
SELECT DISTINCT COUNT(DISTINCT a.NAME) AS 'count'
FROM ANIMAL_INS a;

/* Level 1 - 가장 비싼 상품 구하기 */
SELECT MAX(PRICE) AS MAX_PRICE
FROM PRODUCT;

/* Level 1 - 최댓값 구하기 */
SELECT MAX(DATETIME) AS '시간'
FROM ANIMAL_INS;

/* Level 2 - 최솟값 구하기 */
SELECT MIN(DATETIME) AS '시간'
FROM ANIMAL_INS;