package com.utils.asserts;

import com.utils.log.LoggerController;
import com.utils.screenshot.Screenshot;
import org.testng.Assert;
import org.testng.collections.Lists;
import org.testng.internal.EclipseInterface;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

public class MyAssert {
    private final static LoggerController log = LoggerController.getLogger(MyAssert.class);


    /**
     * 断言字符是否已某个字符串开头
     *
     * @param message 断言错误消息
     * @param content 待断言字符串
     * @param prefix  前缀表达式
     */
    public static void assertStartWith(String content, String prefix, String message) {
        if (message != null)
            log.info(message);

        if (content.startsWith(prefix)) {
            log.info("前缀匹配校验成功");
        } else {
            log.error("前缀匹配校验失败！\n待校验的字符窜为:" + content + "\n校验的前缀表达式为:" + prefix);
            MyAssert.fail();
        }
    }

    /**
     * 断言字符是否已某个字符串开头
     *
     * @param content 待断言字符串
     * @param prefix  前缀表达式
     */
    public static void assertStartWith(String content, String prefix) {
        MyAssert.assertStartWith(content, prefix, null);
    }


    /**
     * 断言字符是否已某个字符串结尾
     *
     * @param message 断言错误消息
     * @param content 待断言字符串
     * @param endfix  前缀表达式
     */
    public static void assertEndWith(String content, String endfix, String message) {
        if (message != null)
            log.info(message);

        if (content.endsWith(endfix)) {
            log.info("后缀匹配校验成功！");
        } else {
            log.error("后缀匹配校验失败！\n待校验的字符窜为:" + content + "\n校验的后缀表达式为:" + endfix);
            MyAssert.fail();
        }
    }

    /**
     * 断言字符是否已某个字符串结尾
     *
     * @param content 待断言字符串
     * @param endfix  前缀表达式
     */
    public static void assertEndWith(String content, String endfix) {
        MyAssert.assertEndWith(content, endfix, null);
    }


    /**
     * 根据正则表达式断言是否匹配
     *
     * @param message 断言错误信息
     * @param matcher 待校验的字符串
     * @param regex   校验的正则表达式
     */
    public static void assertMatch(String matcher, String regex, String message) {
        if (message != null)
            log.info(message);

        if (Pattern.matches(regex, matcher)) {
            log.info("匹配校验成功！");
        } else {
            log.error("匹配校验失败！\n待校验的字符串为:" + matcher + "\n校验的正则表达式为:" + regex);
            MyAssert.fail();
        }
    }

    /**
     * 根据正则表达式断言是否匹配
     *
     * @param matcher 待校验的字符串
     * @param regex   校验的正则表达式
     */
    public static void assertMatch(String matcher, String regex) {
        MyAssert.assertMatch(matcher, regex, null);
    }

    /**
     * 根据正则表达式断言是否匹配
     *
     * @param message 断言错误信息
     * @param matcher 待校验的字符串
     * @param regex   校验的正则表达式
     */
    public static void assertNoMatch(String matcher, String regex, String message) {
        if (message != null)
            log.info(message);

        if (!Pattern.matches(regex, matcher)) {
            log.info("匹配校验成功！");
        } else {
            log.error("匹配校验失败！\n待校验的字符串为:" + matcher + "\n校验的正则表达式为:" + regex);
            MyAssert.fail();
        }
    }

    /**
     * 根据正则表达式断言是否匹配
     *
     * @param matcher 待校验的字符串
     * @param regex   校验的正则表达式
     */
    public static void assertNoMatch(String matcher, String regex) {
        MyAssert.assertNoMatch(matcher, regex, null);
    }


    /**
     * 断言字符串中是否包含某些字符
     *
     * @param message  断言错误消息
     * @param content  断言的字符串为
     * @param included 包含的字符串
     */
    public static void assertInclude(String content, String included, String message) {
        if (message != null)
            log.info(message);
        if (content.contains(included)) {
            log.info("匹配校验成功！");
        } else {
            log.error("匹配校验失败！\n待校验的字符串为:" + content + "\n包含字符串为:" + included);
            MyAssert.fail(message);
        }
    }

