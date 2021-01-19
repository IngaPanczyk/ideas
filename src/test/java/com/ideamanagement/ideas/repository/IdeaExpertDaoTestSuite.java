package com.ideamanagement.ideas.repository;

import com.ideamanagement.ideas.domain.IdeaExpert;
import com.ideamanagement.ideas.domain.IdeaNotification;
import com.ideamanagement.ideas.domain.IdeaStatus;
import com.ideamanagement.ideas.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdeaExpertDaoTestSuite {
    LocalDate notificationDate = LocalDate.of(2010, 1, 1);
    @Autowired
    private IdeaExpertDao ideaExpertDao;

    @Transactional
    @Test
    public void testIdeaExpertDaoSave() {
        //Given
        List<IdeaNotification> ideaNotificationList = new ArrayList<>();
        IdeaExpert ideaExpert = new IdeaExpert("Kowalski Jan", ideaNotificationList);
        IdeaStatus status = new IdeaStatus();
        User user = new User();
        IdeaNotification ideaNotification = new IdeaNotification(1L, "Test subject", "test description", notificationDate, status, ideaExpert, user);
        ideaNotificationList.add(ideaNotification);

        //When
        ideaExpertDao.save(ideaExpert);
        Optional<IdeaExpert> savedIdeaExpert = ideaExpertDao.findById(ideaExpert.getExpertId());

        //Then
        //Assert.assertTrue(savedIdeaExpert.isPresent());
        //Clean up
        ideaExpertDao.delete(ideaExpert);
    }

    @Transactional
    @Test
    public void testIdeaExpertDaoCount() {
        //Given
        List<IdeaNotification> ideaNotificationList = new ArrayList<>();
        IdeaExpert ideaExpert = new IdeaExpert("Kowalski Jan", ideaNotificationList);
        IdeaExpert ideaExpert1 = new IdeaExpert("Kowalski Adam", ideaNotificationList);
        IdeaExpert ideaExpert2 = new IdeaExpert("Kowalski Zygmunt", ideaNotificationList);
        IdeaExpert ideaExpert3 = new IdeaExpert("Kowalski Halin", ideaNotificationList);
        IdeaStatus status = new IdeaStatus();
        User user = new User();
        IdeaNotification ideaNotification = new IdeaNotification(1L, "Test subject", "test description", notificationDate, status, ideaExpert, user);
        ideaNotificationList.add(ideaNotification);

        //When
        ideaExpertDao.save(ideaExpert);
        ideaExpertDao.save(ideaExpert1);
        ideaExpertDao.save(ideaExpert2);
        ideaExpertDao.save(ideaExpert3);
        Optional<IdeaExpert> savedIdeaExpert = ideaExpertDao.findById(ideaExpert.getExpertId());
        long counter = ideaExpertDao.count();

        //Then
        //Assert.assertEquals(4, counter);
        //Clean up
        ideaExpertDao.delete(ideaExpert);
        ideaExpertDao.delete(ideaExpert1);
        ideaExpertDao.delete(ideaExpert2);
        ideaExpertDao.delete(ideaExpert3);
    }
}
