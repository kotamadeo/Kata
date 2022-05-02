package com.gmail.at.kotamadeo;

public final class Expression {
    private final String ROMAN = "I?[XV]|V?II?I?";
    private final String ARABIC = "[1-9]|10";
    private final String OPERAND = "[-+*/]";
    private final String OR = "|";

    public String getARABIC() {
        return ARABIC;
    }

    public String getOR() {
        return OR;
    }

    public String getOPERAND() {
        return OPERAND;
    }

    public String getROMAN() {
        return ROMAN;
    }
}
