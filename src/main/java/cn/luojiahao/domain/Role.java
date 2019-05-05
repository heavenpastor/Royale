package cn.luojiahao.domain;

public class Role {
    private int rid;
    private String role;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", role='" + role + '\'' +
                '}';
    }
}
