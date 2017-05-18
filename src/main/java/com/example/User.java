/**
 * 
 */
package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pooja
 *
 */
public class User {
	
	private final long id;
    private final String forename;
    private final String surname;
    private final String organisation;
    private final List<String> notifications;
    private final long points;
    //Friends are deprecated and should not be used
    private final List<String> friends;

    public User(int id) {
        String[] forenames = {"Alice", "Manjula", "Bartosz", "Mack"};
        String[] surnames = {"Smith", "Salvatore", "Jedrzejewski", "Scott"};
        String[] organisations = {"ScottLogic", "UNICEF"};

        forename = forenames[id%3];
        surname = surnames[id%4];
        organisation = organisations[id%2];
        notifications= new ArrayList<>();
        notifications.add("You have been promoted!");
        notifications.add("Sorry, disregard the previous notifaction- wrong user");
        points = id * 31 % 1000;

        //You have no friends
        friends = new ArrayList<>();

        this.id = id;
    }

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the forename
	 */
	public String getForename() {
		return forename;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @return the organisation
	 */
	public String getOrganisation() {
		return organisation;
	}

	/**
	 * @return the notifications
	 */
	public List<String> getNotifications() {
		return notifications;
	}

	/**
	 * @return the points
	 */
	public long getPoints() {
		return points;
	}

	/**
	 * @return the friends
	 */
	public List<String> getFriends() {
		return friends;
	}

}
