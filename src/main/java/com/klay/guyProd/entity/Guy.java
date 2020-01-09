package com.klay.guyProd.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;

import java.io.Serializable;

@Entity
@Table(name="guy")
public class Guy  implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @GeneratedValue(generator="system-uuid")
    @Column(name = "id")
    private String  id;

    @Column(name = "name")
    private String name;
    
    @Min(value = 18,message = "未成年不能添加")
    @Column(name = "age")
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
