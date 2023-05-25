package com.hnc.nbaver.model.dao;

import java.util.List;

import com.hnc.nbaver.model.dto.Board;
import com.hnc.nbaver.model.dto.SearchCondition;

public interface BoardDao {

	void insertBoard(Board board);

	void updateBoard(Board board);

	List<Board> selectAll();

	void updateViewCnt(int id);

	Board selectOne(int id);

	List<Board> search(SearchCondition condition);

	void deleteBoard(int id);

	List<Board> selectByPlayerId(int playerId);

	List<Board> selectByTeam(String team);

}
