package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojoclass.pojo;
import com.example.demo.service.service;

@RestController
public class controller {

	@Autowired
	public service objser;
	@PostMapping("/post")
	public pojo addDetails(@RequestBody pojo d)
	{
		return objser.saveInfo(d);
	}
	@GetMapping("/get")
	public List<pojo>getDetails()
	{
		return objser.getDet();
	}
	@PutMapping("/update")
	public pojo updateDetails(@RequestBody pojo bookingid)
	{
		return objser.updateInfo(bookingid);
	}
	@DeleteMapping ("/delete/{bookingid}")
	public String deleteDetails(@PathVariable("bookingid") int did)
	{
		objser.deleteInfo(did);
		return "deleted";
	}
}
