package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
@Component
public class Student {

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    @Autowired
    public Student(@Value("#{'10'}")int id, @Value("#{Hannibal}")String name,@Value("#{T(java.util.List).of(phone)}")List<Phone>ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
