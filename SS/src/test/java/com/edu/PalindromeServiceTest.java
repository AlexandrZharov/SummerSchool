package com.edu;

import junit.framework.TestCase;
import org.junit.Assert;
import java.util.logging.Logger;

public class PalindromeServiceTest extends TestCase {

    public void testEnglishPalindromeText() {
        String text = "ABba";
        Assert.assertTrue(PalindromeService.check(text));
    }

    public void testRussianPalindromeText() {
        String text = "ЫаАы";
        Assert.assertTrue(PalindromeService.check(text));
    }

    public void testEnglishNotPalindromeText() {
        String text = "ABbaT";
        Assert.assertFalse(PalindromeService.check(text));
    }

    public void testRussianNotPalindromeText() {
        String text = "ЫаАыС";
        Assert.assertFalse(PalindromeService.check(text));
    }

    public void testNullText() {
        Assert.assertFalse(PalindromeService.check(null));
    }

    public void testEmptyText() {
        Assert.assertFalse(PalindromeService.check(""));
    }
}