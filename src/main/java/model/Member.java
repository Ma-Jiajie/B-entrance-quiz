package model;

public class Member {
    private String id;
    private String name;

    //TODO GTB: 拼写错误
    public Member(String id, String namn) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
