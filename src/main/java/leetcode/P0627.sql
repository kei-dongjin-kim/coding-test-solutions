-- Oracle

UPDATE
    Salary
SET
    sex = DECODE(sex, 'm', 'f', 'f', 'm')
;
