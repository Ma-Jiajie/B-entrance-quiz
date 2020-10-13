package controller.responseDTO;

import model.Member;

import java.util.List;

public class membersDTO {
    private List<Member> members;

    public membersDTO(List<Member> allMembers) {
        this.members = allMembers;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
