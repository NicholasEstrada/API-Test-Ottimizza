# API REST - Documentação
É possível verificar as funções da aplicação no arquivo [DateController](src/main/java/com/ottimizza/REST/DateController.java)

## 1. Formatar Data

### Endpoint: POST /formatDate

#### Descrição
Este endpoint formata uma data para o formato "yyyy MM".

#### Exemplo de Chamada

```bash
curl -X POST \
  http://localhost:8080/formatDate \
  -H 'Content-Type: text/plain' \
  -d '01/05/2022'
```

## 2. Concatenar Nomes

### Endpoint: POST /nameConcatenate

#### Descrição
Este endpoint recebe um array de nomes e retorna a concatenação deles.

#### Exemplo de Chamada

```bash
curl -X POST \
  http://localhost:8080/nameConcatenate \
  -H 'Content-Type: application/json' \
  -d '["CARLOS", "EDUARDO", "DA", "COSTA", "XAVIER"]'

```

## 3. Encontrar o Maior Número

### Endpoint: POST /foundHighest

#### Descrição
Este endpoint recebe um array de números inteiros e retorna o maior valor.

#### Exemplo de Chamada

```bash
curl -X POST \
  http://localhost:8080/foundHighest \
  -H 'Content-Type: application/json' \
  -d '[334, 568, 123, 796, 225]'

```
