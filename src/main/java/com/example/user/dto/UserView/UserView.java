package com.example.user.dto.UserView;

import java.util.List;

public class UserView {
	
	 private long id;
	    private String forename;
	    private String surname;
	    private String organisation;
	    private List<String> notifications;
	    private long points;

	    public UserView(){

	    }

	    public long getId() {
	        return id;
	    }

	    public String getForename() {
	        return forename;
	    }

	    public String getSurname() {
	        return surname;
	    }

	    public String getOrganisation() {
	        return organisation;
	    }

	    public List<String> getNotifications() {
	        return notifications;
	    }

	    public long getPoints() {
	        return points;
	    }


}
