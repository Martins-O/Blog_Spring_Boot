package com.martins.myblog.service.impl;

import com.martins.myblog.data.dto.request.CreateBlogRequest;
import com.martins.myblog.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RequiredArgsConstructor
class BlogServiceImplTest {
    private final BlogService service;
    private CreateBlogRequest request;

    @BeforeEach
    public void setUp(){
        request = CreateBlogRequest.builder()
                .author("Martins")
                .content("Learn java at the confort of your home")
                .title("Learn java")
                .build();
    }

    @Test
    void createBlog() {
        service.createBlog(request);
        assertNotNull(service.createBlog(request));
    }

    @Test
    void deleteBlog() {
    }
}