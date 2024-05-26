/**
 * Phone Pyae Moe Yan
 * 05/25/2024
 * Lab 6
 * To learn to familiarize with q queue as used for simulation.
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Person> queue = new LinkedQueue<>();
        Random random = new Random();

        System.out.println("Add three people to the queue");
        queue.enqueue(new Person("John Doe", "1234567890", "Checking out books"));
        queue.enqueue(new Person("Jane Smith", "0987654321", "Getting a library card"));
        queue.enqueue(new Person("Alice Johnson", "1122334455", "Paying a fine"));

        System.out.println("Process two people");
        processQueue(queue, 2, random);

        System.out.println("Add two more people to the queue");
        queue.enqueue(new Person("Bob Brown", "2233445566", "Checking out books"));
        queue.enqueue(new Person("Charlie Davis", "3344556677", "Getting a library card"));

        System.out.println("Process two more people");
        processQueue(queue, 2, random);

        System.out.println("Add two more people");
        queue.enqueue(new Person("David Evans", "4455667788", "Paying a fine"));
        queue.enqueue(new Person("Eve Foster", "5566778899", "Checking out books"));

        System.out.println("Process the reamaining");
        processQueue(queue, 3, random);
    }

    private static void processQueue(LinkedQueue<Person> queue, int numberOfPeople, Random random) {
        for (int i = 0; i < numberOfPeople && !queue.isEmpty(); i++) {
            Person person = queue.dequeue();
            int extraTime = 0;

            if ("Checking out books".equals(person.getReasonForBeingInLine())) {
                extraTime = random.nextInt(5) + 1; // Random number of books (1 to 5)
            } else if ("Paying a fine".equals(person.getReasonForBeingInLine())) {
                extraTime = 1;
            }

            int totalTicks = 1 + extraTime;
            System.out.println("Processed " + person + " in " + totalTicks + " clock ticks.");
        }
    }
}

/* OUTPUT
Add three people to the queue
Process two people
Processed { Name: John Doe, Library Card Number: 1234567890, Reason: Checking out books } in 6 clock ticks.
Processed { Name: Jane Smith, Library Card Number: 0987654321, Reason: Getting a library card } in 1 clock ticks.
Add two more people to the queue
Process two more people
Processed { Name: Alice Johnson, Library Card Number: 1122334455, Reason: Paying a fine } in 2 clock ticks.
Processed { Name: Bob Brown, Library Card Number: 2233445566, Reason: Checking out books } in 3 clock ticks.
Add two more people
Process the reamaining
Processed { Name: Charlie Davis, Library Card Number: 3344556677, Reason: Getting a library card } in 1 clock ticks.
Processed { Name: David Evans, Library Card Number: 4455667788, Reason: Paying a fine } in 2 clock ticks.
Processed { Name: Eve Foster, Library Card Number: 5566778899, Reason: Checking out books } in 2 clock ticks.
*/

