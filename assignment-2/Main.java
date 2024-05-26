public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Ring<Integer> list = new Ring<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Ring: ");
        list.display();

        list.advance();
        list.add(5);
        System.out.println("After adding 5 next to Ring: ");
        list.display();

        list.advance();
        list.advance();
        list.remove();
        System.out.println("After removing current: ");
        list.display();
    }
}
