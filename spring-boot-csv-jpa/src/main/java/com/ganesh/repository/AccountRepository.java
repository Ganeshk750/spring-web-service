package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.entity.AccountDetails;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails, Integer> {

}
