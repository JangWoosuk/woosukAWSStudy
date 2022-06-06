package com.example.woosukawsstudy.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepo;

    @After
    public void cleanUp(){
        postRepo.deleteAll();
    }

    @Test
    public void loadBoard(){
        //given
        String title = "게시글 타이틀";
        String content = "게시글 내용 *****";
        postRepo.save(Post.builder()
                .title(title)
                .content(content)
                .author("woosuk@email.com")
                .build());

        //when
        List<Post> postList = postRepo.findAll();

        //then

        Post post = postList.get(0);
        assertThat(post.getTitle()).isEqualTo(title);
        assertThat(post.getContent()).isEqualTo(content);
    }
}
