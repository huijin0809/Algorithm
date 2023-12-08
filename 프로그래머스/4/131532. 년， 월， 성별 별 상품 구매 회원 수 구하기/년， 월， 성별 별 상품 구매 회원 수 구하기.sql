-- 코드를 입력하세요
SELECT
    YEAR(t2.SALES_DATE) YEAR, -- 년도만 추출
    MONTH(t2.SALES_DATE) MONTH, -- 월만 추출
    t1.GENDER GENDER,
    COUNT(DISTINCT t1.USER_ID) USERS
    -- 구매한 상품의 갯수가 아닌, 성별별 회원의 수를 구하는 것이므로 회원 아이디는 중복을 제거
FROM USER_INFO t1
INNER JOIN ONLINE_SALE t2
ON t1.USER_ID = t2.USER_ID
WHERE GENDER IS NOT NULL -- 성별 정보가 없는 경우 결과에서 제외
GROUP BY YEAR, MONTH, GENDER -- 년도,월,성별별로 그룹화
ORDER BY YEAR, MONTH, GENDER -- 오름차순 ASC는 생략가능