package com.webcore.app.loan.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.User;
@Repository
public interface HomeRepository extends CrudRepository<User, Integer>
{
public List <User> findAll();
}
