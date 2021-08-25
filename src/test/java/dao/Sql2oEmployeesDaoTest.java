package dao;

import models.Department;
import models.Employees;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Sql2oEmployeesDaoTest {
    private static Sql2oEmployeesDao employeesDao;
    private static Connection conn;
    private static Sql2oDepartmentDao departmentDao;

    @BeforeClass
    public static void setUp() throws Exception {
        String connectingString = "jdbc:postgresql://localhost:5432/newsapi_test";
        Sql2o sql2o = new Sql2o( connectingString , "moringa" , "Accesss" );
        employeesDao = new Sql2oEmployeesDao( sql2o );
        departmentDao = new Sql2oDepartmentDao( sql2o );
        conn = sql2o.open( );
    }

    @After
    public void tearDown() throws Exception {
        employeesDao.clearAll( );
        departmentDao.clearAll( );
    }

    @AfterClass
    public static void shutDown() throws Exception {
        conn.close( );
    }
}

