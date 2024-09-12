package com.saksham.JAVA9;

public interface PrivateMethodUpdate {
	
	static void sendNotes() {
		callMeFirst();
		System.out.println("Sending notes");
	}
	
	default void sendMeetingInvite() {
		callMeFirst();
		System.out.println("Sending meeting");
	}
	
	private static void callMeFirst() {
		System.out.println(" Called me method");
	}

}
