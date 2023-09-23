package com.module3.project3.enams;

public enum AnswersType {
    QS_1("Q-2", null),
    QS_2("Q-3", "Lie"),
    QS_2_FALSE("R-1", "Tell the truth"),
    QS_3_1("Q-4", "Wolf necklace"),
    QS_3_2("Q-4","Old computer" ),
    QS_3_3("Q-4", "Suitcase with money"),
    QS_4_1("R-2", "Sun"),
    QS_4_2("Q-5","Fire" ),
    QS_4_3("R-3", "Red pen"),
    QS_5_1("R-4", "No, you won't take the treasure directly; you acknowledge the creature's kindness."),
    QS_5_2("R-5", "Yes, you decide to take the treasure directly from the creature." ),
    QS_5_3("R-6", "What mermaid? Am I still sleeping?"),
    QS_5_4("R-7", "I think creature wants to trick me. Better attack first");

    private String qsNo;
    private String value;

    AnswersType(String qsNo, String value) {
        this.qsNo = qsNo;
        this.value = value;
    }

    public String getQsNo() {
        return qsNo;
    }

    public String getValue() {
        return value;
    }
}
