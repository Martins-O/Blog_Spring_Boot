package com.martins.myblog.data.repository;

import com.martins.myblog.data.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    Blog findBlogsById(Long blogId);
    Blog findBlogsByAuthor(String author);
    boolean existsBlogByTitle(String title);
}
