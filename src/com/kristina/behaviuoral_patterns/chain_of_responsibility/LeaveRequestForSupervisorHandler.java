package com.kristina.behaviuoral_patterns.chain_of_responsibility;

public class LeaveRequestForSupervisorHandler extends LeaveRequestHandler{
    LeaveRequestForProjectManagerHandler supervisorHandler = new LeaveRequestForProjectManagerHandler();
    @Override
    public void handleRequest(int days) {
       if(1>days || days <3){
           System.out.println("Supervisor is handling request");
       }else {
           supervisorHandler.handleRequest(days);
       }
    }
}
