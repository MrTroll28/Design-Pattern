package Observer.Subcriber;

public class Main {
    public static void main(String[] args) {
        Subcriber subcriber1 = new Subcriber(1, "Subcriber 1");
        Subcriber subcriber2 = new Subcriber(2, "Subcriber 2");
        Subcriber subcriber3 = new Subcriber(3, "Subcriber 3");

        Channel channel = new Channel(1, "Channel 1", true);

        channel.add(subcriber1);
        channel.add(subcriber2);
        channel.add(subcriber3);

        channel.changeState();
    }
}
