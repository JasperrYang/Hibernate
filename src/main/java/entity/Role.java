package entity;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private Integer role_id;
    private String role_name;
    private String role_memo;
    //一个角色中有多个用户
    private Set<UserDemo> setUser = new HashSet<UserDemo>();

    public Set<UserDemo> getSetUser() {
        return setUser;
    }

    public void setSetUser(Set<UserDemo> setUser) {
        this.setUser = setUser;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_memo() {
        return role_memo;
    }

    public void setRole_memo(String role_memo) {
        this.role_memo = role_memo;
    }
}
