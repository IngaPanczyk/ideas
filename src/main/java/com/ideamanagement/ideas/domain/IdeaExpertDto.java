package com.ideamanagement.ideas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class IdeaExpertDto {

    private Long expertId;
    private String expertName;
    public List<IdeaNotification> ideaNotificationList = new ArrayList<>();

}
