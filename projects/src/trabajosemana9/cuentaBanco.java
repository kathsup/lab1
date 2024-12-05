package trabajosemana9;

public class cuentaBanco {
    public String cliente; 
    public int numeroCuenta; 
    public String telefono; 
    public float limite; 
    private float saldo; 

    public cuentaBanco() {
        this.cliente = " ";
        this.numeroCuenta = 0;
        this.telefono = " ";
        this.limite = 999999;
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void depositar(float monto) {
        if (monto > 0) {
            if (saldo + monto <= limite) {
                saldo = saldo + monto;
            }
        }
    }
    
    public void retirar(float monto) {
        if (monto > 0) {
            if (monto <= 0) {
                if (saldo - monto >= 0) {
                }
            }
        }
    }
    
    
    public static void main(String[]args){
    
    cuentaBanco cuenta = new cuentaBanco();
    cuenta.cliente="Paola cortes"; 
    cuenta.numeroCuenta=22345411; 
    cuenta.telefono="1234-5678";
    cuenta.limite=5000; 
    
        System.out.println("saldo actual: "+cuenta.getSaldo());
        cuenta.depositar(2400);
        System.out.println("saldo actual con deposito: "+cuenta.getSaldo());
    
        cuenta.retirar(2000);
        System.out.println("saldo actual con retiro: "+cuenta.getSaldo());
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
