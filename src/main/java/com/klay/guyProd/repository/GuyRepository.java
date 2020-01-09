package com.klay.guyProd.repository;

import com.klay.guyProd.entity.Guy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuyRepository  extends JpaRepository<Guy,String>{


}
