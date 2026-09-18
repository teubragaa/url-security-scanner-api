# URL Security Scanner API

API REST criada em Java e Spring Boot para analisar disponibilidade e configurações básicas de segurança de URLs.

## Funcionalidades planejadas

- Verificar se uma URL está disponível;
- Retornar o código de status HTTP;
- Identificar o uso de HTTPS;
- Medir o tempo de resposta;
- Verificar redirecionamentos;
- Analisar cabeçalhos HTTP de segurança;
- Consultar validade do certificado SSL;
- Salvar histórico das análises;
- Bloquear URLs internas para reduzir riscos de SSRF.

## Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Docker
- Docker Compose
- Maven

  
## Objetivo

Projeto de portfólio voltado ao estudo de APIs REST, Java, Spring Boot, Docker, persistência de dados e fundamentos de segurança web.

## Estrutura

```text
controller/  → endpoints da API
dto/         → objetos de entrada e saída
model/       → entidades do banco de dados
repository/  → acesso aos dados
service/     → regras de negócio e análise das URLs
