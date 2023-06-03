public class IntroductionToAutomation {
    public static void main(String[] args) {
        /*
        Application - Product - Software
        SDLC -> process of achieving the product that is
        bug-free, good quality, user-friendly

        Requirements gathering
        Planning
        Design
        Development
        Testing
        Deployment
        Maintenance

        Application - Software
        1. Native application - AppStore or PlayStore
        2. Web Application - web browser
        3. Hybrid application

        UI TESTING
        Web Application -> Selenium WebDriver
                        -> WebDriverIO
                        -> Cypress
                        -> Playwright
        Mobile Application -> Appium
                           -> Cloud technologies: BrowserStack,
                           SeeTest, SauceLabs, Perfecto

        1. Backend - API Tester
        2. Frontend - UI Tester

        TEST CASE CREATION:
        TC567: Validate Google title
        Go to https://www.google.com/
        Validate the title displayed as Google

        TC567: Validate Google title
        Given user navigate to https://www.google.com/
        Then user should see title as Google

        TEST SCRIPT CREATION
        Set up driver
        Maximize driver
        Implement some waits
        Navigate to https://www.google.com/
        Validate the title

        Test case       -> manual
        Test script     -> automation

        SELENIUM WEBDRIVER
        - Selenium is a set of suites that helps us automate
        browsers

        BROWSER
        A web browser (commonly referred to as a browser) is
        application software for accessing the World Wide Web
        Ex:
        Google Chrome
        Opera
        Mozilla Firefox
        Internet Explorer
        Safari
        Edge

        Developers -> SE -> SDE -> Engineer

        Frontend Developers -> HTML-CSS-JS-React
        Backend Developers  -> Java (springboot), C3, Ruby, Python

        DevOps -> Pipelines - Environments

        Full Stack Developer -> Frontend + Backend

        System Architects

        CTO

        Dependencies:
        What are some dependencies that you use for automation?
        - Dependencies are known as any tool or library or jars
        that you use in your project
        - Java is our programming language
        - Selenium is our GUI (graphical user interface)
        automation tool
        - JUnit
        - TestNG
        - WebDriverManager (BoniGarcia)
        - Rest-Assured
        - JDBC
        - Cucumber

        How to automate web browser?
        1. Get all the dependencies set
        2. Set up driver
            System.setProperty("driver", "path");
            WebDriver driver = new ChromeDriver(); // Instantiate a Chrome Browser

            NOTE: In the above line to instantiate ChromeDriver
            instance, we are using Polymorphism as CHromeDriver
            is a child to WebDriver and in the shaope of
            WebDriver. We are also using Abstraction as
            WebDriver is an interface. Also, since ChromeDriver
            is a child to WebDriver, there is inheritance.

        3. Maximize
            1. driver.manage().window().maximize(); //  this line
            maximizes the current window if it is not already
            maximized
            2. driver.manage().window().fullscreen(); // this line
            fullscreens the current window if it is not already fullscreen

        4. Put some implicit waits
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECOND);

            NOTE: All the implicit, explicit and fluent waits
            from Selenium jars are used to synchronize driver with
            source code
            THE REASON: Source code is much faster than driver
            and if we don't use waits, we will get a lot of
            failure due to NoSuchElementException

        HTML DOM Structure
        DOM -> Document Object Model

        5. Navigate to your application
            driver.get("applicationUrl");

        6. Validations
            - title
            - url
            -content (header, footer, nav, paragraphs, links)
            - actions (navigations)



















         */
    }
}
