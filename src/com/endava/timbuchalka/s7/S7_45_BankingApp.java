package com.endava.timbuchalka.s7;

import java.util.ArrayList;
import java.util.Scanner;

public class S7_45_BankingApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank("MICB");

    public static void main(String[] args) {

        boolean quit = false;
        startBank();
        printActions();
        while (!quit) {
            System.out.println("Enter you choice:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shut down");
                    quit = true;
                    break;
                case 1:
                    printBranches();
                    break;
                case 2:
                    printCustomers();
                    break;
                case 3:
                    addBranch();
                    break;
                case 4:
                    addCustomer();
                    break;
                case 5:
                    addTransaction();
                    break;
                case 9:
                    printActions();
                    break;
            }
        }
    }

    private static void startBank() {
        System.out.println("Creating bank ...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:");
        System.out.println(
                "0 - Exit\n" +
                        "1 - Print branches\n" +
                        "2 - Print all customer's for a particular branch\n" +
                        "3 - Add a new branch\n" +
                        "4 - Add a new customer to the branch\n" +
                        "5 - Add a new transaction for the customer\n" +
                        "9 - Print the list of available actions");
        System.out.println("Choose your action: ");
    }

    private static void printBranches() {
        System.out.println("Branches:");
        int i = 1;
        for (Branch branch : bank.getBranches()) {
            System.out.println(i++ + ". " + branch.getName());
        }
    }

    private static void printCustomers() {
        System.out.println("Enter the name of an existing branch:");
        String name = scanner.nextLine();
        System.out.println("Would you like to see all customers transactions for that branch (Y/N):");
        String printTransactions = scanner.nextLine();
        bank.listCustomers(name, printTransactions.equalsIgnoreCase("Y"));
    }

    private static void addBranch() {
        System.out.println("Enter the name of a new branch:");
        String name = scanner.nextLine();
        if (bank.addBranch(name)) {
            System.out.println("Branch was added successfully");
        } else {
            System.out.println("Branch wasn't added");
        }
    }

    private static void addCustomer() {
        System.out.println("Enter the name of an existing branch:");
        String branchName = scanner.nextLine();
        System.out.println("Enter the name of a new customer:");
        String customerName = scanner.nextLine();
        System.out.println("Enter customer's initial transaction amount:");
        double initialTransaction = scanner.nextDouble();
        if (bank.addCustomer(branchName, customerName, initialTransaction)) {
            System.out.println("Customer was added successfully");
        } else {
            System.out.println("Customer wasn't added");
        }
    }

    private static void addTransaction() {
        System.out.println("Enter the name of an existing branch:");
        String branchName = scanner.nextLine();
        System.out.println("Enter the name of an existing customer:");
        String customerName = scanner.nextLine();
        System.out.println("Enter customer's transaction amount:");
        double initialTransaction = scanner.nextDouble();
        if (bank.addCustomerTransaction(branchName, customerName, initialTransaction)) {
            System.out.println("Transaction was added successfully");
        } else {
            System.out.println("Transaction wasn't added");
        }
    }
}

class Bank {

    private final String name;
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.addCustomerTransaction(customerName, initialTransaction);
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        System.out.println("Customer details for branch " + branchName);
        ArrayList<Customer> customers = branch.getCustomers();
        for (int i = 0; i < branch.getCustomers().size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
            if (printTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = customer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }
}

class Branch {

    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) != null) {
            return false;
        }
        Customer customer = new Customer(name, initialTransaction);
        customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return false;
        }
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {

    private final String name;
    private final ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}