public  class Ejercicio11Imprimir {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Alas de Sangre", "Rebecca Yarros", 154215, 24.95);
        libro1.imprimir();
        System.out.println("------------------");
        CuentaBancaria cuenta1 = new CuentaBancaria("Pepe");
        cuenta1.imprimir();
    }

}
