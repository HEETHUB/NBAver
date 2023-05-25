package com.hnc.nbaver.model.service;

import java.util.List;

import com.hnc.nbaver.model.dto.Board;
import com.hnc.nbaver.model.dto.SearchCondition;

public interface BoardService {

	void writeBoard(Board board);

	void modifyBoard(Board board);

	List<Board> getBoardList();

	Board getBoard(int id);

	List<Board> search(SearchCondition condition);

	void removeBoard(int id);

	List<Board> searchByPlayerId(int playerId);

	List<Board> searchByTeam(String team);
	
}
