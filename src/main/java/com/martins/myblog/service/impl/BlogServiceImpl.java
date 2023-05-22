package com.martins.myblog.service.impl;

import com.martins.myblog.data.dto.request.CreateBlogRequest;
import com.martins.myblog.data.dto.response.Response;
import com.martins.myblog.data.model.Blog;
import com.martins.myblog.data.repository.BlogRepository;
import com.martins.myblog.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BlogServiceImpl implements BlogService {
    private final BlogRepository repository;

    public BlogServiceImpl(BlogRepository repository) {
        this.repository = repository;
    }

    @Override
    public Response createBlog(CreateBlogRequest request) {
        Blog blog = Blog.builder()
                .author(request.getAuthor())
                .content(request.getContent())
                .title(request.getTitle())
                .build();
        repository.save(blog);
        return new Response("Created successfully");
    }

    @Override
    public void deleteBlog(String blogId) {
        repository.deleteById(blogId);
    }

    @Override
    public List<Blog> getAllBlog() {
        List<Blog> fetchAll = repository.findAll();
        log.info("fetchAll: " + fetchAll);
        return fetchAll;
    }

    @Override
    public Blog getBlog(String blogId) {
        Blog fetch = repository.findBlogsById(blogId);
        log.info("Fetched blog {}", fetch);
        return fetch;
    }
}
