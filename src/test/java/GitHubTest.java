import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class will contain a series of test skeletons for
 * exercising the following Github features.
 *
 * 1. A test to see if a registered user can successfully log in
 * 2. A test to see if an unregistered user cannot log in
 * 3. A test to see if a registered user can create a new repository
 * 4. A test to see if a registered user cannot create a new repository
 *    when it has the same name as an existing repository.
 *
 */
public class GitHubTest {

  private WebDriver driver;

  private static final String GIT_HUB_URL = "https://github.com";

  //Enter the username for the Github account you create here
  private static final String USERNAME = "";

  //Enter the password for the Github account you create here.
  //Note: Do not use any of your real-life passwords!
  private static final String PASSWORD = "";

  @Before
  public void setup() {
    driver = new ChromeDriver();

    // And now use this to visit Github
    driver.get(GIT_HUB_URL);
  }

  /**
   * Test to see if an user can successfully login to Github.
   *
   * @TODO - Complete this test
   */
  @Test
  public void testGitHubLoginSuccess() {

  }

  /**
   * Test to see if an unknown user cannot login to Github.
   *
   * @TODO - Complete this test
   */
  @Test
  public void testGitHubLoginFailure() {

  }

  /**
   * Test to see that a registered user can successfully create
   * a new repository.
   *
   * @TODO - Complete this test
   */
  @Test
  public void testStartAProjectSuccess() {

  }

  /**
   * Test to see that a registered user cannot create a new repository
   * when it has the same name as an existing repository.
   *
   * @TODO - Complete this test
   */
  @Test
  public void testStartAProjectFailure() {

  }

  @After
  public void tearDown() {
    driver.close();
  }

}
