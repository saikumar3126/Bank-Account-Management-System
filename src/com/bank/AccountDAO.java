package com.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountDAO {

    public void createAccount(int accountNumber, String accountHolderName,
                              String phoneNumber, String accountType,
                              double balance) {

        String sql = "INSERT INTO account "
                   + "(account_number, account_holder_name, phone_number, account_type, balance) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, accountNumber);
            ps.setString(2, accountHolderName);
            ps.setString(3, phoneNumber);
            ps.setString(4, accountType);
            ps.setDouble(5, balance);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Account created successfully!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    public void viewAccount(int accountNumber) {

        String sql = "SELECT * FROM account WHERE account_number = ?";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, accountNumber);

            java.sql.ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Account Number: " + rs.getInt("account_number"));
                System.out.println("Account Holder: " + rs.getString("account_holder_name"));
                System.out.println("Phone Number: " + rs.getString("phone_number"));
                System.out.println("Account Type: " + rs.getString("account_type"));
                System.out.println("Balance: " + rs.getDouble("balance"));
            } else {
                System.out.println("Account not found!");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}