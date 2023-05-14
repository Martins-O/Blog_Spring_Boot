package com.martins.myblog.service.impl;

import com.martins.myblog.data.dto.request.CreateBlogRequest;
import com.martins.myblog.data.dto.response.Response;
import com.martins.myblog.data.model.Blog;
import com.martins.myblog.data.repository.BlogRepository;
import com.martins.myblog.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        return repository.findAll();
    }

    @Override
    public Blog getBlog(String blogId) {
        return repository.findBlogById(blogId);
    }
}
