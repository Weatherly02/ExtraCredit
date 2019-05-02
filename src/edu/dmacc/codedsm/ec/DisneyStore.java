package edu.dmacc.codedsm.ec;

public class DisneyStore extends Store {

    @Override
    public boolean openStore(String employeeName) {
        if (employeeName != null) {
            System.out.println("This is who will open the DisneyStore " + employeeName);
            return true;
        } else {
            return false;

        }
    }
}