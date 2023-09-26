package kr.kh.spring.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kr.kh.spring.pagination.Criteria;
import kr.kh.spring.vo.BoardVO;

public interface BoardService {

	boolean insertBoard(BoardVO board, MultipartFile[] files2);

	List<BoardVO> getBoardList(Criteria cri);

	int getTotalCount(Criteria cri);

	BoardVO getBoard(Integer bo_num);
}
