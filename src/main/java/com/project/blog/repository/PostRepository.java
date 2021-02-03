package com.project.blog.repository;

import com.project.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(
        path="containsTitle",
        collectionResourceRel="contains-title"
)
public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findByTitleContaining(String title);
}
