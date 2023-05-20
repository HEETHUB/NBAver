package com.hnc.nbaver.model.dto;

public class TeamStats {
	private String SNAME;
	private int RANK;
	private String FNAME;
	private String DIV;
	private int GP;
	private int W;
	private int L;
	private double WINP;
	private double GB;
	private int HW;
	private int HL;
	private int RW;
	private int RL;
	private int DW;
	private int DL;
	private String STREAK;
	
	public TeamStats() {}

	public TeamStats(int rANK, String fNAME, String sNAME, String dIV, int gP, int w, int l, double wINP, double gB,
			int hW, int hL, int rW, int rL, int dW, int dL, String sTREAK) {
		RANK = rANK;
		FNAME = fNAME;
		SNAME = sNAME;
		DIV = dIV;
		GP = gP;
		W = w;
		L = l;
		WINP = wINP;
		GB = gB;
		HW = hW;
		HL = hL;
		RW = rW;
		RL = rL;
		DW = dW;
		DL = dL;
		STREAK = sTREAK;
	}

	public int getRANK() {
		return RANK;
	}

	public void setRANK(int rANK) {
		RANK = rANK;
	}

	public String getFNAME() {
		return FNAME;
	}

	public void setFNAME(String fNAME) {
		FNAME = fNAME;
	}

	public String getSNAME() {
		return SNAME;
	}

	public void setSNAME(String sNAME) {
		SNAME = sNAME;
	}

	public String getDIV() {
		return DIV;
	}

	public void setDIV(String dIV) {
		DIV = dIV;
	}

	public int getGP() {
		return GP;
	}

	public void setGP(int gP) {
		GP = gP;
	}

	public int getW() {
		return W;
	}

	public void setW(int w) {
		W = w;
	}

	public int getL() {
		return L;
	}

	public void setL(int l) {
		L = l;
	}

	public double getWINP() {
		return WINP;
	}

	public void setWINP(double wINP) {
		WINP = wINP;
	}

	public double getGB() {
		return GB;
	}

	public void setGB(double gB) {
		GB = gB;
	}

	public int getHW() {
		return HW;
	}

	public void setHW(int hW) {
		HW = hW;
	}

	public int getHL() {
		return HL;
	}

	public void setHL(int hL) {
		HL = hL;
	}

	public int getRW() {
		return RW;
	}

	public void setRW(int rW) {
		RW = rW;
	}

	public int getRL() {
		return RL;
	}

	public void setRL(int rL) {
		RL = rL;
	}

	public int getDW() {
		return DW;
	}

	public void setDW(int dW) {
		DW = dW;
	}

	public int getDL() {
		return DL;
	}

	public void setDL(int dL) {
		DL = dL;
	}

	public String getSTREAK() {
		return STREAK;
	}

	public void setSTREAK(String sTREAK) {
		STREAK = sTREAK;
	}
}