package core;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest_01 {
@BeforeClass
    public static void beforeClass() throws Exception {
    System.out.println("BeforeClass");}
@AfterClass
    public static void afterClass() throws Exception {
    System.out.println("AfterClass");}
@Before
    public void beforeMethod() throws Exception {
    System.out.println("Before");}
@After
    public void afterMethod() throws Exception {
    System.out.println("After");}
@Test // @Ignore
    public void test_01_AssertEquals_Positive() {
    System.out.println("Test_01_AssertEquals_Positive");}
@Test // @Ignore
    public void test_02_AssertEquals_Negative() {
    System.out.println("Test_02_AssertEquals_Negative");}
@Test @Ignore
    public void test_03_AssertEquals_Ignored() {
    System.out.println("Test_03_AssertEquals_Ignored");}
@Test // @Ignore
    public void test_04_AssertSame_Positive() {
    System.out.println("Test_04_AssertSame_Positive");}
@Test // @Ignore
    public void test_05_AssertSame_Negative() {
    System.out.println("Test_05_AssertSame_Negative");}
@Test @Ignore
    public void test_06_AssertSame_Ignored() {
    System.out.println("Test_06_AssertSame_Ignored");}
@Test // @Ignore
    public void test_07_AssertFalse_Positive() {
    System.out.println("Test_07_AssertFalse_Positive");}
@Test // @Ignore
    public void test_08_AssertFalse_Negative() {
    System.out.println("Test_08_AssertFalse_Negative");}
@Test // @Ignore
    public void test_09_AssertTrue_Positive() {
    System.out.println("Test_09_AssertTrue_Positive");}
@Test // @Ignore
    public void test_10_AssertTrue_Negative() {
    System.out.println("Test_10_AssertTrue_Negative");}
}