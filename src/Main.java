public class Main {
    public static void main(String[] args) {

        Queue queue = Queue.getInstance(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        queue.display();

        queue.delete();

        queue.display();
    }
}