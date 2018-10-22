package it.unical.asde2018.MavenFirstTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MyMathTest.class, MyMathPerfomanceTests.class})
public class MyMathTestSuite {

}
