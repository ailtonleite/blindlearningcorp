# Projeto Final Gama

![](https://blog.mxcursos.com/wp-content/uploads/2017/04/front-end-ou-back-end-entenda-as-diferencas-e-descubra-o-seu-perfil.png)

# Sobre
Desenvolver uma API utilizando o java Spring Boot para consulta de dados de clientes, a API deve ter 2 endpoints principais de consultas, uma consulta geral e outra por ID. No final adicionaremos um bônus ao projeto, mais 2 endpoints para adição e remoção do usuário e um front-end.

# Objetivos
- [x] Criar a tabela de dados utilizando o MySQL
- [ ] Criar o projeto Spring Boot
- [ ] Adicionar os endpoints principais
- [ ] Adicionar os endpoints para adicionar e remover usuários (bônus)
- [ ] Adicionar o front-end (bônus)

# Criando a tabela de dados
### Criando o banco de dados

Primeiro passo é criar a nossa database no MySQL Command Line Client, para criar uma database basta digitar o comando:
```
create database apidados;
```

Podemos verificar se a database foi criada com sucesso, utilizando o comando:
```
show databases;
```

Por fim, precisamos acessa-la utilizando o comando:
```
use apidados;
```

### Criando a tabela

Agora precisamos criar nossa tabela com os seguintes atributos:
* numero (como uma chave primaria e não nulo)
* agencia (numero inteiro e não nulo)
* tipo (numero inteiro e não nulo) (tipo 0: conta corrente, tipo 1: poupança, tipo 2: investimento)
* saldo (numero decimal e não nulo)
* titular (texto não nulo)

Para isso vamos usar o seguinte bloco de comandos:
```
create table tbdados (
numero integer not null primary key,
agencia integer not null,
tipo integer not null,
saldo double not null,
titular varchar(100) not null
);
```

Podemos verificar se a tabela foi criada com sucesso, utilizando o comando:
```
describe tbdados;
```

### Adicionando os dados

**OBS: Todos os dados inseridos serão fictício**

Podemos adicionar inúmeros dados a nossa tabela, e para adiciona=los devemos seguir o seguinte comando:
```
insert into tbdados values (numero, agencia, tipo, saldo, "titular");
```

Por exemplo:
```
insert into tbdados values (2468, 123456, 0, 400.00, "Ailton");
```

Para mostrar estes valores:
```
select numero, agencia, tipo, saldo, titular from tbdados;
```

# Criando o projeto Spirng
### Primeiros passos

Para criarmos nosso projeto com todas as configurações e dependências necessários, usaremos a ferramenta Spring Initializr acessando o link: https://start.spring.io/

Primeiro passo é fazer algumas configurações. Na aba de seleção **Project** vamos usar **Maven project** e em **Language** vamos usar **Java**, em **group** vamos utilizar br.com.blindlearningcorp e em **Artifact** vamos colocar banking. Além das configurações vamos precisar das seguintes dependências (vá até o botão **add depenences** ou utilize o atalho CTRL + B):
* Spring Web
* Spring Data JPA
* MySQL Driver
* Spring Boot DevTools
* Thymeleaf

Ao final clique no botão **Generate** (ou use o atalho CTRL + ENTER).

### Fazendo alguns ajustes
Utilizando a ferramenta eclipse

🚧 Em desenvolvimento . . .
