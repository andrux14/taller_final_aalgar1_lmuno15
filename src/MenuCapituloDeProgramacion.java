import java.util.Scanner;
import java.util.Random;

public class MenuCapituloDeProgramacion {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                      MENU CAPITULO DE PROGRAMACION                       |");
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
                case 6:
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
                    break;
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
            System.out.println("|                          DATOS PRIMITIVOS                                |");
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
                case 6:
                    Explicacion_double();
                    break;
                case 7:
                    Explicacion_char();
                    break;
                case 8:
                    Explicacion_boolean();
                    break;
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
            System.out.println("|                                 byte                                     |");
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
            System.out.println("|                                  short                                   |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|     Este tipo de dato utiliza 16 bits con signo y puede almacenar        |");
            System.out.println("|     valores numéricos en el rango de -32,768 a 32,767. Se utiliza        |");
            System.out.println("|     cuando se necesita un rango más amplio que el proporcionado por      |");
            System.out.println("|     los bytes, pero aún se desea ahorrar memoria en comparación con      |");
            System.out.println("|     los tipos de dato más grandes.                                       |");
            System.out.println("|                                                                          |");
            System.out.println("|                      Ejemplo: short precio = 14500                       |");
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
            System.out.println("|                                  int                                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    Es un tipo de dato de 32 bits con signo utilizado para almacenar      |");
            System.out.println("|    valores numéricos. Su rango va desde -2,147,483,648 (-2^31) hasta     |");
            System.out.println("|    2,147,483,647 (2^31 - 1). Es el tipo de dato más comúnmente           |");
            System.out.println("|    utilizado para representar números enteros.                           |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Ejemplo: int ahorro = 150000;                        |");
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
            System.out.println("|                                   long                                   |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    El tipo de dato long es un entero de 64 bits complemento a dos.       |");
            System.out.println("|    Su valor mínimo es -9,223,372,036,854,775,808 y el máximo             |");
            System.out.println("|    9,223,372,036,854,775,807 (inclusive). Utilice este tipo de dato      |");
            System.out.println("|    cuando necesite un rango de valores más amplio que el                 |");
            System.out.println("|    proporcionado por int.                                                |");
            System.out.println("|                                                                          |");
            System.out.println("|                    Ejemplo: long metros = 18586523l;                      |");
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
            System.out.println("|                                 float                                    |");
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

    private static void Explicacion_double() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                 double                                   |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    El tipo de dato double se usa para representar números de punto       |");
            System.out.println("|    flotante con doble precisión, lo que significa que tiene una mayor    |");
            System.out.println("|    precisión en comparación con float. Los valores de tipo double        |");
            System.out.println("|    tienen aproximadamente 15-16 dígitos decimales de precisión, lo       |");
            System.out.println("|    cual es útil para cálculos matemáticos que requieren una mayor        |");
            System.out.println("|    exactitud.                                                            |");
            System.out.println("|                                                                          |");
            System.out.println("|               Ejemplo: double numeropi = 3.14159265358979d               |");
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

    private static void Explicacion_char() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                 char                                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    El tipo de dato char se utiliza para almacenar un solo carácter       |");
            System.out.println("|    Unicode. Un char en Java ocupa 16 bits y puede representar            |");
            System.out.println("|    cualquier carácter del conjunto Unicode, que incluye caracteres de    |");
            System.out.println("|    diversos idiomas, símbolos y emojis.                                  |");
            System.out.println("|                                                                          |");
            System.out.println("|                   Ejemplo: char primerNombre = Juan                      |");
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

    private static void Explicacion_boolean() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                               boolean                                    |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    En Java, una variable booleana es un tipo de variable que puede       |");
            System.out.println("|    almacenar uno de dos posibles valores: true (verdadero) o false       |");
            System.out.println("|    (falso). El tipo de dato que se utiliza para declarar una             |");
            System.out.println("|    variable booleana es boolean.                                         |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Ejemplo: boolean haceFrio = true                     |");
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
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                                STRING                                    |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    En Java, un String es una clase que representa una secuencia de       |");
            System.out.println("|    caracteres. A diferencia de otros lenguajes de programación donde     |");
            System.out.println("|    las cadenas de texto pueden ser simplemente arrays de caracteres,     |");
            System.out.println("|    en Java, String es un objeto que proporciona métodos para             |");
            System.out.println("|    manipular y operar sobre textos de manera más conveniente.            |");
            System.out.println("|                                                                          |");
            System.out.println("|               Ejemplo: String mensaje = ''Feliz navidad!'';              |");
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

