SET SERVEROUTPUT ON

DECLARE
  result PLS_INTEGER;
  custom_exception EXCEPTION;
BEGIN
  result := 42 / 0;                            -- "Unexpected" division by 0

  RAISE custom_exception;
EXCEPTION                                      -- Non-Compliant
  WHEN custom_exception THEN
    DBMS_OUTPUT.PUT_LINE ('custom_exception: ' || DBMS_UTILITY.FORMAT_ERROR_STACK);
END;
/