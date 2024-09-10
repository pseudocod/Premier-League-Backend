package com.premierleague.premierleague.domain.entity.match;

public enum MatchStatus {
    FINISHED("Finished"),
    POSTPONED("Postponed"),
    CANCELLED("Cancelled"),
    IN_PROGRESS("In Progress");

    private final String description;

    MatchStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
