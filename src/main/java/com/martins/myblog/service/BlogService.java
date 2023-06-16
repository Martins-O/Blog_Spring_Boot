package com.martins.myblog.service;

import com.martins.myblog.data.dto.request.CreateBlogRequest;
import com.martins.myblog.data.dto.response.Response;
import com.martins.myblog.data.model.Blog;

import java.util.List;

public interface BlogService {
    Response createBlog(CreateBlogRequest request);
    void deleteBlog(Long blogId);
    List<Blog> getAllBlog();
    Blog getBlog(Long blogId);

    Blog getBlogByAuthor(String author);
}
