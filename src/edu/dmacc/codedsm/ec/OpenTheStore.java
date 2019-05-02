package edu.dmacc.codedsm.ec;

public class OpenTheStore implements Openner {
    private String employeeName;
    private String position;

    public void performOpen() {

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public OpenTheStore(String employeeName, String position) {
        this.employeeName = employeeName;
        this.position = position;
    }



}

