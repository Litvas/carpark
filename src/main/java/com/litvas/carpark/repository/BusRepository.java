package com.litvas.carpark.repository;

import com.litvas.carpark.domain.Bus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends CrudRepository<Bus, Long> {

}
