package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProDAO;
import com.example.domain.ProVO;
import com.example.domain.QueryVO;

import java.util.*;

@RestController
@RequestMapping("/pro")
public class ProRestController {
	@Autowired
	ProDAO dao;

	@PostMapping("/insert")
	public void insert(@RequestBody ProVO vo) {
		dao.insert(vo);
	}

	@PostMapping("/update")
	public void update(@RequestBody ProVO vo) {
		dao.update(vo);
	}

	@GetMapping("/list.json")
	public List<HashMap<String, Object>> list() {
		return dao.list();
	}

	@GetMapping("/read.json")
	public HashMap<String, Object> read(String pcode) {
		return dao.read(pcode);
	}

	@GetMapping("/code")
	public int code() {
		return dao.code();
	}

	@GetMapping("/stu/list.json")
	public List<HashMap<String, Object>> stulist(String pcode) {
		return dao.stuList(pcode);
	}

	@GetMapping("/cou/list.json")
	public List<HashMap<String, Object>> coulist(String pcode) {
		return dao.couList(pcode);
	}

	@GetMapping("/slist.json")
	public List<HashMap<String, Object>> slist(QueryVO vo) {
		return dao.slist(vo);
	}

	@GetMapping("/total")
	public int total(QueryVO vo) {
		return dao.total(vo);
	}

}