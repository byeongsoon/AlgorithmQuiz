/* Level 3 - 카테고리 별 도서 판매량 집계하기 */
SELECT b.CATEGORY, SUM(s.SALES)
FROM BOOK b
         LEFT JOIN BOOK_SALES s ON (b.BOOK_ID = s.BOOK_ID)
WHERE YEAR(SALES_DATE ) = 2022 ANd MONTH(SALES_DATE) = 01
GROUP BY CATEGORY
ORDER BY CATEGORY;

/* Level 3 - 즐겨찾기가 가장 많은 식당 정보 출력하기 */
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM (
    SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES, ROW_NUMBER() OVER (PARTITION BY FOOD_TYPE ORDER BY FAVORITES DESC) AS RN
    FROM REST_INFO
) AS REST_INFO
WHERE RN = 1
ORDER BY FOOD_TYPE DESC;

/* Level 3 - 조건에 맞는 사용자와 총 거래금액 조회하기 */
SELECT u.USER_ID, u.NICKNAME, TOTAL_SALES
FROM (
     SELECT WRITER_ID, SUM(PRICE) AS TOTAL_SALES
     FROM USED_GOODS_BOARD
     WHERE STATUS = 'DONE'
     GROUP BY WRITER_ID
) b
LEFT JOIN USED_GOODS_USER u ON (b.WRITER_ID = u.USER_ID)
WHERE TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES;

/* Level 2 - 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기 */
SELECT CAR_TYPE, COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%'
   OR OPTIONS LIKE '%열선시트%'
   OR OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;

/* Level 2 - 진료과별 총 예약 횟수 출력하기 */
SELECT MCDP_CD AS '진료과코드', COUNT(*) AS '5월예약건수'
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY COUNT(*), MCDP_CD;

/* Level 2 - 동명 동물 수 찾기 */
SELECT NAME, COUNT(*) AS 'COUNT'
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT >= 2 AND NAME IS NOT NULL
ORDER BY NAME;

/* Level 2 - 성분으로 구분한 아이스크림 총 주문량 */
SELECT i.INGREDIENT_TYPE, SUM(f.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF f
         LEFT JOIN ICECREAM_INFO i ON (i.FLAVOR = f.FLAVOR)
GROUP BY i.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC;