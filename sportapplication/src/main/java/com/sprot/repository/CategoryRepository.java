package com.sprot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sport.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Serializable> {

}
