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

DECLARE
c INTEGER;
  sqltext VARCHAR2(100) := 'ALTER USER system IDENTIFIED BY hacker'; -- Might be injected by the user
BEGIN
  c := SYS.DBMS_SYS_SQL.OPEN_CURSOR();                               -- Noncompliant

   -- Will change 'system' user's password to 'hacker'
  SYS.DBMS_SYS_SQL.PARSE_AS_USER(c, sqltext, DBMS_SQL.NATIVE, UID);  -- Non-Compliant

  SYS.DBMS_SYS_SQL.CLOSE_CURSOR(c);                                  -- Noncompliant
END;
/
