package c1030.EjercicioSimple.Ej02;

public class App {
    public static void main(String[] args) {
        // System.out.println("as");
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1,100);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(2, 1000);

        System.out.println( cuentaAhorro.getSaldo() );

        cuentaAhorro.Retirar(10);
        cuentaAhorro.Depositar(0.01);

        System.out.println( cuentaAhorro.getSaldo() );

        cuentaAhorro.Transferir(cuentaCorriente,10);

        System.out.println( cuentaAhorro.getSaldo() );
        System.out.println( cuentaCorriente.getSaldo() );
    }
}
