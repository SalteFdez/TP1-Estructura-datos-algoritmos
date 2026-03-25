void main() {
    int[] lista = new int[10];
    //System.out.println("Números en orden:");
    for (int i = 0; i < lista.length; i++) {
        lista[i] = i + 1;
        /*
        if (i < 9){
            System.out.print(lista[i] + ", ");
        } else {
            System.out.print(lista[i]);
        } */
    }

    System.out.println("Números en orden inverso:");
    for (int i = lista.length - 1; i >= 0 ; i--) {
        if (i > 0){
            System.out.print(lista[i] + ", ");
        } else {
            System.out.print(lista[i]);
        }
    }
}