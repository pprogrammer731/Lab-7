import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {
//        LinkedQueue<String> q=new LinkedQueue<>();
        ArrayQueue<String> q=new ArrayQueue<>();
        System.out.println("1 Insert to queue\t 2 delete from queue");
        int choice=-1;
        Scanner in=new Scanner(System.in);
        while (choice!=0){
            System.out.println("your choice");
            choice=in.nextInt();
            switch (choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("input a name");
                    q.enqueue(in.next());
                    break;
                case 2:
                    System.out.println("removed is "+q.dequeue());
                    break;
            }
            System.out.println("First = "+q.first()+"\t size = "+q.size());
        }
    }
}
