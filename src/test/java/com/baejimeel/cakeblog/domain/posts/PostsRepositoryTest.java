package com.baejimeel.cakeblog.domain.posts;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DisplayName("게시글 테스트")
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @After("완료되었습니다")
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글_저장_불러오기(){
        //given
        String title = "테스트 게시글";
        String content = "테스트 문장";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("baejimeel")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        Assertions.assertEquals(posts.getTitle(), title);
        Assertions.assertEquals(posts.getContent(), content);
    }
}