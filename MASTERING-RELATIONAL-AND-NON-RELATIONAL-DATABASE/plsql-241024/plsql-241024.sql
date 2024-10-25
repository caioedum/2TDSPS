-- Exercício 1
CREATE TABLE historico (
    cod_produto       NUMBER,
    nome_produto      VARCHAR(50),
    data_movimentacao DATE
);

DECLARE
    v_codigo produto.cod_produto%TYPE := 12349;
    CURSOR cur_emp IS
    SELECT
        nom_produto
    FROM
        produto
    WHERE
        cod_produto = v_codigo;
BEGIN
    FOR x IN cur_emp LOOP
        INSERT INTO historico VALUES (
            v_codigo,
            x.nom_produto,
            sysdate
        );
        COMMIT;
    END LOOP;
END;

-- Exercício 2
DECLARE
    CURSOR c_consulta_cliente IS
    SELECT
        cod_cliente,
        nom_cliente
    FROM
        cliente;
BEGIN
    FOR x IN c_consulta_cliente LOOP
        dbms_output.put_line('Cliente: '
                             || x.cod_cliente
                             || 'Nome: '
                             || x.nom_cliente);
    END LOOP;
END;