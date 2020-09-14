package com.mmkalva.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mmkalva.domain.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long>{

}
