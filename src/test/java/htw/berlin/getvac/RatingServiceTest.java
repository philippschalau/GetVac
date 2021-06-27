package htw.berlin.getvac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class RatingServiceTest {

    @Autowired
    private RatingService ratingService;

    @MockBean
    private RatingRepository ratingRepository;

    @Test
    @DisplayName("should generate a ArrayList with comments from DB by random")
    void testShowComments() {

        doReturn(List.of("Test1", "Test2", "Test3", "Test4", "Test5")).when(ratingRepository).comments();


        List<String> commentList = ratingService.showComments();


        Assertions.assertSame(commentList.size(), 3, "Anzahl passt nicht");
    }
}