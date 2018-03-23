package com.choe.practice.boot.booya.repository;

import org.springframework.data.repository.CrudRepository;

import com.choe.practice.boot.booya.entity.cassandra.VisitingRecordBak;

public interface VisitingRecordBakRepository extends CrudRepository<VisitingRecordBak, String> {

}
