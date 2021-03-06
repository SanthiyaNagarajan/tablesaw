package tech.tablesaw.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    /** To improve the test coverage, add the following new test cases */
    /**
     * splitByCharacterTypeCamelCase(String): String[]
     */
    @Test
    public void splitByCharacterTypeCamelCaseTest_NullStr() {
        String[] actual = StringUtils.splitByCharacterTypeCamelCase(null);
        assertEquals(null, actual);
    }

    @Test
    public void splitByCharacterTypeCamelCaseTest() {
        String[] actual = StringUtils.splitByCharacterTypeCamelCase("hREDG1&23fhkAJhsN1321hadgNN&**&)(+=;'_");
        String[] expected = new String[] {"h", "REDG", "1", "&", "23", "fhk", "A", "Jhs", "N" , "1321", "hadg", "NN", "&**&", ")", "(", "+=", ";'", "_"};
        assertArrayEquals(expected, actual);
    }

    /**
     * repeat(String int): String
     */
    @Test
    public void repeatTest_NegativeRepeat() {
        String actual = StringUtils.repeat("happy", -1);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void repeatTest_NullStr() {
        String actual = StringUtils.repeat(null, 3);
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void repeatTest() {
        String actual = StringUtils.repeat("happy", 5);
        String expected = "happyhappyhappyhappyhappy";
        assertEquals(expected, actual);
    }

    @Test
    public void repeatTest_2() {
        String actual = StringUtils.repeat("ha", 5);
        String expected = "hahahahaha";
        assertEquals(expected, actual);
    }

    /**
     * join(Object[], char): String
     */
    @Test
    public void joinTest_NullStr() {
        Object[] str = null;
        String actual = StringUtils.join(str, '*');
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void joinTest() {
        Object[] str = new String[]{"a", "b", "c"};
        String actual = StringUtils.join(str, '*');
        String expected = "a*b*c";
        assertEquals(expected, actual);
    }

    /**
     * capitalize(String): String
     */
    @Test
    public void capitalize_NullStr() {
        String str = null;
        String actual = StringUtils.capitalize(str);
        String expected = null;
        assertEquals(expected, actual);
    }
}
