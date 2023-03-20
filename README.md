# Preparando ambiente

## Linux

```
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt-get install openjdk-8-jdk
```

Fedora
```
su -c "yum install java-1.8.0-openjdk"
```

Verificar instalação

```
javac -version
java -version
```

## Mac OSX

baixar de http://jdk.java.net/8/

## Windows

Instalar SDK do windows acessando: http://www.oracle.com/technetwork/java/

Escolher o Java SE: http://www.oracle.com/technetwork/java/javase/downloads/index.html

Configurar variáveis de ambiente, adicionando uma variável chamada JAVA_HOME com o valor dado pelo diretório onde o java foi instalado

Editar a variável PATH, adcionando no final %JAVA_HOME%\bin.

# Possibilidades

- Collection
    - Set
        - SortedSet
    - List
    - Queue
    - Deque
-Map
    - SortedMap# testaJavaColections
