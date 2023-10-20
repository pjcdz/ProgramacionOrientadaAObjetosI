// import java.util.Scanner;

// public class clase0901{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n1 = scanner.nextInt();
//         System.out.println("Primer numero: " + n1);
//         int n2 = scanner.nextInt();
//         System.out.println("Segundo numero: " + n2);
//         scanner.nextLine();
//         String op = scanner.nextLine();
//         System.out.println("Operador: " + op);

//         float res = 0;
//         switch(op) {
//             case "+":
//                 res = n1 + n2;
//                 break;
//             case "-":
//                 res = n1 - n2;
//                 break;
//             case "*":
//                 res = n1 * n2;
//                 break;
//             case "/":
//                 try {
//                     res = n1 / n2;
//                 } catch (ArithmeticException e2) {
//                     System.out.println("Division por cero");
//                     return;
//                 }
                
//                 break;
//             default:
//                 System.out.println("Operador invalido");
//                 return;
//         }

//         System.out.println("El resultado es: " + res);
//     }
// }

// ######################################################################################################################################

// import java.util.Scanner;
// import java.time.LocalDate;
// import java.time.Period;

// public class clase0901{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n1 = scanner.nextInt();       
//         int fecha = LocalDate.now().getYear();
//         int edad = fecha - n1;
//         System.out.println("Tenes:" + edad + "años");
//     }
// }

// ######################################################################################################################################

// import java.util.Scanner;

// public class clase0901{
//     public static void main(String[] args) {
//         System.out.println("Registro de alumnos");

//         Scanner scanner = new Scanner(System.in);
//         String nombre = ".";
//         do {
//             boolean nombreValido = false;

//             do {
//                 try {
//                     System.out.print("Nombre: ");
//                     nombre = scanner.nextLine();

//                     if (nombre.isEmpty()) {
//                         throw new IllegalArgumentException("No puede ser un nombre vacio");
//                     } else if (!nombre.matches("[a-zA-Z]+")) {
//                         throw new IllegalArgumentException("El nombre debe contener unicamente letras");
//                     } else {
//                         nombreValido = true;
//                     }
//                 } catch(IllegalArgumentException e1) {
//                     System.out.println(e1.getMessage());
//                 }
//             } while (!nombreValido);
            
//             if ( !nombre.equals("salir") ) {
//                 boolean edadValida = false;

//                 do {
//                     try {
//                         System.out.print("Edad: ");
//                         int edad = scanner.nextInt();
//                         edadValida = true;
//                         scanner.nextLine();
//                     } catch (java.util.InputMismatchException e2) {
//                         System.out.println("Ingrese una edad que sea un numero");
//                         scanner.nextLine();
//                     }
//                 } while (!edadValida);
//             }
//         } while (!nombre.equals("salir"));
//     }
// }
