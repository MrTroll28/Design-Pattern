package Observer.Subcriber;

public class Subcriber implements Observer {
    private int id;
    private String name;

    public Subcriber(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void reciveNotification(String message){
        System.out.println(id + " " + name + " nhận thông báo: " + message);
    }
}
