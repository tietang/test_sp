package models;

import java.io.Serializable;

/**
 * UserPwd
 */
public class UserPwd implements Serializable {

	private static final long serialVersionUID = 1L;
	/** userId **/
	protected Long userId;

	/** email **/
	protected String email;
	/** username **/
	protected String username;
	/** password **/
	protected String password;

	public UserPwd() {
	}

	public UserPwd(String email, String username, String password) {
		super();

		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserPwd [userId=" + userId + ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}

}