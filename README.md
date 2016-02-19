
ntomjs-webdriver
phantomjs with webdriver
PhantomJS itself is not a test framework, it is only used to launch the tests via a suitable test runner.

We will see a PhantomJs and GhostDriver combination. GhostDriver is a pure JavaScript implementation of the WebDriver Wire Protocol for PhantomJS. It’s a Remote WebDriver that uses PhantomJS as back-end. So, Ghostdriver is the bridge between the Selenium WebDriver with Phantom JS.

Ghost Driver is a pure JavaScript implementation of the WebDriver Wire Protocol for PhantomJS. It’s a Remote WebDriver that uses PhantomJS as back-end.
How to use it ?

Step 1:

    Download PhantomJs as per your OS.

I am using Mac and hence this blog post will follow Setting up PhantomJs with Selenium WebDriver

Download and extract the package. or windows its an exe file and for Mac its just a zip package you will need to extract and SET the phantomjs in the PATH.

You will need to setup the Phantomjs executable that is in the bin folder to some PATH.

e.g: /usr/bin 

Step 2:

Starting the PhantomJs in a Remote WebDriver mode

hantomjs --webdriver=2322

