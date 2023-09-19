package kr.kh.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.kh.edu.service.BoardService;
import kr.kh.edu.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/board/list")
	public String list(Model model) {
		//게시글 전체를 가져오라고 서비스에게 시킴
		List<BoardVO> list = boardService.getBoardList();
		
		//화면에 데이터를 전송
		model.addAttribute("list", list);
		model.addAttribute("title", "게시글조회");
		return "/board/list";
	}

}
