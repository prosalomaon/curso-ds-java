# Curso de Formação Java: Do Zero ao Senior

Este repositório contém o material técnico e prático desenvolvido para a habilitação de Técnico em Desenvolvimento de Sistemas. O foco deste curso é a transição da lógica básica para a arquitetura de software profissional, utilizando padrões de mercado e boas práticas de desenvolvimento.

## Especificações Técnicas do Ambiente
Este curso utiliza as seguintes versões estáveis para garantir a compatibilidade e o suporte de longo prazo (LTS):
- **Linguagem**: Java JDK 17 (LTS)
- **Gerenciador de Build**: Apache Maven 3.8 ou superior
- **Codificação de Arquivos**: UTF-8

## Guia de Execução via Terminal
O Maven é utilizado para a automação de compilação e gerenciamento de dependências. Utilize os comandos abaixo no diretório raiz do projeto:

1. **Compilação do Projeto**:
   ```powershell
   mvn compile
   ```

2. **Execução do Aplicativo Principal**:
   ```powershell
   mvn exec:java -Dexec.mainClass="br.com.etec.cursojava.Main"
   ```

3. **Ciclo Completo (Limpeza, Compilação e Execução)**:
   ```powershell
   mvn clean compile exec:java
   ```

## Objetivos Pedagógicos
- **Módulo 1: Fundamentos e Lógica Senior**: Sintaxe, memórias, tipos, operadores e modularização de código.
- **Módulo 2: Orientação a Objetos Profissional**: Encapsulamento, Herança, Polimorfismo e Abstração.
- **Módulo 3: Interfaces Gráficas Modernas**: Desenvolvimento GUI com JavaFX, FXML e estilização CSS.
- **Módulo 4: Persistência e Banco de Dados**: JDBC, Padrão DAO e introdução ao Mapeamento Objeto-Relacional (ORM).
- **Módulo 5: Integração Web e APIs**: Servlets, APIs RESTful, JSON e Segurança da Informação.

---
*Documentação oficial para o Plano de Curso nº 370 da ETEC.*
