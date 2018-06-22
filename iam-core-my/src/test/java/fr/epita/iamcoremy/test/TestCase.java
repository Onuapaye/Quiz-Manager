package fr.epita.iamcoremy.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.iamcoremy.Identity;
import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestCase {
	
	@Autowired
	private Identity id;

	@Autowired
	private DataSource ds;
	
	private static Logger LOGGER = LogManager.getLogger("Test Case Logging");
	
	@BeforeClass
	public static void globalSetup() {
		LOGGER.info("BeforeClass globalSetup() Method");
	}
	
	@Test
	public void testKasapa() {
		Assert.assertNotNull(id);
		Assert.assertNotNull(ds);
		Connection connection = null;
		try {
			connection = ds.getConnection();
			final String currentSchema = connection.getSchema();
			Assert.assertEquals(currentSchema, "ROOT");
			LOGGER.info(currentSchema);
		} catch (final Exception e) {
			LOGGER.error("problem while using the ds connection", e);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (final SQLException e) {
					LOGGER.error("problem while closing the ds connection", e);
				}
			}
		}
		LOGGER.info("Test testKasapa() Method");
	}
	
	@Before
	public void sayKasapa() {
		LOGGER.info("Before sayKasapa() Method");
	}
	
	@After
	public void test3() {
		LOGGER.info("After test3() Method");
	}
	
	@AfterClass
	public static void afterKasapa() {
		LOGGER.info("AfterClass afterKasapa() Method");
	}
	

}