    private static void Constantes() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                              CONSTANTES                                  |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|     En Java, las constantes son valores que, una vez establecidos,       |");
            System.out.println("|     no pueden ser modificados durante la ejecución del programa. En      |");
            System.out.println("|     términos de programación, una constante es una variable cuyo         |");
            System.out.println("|     valor es fijo y no cambia después de su inicialización. En Java,     |");
            System.out.println("|     las constantes se definen utilizando la palabra clave final.         |");
            System.out.println("|                                                                          |");
            System.out.println("|                     Cómo Definir Constantes en Java                      |");
            System.out.println("|                                                                          |");
            System.out.println("|     Para definir una constante en Java, debes usar la palabra clave      |");
            System.out.println("|     final al declarar una variable. Además, es una convención común      |");
            System.out.println("|     en Java escribir los nombres de las constantes en mayúsculas         |");
            System.out.println("|     para diferenciarlas de las variables regulares.                      |");
            System.out.println("|                                                                          |");
            System.out.println("|            Ejemplo: public static final int EDAD_MINIMA = 18;            |");
            System.out.println("|                     public static final double PI = 3.14159;             |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al MENÚ PRINCIPAL:  ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al MENÚ PRINCIPAL...                                    ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 1);

    }

    private static void TipoDeOperadores() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          TIPO DE OPERADORES                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                        1. Aritmeticos                                    |");
            System.out.println("|                        2. Relacionales                                   |");
            System.out.println("|                        3. Logicos                                        |");
            System.out.println("|                        4. Asignacion                                     |");
            System.out.println("|                        5. Incremento / Decremento                        |");
            System.out.println("|                        6. Volver a MENU PRINCIPAL                        |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    Operadores_Aritmeticos();
                    break;
                case 2:
                    Operadores_Relacionales();
                    break;
                case 3:
                    Operadores_Logicos();
                    break;
                case 4:
                    Operadores_Asignacion();
                    break;
                case 5:
                    Operadores_Incremento_Decremento();
                    break;
                case 6:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 6);
    }

    private static void Operadores_Aritmeticos() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                         OPERADORES ARITMETICOS                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    Estos operadores se utilizan para realizar operaciones matemáticas.   |");
            System.out.println("|                                                                          |");
            System.out.println("|    + : Suma                                                              |");
            System.out.println("|    - : Resta                                                             |");
            System.out.println("|    * : Multiplicación                                                    |");
            System.out.println("|    / : División                                                          |");
            System.out.println("|    % : Módulo (residuo de la división)                                   |");
            System.out.println("|                                                                          |");
            System.out.println("|     Ejemplo:                                                             |");
            System.out.println("|                                                                          |");
            System.out.println("|     int a = 6                                                            |");
            System.out.println("|     int b = 3                                                            |");
            System.out.println("|     int suma = a+b;                                                      |");
            System.out.println("|     int resta = a-b;                                                     |");
            System.out.println("|     int multiplicacion = a*b;                                            |");
            System.out.println("|     int division =  a/b;                                                 |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
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

    private static void Operadores_Relacionales() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                         OPERADORES RELACIONALES                          |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|     Estos operadores se utilizan para comparar dos valores.              |");
            System.out.println("|                                                                          |");
            System.out.println("|     == : Igual a                                                         |");
            System.out.println("|     != : Diferente de                                                    |");
            System.out.println("|     > : Mayor que                                                        |");
            System.out.println("|     < : Menor que                                                        |");
            System.out.println("|     >= : Mayor o igual que                                               |");
            System.out.println("|     <= : Menor o igual que                                               |");
            System.out.println("|                                                                          |");
            System.out.println("|     Ejemplo:                                                             |");
            System.out.println("|                                                                          |");
            System.out.println("|     int a = 10;                                                          |");
            System.out.println("|     int b = 5;                                                           |");
            System.out.println("|     boolean esIgual = (a == b); // esIgual = false                       |");
            System.out.println("|     boolean esMayor = (a > b);  // esMayor = true                        |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
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

    private static void Operadores_Logicos() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          OPERADORES LOGICOS                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|    Los operadores lógicos están relacionados con el álgebra de           |");
            System.out.println("|    Boole. Evalúan una expresión en la que están implicados uno o dos     |");
            System.out.println("|    operandos con valor de tipo boolean. Retornan como resultando un      |");
            System.out.println("|    valor lógico, que será true si la evaluación de la expresión es       |");
            System.out.println("|    cierta o false en caso contrario.                                     |");
            System.out.println("|                                                                          |");
            System.out.println("|     && : Y lógico (AND)                                                  |");
            System.out.println("|     || : O lógico (OR)                                                   |");
            System.out.println("|     ! : No lógico (NOT)                                                  |");
            System.out.println("|                                                                          |");
            System.out.println("|     Ejemplo:                                                             |");
            System.out.println("|                                                                          |");
            System.out.println("|     boolean a = true;                                                    |");
            System.out.println("|     boolean b = false;                                                   |");
            System.out.println("|     boolean resultado = a && b; // resultado = false                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
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

    private static void Operadores_Asignacion() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                       OPERADORES DE ASIGNACION                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|     Los operadores de asignación son fundamentales en Java ya que        |");
            System.out.println("|     permiten asignar valores a variables. A través de estos              |");
            System.out.println("|     operadores, se puede almacenar información en variables para su      |");
            System.out.println("|     posterior uso en el programa.                                        |");
            System.out.println("|                                                                          |");
            System.out.println("|     = : Asignación simple                                                |");
            System.out.println("|     += : Asignación con suma                                             |");
            System.out.println("|     -= : Asignación con resta                                            |");
            System.out.println("|     *= : Asignación con multiplicación                                   |");
            System.out.println("|     /= : Asignación con división                                         |");
            System.out.println("|     %= : Asignación con módulo                                           |");
            System.out.println("|                                                                          |");
            System.out.println("|     Ejemplo:                                                             |");
            System.out.println("|                                                                          |");
            System.out.println("|    int x = 10;                                                           |");
            System.out.println("|    x += 5;  // Equivalente a x = x + 5; x = 15                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
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

    private static void Operadores_Incremento_Decremento() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                   OPERADORES INCREMENTO / DECREMENTO                     |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|    Java tiene dos operaciones opuestas llamadas incremento (++) y        |");
            System.out.println("|    decremento (--), que aumentan o disminuyen el valor de una            |");
            System.out.println("|    variable en uno .                                                     |");
            System.out.println("|                                                                          |");
            System.out.println("|    Ejemplo:                                                              |");
            System.out.println("|                                                                          |");
            System.out.println("|    int c = 10;                                                           |");
            System.out.println("|    c++; // c = 11                                                        |");
            System.out.println("|    --c; // c = 10                                                        |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '1' para volver al menú OPERADORES ARITMETICOS: ");
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

    private static void CondicionalIfElse() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                         IF, ELSE IF Y ELSE                               |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                      1. Explicación de IF                                |");
            System.out.println("|                      2. Explicación de ELSE IF                           |");
            System.out.println("|                      3. Explicación de ELSE                              |");
            System.out.println("|                      4. PROGRAMA DE IF, else if /Else                    |");
            System.out.println("|                      5. Volver a MENU PRINCIPAL                          |");
            System.out.println("----------------------------------------------------------------------------");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    Explicacion_if();
                    break;
                case 2:
                    Explicacion_else_if();
                    break;
                case 3:
                    Explicacion_else();
                    break;
                case 4:
                    Programa_if_else();
                case 5:
                    System.out.println("Retornando al menu anterior...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opcion != 5);
    }

    private static void Explicacion_if() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION IF                                  |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| Es una construcción del lenguaje que controla el orden de las            |");
            System.out.println("| instrucciones. Se le pasa una expresión lógica entre paréntesis y luego  |");
            System.out.println("| se describe un bloque de código entre llaves. Este bloque de código      |");
            System.out.println("| se ejecutará solo si la condición se cumple. Si la condición no se       |");
            System.out.println("| cumple, se omitirá el bloque de código.                                  |");
            System.out.println("| if (condición){}                                                         |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL IF ELSE: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL IF ELSE...                          ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);
    }
    private static void Explicacion_else_if() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                         EXPLICACION ELSE IF                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| Se utiliza en Java para tomar decisiones sobre un valor preexistente     |");
            System.out.println("| Es decir, si una condición basada en ese valor se cumple (si esa         |");
            System.out.println("| condición es verdadera), el programa tomará un camino. Si no el          |");
            System.out.println("| programa tomará otro. A esa condición se la llama condición booleana,    |");
            System.out.println("| ya que solo puede tomar como valor verdadero o falso.                    |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL IF ELSE: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL IF ELSE...                          ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);
    }
    private static void Explicacion_else() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                         EXPLICACION ELSE                                 |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| Se utiliza como parte de una estructura de control condicional junto     |");
            System.out.println("| con if. El bloque else especifica una sección de código que se           |");
            System.out.println("| si la condición evaluada en el bloque if es falsa.                       |");
            System.out.println("| if (condicion){                                                          |");
            System.out.println("| } else{}                                                                 |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL IF ELSE: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL IF ELSE...                          ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);
    }
    private static void Programa_if_else() {

        int opcion;
        do {
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("|                                                                          |");
                System.out.println("|                   Ingrese el carro que desea cotizar                     |");
                System.out.println("|                                                                          |");
                System.out.println("|                         1. Logan                                         |");
                System.out.println("|                         2. KIA Rio                                       |");
                System.out.println("|                         3. Volkswagen Gol                                |");
                System.out.println("|                         4. Chevrolet Spark                               |");
                System.out.println("|                                                                          |");
                System.out.println("----------------------------------------------------------------------------");



                int calificacion =scanner.nextInt();
                if (calificacion < 1 || calificacion > 4){
                    System.out.println("Ingrese una opcion valida");
                }
                else
                    switch (calificacion){
                        case 1:
                            System.out.println(" Logan : $65.500.000 pesos");
                            break;
                        case 2:
                             System.out.println(" KIA Rio : $71.250.000 pesos");
                            break;
                        case 3:
                            System.out.println(" Volkswagen Gol : $55.680.000 pesos");
                            break;
                        case 4:
                            System.out.println(" Chevrolet Spark : $61.862.000 pesos");
                            break;
                    }
            }

            System.out.print("Ingrese '2' para volver al menú CONDICIONAL IF ELSE: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú     IF, ELSE IF Y ELSE                          ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);
    }

    private static void CondicionalSwitch() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                        CONDICIONAL SWITCH                                |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                        1. Explicacion Switch                             |");
            System.out.println("|                        2. Programa de Switch - Valide su calificación    |");
            System.out.println("|                           Digite la opcion:                              |");
            System.out.println("|                        3. Volver a MENU PRINCIPAL                        |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_switch();
                    break;
                case 2:
                    Programa_de_switch();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ DATOS PRIMITIVOS...                              ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_switch() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION SWITCH                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|    Es una estructura que evalúa más de un caso y se caracteriza          |");
            System.out.println("|    por: Selección de una opción entre varias.                            |");
            System.out.println("|                                                                          |");
            System.out.println("|    Switch recibe un “caso” y lo evalúa hasta encontrar el caso           |");
            System.out.println("|    que corresponda                                                       |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '3' para volver al menú CONDICIONAL SWITCH: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL SWITCH...                           ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 3);

    }

    private static void Programa_de_switch() {
        int opcion;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                 Ingrese '1' para ver el ejemplo                          |");
            System.out.println("|             ingrese '2' para volver al menú SWITCH                       |");
            System.out.println("----------------------------------------------------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("\nIngrese una calificación (1 a 10): ");
                    int calificacion = scanner.nextInt();

                    switch (calificacion) {
                        case 1:
                        case 2:
                            System.out.println("Su calificación es: F");
                            break;
                        case 3:
                        case 4:
                            System.out.println("Su calificación es: D");
                            break;
                        case 5:
                        case 6:
                            System.out.println("Su calificación es: C");
                            break;
                        case 7:
                        case 8:
                            System.out.println("Su calificación es: B");
                            break;
                        case 9:
                        case 10:
                            System.out.println("Su calificación es: A");
                            break;
                        default:
                            System.out.println("Número no válido, por favor verifique");
                            break;
                    }
                    break;
                // Consume the newline character
                case 2:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL SWITCH...                           ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }

        } while (opcion != 2);
    }

    private static void CondicionalTernaria() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                    CONDICIONAL TERNARIA                                  |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|          1. Explicacion de ternaria                                      |");
            System.out.println("|          2. Programa ternaria - determine si un número es par o impar    |");
            System.out.println("|             Digite la opcion:                                            |");
            System.out.println("|          3. Volver a MENU PRINCIPAL                                      |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_de_ternaria();
                    break;
                case 2:

                    Programa_ternaria();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ DATOS PRIMITIVOS...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_de_ternaria() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                        EXPLICACION TERNARIA                              |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|  Es una construcción que permite tomar decisiones basadas en una         |");
            System.out.println("|  condición booleana de manera concisa en una sola línea de código.       |");
            System.out.println("|  Es una forma abreviada de expresar una estructura condicional(if-else)  |");
            System.out.println("|  Este operador se compone de tres partes:                                |");
            System.out.println("|  - La condición a evaluar (condición booleana)                           |");
            System.out.println("|  - El valor si la condición es verdadera (valor verdadero)               |");
            System.out.println("|  - El valor si la condición es falsa (valor falso)                       |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú CONDICIONAL TERNARIA: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL TERNARIA...                         ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);

    }

    private static void Programa_ternaria() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|            PROGRAMA TERNARIA - Determine si un número es par o impar         |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El número " + numero + " es " + resultado);
        int opcion;
        do {
            System.out.println(" Ingrese '2' para volver al menú TERNARIA");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú CONDICIONAL TERNARIA...                         ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 2);

    }

    private static void BucleDoWhile() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                         BUCLE DO WHILE                                   |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|             1. Explicacion de DO WHILE                                   |");
            System.out.println("|             2. Programa DO WHILE - adivina el numero                     |");
            System.out.println("|                Digite la opcion:                                         |");
            System.out.println("|             3. Volver a MENU PRINCIPAL                                   |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_de_do_while();
                    break;
                case 2:
                    Programa_do_while();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);


    }

    private static void Explicacion_de_do_while() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION  DO WHILE                           |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| La estructura repetitiva es aquella en que el cuerpo del bucle se        |");
            System.out.println("| repite mientras que se cumple una determinada condición.                 |");
            System.out.println("| En esta estructura, la condición del ciclo se evalúa al final, por lo    |");
            System.out.println("| que siempre se ejecutarán las instrucciones del ciclo por lo menos       |");
            System.out.println("| una vez. Si la condición se evalúa verdadera, se ejecuta nuevamente      |");
            System.out.println("| el cuerpo del bucle; si la condición es falsa, entonces sale y se sigue  |");
            System.out.println("| con el flujo normal del algoritmo. Este proceso se repite una y otra     |");
            System.out.println("| vez hasta que la condición sea falsa.                                    |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE DO WHILE: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE DO WHILE...                               ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opcion valida.");
            }
        } while (opcion != 2);

    }

    private static void Programa_do_while() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|            PROGRAMA DO WHILE- Adivina el número                          |");
        System.out.println("----------------------------------------------------------------------------");

        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        int adivinanza;
        do {
            System.out.println("Adivina un numero entre 1 y 10: ");
            System.out.println("Ingrese el numero ");
            adivinanza = scanner.nextInt();
            if (adivinanza < numeroAleatorio) {
                System.out.println("El número es mayor. Intente de nuevo.");
            } else if (adivinanza > numeroAleatorio) {
                System.out.println("El número es menor. Intente de nuevo.");
            } else {
                System.out.println(" Adivinaste el número.");
            }
        } while (adivinanza != numeroAleatorio);//continua hasta que la adivinanza sea correcta

    }
    private static void BucleWhile() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                          BUCLE WHILE                                     |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                   1. Explicacion While                                   |");
            System.out.println("|                   2. Programa de While - Sumatoria de numeros            |");
            System.out.println("|                   3. Volver a MENU PRINCIPAL                             |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_while();
                    break;
                case 2:
                    Programa_de_while();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_while() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                          EXPLICACION WHILE                               |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|   Es una estructura cíclica, que nos permite ejecutar una o varias       |");
            System.out.println("|   líneas de código de manera repetitiva sin tener un valor inicial       |");
            System.out.println("|   e incluso a veces sin conocer cuando se va a dar el valor final        |");
            System.out.println("|   esperado,los cliclos while, no dependen de valores numéricos,          |");
            System.out.println("|   sino de valores booleanos, su ejecución depende del valor de           |");
            System.out.println("|   verdad de una condición dada,verdadera o falso.                        |");
            System.out.println("|   son mucho más efectivos para condiciones indeterminadas.               |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE WHILE: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE WHILE...                                  ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opción valida.");
            }
        } while (opcion != 2);

    }
    private static void Programa_de_while() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                     PROGRAMA WHILE- Sumatoria                            |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Ingrese un número entero:  ");
        int numeroE = scanner.nextInt();
        int sumatoria = 0;
        int contador = 1;
        while (contador <= numeroE){
            sumatoria += contador;
            contador++;
        }
        System.out.println(" La sumatoria de los números del 1 al " + numeroE + " es: " + sumatoria);
        int opcion;
        do {
            System.out.println(" Ingrese '2' para volver al menú BUCLE WHILE");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE WHILE...                                  ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 2);
    }
    private static void BucleFor() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                           BUCLE FOR                                      |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                   1. Explicacion For                                     |");
            System.out.println("|                   2. Programa de For - Sumatoria de números              |");
            System.out.println("|                   3. Volver a MENU PRINCIPAL                             |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();// Consume the newline character
            switch (opcion) {
                case 1:
                    Explicacion_for();
                    break;
                case 2:
                    Programa_de_for();
                    break;
                case 3:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo a MENÚ PRINCIPAL...                                     ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (opcion != 3);
    }

    private static void Explicacion_for() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                                                                          |");
            System.out.println("|                           EXPLICACION FOR                                |");
            System.out.println("|                                                                          |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|  Es una estructura de control cíclica, nos permiten ejecutar una o       |");
            System.out.println("|  varias líneas de código de forma iterativa (o repetitiva), pero         |");
            System.out.println("|  teniendo cierto control y conocimiento sobre las iteraciones. En el     |");
            System.out.println("|  ciclo for, es necesario tener un valor inicial y un valor final, y      |");
            System.out.println("|  opcionalmente podemos hacer uso del tamaño del paso entre cada giro     |");
            System.out.println("|  o iteración del ciclo.                                                  |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese '2' para volver al menú BUCLE FOR: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (opcion) {
                case 1:
                    System.out.println("                                                                    ");
                    System.out.println("  Volviendo al menú BUCLE FOR...                                    ");
                    System.out.println("                                                                    ");
                    break;
                default:
                    System.out.println("Ingrese la opción valida.");
            }
        } while (opcion != 2);

    }

    private static void Programa_de_for() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                      PROGRAMA FOR- Sumatoria                             |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Ingrese un número entero:  ");
        int numeroF = scanner.nextInt();
        int sumaF = 0;
        for (int i = 1; i <= numeroF; i++){
            sumaF += i;
        }
        System.out.println("La sumatoria de los números entre 1 y " + numeroF + " es: " + sumaF);

    }
}