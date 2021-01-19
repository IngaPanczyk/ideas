package com.ideamanagement.ideas.repository;

import com.ideamanagement.ideas.domain.IdeaExpert;
import com.ideamanagement.ideas.domain.Notification;
import com.ideamanagement.ideas.domain.Status;
import com.ideamanagement.ideas.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdeaExpertDaoTestSuite {
    LocalDate notificationDate = LocalDate.of(2010,1,1);
    @Autowired
    private IdeaExpertDao ideaExpertDao;

    @Transactional
    @Test
    public void testIdeaExpertDaoSave() {
        //Given
        List<Notification> notificationList = new ArrayList<>();
        IdeaExpert ideaExpert = new IdeaExpert(1L, "Kowalski Jan", new ArrayList<>());
        Status status = new Status();
        User user = new User();
        Notification notification = new Notification(1L, "Test subject","test description", notificationDate,status, ideaExpert,user );
        notificationList.add(notification);

        //When
        ideaExpertDao.save(ideaExpert);
        Optional <IdeaExpert> savedIdeaExpert = ideaExpertDao.findById(ideaExpert.getExpertId());

        //Then
       // Assert.assertTrue(savedIdeaExpert.isPresent());
        //Clean up
       // ideaExpertDao.delete(ideaExpert);
    }
}
