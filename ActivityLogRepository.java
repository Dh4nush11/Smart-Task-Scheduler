package com.dhanush.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dhanush.scheduler.entity.ActivityLog;

public interface ActivityLogRepository
extends JpaRepository<ActivityLog,Long>{

}
