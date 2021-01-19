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

    @Column
    @OneToMany(targetEntity = Notification.class,
            mappedBy = "ideaExpert",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Notification> notificationList = new ArrayList<>();


}
