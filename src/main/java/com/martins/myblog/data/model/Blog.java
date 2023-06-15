package com.martins.myblog.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Blog {
    @Id
    private String id;
    private String title;
    private String content;
    private String author;
}
