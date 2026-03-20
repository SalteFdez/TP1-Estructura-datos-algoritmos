void main() {
    IO.println("--- Calculadora de Superficies y Perímetros (Valores Fijos) ---\n");

    // ==========================================
    // 1. CÍRCULO
    // ==========================================
    // Asignamos un valor fijo al radio
    double radio = 5.0;

    double superficieCirculo = Math.PI * Math.pow(radio, 2);
    double perimetroCirculo = 2 * Math.PI * radio;

    IO.println("--- CÍRCULO ---");
    IO.println("Radio asignado: " + radio);
    IO.println("Superficie: " + superficieCirculo);
    IO.println("Perímetro: " + perimetroCirculo + "\n");


    // ==========================================
    // 2. RECTÁNGULO
    // ==========================================
    double baseRectangulo = 10.0;
    double alturaRectangulo = 4.0;

    double superficieRectangulo = baseRectangulo * alturaRectangulo;
    double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

    IO.println("--- RECTÁNGULO ---");
    IO.println("Base: " + baseRectangulo + ", Altura: " + alturaRectangulo);
    IO.println("Superficie: " + superficieRectangulo);
    IO.println("Perímetro: " + perimetroRectangulo + "\n");


    // ==========================================
    // 3. TRIÁNGULO
    // ==========================================
    double baseTriangulo = 6.0;
    double alturaTriangulo = 8.0;
    double lado1 = 6.0;
    double lado2 = 8.0;
    double lado3 = 10.0;

    // Cuidado acá con el orden de las operaciones, usamos paréntesis
    double superficieTriangulo = (baseTriangulo * alturaTriangulo) / 2;
    double perimetroTriangulo = lado1 + lado2 + lado3;

    IO.println("--- TRIÁNGULO ---");
    IO.println("Base: " + baseTriangulo + ", Altura: " + alturaTriangulo);
    IO.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
    IO.println("Superficie: " + superficieTriangulo);
    IO.println("Perímetro: " + perimetroTriangulo + "\n");


    // ==========================================
    // 4. ROMBO
    // ==========================================
    double diagonalMayor = 12.0;
    double diagonalMenor = 8.0;
    double ladoRombo = 7.21;

    double superficieRombo = (diagonalMayor * diagonalMenor) / 2;
    double perimetroRombo = 4 * ladoRombo;

    IO.println("--- ROMBO ---");
    IO.println("Diagonal Mayor: " + diagonalMayor + ", Diagonal Menor: " + diagonalMenor);
    IO.println("Lado: " + ladoRombo);
    IO.println("Superficie: " + superficieRombo);
    IO.println("Perímetro: " + perimetroRombo);

    IO.println("\n¡Cálculos finalizados!");
}