import java.util.Scanner;

public class MenuCapituloDeProgramacion {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                    MENU CAPITULO DE PROGRAMACION                         |");
            System.out.println("|                     Leidy Ibeth Muñoz Zea - lmuno15                      |");
            System.out.println("|                 Andrés Felipe Algarra Reyes  - aalgar1                   |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                          1. Datos primitivos                             |");
            System.out.println("|                          2. Varialbles String.                           |");
            System.out.println("|                          3. Constantes.                                  |");
            System.out.println("|                          4. Tipo de operadores                           |");
            System.out.println("|                          5. Condicional IF, ELSE, IF ELSE.               |");
            System.out.println("|                          6. Condicional Switch.                          |");
            System.out.println("|                          7. Condicional ternaria.                        |");
            System.out.println("|                          8. Bucle DO WHILE.                              |");
            System.out.println("|                          9. Bucle WHILE                                  |");
            System.out.println("|                          10. Bucle FOR                                   |");
            System.out.println("|                          11. Salir                                       |");
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
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                          Datos Primitivos                                |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                        1. Explicacion byte                               |");
            System.out.println("|                        2. Explicacion short                              |");
            System.out.println("|                        3. Explicacion int                                |");
            System.out.println("|                        4. Explicacion long                               |");
            System.out.println("|                        5. Explicacion float                              |");
            System.out.println("|                        6. Explicacion double                             |");
            System.out.println("|                        7. Explicacion char                               |");
            System.out.println("|                        8. Explicacion boolean                            |");
            System.out.println("|                        9. Volver a MENU PRINCIPAL                        |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    Explicacion_byte();
                    break;
                case 2:
                    Explicacion_short();
                    break;
                case 3:
                    Explicacion_int();
                    break;
                case 4:
                    Explicacion_long();
                    break;
                case 5:
                    Explicacion_float();
                    break;
                /*case 6:
                    Explicacion_double();
                    break;
                case 7:
                    Explicacion_char();
                    break;
                case 8:
                    Explicacion_boolean();
                    break;*/
                case 9:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 9);
    }

    private static void Explicacion_byte() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                           Explicacion byte                               |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    La variable byte es un tipo de dato primitivo que se utiliza para     |");
            System.out.println("|    almacenar números enteros en un rango limitado.                       |");
            System.out.println("|                                                                          |");
            System.out.println("|    Un byte ocupa 1 byte (8 bits) de memoria y puede almacenar valores    |");
            System.out.println("|    enteros desde -128 hasta 127. Esto se debe a que un byte utiliza      |");
            System.out.println("|    un bit para el signo y los otros 7 bits para el valor.                |");
            System.out.println("|                                                                          |");
            System.out.println("|                         Ejemplo: byte edad = 42                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }

    private static void Explicacion_short() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                           Explicacion short                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|     Este tipo de dato utiliza 16 bits con signo y puede almacenar        |");
            System.out.println("|     valores numéricos en el rango de -32,768 a 32,767. Se utiliza        |");
            System.out.println("|     cuando se necesita un rango más amplio que el proporcionado por      |");
            System.out.println("|     los bytes, pero aún se desea ahorrar memoria en comparación con      |");
            System.out.println("|     los tipos de dato más grandes.                                       |");
            System.out.println("|                                                                          |");
            System.out.println("|                         Ejemplo: short precio = 14500                    |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);
    }

    private static void Explicacion_int() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                           Explicacion int                                |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    Es un tipo de dato de 32 bits con signo utilizado para almacenar      |");
            System.out.println("|    valores numéricos. Su rango va desde -2,147,483,648 (-2^31) hasta     |");
            System.out.println("|    2,147,483,647 (2^31 - 1). Es el tipo de dato más comúnmente           |");
            System.out.println("|    utilizado para representar números enteros.                           |");
            System.out.println("|                                                                          |");
            System.out.println("|                         Ejemplo: int ahorro = 150000;                    |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);
    }

    private static void Explicacion_long() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                           Explicacion long                               |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    El tipo de dato long es un entero de 64 bits complemento a dos.       |");
            System.out.println("|    Su valor mínimo es -9,223,372,036,854,775,808 y el máximo             |");
            System.out.println("|    9,223,372,036,854,775,807 (inclusive). Utilice este tipo de dato      |");
            System.out.println("|    cuando necesite un rango de valores más amplio que el                 |");
            System.out.println("|    proporcionado por int.                                                |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Ejemplo: long metros = 18586523l;                     |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }

    private static void Explicacion_float() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                           Explicacion float                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    En Java, una variable de tipo float es un tipo de dato que se         |");
            System.out.println("|    utiliza para representar números decimales, es decir, números que     |");
            System.out.println("|    tienen una parte fraccionaria. El tipo float es un tipo de dato       |");
            System.out.println("|    primitivo que sigue el estándar IEEE 754 para la representación de    |");
            System.out.println("|    números de punto flotante de precisión simple.                        |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Ejemplo: float estatura = 1.75f;                     |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú DATOS PRIMITIVOS: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú DATOS PRIMITIVOS...                             ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

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



