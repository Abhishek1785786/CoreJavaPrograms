package com.javaproject;
//import java.util.Scanner;
public class BugTracker {
	
	int bugid;
	String applicationname;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	public static void main(String[] args) {
		BugTracker bt=new BugTracker();
		bt.bugid=1;
		bt.applicationname="Vcube";
		bt.bugtitle="login";
		bt.severity="Low";
		bt.priority="Low";
		bt.status="Open";
		bt.assignedDeveloper="Abhi";
		
		bt.assignToDeveloper(1,"Abhi");
		bt.displayBugSummary();
		
	}
	int getBugid() {
		return bugid;
	}
	String getApplicationName() {
		return applicationname;
	}
	String getBugTitle() {
		return bugtitle;
	}
	String getSeverity() {
		return severity;
	}
	String getPriority() {
		return priority;
	}
	String getStatus() {
		return status;
	}
	String getAssignedDeveloper() {
		return assignedDeveloper;
	}
	
	void assignToDeveloper(int bugid, String developerName) {
		if (this.bugid==bugid) {
			this.assignedDeveloper=developerName;
			updatestatus("In Development");
		}else {
			System.out.println("Bug id not found");
		}
		
	}
	void updatestatus(String newstatus) {
		this.status=newstatus;
	}
	
	void displayBugSummary() {
		System.out.println("Bug Id : "+getBugid());
		System.out.println("Application Name : "+ getApplicationName());
		System.out.println("Bug Title : "+getBugTitle());
		System.out.println("Severity : "+getSeverity());
		System.out.println("Priority : "+getPriority());
		System.out.println("Status : "+getStatus());
		System.out.println("Assigned Developer : "+getAssignedDeveloper());
		
	}
	

}

