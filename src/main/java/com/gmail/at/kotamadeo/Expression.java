package com.gmail.at.kotamadeo;

public final class Expression {
    private final String ROMAN = "I?[XV]|V?II?I?";
    private final String ARABIC = "[1-9]|10";
    private final String OPERATION = "[-+*/]";
    private final String OR = "|";

    public String getARABIC() {
        return ARABIC;
    }

    public String getOPERATION() {
        return OPERATION;
    }

    public String getOR() {
        return OR;
    }

    public String getROMAN() {
        return ROMAN;
    }
}
