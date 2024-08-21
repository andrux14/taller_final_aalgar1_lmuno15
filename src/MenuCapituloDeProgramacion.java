import java.util.Scanner;

public class MenuCapituloDeProgramacion {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-                     MENU CAPITULO DE PROGRAMACION                        -");
            System.out.println("-                     Leidy Ibeth Muñoz Zea - lmuno15                      -");
            System.out.println("-                 Andrés Felipe Algarra Reyes  - aalgar1                   -");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-                          1. Datos primitivos                             -");
            System.out.println("-                          2. Varialbles String.                           -");
            System.out.println("-                          3. Constantes.                                  -");
            System.out.println("-                          4. Tipo de operadores                           -");
            System.out.println("-                          5. Condicional IF, ELSE, IF ELSE.               -");
            System.out.println("-                          6. Condicional Switch.                          -");
            System.out.println("-                          7. Condicional ternaria.                        -");
            System.out.println("-                          8. Bucle DO WHILE.                              -");
            System.out.println("-                          9. Bucle WHILE                                  -");
            System.out.println("-                          10. Bucle FOR                                   -");
            System.out.println("-                          11. Salir                                       -");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    DatosPrimitivos();
                    break;
                case 2:
                    VariablesString();
                    break;
                case 3:
                    Constantes();
                    break;
                case 4:
                    TipoDeOperadores();
                    break;
                case 5:
                    CondicionalIfElse();
                    break;
                /*case 6:
                    CondicionalSwitch();
                    break;
                case 7:
                    CondicionalTernaria();
                    break;
                case 8:
                    BucleDoWhile();
                    break;
                case 9:
                    BucleWhile();
                    break;
                case 10:
                    BucleFor();
                    break;*/
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 11);
    }

    private static void DatosPrimitivos() {
        int opcion;

        do {
            System.out.println("-----------------Datos Primitivos-----------");
            System.out.println("1. OPCION 1");
            System.out.println("2. OPCION 2");
            System.out.println("3. Volver al menu principal");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("Usted ingresó a la opcion 1 del submenu1.");
                    break;
                case 2:
                    System.out.println("Usted ingresó a la opcion 2 del submenu1.");
                    break;
                case 3:
                    System.out.println("Retornando al menu principal...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 3);
    }
    private static void VariablesString() {
        int opcion;

        do {
            System.out.println("Variables String");
            System.out.println("1. OPCION 1");
            System.out.println("2. OPCION 2");
            System.out.println("3. Volver al menu principal");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("Usted ingresó a la opcion 1 del submenu2.");
                    break;
                case 2:
                    System.out.println("Usted ingresó a la opcion 2 del submenu2.");
                    break;
                case 3:
                    System.out.println("Retornando al menu anterior...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 3);
    }
    private static void Constantes() {
        int opcion;

        do {
            System.out.println("Constantes");
            System.out.println("1. OPCION 1");
            System.out.println("2. OPCION 2");
            System.out.println("3. Volver al menu principal");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("Usted ingresó a la opcion 1 del submenu2.");
                    break;
                case 2:
                    System.out.println("Usted ingresó a la opcion 2 del submenu2.");
                    break;
                case 3:
                    System.out.println("Retornando al menu anterior...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 3);
    }
    private static void TipoDeOperadores() {
        int opcion;

        do {
            System.out.println("Tipo de operadores");
            System.out.println("1. OPCION 1");
            System.out.println("2. OPCION 2");
            System.out.println("3. Volver al menu principal");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("Usted ingresó a la opcion 1 del submenu2.");
                    break;
                case 2:
                    System.out.println("Usted ingresó a la opcion 2 del submenu2.");
                    break;
                case 3:
                    System.out.println("Retornando al menu anterior...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 3);
    }
    private static void CondicionalIfElse() {
        int opcion;

        do {
            System.out.println("Condicional IF, ELSE, IF ELSE");
            System.out.println("1. OPCION 1");
            System.out.println("2. OPCION 2");
            System.out.println("3. Volver al menu principal");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("Usted ingresó a la opcion 1 del submenu2.");
                    break;
                case 2:
                    System.out.println("Usted ingresó a la opcion 2 del submenu2.");
                    break;
                case 3:
                    System.out.println("Retornando al menu anterior...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 3);
    }

}



