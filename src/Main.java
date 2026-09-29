public class Main{
    public static void main(String[] args){
        LinkedList<Character> l1 = new LinkedList<>(), l2 = new LinkedList<>();
        l1.add('A');
        l1.add('A');
        l1.add('B');
        l1.add('A');
        l1.add('C');
        l1.add('B');
        l1.add('D');
        l1.add('D');

        l2.add('F');
        l2.add('G');
        l2.add('H');
        l2.add('E');

        System.out.print("Lista 1: ");
        l1.mostrar();
        System.out.println();
        System.out.print("Lista 2: ");
        l2.mostrar();
        System.out.println();

        System.out.println("\n===Eliminación de elementos repetidos===");
        System.out.print("Lista 1 antes: ");
        l1.mostrar();
        System.out.println();
        l1.eliminarRepetidos();
        System.out.print("Lista 1 después: ");
        l1.mostrar();
        System.out.println();

        System.out.println("\n===Rotación a la derecha de los elementos===");
        System.out.print("Lista 2 antes: ");
        l2.mostrar();
        System.out.println();
        l2.rotarDerecha();
        System.out.print("Lista 2 después: ");
        l2.mostrar();
        System.out.println();

        System.out.println("\n===Concatenación de cadenas===");
        System.out.print("Lista 1 antes: ");
        l1.mostrar();
        System.out.println();
        l1.concat(l2);
        System.out.print("Lista 1 concatenada con lista 2: ");
        l1.mostrar();
        System.out.println();

    }
}