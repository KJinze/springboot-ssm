package cn.itcast.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

@RestController
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	@PostMapping("findByPage")
	public Map<String,Object> findByPage(Model model,Integer page,Integer rows){
		return noticeService.findByPage(page,rows);
	}
}
