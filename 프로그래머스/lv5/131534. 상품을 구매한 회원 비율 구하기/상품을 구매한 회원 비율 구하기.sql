SELECT
    YEAR(A.SALES_DATE) AS YEAR,
    MONTH(A.SALES_DATE) AS MONTH,
    count(*) AS PUCHASED_USERS,
    ROUND(
        count(*) /
        (
            SELECT
                count(*)
            FROM
                USER_INFO C
            WHERE
                YEAR(C.JOINED) = 2021
        ),
        1
    ) AS PUCHASED_RATIO
FROM
    (SELECT * FROM ONLINE_SALE GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), USER_ID) A
    INNER JOIN (
        SELECT
            *
        FROM
            USER_INFO C
        WHERE
            YEAR(C.JOINED) = 2021) B
    ON A.USER_ID = B.USER_ID
GROUP BY
    YEAR(A.SALES_DATE), 
    MONTH(A.SALES_DATE)
ORDER BY
    YEAR(A.SALES_DATE), 
    MONTH(A.SALES_DATE)