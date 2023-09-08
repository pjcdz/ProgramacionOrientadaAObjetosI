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
        boolean incluirMinusculas = true;
        boolean incluirDigitos = true;

        System.out.print("Ingresa la longitud: ");
        int longitud = scanner.nextInt();
        int count = 0;

        while (count <= longitud) {
            int sigRandom = random.nextInt(3);

            if (sigRandom == 0) {
                if (incluirMayusculas) {
                    String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVW";
                    int indiceRandom = random.nextInt(mayusculas.length());
                    System.out.print(mayusculas.charAt(indiceRandom));
                }
            } else if (sigRandom == 1) {
                if (incluirMinusculas) {
                    String minusculas = "abcdefghijklmnopqrstuvwxyz";
                    int indiceRandom = random.nextInt(minusculas.length());
                    System.out.print(minusculas.charAt(indiceRandom));
                }
            } else if (sigRandom == 2) {
                if (incluirDigitos) {
                    String digitos = "123456789";
                    int indiceRandom = random.nextInt(digitos.length());
                    System.out.print(digitos.charAt(indiceRandom));
                }
            }

            count++;
        }
    }
}