    /**
     * 断言字符串中是否包含某些字符
     *
     * @param content  断言的字符串为
     * @param included 包含的字符串
     */
    public static void assertInclude(String content, String included) {
        MyAssert.assertInclude(content, included, null);
    }



    public static void assertTrue(boolean condition, String message) {
        if (!condition) {
            failNotEquals(condition, Boolean.TRUE, message);
        }

    }

    public static void assertTrue(boolean condition) {
        assertTrue(condition, (String)null);
    }

    public static void assertFalse(boolean condition, String message) {
        if (condition) {
            failNotEquals(condition, Boolean.FALSE, message);
        }

    }

    public static void assertFalse(boolean condition) {
        assertFalse(condition, (String)null);
    }

    public static void fail(String message, Throwable realCause) {
        AssertionError ae = new AssertionError(message);
        ae.initCause(realCause);
        throw ae;
    }

    public static void fail(String message) {
        //Screenshot.screenshot("assert_fail_");
        log.error("Assert fail");
        throw new AssertionError(message);
    }

    public static void fail() {
        fail((String)null);
    }

    public static void assertEquals(Object actual, Object expected, String message) {
        if (expected != null && expected.getClass().isArray()) {
            assertArrayEquals(actual, expected, message);
        } else {
            assertEqualsImpl(actual, expected, message);
        }
    }

    private static void assertEqualsImpl(Object actual, Object expected, String message) {
        if (expected != null || actual != null) {
            if (expected == null ^ actual == null) {
                failNotEquals(actual, expected, message);
            }

            if (!expected.equals(actual) || !actual.equals(expected)) {
                fail(format(actual, expected, message, true));
            }
        }
    }

    private static void assertArrayEquals(Object actual, Object expected, String message) {
        if (expected != actual) {
            if (null == expected) {
                fail("expected a null array, but not null found. " + message);
            }

            if (null == actual) {
                fail("expected not null array, but null found. " + message);
            }

            if (!actual.getClass().isArray()) {
                failNotEquals(actual, expected, message);
            }

            int expectedLength = Array.getLength(expected);
            if (expectedLength != Array.getLength(actual)) {
                failNotEquals(Array.getLength(actual), expectedLength, message == null ? "" : message + " (Array lengths are not the same)");
            }

            for(int i = 0; i < expectedLength; ++i) {
                Object _actual = Array.get(actual, i);
                Object _expected = Array.get(expected, i);

                try {
                    assertEquals(_actual, _expected);
                } catch (AssertionError var8) {
                    failNotEquals(actual, expected, message == null ? "" : message + " (values at index " + i + " are not the same)");
                }
            }

        }
    }

    public static void assertEquals(byte[] actual, byte[] expected) {
        assertEquals(actual, expected, "");
    }

