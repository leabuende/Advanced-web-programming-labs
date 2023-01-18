package com.apr2023.model;

import java.sql.*;
import java.util.ArrayList;

import static com.apr2023.utils.Constants.QUERY_SEL_EMPLOYEES;

/**
 *
 * @author JAA
 */
public class DBActions {
    //TODO correct level of encapsulation ?
    //TODO initialization not required ?
    Connection conn;
    Statement stmt;
    ResultSet rs;
    ArrayList<Employee> listEmployees;

    public DBActions(String dbUrl, String dbUser, String dbPwd) {
        try {
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (SQLException sqle) { //TODO why not just catch Exception e ?
                //TODO add error code
        }

    }

    public Statement getStatement() {
        try {
            stmt = conn.createStatement(); // TODO createStatement is declared in an interface (Connection). So why is this possible?
        } catch (SQLException sqle) { //TODO why not just catch Exception e ?
            //TODO add error code
        }
        return stmt;

    }

    public ResultSet getResultSet(String query) {
        stmt = getStatement();
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException sqle) { //TODO why not just catch Exception e ?
            //TODO add error code
        }
        return rs;

    }

    public ArrayList<Employee> getEmployees() {
        listEmployees = new ArrayList<>();  //TODO local vs global variable
        rs = getResultSet(QUERY_SEL_EMPLOYEES);
        try {
            while (rs.next()) {
                Employee emplBean = new Employee();
                emplBean.setFirstname(rs.getString("FIRSTNAME"));
                //TODO add code to retrieve the last name, the email and the city

                listEmployees.add(emplBean);
            }
        } catch (SQLException e) { //TODO why not just catch Exception e ?
            //TODO add error code
        }
        return listEmployees;
    }
}
