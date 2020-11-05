# Números Científicos 

* Um número de ponto flutuante também pode ser um número científico com um "e" para indicar a potência de 10:

~~~
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);
~~~
# Comprimento da String 

* Uma String em Java é, na verdade, um objeto que contém métodos que podem realizar certas operações em strings. Por exemplo, o comprimento de uma string pode ser encontrado com o length()método:

~~~
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println(txt.length());

//saída é 26
~~~

# Encontrar um personagem em uma string

* O indexOf()método retorna o índice (a posição) da primeira ocorrência de um texto especificado em uma string (incluindo espaços em branco):

~~~
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
~~~
