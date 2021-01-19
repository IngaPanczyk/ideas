package com.ideamanagement.ideas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "STATUSES")
@Component
public class IdeaStatus {
    @Id
    @Column(name = "status_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long statusId;

    @Column
    public String notificationStatus;


    @OneToMany(targetEntity = IdeaNotification.class,
            mappedBy = "status",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<IdeaNotification> ideaNotificationList = new ArrayList<>();
}
