import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by wscown on 2/19/16.
 */
public class MyStringUtilsTest {

    @Test
    public void testCombine() throws Exception {

        char[] test1 = new char[]{'a'};
        char[] test2 = new char[]{'a','b','c'};
        char[] test3 = new char[]{'a','b','c','d',' ','1','2','3','4','5','6','7'};

        String testanswer1 = "a";
        String testanswer2 = "a,b,c";
        String testanswer3 = "a,b,c,d, ,1,2,3,4,5,6,7";

        String[] stest1 = new String[]{"a"};
        String[] stest2 = new String[]{"a","b","c"};
        String[] stest3 = new String[]{"This", "is", "a", "test"};

        String stestanswer1 = "a";
        String stestanswer2 = "a,b,c";
        String stestanswer3 = "This,is,a,test";

        assertTrue(testanswer1.equals(MyStringUtils.combine(test1)));
        assertTrue(testanswer2.equals(MyStringUtils.combine(test2)));
        assertTrue(testanswer3.equals(MyStringUtils.combine(test3)));

        assertTrue(stestanswer1.equals(MyStringUtils.combine(stest1)));
        assertTrue(stestanswer2.equals(MyStringUtils.combine(stest2)));
        assertTrue(stestanswer3.equals(MyStringUtils.combine(stest3)));
    }

    @Test
    public void testSeparate() throws Exception {
        String testinput1 = "This is a test line 1\nThis is a test line 2\nThis is a test line 3";
        String testinput2 = "This should only be a single line";
        String testinput3 = "This should be one line, even with the new line in the test arguement\n";
        String testinput4 = "This should be two lines with the second line a sting of single white space character\n ";

        String[] testanswer1 = new String[]{"This is a test line 1","This is a test line 2", "This is a test line 3"};
        String[] testanswer2 = new String[]{"This should only be a single line"};
        String[] testanswer3 = new String[]{"This should be one line, even with the new line in the test arguement"};
        String[] testanswer4 = new String[]{"This should be two lines with the second line a sting of single white space character", " "};

        assertArrayEquals(testanswer1, MyStringUtils.separate(testinput1));
        assertArrayEquals(testanswer2, MyStringUtils.separate(testinput2));
        assertArrayEquals(testanswer3, MyStringUtils.separate(testinput3));
        assertArrayEquals(testanswer4, MyStringUtils.separate(testinput4));
    }

    @Test
    public void testReverseCaptial() throws Exception {
        String testinput1 = "1";
        String testinput2 = "T";
        String testinput3 = "l";
        String testinput4 = "AAAAA";
        String testinput5 = "bbbbb";
        String testinput6 = "This is a test";
        String testinput7 = "ThiS IS ThE FinaL TesT";

        String testanswer1 = "1";
        String testanswer2 = "t";
        String testanswer3 = "L";
        String testanswer4 = "aaaaa";
        String testanswer5 = "BBBBB";
        String testanswer6 = "tHIS IS A TEST";
        String testanswer7 = "tHIs is tHe fINAl tESt";

        assertTrue(testanswer1.equals(MyStringUtils.reverseCaptial(testinput1)));
        assertTrue(testanswer2.equals(MyStringUtils.reverseCaptial(testinput2)));
        assertTrue(testanswer3.equals(MyStringUtils.reverseCaptial(testinput3)));
        assertTrue(testanswer4.equals(MyStringUtils.reverseCaptial(testinput4)));
        assertTrue(testanswer5.equals(MyStringUtils.reverseCaptial(testinput5)));
        assertTrue(testanswer6.equals(MyStringUtils.reverseCaptial(testinput6)));
        assertTrue(testanswer7.equals(MyStringUtils.reverseCaptial(testinput7)));

    }

    @Test
    public void testReverseWords() throws Exception {
        String testinput1 = "A";
        String testinput2 = "All";
        String testinput3 = "All these words should be reversed";

        String testanswer1 = "A";
        String testanswer2 = "llA";
        String testanswer3 = "llA eseht sdrow dluohs eb desrever";

        assertTrue(testanswer1.equals(MyStringUtils.reverseWords(testinput1)));
        assertTrue(testanswer2.equals(MyStringUtils.reverseWords(testinput2)));
        assertTrue(testanswer3.equals(MyStringUtils.reverseWords(testinput3)));
    }

    @Test
    public void testNoWhiteSpaceLineSeperated() throws Exception {
        String testinput1 = "A";
        String testinput2 = "   b";
        String testinput3 = "C     ";
        String testinput4 = "Test";
        String testinput5 = "This is a test";
        String testinput6 = "    This   is the       final    test    ";

        String[] testanswer1 = new String[]{"A"};
        String[] testanswer2 = new String[]{"b"};
        String[] testanswer3 = new String[]{"C"};
        String[] testanswer4 = new String[]{"Test"};
        String[] testanswer5 = new String[]{"This","is","a","test"};
        String[] testanswer6 = new String[]{"This","is","the","final","test"};

        assertArrayEquals(testanswer1, MyStringUtils.noWhiteSpaceLineSeperated(testinput1));
        assertArrayEquals(testanswer2, MyStringUtils.noWhiteSpaceLineSeperated(testinput2));
        assertArrayEquals(testanswer3, MyStringUtils.noWhiteSpaceLineSeperated(testinput3));
        assertArrayEquals(testanswer4, MyStringUtils.noWhiteSpaceLineSeperated(testinput4));
        assertArrayEquals(testanswer5, MyStringUtils.noWhiteSpaceLineSeperated(testinput5));
        assertArrayEquals(testanswer6, MyStringUtils.noWhiteSpaceLineSeperated(testinput6));
    }

    @Test
    public void testEverySubstring() throws Exception {

        String testinput1 = "a";
        String testinput2 = "ab";
        String testinput3 = "abc";
        String testinput4 = "abcd";

        String[] testanswer1 = new String[]{"a"};
        String[] testanswer2 = new String[]{"a", "b", "ab"};
        String[] testanswer3 = new String[]{"a", "b", "c", "ab", "bc", "abc"};
        String[] testanswer4 = new String[]{"a", "b", "c", "d", "ab", "bc", "cd", "abc", "bcd", "abcd"};

        assertArrayEquals(testanswer1, MyStringUtils.everySubstring(testinput1));
        assertArrayEquals(testanswer2, MyStringUtils.everySubstring(testinput2));
        assertArrayEquals(testanswer3, MyStringUtils.everySubstring(testinput3));
        assertArrayEquals(testanswer4, MyStringUtils.everySubstring(testinput4));
    }

    @Test
    public void testStringManipulation() throws Exception {
        String[] testinput1 = new String[]{"This is a test", "No idea if this is right or close to right", "But what can you do but blindy carry on?!"};

        String testanswer1 = "                                                                  This is a test    e\n" +
                "                                      No idea if this is right or close to right   2a\n" +
                "                                       But what can you do but blindy carry on?!   29";

        assertTrue(testanswer1.equals(MyStringUtils.stringManipulation(testinput1)));
    }
}