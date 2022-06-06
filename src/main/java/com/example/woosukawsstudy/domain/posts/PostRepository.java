package com.example.woosukawsstudy.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
//JPA Repository interface는 JpaRepository<EntityClass, PK Type>을 상속 하면 끝. 이때 EntityClass 와 Repository는 같은 위치에 존재 해야한다.
public interface PostRepository extends JpaRepository<Post, Long> {
}
