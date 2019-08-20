package com.example.om.dao;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.om.pojo.User;

public abstract interface UserRepository extends JpaRepository<User, Integer> {
	@Query(nativeQuery = true, value = "select * from users  where id = ?1")
	public abstract List<User> findOneUser(String paramString);

	@Query(value = "SELECT * FROM USERS WHERE name = ?1", countQuery = "SELECT count(*) FROM USERS WHERE name = ?1", nativeQuery = true)
	public abstract Page<User> findByLastname(String paramString, Pageable paramPageable);
	
	@Query(nativeQuery = true, value = "select * from users  where username = ?1")
	public abstract User findByUserame(String username);
}
