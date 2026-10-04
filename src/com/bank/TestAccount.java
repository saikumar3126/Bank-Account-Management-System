package com.bank;

public class TestAccount {

    public static void main(String[] args) {

        AccountDAO dao = new AccountDAO();

        dao.viewAccount(100001);
    }
}