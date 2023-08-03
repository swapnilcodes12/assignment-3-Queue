public class Queue {

    private static Queue instance;
    private int front;
    private int rear;
    private int size;
    private int[] queue;

    private Queue(int size) {
        front = 0;
        rear = 0;
        this.size = size;
        queue = new int[size];
    }

    public static  Queue getInstance(int size) {
        if (instance == null) {
            instance = new Queue(size);
        }
        return instance;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == size;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear] = item;
            rear++;
        }
    }

    public int delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = queue[front];
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
            return data;
        }
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.printf(queue[i] + " ");
        }
        System.out.println();
    }

}
