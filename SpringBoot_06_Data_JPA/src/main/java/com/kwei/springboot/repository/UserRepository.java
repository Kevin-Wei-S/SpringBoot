package com.kwei.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kwei.springboot.entities.User;

// 繼承JpaRepository<操作的實體類,主鍵類型>來完成對數據庫的操作
public interface UserRepository extends JpaRepository<User,Integer> {
	
}
