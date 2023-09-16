// import java.util.Scanner;
// import java.util.Random;

// public class clase0908{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();
    
//         int randomNum = random.nextInt(100);
//         System.out.println(randomNum);

//         int num = 0;
//         int intentos = 0;

//         do {

//             boolean esNum = false;
//             do {
//                 try {
//                     System.out.print("Ingresa tu intento: "); 
//                     num = scanner.nextInt();
//                     esNum = true;
//                 } catch (java.util.InputMismatchException e1) {
//                     System.out.println("Solo puedes ingresar numeros enteros"); 
//                     scanner.nextLine();
//                 }
//             } while(!esNum);
            
//             if (num > randomNum) {
//                 System.out.println("Menor"); 
//                 intentos++;
//             } else if (num < randomNum) {
//                 System.out.println("Mayor"); 
//                 intentos++;
//             } else {
//                 System.out.println("Congratz. El numero era " + randomNum + ", adivinarlo te tomo " + intentos + " intentos"); 
//             }
//         } while (num != randomNum);
//     }
// }

import java.util.Scanner;
import java.util.Random;

public class clase0908{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean incluirMayusculas = true;
        boolean incluirMinusculas = false;
        boolean incluirDigitos = false;

        // System.out.print("Ingresa la longitud: ");
        // int longitud = scanner.nextInt();
        int longitud = 10;
        int count = 0;

        // System.out.print("Incluir Mayuscular? true/false: ");
        // boolean incluirMayusculas = scanner.nextBoolean();
        // System.out.print("Incluir Minusculas? true/false: ");
        // boolean incluirMinusculas = scanner.nextBoolean();
        // System.out.print("Incluir Digitos? true/false: ");
        // boolean incluirDigitos = scanner.nextBoolean();

        String sig = "";

        if (incluirMayusculas) {
            sig += "0";
        } 
        if (incluirMinusculas) {
            sig += "1";
        }
        if (incluirDigitos) {
            sig += "2";
        }
        if (!incluirMayusculas && !incluirMinusculas && !incluirDigitos) {
            sig += "2";
        }

        // for (int x = 0; x < sig.length(); x++) {
        //     System.out.print(sig.charAt(x));
        // }

        // System.out.println("-- " + sig.length());
        // int sigRandom = random.nextInt(sig.length());
        // System.out.println(sigRandom);

        while (count <= longitud) {
            int sigCharAt = random.nextInt(sig.length());
            char sigRandomChar = sig.charAt(sigCharAt);
            int sigRandom = Character.getNumericValue(sigRandomChar);
            // System.out.println(sigRandom);

            if (sigRandom == 0) {
                String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVW";
                int indiceRandom = random.nextInt(mayusculas.length());
                System.out.print(mayusculas.charAt(indiceRandom));
            } else if (sigRandom == 1) {
                String minusculas = "abcdefghijklmnopqrstuvwxyz";
                int indiceRandom = random.nextInt(minusculas.length());
                System.out.print(minusculas.charAt(indiceRandom));
            } else if (sigRandom == 2) {
                String digitos = "123456789";
                int indiceRandom = random.nextInt(digitos.length());
                System.out.print(digitos.charAt(indiceRandom));
            }

            count++;
        }
    }
}
