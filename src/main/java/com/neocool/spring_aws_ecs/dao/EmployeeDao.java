package com.neocool.spring_aws_ecs.dao;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@XRayEnabled
public class EmployeeDao {
    public int id = 10;
    public String Name = "Aman";

    public int getId() {
        return id;
    }
    public String getName() {
        return Name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "EmployeeDao{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
