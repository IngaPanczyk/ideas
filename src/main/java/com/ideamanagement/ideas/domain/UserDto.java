package com.ideamanagement.ideas.domain;

import java.util.ArrayList;
import java.util.List;

public class UserDto {

    Long userId;
    String username;
    public List<IdeaNotification> ideaNotificationList = new ArrayList<>();
}
