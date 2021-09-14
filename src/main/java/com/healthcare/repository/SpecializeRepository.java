package com.healthcare.repository;

import com.healthcare.entity.Specialize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SpecializeRepository extends JpaRepository<Specialize,Integer> {


  // void updateSpecialize(Specialize specialize);
}
