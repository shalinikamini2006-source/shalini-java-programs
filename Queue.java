import java.util.LinkedList;
import java.util.Queue;
 class QueueExample {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        System.out.println("Enqueuing elements:");
        myQueue.offer("Apple"); // Adds "Apple"
        myQueue.offer("Banana"); // Adds "Banana"
        myQueue.offer("Cherry"); // Adds "Cherry"
        System.out.println("Queue after enqueuing: " + myQueue);
        System.out.println("\nDequeuing elements:");
        String firstElement = myQueue.poll(); // Removes "Apple"
        System.out.println("Removed element: " + firstElement);
        System.out.println("Queue after first dequeue: " + myQueue);
        String secondElement = myQueue.poll(); // Removes "Banana"
        System.out.println("Removed element: " + secondElement);
        System.out.println("Queue after second dequeue: " + myQueue);
        System.out.println("\nAttempting to dequeue from an empty queue:");
        myQueue.poll(); // Removes "Cherry"
        System.out.println("Queue after third dequeue: " + myQueue);
        String emptyPoll = myQueue.poll(); // Returns null
        System.out.println("Attempted to poll from empty queue, result: " + emptyPoll);
    }
}