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
* O método pode ser usado para encontrar o maior valor de x e y :Math.max(x,y)


Math.max(5, 10);

Math.min ( x, y )
O método pode ser usado para encontrar o menor valor de de x e y :Math.min(x,y)

Exemplo
Math.min(5, 10);

Math.sqrt ( x )
O método retorna a raiz quadrada de x :Math.sqrt(x)

Exemplo
Math.sqrt(64);

Math.abs ( x )
O método retorna o valor absoluto (positivo) de x :Math.abs(x)

Exemplo
Math.abs(-4.7);

Números aleatórios
Math.random() retorna um número aleatório entre 0,0 (inclusivo) e 1,0 (exclusivo):

Exemplo
Math.random();

Para obter mais controle sobre o número aleatório, por exemplo, você deseja apenas um número aleatório entre 0 e 100, você pode usar a seguinte fórmula:

Exemplo
int randomNum = (int)(Math.random() * 101);  // 0 to 100
