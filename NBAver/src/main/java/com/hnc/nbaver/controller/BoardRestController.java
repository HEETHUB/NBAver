package com.hnc.nbaver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnc.nbaver.model.dto.Board;
import com.hnc.nbaver.model.dto.SearchCondition;
import com.hnc.nbaver.model.service.BoardService;

@RestController
@RequestMapping("/server/board/")
public class BoardRestController {
	
	@Autowired
	private BoardService boardService;
	
	// 게시글 생성
	@PostMapping("")
	public ResponseEntity<?> write(Board board) {
		boardService.writeBoard(board);
		return new ResponseEntity<Board>(board, HttpStatus.CREATED);
	}
	
	// 게시글 수정
	@PutMapping("")
	public ResponseEntity<?> update(Board board) {
		System.out.println(board);
		boardService.modifyBoard(board);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// 게시글 삭제
	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable("id")int id){
		if (boardService.getBoard(id) == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		boardService.removeBoard(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// 게시글 리스트 가져오기
	@GetMapping("")
	public ResponseEntity<?> list(){
		List<Board> list = boardService.getBoardList(); 
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
	}
	
	// 게시글 상세
	@GetMapping("{id}")
	public ResponseEntity<?> detail(@PathVariable("id")int id){
		Board board = boardService.getBoard(id);
		if (board == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}
	
	// 게시글 찾기
	@GetMapping("search")
	public ResponseEntity<?> search(SearchCondition condition){
		List<Board> list = boardService.search(condition);
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
	}
	
	// 선수별 게시판 
	@GetMapping("player/{playerId}")
	public ResponseEntity<?> searchByPlayerId(@PathVariable("playerId")int playerId){
		List<Board> list = boardService.searchByPlayerId(playerId);
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
	}
	
	// 팀별 게시판 
		@GetMapping("team/{team}")
		public ResponseEntity<?> searchByTeam(@PathVariable("team")String team){
			List<Board> list = boardService.searchByTeam(team);
			if (list == null || list.size() == 0)
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
		}
}
