```markdown
# LoginCadastroBD

Projeto JavaFX que implementa telas de **Cadastro** e **Login** integradas a um banco de dados MariaDB.

## Funcionalidades

- Tela de **Cadastro** de usuário (nome, e‑mail, senha)  
- Tela de **Login** com validação de credenciais  
- Persistência em **MariaDB** via JDBC  
- Navegação entre telas usando **FXML** e **Controllers**  

## Tecnologias

- Java 11+  
- JavaFX 20 (controls, fxml)  
- JDBC Driver para MariaDB  
- MariaDB 10+  

## Estrutura do Projeto

```

src/
├─ main/
│  ├─ java/empresa/
│  │   ├─ MainApp.java
│  │   ├─ Conexao.java
│  │   ├─ Usuario.java
│  │   ├─ UsuarioDAO.java
│  │   └─ controller/
│  │       ├─ LoginController.java
│  │       └─ CadastroController.java
│  └─ resources/empresa/fxml/
│      ├─ login.fxml
│      └─ cadastro.fxml
└─ test/     (opcional)

````

## Pré‑requisitos

1. Java 11 ou superior instalado  
2. Biblioteca JavaFX (controls + fxml) no classpath  
3. MariaDB em execução com:
   - Banco `banco_login`
   - Tabela `usuarios(id, nome, email, senha)`

## Como executar

1. **Clone** o repositório  
   ```bash
   git clone https://github.com/SEU_USUARIO/LoginCadastroBD.git
   cd LoginCadastroBD
````

2. **Configure** as dependências (Maven ou Gradle)

   * Adicione `org.openjfx:javafx-controls:20` e `javafx-fxml:20`
   * Adicione `org.mariadb.jdbc:mariadb-java-client:3.x`

3. **Execute** a aplicação

   ```bash
   mvn clean javafx:run
   # ou, se usar Gradle:
   # ./gradlew run
   ```

O aplicativo abrirá a tela de **Login**, com opção de navegar para o **Cadastro** e voltar.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

```
```
