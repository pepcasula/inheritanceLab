package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Raphael Grassman", "12345678", 40000.0, "Human Resources");
    }

    @Test
    public void canGetName(){
        assertEquals("Raphael Grassman", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("Johnny Cash");
        assertEquals("Johnny Cash", manager.getName());
    }

    @Test
    public void canGetNin(){
        assertEquals("12345678", manager.getNin());
    }

    @Test
    public void canSetNin(){
        manager.setNin("87654321");
        assertEquals("87654321", manager.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.0, manager.getSalary(), 0.1);
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(48000.0);
        assertEquals(48000.0, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Human Resources", manager.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        manager.setDeptName("Customer Support");
        assertEquals("Customer Support", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000.0);
        assertEquals(42000.0, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(40400.0, manager.getSalary(), 0.1);
    }
}
