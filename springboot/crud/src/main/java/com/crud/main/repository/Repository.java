package com.crud.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crud.main.entity.Author;

@Repository
public interface Repository extends PagingAndSortingRepository<Author, String> {

}
