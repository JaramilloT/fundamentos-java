import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = (int) 5.89 + (int) 3.45;
        System.out.println(x);
        int option;


        do {System.out.println("Menu, 1).\n 2).\n 3).\n 4).\n 5).\n 6).\n 7).\n 8).\n 9).\n 10).\n 11).\n 12).\n 13).\n 14).\n 15).\n 16).\n 17).\n 18).\n 19).\n 20).\n");

        option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("1). ¿Cuál será el resultado de la siguiente operación?: " + Main.primero());
                break;
            case 2:
                System.out.println("2). Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?: " + Main.segundo());
                break;
            case 3:
                System.out.println("3). ¿Qué valor se imprimirá? " + Main.tercero());
                break;
            case 4:
                System.out.println("1). Escribe código para convertir un String que contiene un número a un int: " + Main.cuarto());
                break;
            case 5:
                System.out.println("5). ¿Cuál es el resultado de (int) (char) (byte) -1?: " + Main.quinto());
                break;
            case 6:
                System.out.println("6). Convierte el número 65 a un char. ¿Qué carácter obtienes?: "+ Main.sexto());
                break;
            case 7:
                System.out.println("7). ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?: "+ Main.septimo());
                break;
            case 8:
                System.out.println("8). Escribe código para convertir un float a un String.: "+ Main.octavo());
                break;
            case 9:
                System.out.println("9). ¿Cuál es el resultado de (int) Math.round(3.7)? " + Main.noveno());
                break;
            case 10:
                System.out.println("10). Dado byte b = 50;, ¿cómo lo convertirías a short? " + Main.decimo());
                break;
            case 11:
                System.out.println("11). ¿Cuál es el valor de x después de la siguiente operación? int x = 10; x += 5: " + Main.once());
                break;
            case 12:
                System.out.println("12). Simplifica la siguiente expresión usando un operador de asignación compuesta: y = y * (x + 5): " + Main.doce());
                break;
            case 13:
                System.out.println("13). ¿Cuál es el valor de a después de estas operaciones? int a = 15; a %= 4;: " + Main.trece());
                break;
            case 14:
                System.out.println("14). Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta. : " + Main.catorce());
                break;
            case 15:
                System.out.println("15). ¿Qué hace la siguiente operación? x ^= 2;  : " + Main.quince());
                break;
            case 16:
                System.out.println("16). ¿Cuál es el valor de x e y después de estas operaciones? : " + Main.diesciseis());
                break;
            case 17:
                System.out.println("17). ¿Qué se imprimirá en la consola?. : " + Main.diescisiete());
                break;
            case 18:
                System.out.println("18). Escribe código que use el operador de decremento para disminuir una variable count en 1. : " + Main.diesciocho());
                break;
            case 19:
                System.out.println("19).¿Cuál es la diferencia entre ++i y i++? : " + Main.diecinueve ());
                break;
            case 20:
                System.out.println("20).¿Qué valor tendrá x después de esta operación? : " + Main.veinte());
                break;
            case 21 :
                System.out.println("21). ¿Cuál es el resultado de la siguiente expresión? : " + Main.veintiuno());
                break;
            case 22:
                System.out.println("22).Escribe código para convertir un double a un int, y luego incrementa el resultado en 1 usando el operador de postincremento. : " + Main.veintidos());
                break;
            case 23:
                System.out.println("23). ¿Qué se imprimirá en la consola? : " + Main.veintitres());
                break;
            case 24:
                System.out.println("24). Crea una expresión que use casteo y un operador de asignación compuesta para dividir un int por 2.0 y asignar el resultado a una variable double.? : " + Main.veinticuatro());
                break;
            case 25:
                System.out.println("25). ¿Cuál es el resultado de la siguiente operación? : " + Main.veinticinco());
                break;
            case 26 :
                System.out.println("26).Escribe código para convertir un long a un short, y luego usa un operador de asignación compuesta para multiplicarlo por 3.17.    : " + Main.veintiseis());
                break;
            case 27:
                System.out.println("27). ¿Qué valor tendrá x después de estas operaciones? : " + Main.veintisiete());
                break;
            case 28:
                System.out.println("28). Crea una expresión que use casteo para convertir un float a un byte, y luego usa el operador de predecremento. : " + Main.veintiocho());
                break;
            case 29:
                System.out.println("29).  ¿Cuál es el resultado de la siguiente operación?: " + Main.veintinueve());
                break;
            case 30:
                System.out.println("30). Escribe una expresión que combine casteo, un operador de asignación compuesta y un operador de incremento para convertir un double a un int, sumarle 5 y luego incrementarlo en 1.: " + Main.treinta());
                break;
        }

        }while ( (option !=0));


    }

}


