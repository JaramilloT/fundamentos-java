import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = (int) 5.89 + (int) 3.45;
        System.out.println(x);
        int option;


        do {System.out.println("Menu");

        option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("¿Cuál será el resultado de la siguiente operación?: "+ Main.primero());
                break;
            case 2:
                System.out.println("Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?: "+ Main.segundo());
                break;
            case 3:
                System.out.println(""+ Main.tercero());
                break;
            case 4:
                System.out.println("Escribe código para convertir un String que contiene un número a un int: "+ Main.cuarto());
                break;
        }
        }while ( (option !=0));

    }

}


