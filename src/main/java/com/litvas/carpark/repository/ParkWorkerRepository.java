package com.litvas.carpark.repository;

import com.litvas.carpark.domain.ParkWorker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkWorkerRepository extends CrudRepository<ParkWorker, Long> {

    ParkWorker findByName(String name);

}
