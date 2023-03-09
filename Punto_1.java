public class Punto_1{
    public static void main(String[] args) {
        int columna;
        int fila;
        for (fila=1;fila<=10;fila++) {
            for (columna=1;columna<=fila;columna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}