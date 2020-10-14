package controller.responseDTO;

import model.Member;

import java.util.List;

//TODO GTB: 类名首字母应大写
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
