void main(String[] args) {
    //Como Entero
    int numeroSinIterar = 265;
    int numero = numeroSinIterar;
    int contador = 0;
    IO.println("Numero como entero: " + numero);
    while (numero > 0){
        int num = numero % 10;
        numero = numero / 10;
        contador += 1;
        System.out.print(num + " ");
    }
    System.out.print("\nCantidad de digitos: " + contador + "\n");
    //Como String
    String numeroEnTexto = String.valueOf(numeroSinIterar);
    IO.println("Numero como string: " + numeroEnTexto);
    for (int i = 0; i < numeroEnTexto.length(); i++) {
        char digito = numeroEnTexto.charAt(i);
        System.out.print(digito + " ");
    }
    System.out.print("\nCantidad de digitos como string: " + numeroEnTexto.length());
}