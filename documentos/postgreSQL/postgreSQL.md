# DQL - Data Query Language 

#### SUMARIO

[TOC]



### Cláusula WHERE 

Consulta que retorna o nome e a data de nascimento de clientes que nasceram entre 1990 e 2009:
```sql
select nm_nome, dt_nascimentoconstituicao as nascimento
from cliente
where dt_nascimentoconstituicao between '1990-01-01' and '2020-01-01';
```

Consulta que retorna código e nome das categorias Suco e Cerveja:
```sql
select cd_codigo, nm_descricao
from categoria
where nm_descricao in ('Suco', 'Refrigerante');
```

Consulta que retorna o código e o nome de clientes que não possuem o complemento preenchido:
```sql
select cd_codigo, nm_nome 
from cliente
where ds_complemento is null;
```

Consulta que retorna o nome, data de nascimento de clientes que nasceram entre 1990 e 2009 e o tipo de pessoa é PF:
```sql
select nm_nome, dt_nascimentoconstituicao, ds_tipopessoa
from cliente 
where dt_nascimentoconstituicao between '1990-01-01' and '2009-01-01'
and ds_tipopessoa = 'PF';
```

Consulta que retorna o nome, tipo de pessoa e data de nascimento de clientes que nasceram entre 1990 e 2020 ou o nome do cliente começa com a letra M:
```sql
select nm_nome, dt_nascimentoconstituicao
from cliente
where dt_nascimentoconstituicao between '1990-01-01' and '2020-01-01'
and nm_nome like 'M%';
```
Consulta que retorna o nome e tipo de pessoa que não começam com a letra V:
```sql
select nm_nome, ds_tipopessoa 
from cliente 
where nm_nome not like 'V%';
```
Consulta que retorna o nome, tipo de pessoa e data de nascimento que não nasceram no ano 2000:
```sql
SELECT nm_nome, dt_nascimentoconstituicao 
FROM cliente
WHERE dt_nascimentoconstituicao not between '2000-01-01' and '2000-12-31';
```

### SELECT - ORDER BY
Consulta que retorna o nome, tipo de pessoa e data de nascimento de clientes que nasceram entre 1990 e 2020 ordenado por nome alfabeticamente:
```sql
select nm_nome, dt_nascimentoconstituicao
from cliente 
where dt_nascimentoconstituicao between '1990-01-01' and '2020-01-01'
order by nm_nome asc;
```

Consulta que retorna o nome, tipo de pessoa e data de nascimento de clientes que nasceram entre 1990 e 2020 ordenado do mais novo para o mais velho e por nome alfabeticamente:
```sql
select nm_nome, ds_tipopessoa, dt_nascimentoconstituicao
from cliente
where dt_nascimentoconstituicao between '1990-01-01' and '2020-01-01'
order by dt_nascimentoconstituicao desc, nm_nome asc;
```

### SELECT - LIMIT 
Consulta que retorna o código do bairro e seu nome onde o código tem que ser maior que 6 limitando a dois registros:
```sql
select cd_codigo, nm_nome 
from cliente 
where cd_codigo > 6
limit 2;
```

Consulta que retorna o código do bairro e seu nome onde o código tem que ser maior que 6 limitando a dois registros pulando dois registros:
```sql
select cd_codigo, nm_nome 
from cliente 
where cd_codigo > 6
limit 2 offset 2;
```

# INDICE  SQL

### JEDHFDFJHDSJ