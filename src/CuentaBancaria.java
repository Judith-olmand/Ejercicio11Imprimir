public class CuentaBancaria implements Imprimible{
    private String titular;

    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    @Override
    public void imprimir(){
        System.out.println(titular);
    }
}
