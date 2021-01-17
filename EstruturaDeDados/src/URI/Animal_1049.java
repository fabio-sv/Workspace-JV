package URI;

import java.util.Scanner;

public class Animal_1049 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentenca1 = scanner.nextLine();
        String sentenca2 = scanner.nextLine();
        String sentenca3 = scanner.nextLine();

        if (sentenca1.equals("vertebrado")) {
            if (sentenca2.equals("ave")) {

                if (sentenca3.equals("carnivoro")) {
                    System.out.println("aguia");

                } else if (sentenca3.equals("onivoro")) {
                    System.out.println("pomba");

                }
            } else if (sentenca2.equals("mamifero")) {

                if (sentenca3.equals("onivoro")) {
                    System.out.println("homem");

                } else if (sentenca3.equals("herbivoro")) {
                    System.out.println("vaca");

                }

            }
        } else if (sentenca1.equals("invertebrado")) {

            if (sentenca2.equals("inseto")) {

                if (sentenca3.equals("hematofago")) {
                    System.out.println("pulga");

                } else if (sentenca3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }

            } else if (sentenca2.equals("anelideo")) {

                if (sentenca3.equals("hematofago")) {
                    System.out.println("sanguessuga");

                } else if (sentenca3.equals("onivoro")) {
                    System.out.println("minhoca");
                }

            }
        }

        scanner.close();
    }
}
