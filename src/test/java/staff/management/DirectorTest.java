package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Frank Stowell", "24681012", 48350.9, "Executive", 25000.0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(25000.0, director.getBudget(), 0.1);
    }

    @Test
    public void canSetBudget(){
        director.setBudget(50000.0);
        assertEquals(50000.0, director.getBudget(), 0.1);
    }

    @Test
    public void canGetName(){
        assertEquals("Frank Stowell", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("Andrew Simmons-Keir");
        assertEquals("Andrew Simmons-Keir", director.getName());
    }

    @Test
    public void canGetNin(){
        assertEquals("24681012", director.getNin());
    }

    @Test
    public void canSetNin(){
        director.setNin("21018642");
        assertEquals("21018642", director.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(48350.9, director.getSalary(), 0.1);
    }

    @Test
    public void canSetSalary(){
        director.setSalary(52000.0);
        assertEquals(52000.0, director.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Executive", director.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        director.setDeptName("Finance");
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.0);
        assertEquals(53350.9, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(49317.9, director.getSalary(), 0.1);
    }

    @Test
    public void canPreventNegativeRaiseValue(){
        director.raiseSalary(-60000.0);
        assertEquals(48350.9, director.getSalary(), 0.1);
    }

    @Test
    public void canPreventNullSetNameValue(){
        director.setName("");
        assertEquals("Frank Stowell", director.getName());
    }




}
