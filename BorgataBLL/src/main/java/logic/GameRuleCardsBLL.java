package logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import base.GameRuleCardsDAL;
import base.GameRuleDAL;
import domain.GameRuleCardsDomainModel;
import domain.GameRuleDomainModel;
import util.HibernateUtil;

public class GameRuleCardsBLL   {

	public static ArrayList<GameRuleCardsDomainModel> getCardsRules(int RuleID) {
		
		ArrayList<GameRuleCardsDomainModel> grC = new ArrayList<GameRuleCardsDomainModel>();
		
		for (GameRuleCardsDomainModel grCards: GameRuleCardsDAL.getCardsRules())
		{
			if (grCards.getRULEID() == RuleID)
			{
				grC.add(grCards);
			}
		}
		
		return grC;

	}
	
	public static HashMap<String, GameRuleCardsDomainModel> getRuleCardsHashSet(int RuleID)
	{
		HashMap<String, GameRuleCardsDomainModel> HashRuleCardsSet = new HashMap();
		
		for (GameRuleCardsDomainModel grCards: getCardsRules(RuleID))
		{
			String keyVal =  "" + grCards.getRULECARDID();
			
			HashRuleCardsSet.put(keyVal, grCards);
		}
		return HashRuleCardsSet;
		
	}
	
}
