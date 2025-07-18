# teste_cross_ide







compilar projeto maven
```
javac -d target/classes -cp src/main/java src/main/java/com/github/tavinescada/*.java
```
note que a última parte do comando, "com/github/tavinescada", coincide com o *group ID* definido como "com.github.tavinescada". Se o *group ID* fosse "com.example", o comando deveria ser
```
javac -d target/classes -cp src/main/java src/main/java/com/example/*.java
```

Executar o projeto maven
```
java -cp target/classes com.github.tavinescada.Main
```
note que o comando de execução também deve coincidir com o *group ID*. Se ele fosse "com.example", o comando deveria ser
```
java -cp target/classes com.example.Main
```
