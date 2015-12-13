package domain;

public class GameRuleDomainModel {

	protected int RULEID;
	protected String RULENAME;
	protected int MAXNUMBEROFPLAYERS;
	protected int PLAYERNUMBEROFCARDS;
	protected int NUMBEROFJOKERS;
	protected int PLAYERCARDSMIN;
	protected int PLAYERCARDSMAX;
	protected int COMMUNITYCARDSMIN;
	protected int COMMUNITYCARDSMAX;
	protected int POSSIBLEHANDCOMBINATIONS;
	protected int DEFAULTGAME;
	
	public GameRuleDomainModel()
	{
		
	}
	public int getRULEID() {
		return RULEID;
	}
	public void setRULEID(int rULEID) {
		RULEID = rULEID;
	}
	public String getRULENAME() {
		return RULENAME;
	}
	public void setRULENAME(String rULENAME) {
		RULENAME = rULENAME;
	}
	public int getMAXNUMBEROFPLAYERS() {
		return MAXNUMBEROFPLAYERS;
	}
	public void setMAXNUMBEROFPLAYERS(int mAXNUMBEROFPLAYERS) {
		MAXNUMBEROFPLAYERS = mAXNUMBEROFPLAYERS;
	}
	public int getPLAYERNUMBEROFCARDS() {
		return PLAYERNUMBEROFCARDS;
	}
	public void setPLAYERNUMBEROFCARDS(int pLAYERNUMBEROFCARDS) {
		PLAYERNUMBEROFCARDS = pLAYERNUMBEROFCARDS;
	}
	public int getNUMBEROFJOKERS() {
		return NUMBEROFJOKERS;
	}
	public void setNUMBEROFJOKERS(int nUMBEROFJOKERS) {
		NUMBEROFJOKERS = nUMBEROFJOKERS;
	}
	public int getPLAYERCARDSMIN() {
		return PLAYERCARDSMIN;
	}
	public void setPLAYERCARDSMIN(int pLAYERCARDSMIN) {
		PLAYERCARDSMIN = pLAYERCARDSMIN;
	}
	public int getPLAYERCARDSMAX() {
		return PLAYERCARDSMAX;
	}
	public void setPLAYERCARDSMAX(int pLAYERCARDSMAX) {
		PLAYERCARDSMAX = pLAYERCARDSMAX;
	}
	public int getCOMMUNITYCARDSMIN() {
		return COMMUNITYCARDSMIN;
	}
	public void setCOMMUNITYCARDSMIN(int cOMMUNITYCARDSMIN) {
		COMMUNITYCARDSMIN = cOMMUNITYCARDSMIN;
	}
	public int getCOMMUNITYCARDSMAX() {
		return COMMUNITYCARDSMAX;
	}
	public void setCOMMUNITYCARDSMAX(int cOMMUNITYCARDSMAX) {
		COMMUNITYCARDSMAX = cOMMUNITYCARDSMAX;
	}
	public int getPOSSIBLEHANDCOMBINATIONS() {
		return POSSIBLEHANDCOMBINATIONS;
	}
	public void setPOSSIBLEHANDCOMBINATIONS(int pOSSIBLEHANDCOMBINATIONS) {
		POSSIBLEHANDCOMBINATIONS = pOSSIBLEHANDCOMBINATIONS;
	}
	public int getDEFAULTGAME() {
		return DEFAULTGAME;
	}
	public void setDEFAULTGAME(int dEFAULTGAME) {
		DEFAULTGAME = dEFAULTGAME;
	}
	
	
}
