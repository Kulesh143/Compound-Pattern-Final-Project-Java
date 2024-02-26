/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Lenovo
 */
public class log {
  private String user;
  private String password;
  private String pic;
  private String email;
public log(LogBuilder builder){
    this.user=builder.user;
    this.password=builder.password;
    this.pic=builder.pic;
    this.email=builder.email;
}
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
  

    /**
     * @return the pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic the pic to set
     */
    

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    

    @Override
    public String toString() {
    String details="Name :"+user+",password :"+password+" ,pic :"+pic+" , email :"+email;
    return details;
 
    }
  
static class LogBuilder{
        private String user;
  private String password;
  private String pic;
  private String email;

        public LogBuilder(String user, String password) {
            this.user = user;
            this.password = password;
           
        }


 

        /**
         * @param user the user to set
         */
        public LogBuilder setUser(String user) {
            this.user = user;
            return this;
        }

        /**
         * @param password the password to set
         */
        public LogBuilder setPassword(String password) {
            this.password = password;  return this;
        }

        /**
         * @param pic the pic to set
         */
        public LogBuilder setPic(String pic) {
            this.pic = pic;  return this;
        }

        /**
         * @param email the email to set
         */
        public LogBuilder setEmail(String email) {
            this.email = email;  return this;
        }
         public log build(){
      log l=new log(this);
      return l;
  }
  }
}