package com.educancoweb.CursoNelioAlves.repositories;

import com.educancoweb.CursoNelioAlves.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
