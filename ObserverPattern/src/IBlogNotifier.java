import java.util.ArrayList;
import java.util.List;

public abstract class IBlogNotifier {

    List<IBlogNotifier> observers = new ArrayList<IBlogNotifier>();
    public int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void subscribe(IBlogNotifier observer) {
        observers.add(observer);
    }

    public void unSubscribe(IBlogNotifier observer){
        observers.remove(observer);
    }

    public void notifyAllObservers(){
        for (IBlogNotifier observer : observers) {
            observer.update();
        }
    }

    private void update() {
    }


}
