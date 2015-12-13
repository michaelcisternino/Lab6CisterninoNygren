package logic;

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

import domain.GameRuleDomainModel;
import logic.GameRuleBLL;

public class GameRule_Test {

	private static ArrayList<GameRuleDomainModel> gr;
	
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
		gr = GameRuleBLL.getRules();
		
		assertTrue(gr.size() > 0);
		
	}
	
}
