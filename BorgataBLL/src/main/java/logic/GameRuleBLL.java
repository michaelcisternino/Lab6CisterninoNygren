package logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.GameRuleDomainModel;
import base.GameRuleDAL;

public class GameRuleBLL {

	public static ArrayList<GameRuleDomainModel> getRules() {
		
		return GameRuleDAL.getRules();

	}
	
	public static HashMap<String, GameRuleDomainModel> getRuleHashSet()
	{
		HashMap<String, GameRuleDomainModel> HashRuleSet = new HashMap();
		
		for (GameRuleDomainModel gr: getRules())
		{
			HashRuleSet.put(gr.getRULENAME(), gr);
		}
		return HashRuleSet;
		
	}

	
}
