package com.github.electroluxv2.laboratory.l13.domain;

import java.util.List;

public class Role {
    private String name;
    List<Permission> permissions;

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public Role setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }
}
