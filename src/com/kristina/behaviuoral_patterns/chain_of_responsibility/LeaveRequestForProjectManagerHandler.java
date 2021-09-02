package com.kristina.behaviuoral_patterns.chain_of_responsibility;

public class LeaveRequestForProjectManagerHandler extends LeaveRequestHandler {
    LeaveRequestForHR hrHandler = new LeaveRequestForHR();
    @Override
    public void handleRequest(int days) {
        if(days > 3 || days < 5){
            System.out.println("Project manager handles request");
        } else {
            hrHandler.handleRequest(days);
        }
    }
}
