package Observer.TaskChange;

public class Member implements Observer {
    @Override
    public void reciveNotification(String taskName, String taskStatus) {
        System.out.println(name + " nhận thông báo: " + taskName +
                " đã chuyển sang trạng thái " + taskStatus);
    }

    private String name;

    public Member(String name) {
        this.name = name;
    }
}
