void main() {
    int caracter = 32;
    System.out.println("--- TABLA ASCII ---");
    for (int i = 32; i <= 127 ; i++) {
        char caracterASCII = (char) i;
        System.out.print(caracter + " --> ASCII: " + caracterASCII + "\n");
        caracter = caracter + 1;
    }
}