# Números Científicos 

* Um número de ponto flutuante também pode ser um número científico com um "e" para indicar a potência de 10:

~~~
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);
~~~
# String

## Comprimento

* Uma String em Java é, na verdade, um objeto que contém métodos que podem realizar certas operações em strings. Por exemplo, o comprimento de uma string pode ser encontrado com o length()método:

~~~
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println(txt.length());

//saída é 26
~~~

## Encontrar um personagem em uma string

* O indexOf()método retorna o índice (a posição) da primeira ocorrência de um texto especificado em uma string (incluindo espaços em branco):

~~~
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
~~~
* Existem muitos métodos de string disponíveis, por exemplo toUpperCase()e toLowerCase():
~~~
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "Hélio world"
~~~

# Classe Math

## Math.max ( x, y )

* O método pode ser usado para encontrar o maior valor de x e y :`Math.max(x,y)`

~~~
System.out.println(Math.max(5, 10));  //Output 10
~~~

## Math.min ( x, y )

* O método pode ser usado para encontrar o menor valor de de x e y :`Math.min(x,y)`
~~~
System.out.println(Math.min(5, 10));  //Output 5
~~~

## Números aleatórios

* `Math.random()` retorna um número aleatório entre 0,0 (inclusivo) e 1,0 (exclusivo):

~~~
System.out.println(Math.random());  //Output 0,2977274678982116
~~~
