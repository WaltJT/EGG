SELECT * FROM EMPLOYEES;

SELECT * FROM EMPLOYEES E ORDER BY E.FIRST_NAME ASC;

DECLARE
  v_last_name employees.last_name%TYPE;
  v_commission employees.commission_pct%TYPE;
BEGIN
  FOR emp IN (SELECT last_name, commission_pct FROM employees) LOOP
    v_last_name := emp.last_name;
    v_commission := emp.commission_pct;

    IF v_commission IS NOT NULL THEN
      DBMS_OUTPUT.PUT_LINE(v_last_name || ' - ' || TO_CHAR(v_commission, '$999,999.99'));
    ELSE
      DBMS_OUTPUT.PUT_LINE(v_last_name || ' - No Commission');
    END IF;
  END LOOP;
END;

/