// import java.util.Scanner;

// public class clase0922 extends Calculadora {
//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("a: ");
//         int a = scanner.nextInt();
//         System.out.print("b: ");
//         int b = scanner.nextInt();

//         // Calculadora calculadora = new Calculadora(a, b);
        
//         scanner.nextLine();
//         System.out.print("Que operacion sera: ");
//         String op = scanner.nextLine();

//         if ( op.equals("+") ) {
//             System.out.println( sumar(a, b) );
//         } else if ( op.equals("-") ) {
//             System.out.println( restar(a, b) );
//         } else if ( op.equals("*") ) {
//             System.out.println( multiplicar(a, b) );
//         } else if ( op.equals("/") ) {
//             if ( dividir(a, b) != 0 ) {
//                 System.out.println( dividir(a, b) );
//             }
//         }
//     }
// }

// class Calculadora {
//     int a;
//     int b;

//     // Calculadora(int a, int b) {
//     //     this.a = a;
//     //     this.b = b;
//     // }

//     static int sumar(int a, int b){
//         return a + b;
//     }

//     static int restar(int a, int b) {
//         return a - b;
//     }

//     static int multiplicar(int a, int b) {
//         return a * b;
//     }

//     static int dividir(int a, int b) {
//         int res = 0;
//         try {
//             res = a / b;
//         } catch (ArithmeticException e1) {
//             System.out.println("No se puede dividir por 0");
//         }
//         return res;
//     }
// }

// public class clase0922 {
//     public static void main(String args[]) {
//         Obrero obrero = new Obrero("Pepe", 100, "Constructor");
//         obrero.getInformacion();
//     }
// }

// class Empleado {
//     private String nombre;
//     private double salario;

//     Empleado(String nombre, double salario) {
//         this.nombre = nombre;
//         this.salario = salario;
//     }

//     public String getNombre() {
//         return nombre;
//     }

//     public double getSalario() {
//         return salario;
//     }

//     public void getInformacion() {
//         System.out.println( getNombre() );
//         System.out.println( getSalario() );
//     }
// }

// class Gerente extends Empleado {
//     private String departamento;

//     Gerente(String nombre, double salario, String departamento) {
//         super(nombre, salario);
//         this.departamento = departamento;
//     }

//     public String getDepartamento() {
//         return departamento;
//     }

//     public void getInformacion() {
//         super.getInformacion();
//         System.out.println( getDepartamento() );
//     }
// }

// class Asistente extends Empleado {
//     private String proyecto;

//     Asistente(String nombre, double salario, String proyecto) {
//         super(nombre, salario);
//         this.proyecto = proyecto;
//     }

//     public String getProyecto() {
//         return proyecto;
//     }

//     public void getInformacion() {
//         super.getInformacion();
//         System.out.println( getProyecto() );
//     }
// }

// class Obrero extends Empleado {
//     private String especialidad;

//     Obrero(String nombre, double salario, String especialidad) {
//         super(nombre, salario);
//         this.especialidad = especialidad;
//     }

//     public String getEspecialidad() {
//         return especialidad;
//     }

//     public void getInformacion() {
//         super.getInformacion();
//         System.out.println( getEspecialidad() );
//     }
// }