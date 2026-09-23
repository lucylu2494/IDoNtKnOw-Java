package org.example;

public enum States {
    KY("KY","Kentucky", "The Bluegrass State"),
    FL("FL", "Florida", "The Sunshine State");
    //constructor lines 3-15
    private final String abbreviation;
    private final String fullName;
    private final String stateMoto;

    States(String abbreviation, String fullName, String stateMoto) {
        this.abbreviation = abbreviation;
        this.fullName = fullName;
        this.stateMoto = stateMoto;
    }
    //getters lines 17-27
    public String getAbbreviation() {
        return abbreviation;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStateMoto() {
        return stateMoto;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(abbreviation)
                .append(" (")
                .append(fullName).append(")");

        return sb.toString();
    }
}
