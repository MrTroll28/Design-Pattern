package Observer.TaskChange;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String status;
    List<Member> members;

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
        this.members = new ArrayList<>();
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void setStatus(String status) {
        this.status = status;
        notification();
    }

    private void notification(){
        for (Member member : members) {
            member.reciveNotification(name ,status);
        }
    }
}
