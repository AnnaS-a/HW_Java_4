import java.util.LinkedList;
// Задача 2: Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task2A {
    int size = 10;
    int items[] = new int[size];
    int front = -1;
    int rear = -1;
    int n;
    private LinkedList<Integer> q = new LinkedList<>();

    boolean isFull() {                      //Проверка, полна ли очередь
        if (front == 0 && rear == size - 1) {
            return true;
        }
            return false;
    }

    boolean isEmpty() {              //Проверка, пустая ли очередь
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    void enQueue(int element) {           //метод помещает элемент в конец очереди
        if (isFull()) {
            System.out.println("Очередь заполнена");
        } else {
            if (front == -1){
                front = 0;
            } 
            rear++;
            q.add(element);
            System.out.println("Добавлен элемент " + element);     
        }
    }

    int deQueue() {           //метод возвращает первый элемент из очереди и удаляет его
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            if (front >= rear) {
                front = -1;         // Внутри только один элемент, поэтому очередь сбрасывается        
                rear = -1;          //в начальное состояние после удаления последнего элемента
            } else {
                q.removeFirst();
                front++;
            }
            System.out.println("\nУдален первый элемент.");
            return (q.element());
        }
    }

    int First() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            System.out.println("\nПервый элемент в очереди: " + q.element());
            return (q.element());
        }
    }

    void display() {               // метод выводит элементы очереди в консоль 
        int i;
        if (isEmpty()) {
        System.out.println("Пустая очередь");
        } else {
            System.out.println("Элементы: ");
            for (i = front; i <= rear; i++){   
            }       
        }
        System.out.print(q);
    }
}
