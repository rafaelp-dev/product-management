# Product Manager CLI 
Este projeto é uma aplicação simples de linha de comando para gerenciar produtos, desenvolvida em Java. A aplicação permite cadastrar, listar, atualizar e remover produtos de uma lista em memória.

## Funcionalidades
- Cadastrar novos produtos (nome, preço e quantidade)
- Listar todos os produtos registrados
- Atualizar dados de um produto existente (pelo ID)
- Deletar um produto da lista (pelo ID)
- Encerrar o programa

## 🧱 Estrutura do Projeto
src/
├── app/
│   └── App.java
└── domain/
    ├── Menu.java   // Interface de interação com o usuário (menu CLI)
    └── Product.java // Classe que representa o produto

## Tecnologias Utilizadas
- Java 21
- IDE: IntelliJ IDEA

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/product-manager-cli.git
   
2. Compile e execute no terminal

3. Siga as instruções do menu no terminal para interagir com o sistema.

## Observações
- Os dados dos produtos são armazenados apenas em memória. Ao encerrar o programa, todas as informações serão perdidas.
- A geração de IDs dos produtos é automática e incremental.

Este projeto é de uso livre para fins de aprendizado e experimentação.
