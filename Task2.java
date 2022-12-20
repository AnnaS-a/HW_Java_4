// Задача 2: Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task2 {
    int size = 10;
    int items[] = new int[size];
    int front = -1;
    int rear = -1;

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
            items[rear] = element;
            System.out.println("Добавлен элемент " + element);     
        }
    }

    int deQueue() {           //метод возвращает первый элемент из очереди и удаляет его
        int element;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;         // Внутри только один элемент, поэтому очередь сбрасывается        
                rear = -1;          //в начальное состояние после удаления последнего элемента
            } else {
                front++;
            }
            System.out.println("Удален элемент:" + element);
            return (element);
        }
    }

    int First() {
        int element;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            element = items[front];
            System.out.println("\nПервый элемент в очереди: " + element);
            return (element);
        }
    }

    void display() {               // метод выводит элементы очереди в консоль 
        int i;
        if (isEmpty()) {
        System.out.println("Пустая очередь");
        } else {
            System.out.println("Элементы: ");
            for (i = front; i <= rear; i++){
                System.out.print(items[i] + "  ");
            }          
        }
    }

    public static void main(String[] args) {
        Task2 q = new Task2();
                
        q.enQueue(12);      // Помещаем элемент в конец очереди
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(4);
        q.enQueue(15);
        q.enQueue(9);

        q.display();

        q.First();                  //возвращает первый элемент из очереди, не удаляя

        q.deQueue();      // удаляет первый элемент 
        q.display();       // видим, внутри очереди 4 элемента

        q.First();   

        q.enQueue(22);
        q.enQueue(5);
        q.display();
    }
}

    

