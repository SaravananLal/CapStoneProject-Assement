package com.ltimindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltimindtree.entity.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {

}
