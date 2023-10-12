/* Level 1 - 이름이 없는 동물의 아이디 */
SELECT a.ANIMAL_ID
FROM ANIMAL_INS as a
WHERE a.NAME IS NULL;

/* Level 1 - 이름이 있는 동물의 아이디 */
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;
