package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Marcus Shaman", "01234567", 35250.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Marcus Shaman", developer.getName());
    }

    @Test
    public void canSetName(){
        developer.setName("Marcel Richmond");
        assertEquals("Marcel Richmond", developer.getName());
    }

    @Test
    public void canGetNin(){
        assertEquals("01234567", developer.getNin());
    }

    @Test
    public void canSetNin(){
        developer.setNin("76543210");
        assertEquals("76543210", developer.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35250.0, developer.getSalary(), 0.1);
    }

    @Test
    public void canSetSalary(){
        developer.setSalary(39999.9);
        assertEquals(39999.9, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1250.5);
        assertEquals(36500.5, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(35602.5, developer.getSalary(), 0.1);
    }
}
