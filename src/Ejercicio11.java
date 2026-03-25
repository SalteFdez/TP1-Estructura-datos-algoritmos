import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);
    String[] asignaturas = {"Matematicas", "Fisica", "Quimica", "Historia", "Lengua"};
    double[] notas = new double[asignaturas.length];
    for (int i = 0; i < asignaturas.length; i++) {
        System.out.print("Ingrese la nota de " + asignaturas[i] +": \n");
        double nota = teclado.nextDouble();
        notas[i] = nota;
    }
    System.out.println("\n--- BOLETÍN DE CALIFICACIONES ---");
    for (int i = 0; i < asignaturas.length; i++) {
        System.out.println("La nota de " + asignaturas[i] + "es : " + notas[i]);
    }
}