package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Philippe Troudeaux", "23456789", 32600.5);
    }

    @Test
    public void canGetName(){
        assertEquals("Philippe Troudeaux", databaseAdmin.getName());
    }

    @Test
    public void canSetName(){
        databaseAdmin.setName("Nelly Piggs");
        assertEquals("Nelly Piggs", databaseAdmin.getName());
    }

    @Test
    public void canGetNin(){
        assertEquals("23456789", databaseAdmin.getNin());
    }

    @Test
    public void canSetNin(){
        databaseAdmin.setNin("98765432");
        assertEquals("98765432", databaseAdmin.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(32600.5, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canSetSalary(){
        databaseAdmin.setSalary(36000.0);
        assertEquals(36000.0, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(7399.5);
        assertEquals(40000.0, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(32926.5, databaseAdmin.getSalary(), 0.1);
    }
}
