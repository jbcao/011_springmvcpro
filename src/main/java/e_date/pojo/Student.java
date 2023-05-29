package e_date.pojo;

import java.util.Date;

/**
 * 功能
 *
 *
 * @author caojianbang
 * @date 25.8.22 12:27 AM
 */
public class Student {
    private String name;
    private Date birth;

    public Student() {
    }

    public Student(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bitrth=" + birth +
                '}';
    }
}
