package models;

import java.io.Serializable;

/**
 * User
 */
public class User extends UserPwd implements Serializable {

    private static final long serialVersionUID = 1L;

    /** firstName **/
    private String firstName;
    /** lastName **/
    private String lastName;
    private String nickname;
    /** birthday **/
    private Integer birthday;
    /** gender **/
    private Integer gender;
    /** phoneNum **/
    private String phoneNum;
    /** location **/
    private String location;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}