SET SERVEROUTPUT ON;

DECLARE
    V_NOME VARCHAR2(30);
    V_IDADE NUMBER := 20;
    V_NUMBER NUMBER := 45;
    V_NUMBER2 NUMBER := 39;
BEGIN
    v_nome := 'CAIO';
    dbms_output.put_line(V_NOME || V_IDADE);
END;

-- Feito por mim e Thiago
DECLARE 
    V_SALARIOATUAL NUMBER := 1412;
    V_AUMENTO NUMBER := 1.25;
    V_SALARIOFINAL NUMBER := 0;
BEGIN
    dbms_output.put_line(V_SALARIOATUAL * V_AUMENTO = V_SALARIOFINAL);
END;

-- Feito pelo professor
DECLARE
    v_salario NUMBER := 1640;
BEGIN
    dbms_output.put_line('O novo valor do salário minímo é R$: '
                         || to_char((v_salario * 1.25), '990.990'));
END;


-- Feito por mim e Thiago
DECLARE
    V_DOL NUMBER := 45;
BEGIN
    dbms_output.put_line('O valor convertido em R$: '
                         || to_char((V_DOL * 5.49)));
END;

-- Feito pelo professor
DECLARE
    DOLLAR NUMBER := 5.50;
BEGIN
    dbms_output.put_line('A conversão do dollar em R$: ' || to_char_((DOLLAR * 5.49)));
END;


    