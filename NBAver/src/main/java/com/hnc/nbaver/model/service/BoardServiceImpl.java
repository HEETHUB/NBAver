package com.hnc.nbaver.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnc.nbaver.model.dao.BoardDao;
import com.hnc.nbaver.model.dto.Board;
import com.hnc.nbaver.model.dto.SearchCondition;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public void writeBoard(Board board) {
		System.out.println("write new post");
		boardDao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		System.out.println("modify board");
		boardDao.updateBoard(board);
	}

	@Override
	public List<Board> getBoardList() {
		System.out.println("get all posts");
		return boardDao.selectAll();
	}

	@Override
	public Board getBoard(int id) {
		System.out.println("get "+id+"th board");
		boardDao.updateViewCnt(id);
		return boardDao.selectOne(id);
	}

	@Override
	public List<Board> search(SearchCondition condition) {
		return boardDao.search(condition);
	}

	@Override
	public void removeBoard(int id) {
		System.out.println("remove "+id+"th post");
		boardDao.deleteBoard(id);
	}

	@Override
	public List<Board> searchByPlayerId(int playerId) {
		System.out.println("get all posts about "+playerId);
		return boardDao.selectByPlayerId(playerId);
	}

	@Override
	public List<Board> searchByTeam(String team) {
		System.out.println("get all posts about "+team);
		return boardDao.selectByTeam(team);
	}

}
