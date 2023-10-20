// public class clase2508{
//     public static void main(String[] args) {
//         int numero = 23;
//         if (numero % 2 == 0) {
//             System.out.println("El numero es par");
//         } else {
//             System.out.println("El numero es impar");
//         }
//     }
// }

// #########################################################################################################

// public class clase2508{
//     public static void main(String[] args) {
//         int numero1 = 223;
//         int numero2 = 50;

//         if (numero1 > numero2) {
//             System.out.println("El numero es mayor");
//         } else if (numero1 == numero2 ) {
//             System.out.println("El numero igual");
//         } else {
//             System.out.println("El numero menor");
//         }
//     }
// }

// #########################################################################################################

// public class clase2508{
//     public static void main(String[] args) {
//         int calificacion = 1;

//         switch (calificacion) {
//             case 1:
//                 System.out.println("1 estrella");
//                 break;
//             case 2:
//                 System.out.println("2 estrellas");
//                 break;
//             case 3:
//                 System.out.println("3 estrellas");
//                 break;
//             case 4:
//                 System.out.println("4 estrellas");
//                 break;
//             case 5  :
//                 System.out.println("5 estrellas");
//                 break;
//             default:
//                 System.out.println("Error en la variable de calificacion");
//                 break;
//         }
//     }
// }

// #########################################################################################################

// public class clase2508{
//     public static void main(String[] args) {
//         int[][] matriz = {
//             { 1, 2, 3},
//             { 4, 5, 6},
//             { 7, 8, 9}
//         };
//         // { 0,0 0,1, 0,2},
//         // { 1,0 1,1 1,2},
//         // { 2,0 2,1 2,2}

//         int filas = matriz.length;
//         int columnas = matriz[0].length;

//         for(int i = 0; i < filas; i++) {
//             for(int j = 0; j < columnas; j++) {
//                 if (i<=j) {
//                     // System.out.println(matriz[i][j]);
//                     int aux = matriz[i][j];
//                     matriz[i][j] = matriz[j][i];
//                     matriz[j][i] = aux;
//                 }
//             }
//         }

//         // 123
//         // 456
//         // 789

//         // 147
//         // 258
//         // 369
        
//         for(int i = 0; i < filas; i++) {
//             for(int j = 0; j < columnas; j++) {
//                 System.out.println(matriz[i][j]);
//             }
//         }
//     }
// }

// #########################################################################################################

// public class clase0825{
//     public static void main(String[] args) {
//         char[][] tablero = new char[8][8];

//         int filas = tablero.length;
//         int columnas = tablero[0].length;
//         for(int x = 0; x < filas; x++) {
//             for(int u = 0; u < columnas; u++) {
//                 if ( (x + u) % 2 == 0) {
//                     System.out.print("# ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             // // System.out.println("");
//         }
//     }
// }

