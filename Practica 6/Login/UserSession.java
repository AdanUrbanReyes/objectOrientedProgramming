import java.util.Date;
import java.io.*;

public class UserSession implements Serializable {
    private String user;
    private Date loginTime;
    String programa;
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getLoginTime() {
        return loginTime;
    }
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
     public String getPrograma(){
               return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
