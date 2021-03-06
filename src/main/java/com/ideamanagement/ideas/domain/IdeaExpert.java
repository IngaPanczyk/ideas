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
@Entity
@Table(name = "EXPERTS")
public final class IdeaExpert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "expert_id", unique = true)
    private Long expertId;
    @Column
    private String expertName;


    @OneToMany(targetEntity = IdeaNotification.class,
            mappedBy = "ideaExpert",
            cascade = CascadeType.MERGE,
            fetch = FetchType.LAZY
    )
    public List<IdeaNotification> ideaNotificationList = new ArrayList<>();

    public IdeaExpert(String expertName, List<IdeaNotification> ideaNotificationList) {
        this.expertName = expertName;
        this.ideaNotificationList = ideaNotificationList;
    }
}
