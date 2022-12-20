// Задача 2: Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task2A_1 {
    public static void main(String[] args) {
        Task2A q = new Task2A();           // Добавляем в очередь элементы                                   
        q.enQueue(2);
        q.enQueue(42);
        q.enQueue(17);
        q.enQueue(4);
        q.enQueue(5);            
                
        q.First();
        q.display();
                                    
        q.deQueue();          // Функция удаляет первый элемент 
        q.display();
    }
}