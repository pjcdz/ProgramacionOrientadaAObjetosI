package EjercicioSimple.Ej02;

public abstract class CuentaBancaria {
    int numeroDeCuenta;
    double saldo;
    
    public CuentaBancaria(int numeroDeCuenta, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Depositar(double monto) {
        System.out.println( "Saldo anterior: " + getSaldo() );

        try {
            if (monto > 0) {
                this.saldo += monto;
            } else {
                throw new Exception("Debe depositar un valor mayor a 0");
            }
        } catch (Exception e1) {
            System.out.println( e1.getMessage() );
        }

        System.out.println( "Saldo posterior: " + getSaldo() );
    }

    public void Retirar(double monto) {
        System.out.println( "Saldo anterior: " + getSaldo() );

        try {
            if (monto <= saldo) {
                this.saldo -= monto;
            } else {
                throw new Exception("No puede retirar una cantidad mayor al saldo actual");
            }
        } catch (Exception e2) {
            System.out.println( e2.getMessage() );
        }
        
        System.out.println( "Saldo posterior: " + getSaldo() );
    }

    public void Transferir(CuentaBancaria cuentaBancaria, double monto) {
        System.out.println( "Saldo anterior: " + getSaldo() );

        Retirar(monto);
        cuentaBancaria.Depositar(monto);
    }
}
