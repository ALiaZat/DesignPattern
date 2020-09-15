import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IBlogNotifier subject = new IBlogNotifier() {
        };

        new ConcreteObsA(subject);
        new ConcreteObsB(subject);
        Scanner s = new Scanner(System.in);
        subject.subscribe(subject);
        System.out.println("Add a new post ");
        s.hasNext();
        subject.notifyAllObservers();
    }
}
