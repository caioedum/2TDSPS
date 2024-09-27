-- Criando procedure para insert
CREATE OR REPLACE PROCEDURE prd_insert_aluno (
    p_ra   aluno.ra%TYPE,
    p_nome aluno.nome%TYPE
) IS
BEGIN
    INSERT INTO aluno VALUES (
        p_ra,
        p_nome
    );
    COMMIT;
END;

-- Criando procedure para update
CREATE OR REPLACE PROCEDURE prd_update_aluno (
    p_ra   aluno.ra%TYPE,
    p_nome aluno.nome%TYPE
) IS
BEGIN
    UPDATE ALUNO SET NOME = p_nome WHERE RA = p_ra;
    COMMIT;
END;

-- Criando procedure para delete
CREATE OR REPLACE PROCEDURE prd_delete_aluno (
    p_ra   aluno.ra%TYPE
) IS
BEGIN
    DELETE FROM ALUNO WHERE RA = p_ra;
    COMMIT;
END;

-- Formas de chamar uma procedure para executá-la
CALL prd_insert_aluno(1111,'DSDSDSDAFA');

EXEC prd_insert_aluno(12321,'DASDASDFDS');

EXECUTE prd_insert_aluno(12323,'DASDASDFDS');

BEGIN
prd_insert_aluno(13214,'FSDFDAFD');
END;

-- Executando a procedure do professor
EXEC PF1788.prd_insert_aluno(12342,'SADSAFSDFDS');

-- Executando a procedure de update
EXEC prd_insert_aluno(12321,'DASDASDFDS');

-- Criando tabela a partir da tabela do professor
CREATE TABLE TB_DE_VENDAS AS SELECT * FROM pf1788.TABELA_VENDAS;

-- Criando procedure para delete específico
CREATE OR REPLACE PROCEDURE prd_delete_many IS
contador NUMBER := 0;
BEGIN
    FOR X IN (SELECT * FROM TABELA_VENDAS) LOOP
    DELETE FROM TABELA_VENDAS WHERE ORDERNUMBER=X.ORDERNUMBER;
    IF MOD(CONTADOR, 200) = 0 THEN
        COMMIT;
    END IF;
    contador := contador + 1;
END LOOP;
END;

-- Executando a procedure de delete específico
EXEC prd_delete_many;





    


