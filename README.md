# Lendo-logs-grandes-com-BufferedReader

## Descrição
`PDVLogReader` é uma aplicação simples desenvolvida em **Java** para leitura de logs de um Ponto de Venda (PDV). O sistema utiliza **BufferedReader** para ler eficientemente arquivos de log linha por linha, exibindo as informações no console.

## Tecnologias Utilizadas
- **Java 11+**
- **BufferedReader & FileReader** para leitura otimizada de arquivos

## Estrutura do Projeto
```
├── logs/
│   ├── pdv_detalhado.log  # Arquivo onde os logs estão armazenados
├── PDVLogReader.java  # Classe principal do programa
```

## Como Usar

### 1️⃣ Compilar o Programa
Abra o terminal na pasta do projeto e execute:
```sh
javac PDVLogReader.java
```

### 2️⃣ Executar o Programa
```sh
java PDVLogReader
```

### 3️⃣ Funcionamento
O programa realiza as seguintes operações:
1. **Lê os logs** do arquivo `logs/pdv_detalhado.log`.
2. **Exibe os registros** armazenados no log no terminal.

Exemplo de saída no terminal:
```
🔹 Exibindo Logs do PDV:
2025-03-18T12:30:45 - Item adicionado: Produto A, Quantidade: 2, Valor: R$ 100,00
2025-03-18T12:31:00 - Pagamento realizado via Pix.
2025-03-18T12:31:15 - Cupom fiscal gerado.
```

## Possíveis Melhorias
- Adicionar filtros para exibir logs por data ou tipo de evento.
- Implementar leitura de diferentes arquivos de log.
- Integrar com um sistema de **busca e análise de logs**.
