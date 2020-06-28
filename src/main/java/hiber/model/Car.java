package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "cars")
public class Car {

    @Column
    private String name;

    @Id
    private int series;

    @OneToOne (mappedBy="car")
    private User user;

    public Car () {
    }

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return name + " " + series;
    }
}
