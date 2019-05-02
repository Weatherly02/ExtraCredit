package edu.dmacc.codedsm.ec;

public class Runner {
    public static void main(String[] args) {

        Store newStore = new DisneyStore();
        OpenTheStore newOpenner = new OpenTheStore("Miss. Felicia","Cinderella");

        boolean openToPublic = newStore.openStore(newOpenner.getEmployeeName());

        }
}
