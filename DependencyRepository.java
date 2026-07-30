package com.dhanush.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dhanush.scheduler.entity.Dependency;

public interface DependencyRepository
extends JpaRepository<Dependency,Long>{

}
