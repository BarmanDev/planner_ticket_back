package dev.plannerticket.Models;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "list_us")
public class ListUs {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_us")
    
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "location")
    private String location;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "date")
    private Date date;
    @Column(name = "time")
    private String time;
    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "user_id")
    // This should be the name of the foreign key column in the 'list_us' table
    private User user;

    public ListUs() {
    }

    public ListUs(Long id, String title, String description, String location, int capacity, Date date, String time,
            String image, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.capacity = capacity;
        this.date = date;
        this.time = time;
        this.image = image;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    
   
}
