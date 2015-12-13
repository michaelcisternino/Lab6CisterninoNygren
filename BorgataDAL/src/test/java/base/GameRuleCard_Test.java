package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.GameRuleCardsDomainModel;

public class GameRuleCard_Test {

	private static ArrayList<GameRuleCardsDomainModel> grCards;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void GetRules()
	{
		grCards = GameRuleCardsDAL.getCardsRules();
		
		assertTrue(grCards.size() > 0);
		
	}
	
}
