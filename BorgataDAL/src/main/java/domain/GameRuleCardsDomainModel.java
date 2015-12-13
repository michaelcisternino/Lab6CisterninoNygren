package domain;

public class GameRuleCardsDomainModel implements java.io.Serializable {

	
	protected int RULEID;
	protected int RULECARDID;
	protected int NBROFCARDS;
	protected int PICKORDER;
	
	public GameRuleCardsDomainModel()
	{
		
	}
	public int getRULEID() {
		return RULEID;
	}
	public void setRULEID(int rULEID) {
		RULEID = rULEID;
	}
	public int getRULECARDID() {
		return RULECARDID;
	}
	public void setRULECARDID(int rULECARDID) {
		RULECARDID = rULECARDID;
	}
	public int getNBROFCARDS() {
		return NBROFCARDS;
	}
	public void setNBROFCARDS(int nBROFCARDS) {
		NBROFCARDS = nBROFCARDS;
	}
	public int getPICKORDER() {
		return PICKORDER;
	}
	public void setPICKORDER(int pICKORDER) {
		PICKORDER = pICKORDER;
	}
	
	
}
