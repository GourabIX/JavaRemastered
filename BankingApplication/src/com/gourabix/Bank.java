package com.gourabix;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branchList;

    public Bank() {
        this("Infinity Bank");
    }

    private Bank(String name) {
        this.name = name;
        this.branchList = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    private boolean saveBranchToFile(Branch branch) {
        return branchList.add(branch);
    }

    private int queryBranchPosition(String branchName) {
        for (int i = 0; i < getBranchList().size(); i++) {
            if (getBranchList().get(i).getName().equalsIgnoreCase(branchName)) {
                return i;
            }
        }

        return -1;
    }

    public boolean addNewBranch(String branchName) {
        if (!branchExistsOrNot(branchName)) {
            return saveBranchToFile(new Branch(branchName));
        }

        return false;
    }

    public boolean branchExistsOrNot(String branchName) {
        if (queryBranchPosition(branchName) >= 0) {
            return true;
        }

        return false;
    }

    public boolean branchExistsOrNot(Branch branch) {
        if (getBranchList().contains(branch)) {
            return true;
        }

        return false;
    }

    public void displayAllBranches() {
        System.out.println("Here's the list of all branches: ");
        for (int i = 0; i < getBranchList().size(); i++) {
            System.out.println((i + 1) + ". " + getBranchList().get(i).getName());
        }
    }

    public Branch getBranchInfo(int position) {
        return getBranchList().get(position);
    }

}
