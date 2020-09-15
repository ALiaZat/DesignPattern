public class ConcreteObsA implements IBlogObserver{

    public ConcreteObsA(IBlogNotifier subject){
        this.subject.subscribe(subject);
    }
    @Override
    public void update() {
        System.out.println("there is an update (1)!");
    }
}