    public static void assertEquals(byte[] actual, byte[] expected, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                if (expected[i] != actual[i]) {
                    fail(String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Byte.toString(expected[i]), Byte.toString(actual[i]), message));
                }
            }

        }
    }

    public static void assertEquals(short[] actual, short[] expected) {
        assertEquals(actual, expected, "");
    }

    public static void assertEquals(short[] actual, short[] expected, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                if (expected[i] != actual[i]) {
                    fail(String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Short.toString(expected[i]), Short.toString(actual[i]), message));
                }
            }

        }
    }

    public static void assertEquals(int[] actual, int[] expected) {
        assertEquals(actual, expected, "");
    }

    public static void assertEquals(int[] actual, int[] expected, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                if (expected[i] != actual[i]) {
                    fail(String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Integer.toString(expected[i]), Integer.toString(actual[i]), message));
                }
            }

        }
    }

    public static void assertEquals(boolean[] actual, boolean[] expected) {
        assertEquals(actual, expected, "");
    }

    public static void assertEquals(boolean[] actual, boolean[] expected, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                if (expected[i] != actual[i]) {
                    fail(String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Boolean.toString(expected[i]), Boolean.toString(actual[i]), message));
                }
            }

        }
    }

    public static void assertEquals(char[] actual, char[] expected) {
        assertEquals(actual, expected, "");
    }

    public static void assertEquals(char[] actual, char[] expected, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                if (expected[i] != actual[i]) {
                    fail(String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Character.toString(expected[i]), Character.toString(actual[i]), message));
                }
            }

        }
    }

    public static void assertEquals(float[] actual, float[] expected) {
        assertEquals(actual, expected, "");
    }

    public static void assertEquals(float[] actual, float[] expected, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                assertEquals(actual[i], expected[i], String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Float.toString(expected[i]), Float.toString(actual[i]), message));
            }

        }
    }

    public static void assertEquals(float[] actual, float[] expected, float delta) {
        assertEquals(actual, expected, delta, "");
    }

    public static void assertEquals(float[] actual, float[] expected, float delta, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                assertEquals(actual[i], expected[i], delta, String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Float.toString(expected[i]), Float.toString(actual[i]), message));
            }

        }
    }

    public static void assertEquals(double[] actual, double[] expected) {
        assertEquals(actual, expected, "");
    }

    public static void assertEquals(double[] actual, double[] expected, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                assertEquals(actual[i], expected[i], String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Double.toString(expected[i]), Double.toString(actual[i]), message));
            }

        }
    }

    public static void assertEquals(double[] actual, double[] expected, double delta) {
        assertEquals(actual, expected, delta, "");
    }

    public static void assertEquals(double[] actual, double[] expected, double delta, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                assertEquals(actual[i], expected[i], delta, String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Double.toString(expected[i]), Double.toString(actual[i]), message));
            }

        }
    }

    public static void assertEquals(long[] actual, long[] expected) {
        assertEquals(actual, expected, "");
    }

    public static void assertEquals(long[] actual, long[] expected, String message) {
        if (!checkRefEqualityAndLength(actual, expected, message)) {
            for(int i = 0; i < expected.length; ++i) {
                if (expected[i] != actual[i]) {
                    fail(String.format("arrays differ firstly at element [%LogEventListener]; expected value is <%s> but was <%s>. %s", i, Long.toString(expected[i]), Long.toString(actual[i]), message));
                }
            }

        }
    }

    private static boolean checkRefEqualityAndLength(Object actualArray, Object expectedArray, String message) {
        if (expectedArray == actualArray) {
            return true;
        } else {
            if (null == expectedArray) {
                fail("expectedArray a null array, but not null found. " + message);
            }

            if (null == actualArray) {
                fail("expectedArray not null array, but null found. " + message);
            }

            assertEquals(Array.getLength(actualArray), Array.getLength(expectedArray), "arrays don't have the same size. " + message);
            return false;
        }
    }

    public static void assertEquals(Object actual, Object expected) {
        assertEquals((Object)actual, (Object)expected, (String)null);
    }

    public static void assertEquals(String actual, String expected, String message) {
        assertEquals((Object)actual, (Object)expected, message);
    }

    public static void assertEquals(String actual, String expected) {
        assertEquals((String)actual, (String)expected, (String)null);
    }

    public static void assertEquals(double actual, double expected, double delta, String message) {
        if (Double.isInfinite(expected)) {
            if (expected != actual) {
                failNotEquals(actual, expected, message);
            }
        } else if (Double.isNaN(expected)) {
            if (!Double.isNaN(actual)) {
                failNotEquals(actual, expected, message);
            }
        } else if (Math.abs(expected - actual) > delta) {
            failNotEquals(actual, expected, message);
        }

    }

    public static void assertEquals(double actual, double expected, double delta) {
        assertEquals(actual, expected, delta, (String)null);
    }

    public static void assertEquals(double actual, double expected, String message) {
        if (Double.isNaN(expected)) {
            if (!Double.isNaN(actual)) {
                failNotEquals(actual, expected, message);
            }
        } else if (actual != expected) {
            failNotEquals(actual, expected, message);
        }

    }

    public static void assertEquals(double actual, double expected) {
        assertEquals(actual, expected, (String)null);
    }

    public static void assertEquals(float actual, float expected, float delta, String message) {
        if (Float.isInfinite(expected)) {
            if (expected != actual) {
                failNotEquals(actual, expected, message);
            }
        } else if (Float.isNaN(expected)) {
            if (!Float.isNaN(actual)) {
                failNotEquals(actual, expected, message);
            }
        } else if (Math.abs(expected - actual) > delta) {
            failNotEquals(actual, expected, message);
        }

    }

    public static void assertEquals(float actual, float expected, float delta) {
        assertEquals(actual, expected, delta, (String)null);
    }

    public static void assertEquals(float actual, float expected, String message) {
        if (Float.isNaN(expected)) {
            if (!Float.isNaN(actual)) {
                failNotEquals(actual, expected, message);
            }
        } else if (actual != expected) {
            failNotEquals(actual, expected, message);
        }

    }

    public static void assertEquals(float actual, float expected) {
        assertEquals(actual, expected, (String)null);
    }

    public static void assertEquals(long actual, long expected, String message) {
        assertEquals((Object)actual, (Object)expected, message);
    }

    public static void assertEquals(long actual, long expected) {
        assertEquals(actual, expected, (String)null);
    }

    public static void assertEquals(boolean actual, boolean expected, String message) {
        assertEquals((Object)actual, (Object)expected, message);
    }

    public static void assertEquals(boolean actual, boolean expected) {
        assertEquals(actual, expected, (String)null);
    }

    public static void assertEquals(byte actual, byte expected, String message) {
        assertEquals((Object)actual, (Object)expected, message);
    }

    public static void assertEquals(byte actual, byte expected) {
        assertEquals((byte)actual, (byte)expected, (String)null);
    }

    public static void assertEquals(char actual, char expected, String message) {
        assertEquals((Object)actual, (Object)expected, message);
    }

    public static void assertEquals(char actual, char expected) {
        assertEquals((char)actual, (char)expected, (String)null);
    }

    public static void assertEquals(short actual, short expected, String message) {
        assertEquals((Object)actual, (Object)expected, message);
    }

    public static void assertEquals(short actual, short expected) {
        assertEquals((short)actual, (short)expected, (String)null);
    }

    public static void assertEquals(int actual, int expected, String message) {
        assertEquals((Object)actual, (Object)expected, message);
    }

    public static void assertEquals(int actual, int expected) {
        assertEquals((int)actual, (int)expected, (String)null);
    }

    public static void assertNotNull(Object object) {
        assertNotNull(object, (String)null);
    }

    public static void assertNotNull(Object object, String message) {
        if (object == null) {
            String formatted = "";
            if (message != null) {
                formatted = message + " ";
            }

            fail(formatted + "expected object to not be null");
        }

        assertTrue(object != null, message);
    }

    public static void assertNull(Object object) {
        assertNull(object, (String)null);
    }

    public static void assertNull(Object object, String message) {
        if (object != null) {
            failNotSame(object, (Object)null, message);
        }

    }

    public static void assertSame(Object actual, Object expected, String message) {
        if (expected != actual) {
            failNotSame(actual, expected, message);
        }
    }

    public static void assertSame(Object actual, Object expected) {
        assertSame(actual, expected, (String)null);
    }

    public static void assertNotSame(Object actual, Object expected, String message) {
        if (expected == actual) {
            failSame(actual, expected, message);
        }

    }

    public static void assertNotSame(Object actual, Object expected) {
        assertNotSame(actual, expected, (String)null);
    }

    private static void failSame(Object actual, Object expected, String message) {
        String formatted = "";
        if (message != null) {
            formatted = message + " ";
        }

        fail(formatted + EclipseInterface.ASSERT_LEFT2 + expected + EclipseInterface.ASSERT_MIDDLE + actual + EclipseInterface.ASSERT_RIGHT);
    }

    private static void failNotSame(Object actual, Object expected, String message) {
        String formatted = "";
        if (message != null) {
            formatted = message + " ";
        }

        fail(formatted + EclipseInterface.ASSERT_EQUAL_LEFT + expected + EclipseInterface.ASSERT_MIDDLE + actual + EclipseInterface.ASSERT_RIGHT);
    }

    private static void failNotEquals(Object actual, Object expected, String message) {
        fail(format(actual, expected, message, true));
    }

    static String format(Object actual, Object expected, String message, boolean isAssertEquals) {
        String formatted = "";
        if (null != message) {
            formatted = message + " ";
        }

        return isAssertEquals ? formatted + EclipseInterface.ASSERT_EQUAL_LEFT + expected + EclipseInterface.ASSERT_MIDDLE + actual + EclipseInterface.ASSERT_RIGHT : formatted + EclipseInterface.ASSERT_UNEQUAL_LEFT + expected + EclipseInterface.ASSERT_MIDDLE + actual + EclipseInterface.ASSERT_RIGHT;
    }

    public static void assertEquals(Collection<?> actual, Collection<?> expected) {
        assertEquals((Collection)actual, (Collection)expected, (String)null);
    }

    public static void assertEquals(Collection<?> actual, Collection<?> expected, String message) {
        if (actual != expected) {
            if (actual == null || expected == null) {
                if (message != null) {
                    fail(message);
                } else {
                    fail("Collections not equal: expected: " + expected + " and actual: " + actual);
                }
            }

            assertEquals(actual.size(), expected.size(), (message == null ? "" : message + ": ") + "lists don't have the same size");
            Iterator<?> actIt = actual.iterator();
            Iterator<?> expIt = expected.iterator();
            int i = -1;

            while(actIt.hasNext() && expIt.hasNext()) {
                ++i;
                Object e = expIt.next();
                Object a = actIt.next();
                String explanation = "Lists differ at element [" + i + "]: " + e + " != " + a;
                String errorMessage = message == null ? explanation : message + ": " + explanation;
                assertEqualsImpl(a, e, errorMessage);
            }

        }
    }

    public static void assertEquals(Iterator<?> actual, Iterator<?> expected) {
        assertEquals((Iterator)actual, (Iterator)expected, (String)null);
    }

    public static void assertEquals(Iterator<?> actual, Iterator<?> expected, String message) {
        if (actual != expected) {
            if (actual == null || expected == null) {
                String msg = message != null ? message : "Iterators not equal: expected: " + expected + " and actual: " + actual;
                fail(msg);
            }

            int i = -1;

            while(actual.hasNext() && expected.hasNext()) {
                ++i;
                Object e = expected.next();
                Object a = actual.next();
                String explanation = "Iterators differ at element [" + i + "]: " + e + " != " + a;
                String errorMessage = message == null ? explanation : message + ": " + explanation;
                assertEqualsImpl(a, e, errorMessage);
            }

            String explanation;
            String errorMessage;
            if (actual.hasNext()) {
                explanation = "Actual iterator returned more elements than the expected iterator.";
                errorMessage = message == null ? explanation : message + ": " + explanation;
                fail(errorMessage);
            } else if (expected.hasNext()) {
                explanation = "Expected iterator returned more elements than the actual iterator.";
                errorMessage = message == null ? explanation : message + ": " + explanation;
                fail(errorMessage);
            }

        }
    }

    public static void assertEquals(Iterable<?> actual, Iterable<?> expected) {
        assertEquals((Iterable)actual, (Iterable)expected, (String)null);
    }

    public static void assertEquals(Iterable<?> actual, Iterable<?> expected, String message) {
        if (actual != expected) {
            if (actual == null || expected == null) {
                if (message != null) {
                    fail(message);
                } else {
                    fail("Iterables not equal: expected: " + expected + " and actual: " + actual);
                }
            }

            Iterator<?> actIt = actual.iterator();
            Iterator<?> expIt = expected.iterator();
            assertEquals(actIt, expIt, message);
        }
    }

    public static void assertEquals(Object[] actual, Object[] expected, String message) {
        if (actual != expected) {
            if (actual == null && expected != null || actual != null && expected == null) {
                if (message != null) {
                    fail(message);
                } else {
                    fail("Arrays not equal: " + Arrays.toString(expected) + " and " + Arrays.toString(actual));
                }
            }

            if (actual.length != expected.length) {
                failAssertNoEqual("Arrays do not have the same size:" + actual.length + " != " + expected.length, message);
            }

            for(int i = 0; i < expected.length; ++i) {
                Object e = expected[i];
                Object a = actual[i];
                String explanation = "Arrays differ at element [" + i + "]: " + e + " != " + a;
                String errorMessage = message == null ? explanation : message + ": " + explanation;
                if (a != null || e != null) {
                    if (a == null && e != null || a != null && e == null) {
                        failNotEquals(a, e, message);
                    }

                    if (e.getClass().isArray()) {
                        assertEquals(a, e, errorMessage);
                    } else {
                        assertEqualsImpl(a, e, errorMessage);
                    }
                }
            }

        }
    }

    public static void assertEqualsNoOrder(Object[] actual, Object[] expected, String message) {
        if (actual != expected) {
            if (actual == null && expected != null || actual != null && expected == null) {
                failAssertNoEqual("Arrays not equal: " + Arrays.toString(expected) + " and " + Arrays.toString(actual), message);
            }

            if (actual.length != expected.length) {
                failAssertNoEqual("Arrays do not have the same size:" + actual.length + " != " + expected.length, message);
            }

            List<Object> actualCollection = Lists.newArrayList();
            actualCollection.addAll(Arrays.asList(actual));
            Object[] var4 = expected;
            int var5 = expected.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Object o = var4[var6];
                actualCollection.remove(o);
            }

            if (actualCollection.size() != 0) {
                failAssertNoEqual("Arrays not equal: " + Arrays.toString(expected) + " and " + Arrays.toString(actual), message);
            }

        }
    }

    private static void failAssertNoEqual(String defaultMessage, String message) {
        if (message != null) {
            fail(message);
        } else {
            fail(defaultMessage);
        }

    }

    public static void assertEquals(Object[] actual, Object[] expected) {
        assertEquals((Object[])actual, (Object[])expected, (String)null);
    }

    public static void assertEqualsNoOrder(Object[] actual, Object[] expected) {
        assertEqualsNoOrder(actual, expected, (String)null);
    }

    public static void assertEquals(Set<?> actual, Set<?> expected) {
        assertEquals((Set)actual, (Set)expected, (String)null);
    }

    public static void assertEquals(Set<?> actual, Set<?> expected, String message) {
        if (actual != expected) {
            if (actual == null || expected == null) {
                if (message == null) {
                    fail("Sets not equal: expected: " + expected + " and actual: " + actual);
                } else {
                    failNotEquals(actual, expected, message);
                }
            }

            if (!actual.equals(expected)) {
                if (message == null) {
                    fail("Sets differ: expected " + expected + " but got " + actual);
                } else {
                    failNotEquals(actual, expected, message);
                }
            }

        }
    }

    public static void assertEqualsDeep(Set<?> actual, Set<?> expected, String message) {
        if (actual != expected) {
            if (actual == null || expected == null) {
                if (message == null) {
                    fail("Sets not equal: expected: " + expected + " and actual: " + actual);
                } else {
                    failNotEquals(actual, expected, message);
                }
            }

            if (expected.size() != actual.size()) {
                if (message == null) {
                    fail("Sets not equal: expected: " + expected + " and actual: " + actual);
                } else {
                    fail(format(actual, expected, message, true));
                }
            }

            Iterator<?> actualIterator = actual.iterator();
            Iterator expectedIterator = expected.iterator();

            while(expectedIterator.hasNext()) {
                Object expectedValue = expectedIterator.next();
                Object value = actualIterator.next();
                if (expectedValue.getClass().isArray()) {
                    assertArrayEquals(value, expectedValue, message);
                } else {
                    assertEqualsImpl(value, expectedValue, message);
                }
            }

        }
    }

    public static void assertEquals(Map<?, ?> actual, Map<?, ?> expected) {
        assertEquals((Map)actual, (Map)expected, (String)null);
    }

    public static void assertEquals(Map<?, ?> actual, Map<?, ?> expected, String message) {
        if (actual != expected) {
            if (actual == null || expected == null) {
                fail("Maps not equal: expected: " + expected + " and actual: " + actual);
            }

            if (actual.size() != expected.size()) {
                fail("Maps do not have the same size:" + actual.size() + " != " + expected.size());
            }

            Set<?> entrySet = actual.entrySet();
            Iterator var4 = entrySet.iterator();

            while(var4.hasNext()) {
                Object anEntrySet = var4.next();
                Map.Entry<?, ?> entry = (Map.Entry)anEntrySet;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object expectedValue = expected.get(key);
                String assertMessage = message != null ? message : "Maps do not match for key:" + key + " actual:" + value + " expected:" + expectedValue;
                assertEqualsImpl(value, expectedValue, assertMessage);
            }

        }
    }

    public static void assertEqualsDeep(Map<?, ?> actual, Map<?, ?> expected) {
        assertEqualsDeep((Map)actual, (Map)expected, (String)null);
    }

    public static void assertEqualsDeep(Map<?, ?> actual, Map<?, ?> expected, String message) {
        if (actual != expected) {
            if (actual == null || expected == null) {
                fail("Maps not equal: expected: " + expected + " and actual: " + actual);
            }

            if (actual.size() != expected.size()) {
                fail("Maps do not have the same size:" + actual.size() + " != " + expected.size());
            }

            Set<?> entrySet = actual.entrySet();
            Iterator var4 = entrySet.iterator();

            while(var4.hasNext()) {
                Object anEntrySet = var4.next();
                Map.Entry<?, ?> entry = (Map.Entry)anEntrySet;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object expectedValue = expected.get(key);
                String assertMessage = message != null ? message : "Maps do not match for key:" + key + " actual:" + value + " expected:" + expectedValue;
                if (expectedValue.getClass().isArray()) {
                    assertArrayEquals(value, expectedValue, assertMessage);
                } else {
                    assertEqualsImpl(value, expectedValue, assertMessage);
                }
            }

        }
    }

    public static void assertNotEquals(Object actual1, Object actual2, String message) {
        boolean fail;
        try {
            assertEquals(actual1, actual2);
            fail = true;
        } catch (AssertionError var5) {
            fail = false;
        }

        if (fail) {
            fail(format(actual1, actual2, message, false));
        }

    }

    public static void assertNotEquals(Object actual1, Object actual2) {
        assertNotEquals((Object)actual1, (Object)actual2, (String)null);
    }

    static void assertNotEquals(String actual1, String actual2, String message) {
        assertNotEquals((Object)actual1, (Object)actual2, message);
    }

    static void assertNotEquals(String actual1, String actual2) {
        assertNotEquals((String)actual1, (String)actual2, (String)null);
    }

    static void assertNotEquals(long actual1, long actual2, String message) {
        assertNotEquals((Object)actual1, (Object)actual2, message);
    }

    static void assertNotEquals(long actual1, long actual2) {
        assertNotEquals(actual1, actual2, (String)null);
    }

    static void assertNotEquals(boolean actual1, boolean actual2, String message) {
        assertNotEquals((Object)actual1, (Object)actual2, message);
    }

    static void assertNotEquals(boolean actual1, boolean actual2) {
        assertNotEquals(actual1, actual2, (String)null);
    }

    static void assertNotEquals(byte actual1, byte actual2, String message) {
        assertNotEquals((Object)actual1, (Object)actual2, message);
    }

    static void assertNotEquals(byte actual1, byte actual2) {
        assertNotEquals((byte)actual1, (byte)actual2, (String)null);
    }

    static void assertNotEquals(char actual1, char actual2, String message) {
        assertNotEquals((Object)actual1, (Object)actual2, message);
    }

    static void assertNotEquals(char actual1, char actual2) {
        assertNotEquals((char)actual1, (char)actual2, (String)null);
    }

    static void assertNotEquals(short actual1, short actual2, String message) {
        assertNotEquals((Object)actual1, (Object)actual2, message);
    }

    static void assertNotEquals(short actual1, short actual2) {
        assertNotEquals((short)actual1, (short)actual2, (String)null);
    }

    static void assertNotEquals(int actual1, int actual2, String message) {
        assertNotEquals((Object)actual1, (Object)actual2, message);
    }

    static void assertNotEquals(int actual1, int actual2) {
        assertNotEquals((int)actual1, (int)actual2, (String)null);
    }

    public static void assertNotEquals(float actual1, float actual2, float delta, String message) {
        boolean fail;
        try {
            assertEquals(actual1, actual2, delta, message);
            fail = true;
        } catch (AssertionError var6) {
            fail = false;
        }

        if (fail) {
            fail(format(actual1, actual2, message, false));
        }

    }

    public static void assertNotEquals(float actual1, float actual2, float delta) {
        assertNotEquals(actual1, actual2, delta, (String)null);
    }

    public static void assertNotEquals(double actual1, double actual2, double delta, String message) {
        boolean fail;
        try {
            assertEquals(actual1, actual2, delta, message);
            fail = true;
        } catch (AssertionError var9) {
            fail = false;
        }

        if (fail) {
            fail(format(actual1, actual2, message, false));
        }

    }

    public static void assertNotEquals(Set<?> actual, Set<?> expected) {
        assertNotEquals((Set)actual, (Set)expected, (String)null);
    }

    public static void assertNotEquals(Set<?> actual, Set<?> expected, String message) {
        boolean fail;
        try {
            assertEquals(actual, expected, message);
            fail = true;
        } catch (AssertionError var5) {
            fail = false;
        }

        if (fail) {
            fail(format(actual, expected, message, false));
        }

    }

    public static void assertNotEqualsDeep(Set<?> actual, Set<?> expected) {
        assertNotEqualsDeep((Set)actual, (Set)expected, (String)null);
    }

    public static void assertNotEqualsDeep(Set<?> actual, Set<?> expected, String message) {
        boolean fail;
        try {
            assertEqualsDeep(actual, expected, message);
            fail = true;
        } catch (AssertionError var5) {
            fail = false;
        }

        if (fail) {
            fail(format(actual, expected, message, false));
        }

    }

    public static void assertNotEquals(Map<?, ?> actual, Map<?, ?> expected) {
        assertNotEquals((Map)actual, (Map)expected, (String)null);
    }

    public static void assertNotEquals(Map<?, ?> actual, Map<?, ?> expected, String message) {
        boolean fail;
        try {
            assertEquals(actual, expected, message);
            fail = true;
        } catch (AssertionError var5) {
            fail = false;
        }

        if (fail) {
            fail(format(actual, expected, message, false));
        }

    }

    public static void assertNotEqualsDeep(Map<?, ?> actual, Map<?, ?> expected) {
        assertNotEqualsDeep((Map)actual, (Map)expected, (String)null);
    }

    public static void assertNotEqualsDeep(Map<?, ?> actual, Map<?, ?> expected, String message) {
        boolean fail;
        try {
            assertEqualsDeep(actual, expected, message);
            fail = true;
        } catch (AssertionError var5) {
            fail = false;
        }

        if (fail) {
            fail(format(actual, expected, message, false));
        }

    }

    public static void assertNotEquals(double actual1, double actual2, double delta) {
        assertNotEquals(actual1, actual2, delta, (String)null);
    }

    public static void assertThrows(Assert.ThrowingRunnable runnable) {
        assertThrows(Throwable.class, runnable);
    }

    public static <T extends Throwable> void assertThrows(Class<T> throwableClass, Assert.ThrowingRunnable runnable) {
        expectThrows(throwableClass, runnable);
    }

    public static <T extends Throwable> T expectThrows(Class<T> throwableClass, Assert.ThrowingRunnable runnable) {
        try {
            runnable.run();
        } catch (Throwable var4) {
            if (throwableClass.isInstance(var4)) {
                return (T) throwableClass.cast(var4);
            }

            String mismatchMessage = String.format("Expected %s to be thrown, but %s was thrown", throwableClass.getSimpleName(), var4.getClass().getSimpleName());
            throw new AssertionError(mismatchMessage, var4);
        }

        String message = String.format("Expected %s to be thrown, but nothing was thrown", throwableClass.getSimpleName());
        throw new AssertionError(message);
    }

    public interface ThrowingRunnable {
        void run() throws Throwable;
    }


}
