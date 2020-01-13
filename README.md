# TestProjectQa

  You may need to install the groovy compiler from the eclipse marketplace, it usually offers to do this automatically. 

  Project uses chromedriver version 79.0.3945.36 (BrowserDrivers folder)

  Maven commands to run the test:
 mvn clean install -U -Pdefault-tests  (will run the package where the test is located)
 mvn -Dtest=CheckingThatTheTextIsDisplayedSpec test (will run only this test)

  On the 10 line of the ChapterOnePage there is an assertion that the "Assert that this text is on the page" is displayed on the page. Each time when autotest redirects to this page - this condition will be checked. If there is no text, the test will fall
