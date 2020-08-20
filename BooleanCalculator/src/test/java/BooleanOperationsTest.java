import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BooleanOperationsTest extends TestCase {

    BooleanOperations bo00 = new BooleanOperations(false, false);
    BooleanOperations bo01 = new BooleanOperations(false, true);
    BooleanOperations bo10 = new BooleanOperations(true, false);
    BooleanOperations bo11 = new BooleanOperations(true, true);
    BooleanOperations bo0Null = new BooleanOperations(false, null);
    BooleanOperations boNull0 = new BooleanOperations(null, false);
    BooleanOperations bo1Null = new BooleanOperations(true, null);
    BooleanOperations boNull1 = new BooleanOperations(null, true);
    BooleanOperations boNullNull = new BooleanOperations(null, null);

    @Test
    public void testConjunctionBO00() {
        Assert.assertFalse(bo00.conjunction());
    }

    @Test
    public void testDisjunctionBO00() {
        Assert.assertFalse(bo00.disjunction());
    }

    @Test
    public void testConjunctionBO01() {
        Assert.assertFalse(bo01.conjunction());
    }

    @Test
    public void testDisjunctionBO01() {
        Assert.assertTrue(bo01.disjunction());
    }

    @Test
    public void testConjunctionBO10() {
        Assert.assertFalse(bo10.conjunction());
    }

    @Test
    public void testDisjunctionBO10() {
        Assert.assertTrue(bo10.disjunction());
    }

    @Test
    public void testConjunctionBO11() {
        Assert.assertTrue(bo11.conjunction());
    }

    @Test
    public void testDisjunctionBO11() {
        Assert.assertTrue(bo11.disjunction());
    }

    @Test
    public void testConjunctionBO0Null() {
        Assert.assertNull(bo0Null.conjunction());
    }

    @Test
    public void testDisjunctionBO0Null() {
        Assert.assertFalse(bo0Null.disjunction());
    }

    @Test
    public void testConjunctionBONull0() {
        Assert.assertNull(boNull0.conjunction());
    }

    @Test
    public void testDisjunctionBONull0() {
        Assert.assertFalse(boNull0.disjunction());
    }

    @Test
    public void testConjunctionBO1Null() {
        Assert.assertNull(bo1Null.conjunction());
    }

    @Test
    public void testDisjunctionBO1Null() {
        Assert.assertTrue(bo1Null.disjunction());
    }

    @Test
    public void testConjunctionBONull1() {
        Assert.assertNull(boNull1.conjunction());
    }

    @Test
    public void testDisjunctionBONull1() {
        Assert.assertTrue(boNull1.disjunction());
    }

    @Test
    public void testConjunctionBONullNull() {
        Assert.assertNull(boNullNull.conjunction());
    }

    @Test
    public void testDisjunctionBONullNull() {
        Assert.assertNull(boNullNull.disjunction());
    }
}