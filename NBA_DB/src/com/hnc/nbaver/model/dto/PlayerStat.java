package com.hnc.nbaver.model.dto;

public class PlayerStat {
	private String YEAR;
	private String TEAM;
	private int GP;
	private double MIN;
	private double PTS;
	private double FGM;
	private double FGA;
	private double FGP;
	private double PM3;
	private double PA3;
	private double PP3;
	private double FTM;
	private double FTA;
	private double FTP;
	private double OREB;
	private double DREB;
	private double REB;
	private double AST;
	private double TOV;
	private double STL;
	private double BLK;
	private double PF;
	private double FP;
	private int DD2;
	private int TD3;
	private double MGN;
	
	public PlayerStat(String yEAR, String tEAM, int gP, double mIN, double pTS, double fGM, double fGA, double fGP, double pM3,
			double pA3, double pP3, double fTM, double fTA, double fTP, double oREB, double dREB, double rEB,
			double aST, double tOV, double sTL, double bLK, double pF, double fP, int dD2, int tD3, double mGN) {
		YEAR = yEAR;
		TEAM = tEAM;
		GP = gP;
		MIN = mIN;
		PTS = pTS;
		FGM = fGM;
		FGA = fGA;
		FGP = fGP;
		PM3 = pM3;
		PA3 = pA3;
		PP3 = pP3;
		FTM = fTM;
		FTA = fTA;
		FTP = fTP;
		OREB = oREB;
		DREB = dREB;
		REB = rEB;
		AST = aST;
		TOV = tOV;
		STL = sTL;
		BLK = bLK;
		PF = pF;
		FP = fP;
		DD2 = dD2;
		TD3 = tD3;
		MGN = mGN;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}
	public String getTEAM() {
		return TEAM;
	}
	public void setTEAM(String tEAM) {
		TEAM = tEAM;
	}
	public int getGP() {
		return GP;
	}
	public void setGP(int gP) {
		GP = gP;
	}
	public double getMIN() {
		return MIN;
	}
	public void setMIN(double mIN) {
		MIN = mIN;
	}
	public double getPTS() {
		return PTS;
	}
	public void setPTS(double pTS) {
		PTS = pTS;
	}
	public double getFGM() {
		return FGM;
	}
	public void setFGM(double fGM) {
		FGM = fGM;
	}
	public double getFGA() {
		return FGA;
	}
	public void setFGA(double fGA) {
		FGA = fGA;
	}
	public double getFGP() {
		return FGP;
	}
	public void setFGP(double fGP) {
		FGP = fGP;
	}
	public double getPM3() {
		return PM3;
	}
	public void setPM3(double pM3) {
		PM3 = pM3;
	}
	public double getPA3() {
		return PA3;
	}
	public void setPA3(double pA3) {
		PA3 = pA3;
	}
	public double getPP3() {
		return PP3;
	}
	public void setPP3(double pP3) {
		PP3 = pP3;
	}
	public double getFTM() {
		return FTM;
	}
	public void setFTM(double fTM) {
		FTM = fTM;
	}
	public double getFTA() {
		return FTA;
	}
	public void setFTA(double fTA) {
		FTA = fTA;
	}
	public double getFTP() {
		return FTP;
	}
	public void setFTP(double fTP) {
		FTP = fTP;
	}
	public double getOREB() {
		return OREB;
	}
	public void setOREB(double oREB) {
		OREB = oREB;
	}
	public double getDREB() {
		return DREB;
	}
	public void setDREB(double dREB) {
		DREB = dREB;
	}
	public double getREB() {
		return REB;
	}
	public void setREB(double rEB) {
		REB = rEB;
	}
	public double getAST() {
		return AST;
	}
	public void setAST(double aST) {
		AST = aST;
	}
	public double getTOV() {
		return TOV;
	}
	public void setTOV(double tOV) {
		TOV = tOV;
	}
	public double getSTL() {
		return STL;
	}
	public void setSTL(double sTL) {
		STL = sTL;
	}
	public double getBLK() {
		return BLK;
	}
	public void setBLK(double bLK) {
		BLK = bLK;
	}
	public double getPF() {
		return PF;
	}
	public void setPF(double pF) {
		PF = pF;
	}
	public double getFP() {
		return FP;
	}
	public void setFP(double fP) {
		FP = fP;
	}
	public int getDD2() {
		return DD2;
	}
	public void setDD2(int dD2) {
		DD2 = dD2;
	}
	public int getTD3() {
		return TD3;
	}
	public void setTD3(int tD3) {
		TD3 = tD3;
	}
	public double getMGN() {
		return MGN;
	}
	public void setMGN(double mGN) {
		MGN = mGN;
	}
	
}
