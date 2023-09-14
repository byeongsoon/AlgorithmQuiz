/* Level 3 - 없어진 기록 찾기 */
SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_OUTS o
LEFT JOIN ANIMAL_INS i ON (o.ANIMAL_ID = i.ANIMAL_ID)
WHERE i.ANIMAL_ID IS NULL
ORDER BY o.ANIMAL_ID;

/* Level 3 - 있었는데요 없었습니다 */
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A
LEFT JOIN ANIMAL_OUTS B ON(A.ANIMAL_ID = B.ANIMAL_ID)
WHERE A.DATETIME > B.DATETIME
ORDER BY A.DATETIME ASC;

/* Level 3 - 오랜 기간 보호한 동물(1) */
SELECT A.NAME, A.DATETIME
FROM ANIMAL_INS A
LEFT JOIN ANIMAL_OUTS B ON (A.ANIMAL_ID = B.ANIMAL_ID)
WHERE B.ANIMAL_ID IS NULL
ORDER BY A.DATETIME ASC
LIMIT 3;

/* Level 4 - 보호소에서 중성화한 동물 */
SELECT A.ANIMAL_ID, A.ANIMAL_TYPE, A.NAME
FROM ANIMAL_INS A
LEFT JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE A.SEX_UPON_INTAKE != B.SEX_UPON_OUTCOME;

/* Level 4 - 그룹별 조건에 맞는 식당 목록 출력하기 */
SELECT m.MEMBER_NAME, r.REVIEW_TEXT, DATE_FORMAT(r.REVIEW_DATE, '%Y-%m-%d') as REVIEW_DATE
FROM MEMBER_PROFILE m
LEFT JOIN REST_REVIEW r ON (m.MEMBER_ID = r.MEMBER_ID)
WHERE m.MEMBER_ID = (
    SELECT MEMBER_ID
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    ORDER BY COUNT(*) DESC
    LIMIT 1
)
ORDER BY REVIEW_DATE;

/* Lelvel 4 - 5월 식품들의 총매출 조회하기 */
SELECT p.PRODUCT_ID, p.PRODUCT_NAME, SUM(p.PRICE * o.AMOUNT) TOTAL_SALES
FROM FOOD_PRODUCT p
LEFT JOIN FOOD_ORDER o ON (p.PRODUCT_ID = o.PRODUCT_ID)
WHERE YEAR(PRODUCE_DATE) = 2022 AND MONTH(PRODUCE_DATE) = 5
GROUP BY p.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC;