//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int [] celieChisla = new int [3];
        celieChisla [0] = 1;
        celieChisla [1] = 2;
        celieChisla [2] = 3;

        double [] drobnieChisla = {1.57 , 7.654, 9.986};

        char [] raduga = new char[] {'k' , 'o' , 'j' , 'z' , 'g' , 's' , 'f'};

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        for (int i = 0; i < celieChisla.length; i++) {
            System.out.print(celieChisla[i]);

            if (i != celieChisla.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < drobnieChisla.length; i++) {
            System.out.print(drobnieChisla[i]);

            if (i != drobnieChisla.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < raduga.length; i++) {
            System.out.print(raduga[i]);

            if (i != raduga.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        for (int i = celieChisla.length - 1; i >= 0; i--) {
            System.out.print(celieChisla[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = drobnieChisla.length - 1; i >= 0; i--) {
            System.out.print(drobnieChisla[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = raduga.length - 1; i >= 0; i--) {
            System.out.print(raduga[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        for (int i = 0; i < celieChisla.length; i++) {
            if (celieChisla[i] % 2 != 0) {
                celieChisla[i]++;
            }
            System.out.print(celieChisla[i]);
            if (i != celieChisla.length - 1) {
                System.out.print(", ");
                }
        }
    }
}