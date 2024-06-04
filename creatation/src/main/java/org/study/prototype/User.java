package org.study.prototype;

// cloneable 是一个标记接口
public class User implements Cloneable {
    private String name;
    private Integer age;

    public User() {
        System.out.println("User instance created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(this.name);
        user.setAge(this.age);
        return user;
    }
}
