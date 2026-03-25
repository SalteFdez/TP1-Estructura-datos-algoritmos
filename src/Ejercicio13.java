void main() {
    int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6}
    };
    int[][] matrizB = {
            {-1, 0},
            {0, 1},
            {1, 1}
    };
    int[][] resultado = new int[2][2];

    // 1er Bucle (i): Recorre las filas de la Matriz A (de 0 a 1)
    for (int i = 0; i < 2; i++) {

        // 2do Bucle (j): Recorre las columnas de la Matriz B (de 0 a 1)
        for (int j = 0; j < 2; j++) {

            // 3er Bucle (k): Es el puntero que se mueve por los 3 números de la fila y columna
            // (Recorre de 0 a 2)
            for (int k = 0; k < 3; k++) {

                // Acá se aplica la fórmula del acumulador:
                // Se multiplica el elemento de A por el de B y se suma al cajoncito del resultado
                resultado[i][j] = resultado[i][j] + (matrizA[i][k] * matrizB[k][j]);

            }
        }
    }
    // --- IMPRESIÓN DEL RESULTADO ---
    System.out.println("El producto de las matrices es:");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            // Usamos print con un espacio para que queden uno al lado del otro
            System.out.print(resultado[i][j] + " ");
        }
        // Hacemos un salto de línea cuando termina la fila
        System.out.println();
    }
}