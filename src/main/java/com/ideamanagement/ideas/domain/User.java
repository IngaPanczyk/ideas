package com.ideamanagement.ideas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    Long userId;

    @Column
    String username;

    @Column
    @OneToMany(targetEntity = Notification.class,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Notification> notificationList = new ArrayList<>();
}
