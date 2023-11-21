package com.yandexLavka.repository;

import com.yandexLavka.entity.Courier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourierRepository extends CrudRepository<Courier, Long> {
    @Query(value = "select * from COURIERS c order by c.ID limit :limit offset :offset", nativeQuery = true)
    List<Courier> findAllWithLimitAndOffset(@Param("limit") final Long limit, @Param("offset") final Long offset);
}
