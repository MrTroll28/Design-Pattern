package Observer.Subcriber;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private int id;
    private String name;
    private boolean state;

    List<Subcriber> subcribers;

    public Channel(int id, String name, boolean state) {
        this.id = id;
        this.name = name;
        this.state = state;
        subcribers = new ArrayList<>();
    }

    public void add(Subcriber subcriber){
        subcribers.add(subcriber);
    }

    public void changeState(){
        state = !state;
        System.out.println(state);
        notification();
    }

    private void notification(){
        for (Subcriber subcriber : subcribers) {
            subcriber.reciveNotification("Status changed to " + state);
        }
    }
}
