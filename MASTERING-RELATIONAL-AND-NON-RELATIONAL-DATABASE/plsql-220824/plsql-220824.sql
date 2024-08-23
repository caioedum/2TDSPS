-- Exercício 1
DECLARE
    valorCarro number := &digiteumvalor;
    valorParcela number;
BEGIN
    valorparcela := valorcarro / 10;
    dbms_output.put_line( 'O valor de cada parcela é: R$' || ( valorparcela / 10 ) * 1.03 );
    
    valorcarro := (valorparcela * 1.03);
    dbms_output.put_line('O valor do carro financiado é: R$' || (valorcarro * 10));
END;

-- Exercício 2
DECLARE

    valorCarro number := &DigiteUmValor;
    valorEntrada number;
    qtdParcelas number := &DigiteQuantidadeParcelas;
    
BEGIN
    valorEntrada := valorCarro * 0.20;
    dbms_output.put_line('Valor do carro R$' || valorcarro);
    dbms_output.put_line('Valor da entrada R$' || valorentrada);
    dbms_output.put_line('O valor do carro financiado em'
                     || qtdparcelas
                     || ' vezes '
                     ||(((valorcarro - valorentrada) * 1.10) + valorentrada));
    
END;

-- Exercício 3
DECLARE
    genero VARCHAR2(30) := '&digiteUmValor';
BEGIN

    IF UPPER(genero) = 'M' then
    dbms_output.put_line('O gênero digitado é Masculino');
    
    ELSIF UPPER(genero) = 'F' THEN
    dbms_output.put_line('O genero digitado é Feminino');
    
    ELSE
    dbms_output.put_line('Valor não encontrado');
    
    END IF;
END;

-- Exercício 4
DECLARE
    numero number := &digiteUmValor;
BEGIN

    IF MOD(numero, 2) = 0 then
        dbms_output.put_line('O número é par');
    ELSE
        dbms_output.put_line('O número é ímpar');
    END IF;
END;

SELECT * FROM TABELA_VENDAS;

SELECT
    COUNT(1),
    CASE
        WHEN dealsize = 'Medium' THEN
            'Empresa de Porte Médio'
        WHEN dealsize = 'Small'  THEN
            'Empresa de pequeno porte'
        WHEN dealsize = 'Large'  THEN
            'Empresa de grande porte'
    END porteempresa
FROM
    tabela_vendas
GROUP BY
    CASE
    WHEN dealsize = 'Medium' THEN
            'Empresa de Porte Médio'
        WHEN dealsize = 'Small'  THEN
            'Empresa de pequeno porte'
        WHEN dealsize = 'Large'  THEN
            'Empresa de grande porte'
    END
ORDER BY 1;