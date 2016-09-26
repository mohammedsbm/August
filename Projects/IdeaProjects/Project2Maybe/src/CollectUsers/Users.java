package CollectUsers;

/**
 * Created by student on 9/26/2016.
 */
public class Users {

    private String userName;
    private String passWord;
    private UserType userType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    //constructors
    Users() {}; //constructor overload

    public Users(String userName, String passWord, UserType userType) {
        this.userName = userName;
        this.passWord = passWord;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return String.format(" %s %s %s ",
                this.userName, this.passWord, this.getUserType().toString());
    }

}
