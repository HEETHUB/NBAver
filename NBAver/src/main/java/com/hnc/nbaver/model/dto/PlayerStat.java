package com.hnc.nbaver.model.dto;

import java.util.List;

public class PlayerStat {
	private int id;
	private String name;
	private String year;
	private String team;
	private int gp;
	private double min;
	private double pts;
	private double fgm;
	private double fga;
	private double fgp;
	private double pm3;
	private double pa3;
	private double pp3;
	private double ftm;
	private double fta;
	private double ftp;
	private double oreb;
	private double dreb;
	private double reb;
	private double ast;
	private double tov;
	private double stl;
	private double blk;
	private double pf;
	private double fp;
	private int dd2;
	private int td3;
	private double mgn;
	
	public PlayerStat(int id, String name, String year, String team, int gp, double min, double pts, double fgm,
			double fga, double fgp, double pm3, double pa3, double pp3, double ftm, double fta, double ftp, double oreb,
			double dreb, double reb, double ast, double tov, double stl, double blk, double pf, double fp, int dd2,
			int td3, double mgn) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.team = team;
		this.gp = gp;
		this.min = min;
		this.pts = pts;
		this.fgm = fgm;
		this.fga = fga;
		this.fgp = fgp;
		this.pm3 = pm3;
		this.pa3 = pa3;
		this.pp3 = pp3;
		this.ftm = ftm;
		this.fta = fta;
		this.ftp = ftp;
		this.oreb = oreb;
		this.dreb = dreb;
		this.reb = reb;
		this.ast = ast;
		this.tov = tov;
		this.stl = stl;
		this.blk = blk;
		this.pf = pf;
		this.fp = fp;
		this.dd2 = dd2;
		this.td3 = td3;
		this.mgn = mgn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getGp() {
		return gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getPts() {
		return pts;
	}

	public void setPts(double pts) {
		this.pts = pts;
	}

	public double getFgm() {
		return fgm;
	}

	public void setFgm(double fgm) {
		this.fgm = fgm;
	}

	public double getFga() {
		return fga;
	}

	public void setFga(double fga) {
		this.fga = fga;
	}

	public double getFgp() {
		return fgp;
	}

	public void setFgp(double fgp) {
		this.fgp = fgp;
	}

	public double getPm3() {
		return pm3;
	}

	public void setPm3(double pm3) {
		this.pm3 = pm3;
	}

	public double getPa3() {
		return pa3;
	}

	public void setPa3(double pa3) {
		this.pa3 = pa3;
	}

	public double getPp3() {
		return pp3;
	}

	public void setPp3(double pp3) {
		this.pp3 = pp3;
	}

	public double getFtm() {
		return ftm;
	}

	public void setFtm(double ftm) {
		this.ftm = ftm;
	}

	public double getFta() {
		return fta;
	}

	public void setFta(double fta) {
		this.fta = fta;
	}

	public double getFtp() {
		return ftp;
	}

	public void setFtp(double ftp) {
		this.ftp = ftp;
	}

	public double getOreb() {
		return oreb;
	}

	public void setOreb(double oreb) {
		this.oreb = oreb;
	}

	public double getDreb() {
		return dreb;
	}

	public void setDreb(double dreb) {
		this.dreb = dreb;
	}

	public double getReb() {
		return reb;
	}

	public void setReb(double reb) {
		this.reb = reb;
	}

	public double getAst() {
		return ast;
	}

	public void setAst(double ast) {
		this.ast = ast;
	}

	public double getTov() {
		return tov;
	}

	public void setTov(double tov) {
		this.tov = tov;
	}

	public double getStl() {
		return stl;
	}

	public void setStl(double stl) {
		this.stl = stl;
	}

	public double getBlk() {
		return blk;
	}

	public void setBlk(double blk) {
		this.blk = blk;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getFp() {
		return fp;
	}

	public void setFp(double fp) {
		this.fp = fp;
	}

	public int getDd2() {
		return dd2;
	}

	public void setDd2(int dd2) {
		this.dd2 = dd2;
	}

	public int getTd3() {
		return td3;
	}

	public void setTd3(int td3) {
		this.td3 = td3;
	}

	public double getMgn() {
		return mgn;
	}

	public void setMgn(double mgn) {
		this.mgn = mgn;
	}
	
	
}
