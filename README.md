# Projeto Final Gama

![](https://blog.mxcursos.com/wp-content/uploads/2017/04/front-end-ou-back-end-entenda-as-diferencas-e-descubra-o-seu-perfil.png)

# Sobre
Desenvolver uma API utilizando o java Spring Boot para consulta de dados de clientes, a API deve ter 2 endpoints principais de consultas, uma consulta geral e outra por ID. No final adicionaremos um bônus ao projeto, mais 2 endpoints para adição e remoção do usuário e um front-end.

# Objetivos
- [x] Criar a tabela de dados utilizando o MySQL
- [x] Criar o projeto Spring Boot
- [x] Adicionar os endpoints principais
- [x] Adicionar os endpoints para adicionar e remover usuários (bônus)
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
Utilizando a ferramenta eclipse já com o nosso projeto gerado e importado dentro do eclipse, é necessário fazer alguns ajustes. No caminho banking/scr/main/resources vamos editar o arquivo application.propeties com as seguintes configurações:

```
#Configurando usuario do banco
spring.datasource.username=root

#Configurando a senha
spring.datasource.password=COLOQUE AQUI A SUA SENHA DO MYSQL

#Configurando base de dados
spring.datasource.url=jdbc:mysql://localhost:3306/apidados?useTimezone=true&serverTimezone=UTC

#Configurando dialeto
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
``` 

Após isso vamos criar 3 packages dentro de banking/scr/main/java:
* br.com.blindlearningcorp.banking.controller (Onde serão armazenados todos os controles da API)
* br.com.blindlearningcorp.banking.model (Onde ficarão todas as classes para cada tabela)
* br.com.blindlearningcorp.banking.dao (Classes para conectar com o banco de dados)

# Fontes de Pesquisas

https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html

https://spring.io/guides/gs/serving-web-content/

https://spring.io/guides/tutorials/rest/

# Agradecimentos

Ao Itaú-Unibanco pela grande oportunidade  em proporcionar a pessoas com deficiência uma vaga no mercado de trabalho e termos a chance de mostrarmos  todo o nosso potencial e capacidade de sermos produtivos e grandes profissionais na área da tecnologia

A Gama Academy que desde do inicío nos proporcionou um curso  de formação com conteúdo de excelente qualidade

Aos nossos professores Francisco Isidro e Diego Augusto pela didática das aulas e a toda dedicação que tiveram para passar de forma mais acessível todo o aprendizado durante a trilha de formação

A Sra. Regina Giovannini que foi nossa Yellow Belt e sempre com um conselho inspirador e sempre disposta a nos ajudar com muita paciência e dedicação

A todos os integrantes deste grupo de trabalho em Especial ao Ailton Leite que foi nosso capitão e nos guiou para o sucesso deste trabalho

Ailton Leite
Aline Luna
Alex Junio
Cássio Roberto
Clau Pinheiro
