package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojoclass.pojo;

public interface repo extends JpaRepository<pojo, Integer> {

}
