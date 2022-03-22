package com.details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Entity.attendance;

public interface RegisterRepository extends JpaRepository<attendance,Long> {

}
