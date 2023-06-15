package com.martins.myblog.data.repository;

import com.martins.myblog.data.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, String> {
    Blog findBlogById(String blogId);
    Blog findBlogsById(String blogId);
    Blog findBlogsByAuthor(String author);
}
