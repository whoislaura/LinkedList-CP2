import java.util.*;

public class LinkedList<T> implements IList<T>{

    private Node<T> head, tail;
    private int size;

    public LinkedList (){
        this.head = null;
        this.tail = null;
        size = 0;
    }

    //Mostrar la lista
    public void mostrar(){
        System.out.print('[');
        Node<T>cursor = head;
        for(int i=0; i<size; i++){
            System.out.print(cursor.getVal());
            cursor = cursor.getNext();
            if(i == size-1) break;
            System.out.print(", ");
        }
        System.out.print("]");
    }

    //1. Eliminar elementos repetidos
    public void eliminarRepetidos(){
        Node<T> cursor = head;
        while (cursor != null) {
            Node<T> previous = cursor;
            Node<T> current = cursor.getNext();

            while (current != null) {
                if (Objects.equals(cursor.getVal(), current.getVal())) {
                    previous.setNext(current.getNext());
                    if (current == tail) {
                        tail = previous;
                    }
                    size--;
                    current = previous.getNext();
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }

            cursor = cursor.getNext();
        }
    }

    //2. Rotar elementos una posicion a la derecha
    public void rotarDerecha(){
        if (size <= 1) {
            return;
        }
        Node<T> oldTail = tail;
        Node<T> newTail = head;
        while (newTail.getNext() != oldTail) {
            newTail = newTail.getNext();
        }
        oldTail.setNext(head);
        head = oldTail;
        tail = newTail;
        tail.setNext(null);
    }
    //3. Concatenar 2 listas
    public void concat(LinkedList<T> l2){
        if (l2 == null) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        int elementsToAdd = l2.size;
        Node<T> cursor = l2.head;
        for (int i = 0; i < elementsToAdd; i++) {
            add(cursor.getVal());
            cursor = cursor.getNext();
        }
    }

    @Override
    public void add(T o) {
        Node<T> value = new Node<>(o);

        if(isEmpty()) head = tail = value;

        else{
            tail.setNext(value);
            tail = value;
        }
        size++;
    }

    @Override
    public void add(T o, int index) {
        if (index >= 0 && index <= size()) {
            if (index == 0) {
                head = new Node<T>(o, head);
                if (isEmpty()) tail=head;
            }
            else if (index == size()) {
                add(o);
                return;
            }
            else {
                Node<T> cursor = head;
                for (int i = 0; i < index - 1; i++) {
                    cursor = cursor.getNext();
                }
                Node<T> node = new Node<>(o);
                node.setNext(cursor.getNext());
                cursor.setNext(node);
            }
            size++;
        }
        else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    @Override
    public T remove(int index) {
        if(index >= 0 && index < size) {
            Node<T> aux;
            if(index == 0) {
                aux = head;
                head = head.getNext();

                if(head == null) tail = null;
            }
            else{
                Node<T> cursor = head;
                for (int i = 0; i < index - 1; i++) {
                    cursor = cursor.getNext();
                }
                aux = cursor.getNext();
                cursor.setNext(aux.getNext());
                if (aux == tail) {
                    tail = cursor;
                }
            }
            size--;
            return aux.getVal();
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    @Override
    public T get(int index) {
        if(index >= 0 && index < size){
            if(index == size-1) return tail.getVal();

            Node<T>cursor = head;
            for(int i=0; i<index; i++){
                cursor = cursor.getNext();
            }
            return cursor.getVal();
        }
        else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
