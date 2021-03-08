package com.jslhrd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jslhrd.domain.BoardVO;
import com.jslhrd.service.BoardService;
import com.jslhrd.service.BoardServiceimpl;

import lombok.Setter;

@Controller
@RequestMapping("Board")
public class BoardController {
	private static final Logger log = LoggerFactory.getLogger(BoardServiceimpl.class);
	
	@Setter(onMethod_=@Autowired)
	private BoardService service;
	
	
	//게시글 전체 목록(board_list.jsp)
	@RequestMapping("board_list")
	public void boardList(Model model) {
		int count = service.boardCount();
		log.info("BoardController : boardList() ....");
		model.addAttribute("count",count);
		model.addAttribute("list",service.boardList());
	}
	
	//글쓰기 폼으로 이동
	@GetMapping("board_write")
	public void boardWrite() {
		log.info("BoardController : boardWrite() ....");
	}
	
	//글쓰기 등록 처리.
	@PostMapping("board_write")
	public String boardWritePro(BoardVO vo, RedirectAttributes rttr) {
		log.info("BoardController : boardWritePro() ....");
		int row = service.boardWrite(vo);
		rttr.addFlashAttribute("row",row);
		return "redirect:/Board/board_write_pro";
	}
	
	@GetMapping("board_write_pro")
	public void BoardWritePro() {
		log.info("BoardController : boardWriteResult() ....");
	}
	
	@GetMapping("board_view")
	public void boardView(@RequestParam("idx") int idx, Model model) {
		log.info("BoardController : boardWriteResult() ....");
		service.boardHits(idx);
		BoardVO vo = service.boardSelect(idx);
		vo.setContents(vo.getContents().replace("\n", "<br>"));
		model.addAttribute("board",vo);
	}
	
	//수정 폼 이동
	@GetMapping("board_modify")
	public void boardModify(@RequestParam("idx") int idx, Model model) {
		log.info("BoardController : boardModify() ....");
		BoardVO vo = service.boardSelect(idx);
		model.addAttribute("board", vo);
		
	}
	
	@PostMapping("board_modify")
	public String boardModifyPro(BoardVO vo, Model model) {
		log.info("BoardController : boardModifyPro() ....");
		int row = service.boardUpdate(vo);
		model.addAttribute("row",row);
		
		return "/Board/board_modify_pro";
		}
}
