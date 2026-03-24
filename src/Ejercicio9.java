import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de Alumnos: ");
    int cantidadDeAlumnos = teclado.nextInt();
    double sumaTotalDeNotas = 0;
    double promedio = 0;
    for (int i = 1; i <= cantidadDeAlumnos; i++) {

        double nota = -1;
        boolean notaValida = false;

        while (!notaValida){
            System.out.print("Ingrese la nota del 0 al 10: ");
            if (teclado.hasNextInt()) {
                nota = teclado.nextDouble();
                if (nota <= 10 && nota >= 0) {
                    notaValida = true;
                } else {
                    System.out.println("Error: La nota debe estar exactamente entre 0 y 10.\n");
                }
            } else {
                System.out.println("Error: Ingresaste letras, agrega un numero entre 0 y 10");
                teclado.next();
            }
        }
        System.out.println("¡Nota ingresada con éxito!: " + nota);
        sumaTotalDeNotas = sumaTotalDeNotas + nota;
        promedio = sumaTotalDeNotas / cantidadDeAlumnos;
    }
    System.out.print("El promedio de notas es: " + promedio);
}