package Task1;

public class Main {
    public static void main(String[] args) {

        StackAction list = new Stack<>();
        list.push(1);
        list.push("nine");
        list.push(6);
        list.push('a');

        System.out.println("Our default list: \n");
        list.print();

        System.out.println("\nList size is: ");
        System.out.println(list.size());

        list.pop();
        System.out.println("List, after first pop: ");
        list.print();

        list.pop();
        System.out.println("List, after second pop: ");
        list.print();

        System.out.println("Clearing list: \n");
        list.clear();
        list.print();

        System.out.println("That's all!");
    }
}
