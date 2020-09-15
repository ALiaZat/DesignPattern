public class ConcreteObsB implements IBlogObserver {
    public ConcreteObsB(IBlogNotifier subject){
        this.subject.subscribe(subject);
    }
    @Override
    public void update() {
        System.out.println("there is an update (2)");
    }
}
