public class Library {
    public static void main(String[] args) {
        LinkedStack<Book> stack = new LinkedStack<>();
        LinkedStack<Book> shelves = new LinkedStack<>();

        // Adding some books to the stack
        System.out.println("3 books are returned the Patron");
        stack.push(new Book("Book One", "Author A", "101"));
        stack.push(new Book("Book Two", "Author B", "102"));
        stack.push(new Book("Book Three", "Author C", "103"));

        System.out.println("Stack: ");
        stack.displayStack();

        System.out.println("Libraian came and put one book on the shelves");
        shelves.push(stack.pop());

        System.out.println("Stack: ");
        stack.displayStack();

        System.out.println("Shelves:");
        shelves.displayStack();

        System.out.println("2 more books are returned by next Patron");
        stack.push(new Book("Book Four", "Author D", "104"));
        stack.push(new Book("Book Five", "Author E", "105"));

        System.out.println("Stack: ");
        stack.displayStack();

        System.out.println("Shelves:");
        shelves.displayStack();

        System.out.println("Libraian came and put two books on the shelves");
        shelves.push(stack.pop());
        shelves.push(stack.pop());

        System.out.println("Stack: ");
        stack.displayStack();

        System.out.println("Shelves:");
        shelves.displayStack();

        System.out.println("Libraian came and put two books on the shelves");
        shelves.push(stack.pop());
        shelves.push(stack.pop());
        
        System.out.println("Stack: ");
        stack.displayStack();

        System.out.println("Shelves:");
        shelves.displayStack();


    }
}
