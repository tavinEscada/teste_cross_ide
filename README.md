# teste_cross_ide
Este teste usa projetos Maven que, criados no VSCode, sejam reconhecidos também no Netbeans como projetos Java.
## Criando projetos e modelando a estrutura básica
Uma vez que se tenha o JDK, o [Maven for Java](https://maven.apache.org/download.cgi) e, no VSCode, a extenção do Maven:
* No VSCode, podemos pressionar F1 e selecionar "Create Java Project":

<p align="center">
  <img width="597" height="132" alt="image" src="https://github.com/user-attachments/assets/d399877a-a4f6-486a-bc8e-10fe1f18f36f" />
</p>

* Em seguida, selecionamos em sequência ```Maven -> No Archetype```, e escolhemos nossos Group e Artifact IDs:
  - O Group ID pode se referir a um grupo de projetos relaciodos a alguma empresa ou marca (como *com.google.guava*) ou até ser algo mais genérico (como *com.mycompany*). De todo modo, ele segue um padrão e existem sugestões como *com.github.usuario*, de acordo com seu nome no GitHub (o usado neste repositório segue esse padrão), de forma a padronizar o grupo de projetos relacionados a seu usuário no Git.
  - Já o Artifact ID se refere ao nome do projeto em si (e geralmente do repositório, da pasta raiz do projeto), sendo, de preferência, algo que defina basicamente no que consiste o programa. No caso deste repositório, é "teste_cross_ide".

Depois disso, se escolhe a pasta de destino do projeto; digamos que o endereço seja a área de trabalho (por exemplo, pasta C:/Users/usuario/Desktop). Com isso, é criada a estrutura do projeto Maven (seguindo o exemplo citado, em C:/Users/usuario/Desktop/teste-cross-ide). Temos, nessa estrutura:
* Pasta src com:
  - uma pasta main/java contendo todos os arquivos.java cujos endereços dependem dos IDs definidos, com cada elemento dividido com barras, pois cada um deles é uma pasta. Assim, os arquivos .java têm o padrão *artifactid/src/main/java/groupid/arquivo.java*). No caso deste repositório, temos:

  <p align="center">
    <img width="304" height="85" alt="image" src="https://github.com/user-attachments/assets/d790babb-5f0a-4a48-85e7-3d73bbb33e8e" />
  </p>

  - pasta main/resources, que pode ser usada para armazenar imagens, arquivos relacionados a banco de dados, propriedades JSON, etc.

  - pasta test, que pode ser usada para armazenar arquivos .java de teste para o programa.

* Pasta target, onde, dentre outras coisas, temos a pasta classes, que é onde teremos os arquivos .class gerados na compilação, e referentes aos arquivos .java compilados.

* Arquivo pom.xml, com detalhes sobre a versão do Maven, codificação dos caracteres, Group e Artifact IDs que foram definidos, e a versão do compilador. Caso haja alguma alteração manual no projeto (mudar o Group ID, a versão do compilador, etc), as informações do pom.xml devem ser atualizadas.

## Exemplos de comandos importantes
* Compilar projeto Maven:
  ```
  javac -d target/classes -cp src/main/java src/main/java/com/github/tavinescada/*.java
  ```
  note que a última parte do comando, "com/github/tavinescada", coincide com o *group ID* definido como "com.github.tavinescada". Se o *group ID* fosse "com.example", o comando deveria ser
  ```
  javac -d target/classes -cp src/main/java src/main/java/com/example/*.java
  ```

* Executar o projeto Maven
  ```
  java -cp target/classes com.github.tavinescada.Main
  ```
  note que o comando de execução também deve coincidir com o *group ID*. Se ele fosse "com.example", o comando deveria ser
  ```
  java -cp target/classes com.example.Main
  ```
