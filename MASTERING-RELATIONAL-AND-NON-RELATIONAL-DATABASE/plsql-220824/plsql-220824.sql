-- Exerc�cio 1
DECLARE
    valorCarro number := &digiteumvalor;
    valorParcela number;
BEGIN
    valorparcela := valorcarro / 10;
    dbms_output.put_line( 'O valor de cada parcela �: R$' || ( valorparcela / 10 ) * 1.03 );
    
    valorcarro := (valorparcela * 1.03);
    dbms_output.put_line('O valor do carro financiado �: R$' || (valorcarro * 10));
END;

-- Exerc�cio 2
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

-- Exerc�cio 3
DECLARE
    genero VARCHAR2(30) := '&digiteUmValor';
BEGIN

    IF UPPER(genero) = 'M' then
    dbms_output.put_line('O g�nero digitado � Masculino');
    
    ELSIF UPPER(genero) = 'F' THEN
    dbms_output.put_line('O genero digitado � Feminino');
    
    ELSE
    dbms_output.put_line('Valor n�o encontrado');
    
    END IF;
END;

-- Exerc�cio 4
DECLARE
    numero number := &digiteUmValor;
BEGIN

    IF MOD(numero, 2) = 0 then
        dbms_output.put_line('O n�mero � par');
    ELSE
        dbms_output.put_line('O n�mero � �mpar');
    END IF;
END;

SELECT * FROM TABELA_VENDAS;

SELECT
    COUNT(1),
    CASE
        WHEN dealsize = 'Medium' THEN
            'Empresa de Porte M�dio'
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
            'Empresa de Porte M�dio'
        WHEN dealsize = 'Small'  THEN
            'Empresa de pequeno porte'
        WHEN dealsize = 'Large'  THEN
            'Empresa de grande porte'
    END
ORDER BY 1;