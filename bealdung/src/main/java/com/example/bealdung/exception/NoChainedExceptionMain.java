package com.example.bealdung.exception;

public class NoChainedExceptionMain {

    public static void main(String[] args) throws Exception{
        getLeave();
    }

    static void getLeave() throws NoLeaveGrantedException {
        try {
            howIsTeamLead();
        } catch (TeamLeadUpsetException e) {
            e.printStackTrace();
            throw new NoLeaveGrantedException("Leave no sanctioned");
        }
    }

    static void howIsTeamLead() throws TeamLeadUpsetException {
        throw new TeamLeadUpsetException("Team Lead Upset");
    }
}
