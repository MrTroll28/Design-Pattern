package Observer.TaskChange;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Task 1", "New");

        Member member1 = new Member("Member 1");
        Member member2 = new Member("Member 2");

        task.addMember(member1);
        task.addMember(member2);

        task.setStatus("Doing");
        task.setStatus("Done");
    }
}
