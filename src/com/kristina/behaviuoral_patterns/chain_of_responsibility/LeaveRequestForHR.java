package com.kristina.behaviuoral_patterns.chain_of_responsibility;

public class LeaveRequestForHR extends LeaveRequestHandler{
    @Override
    public void handleRequest(int days) {
        if(days> 5) {
            System.out.println("HR handles a request.");
        }
    }
}
