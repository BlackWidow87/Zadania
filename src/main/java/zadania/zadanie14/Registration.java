package zadania.zadanie14;
/* Create Registration Class in which you would have variables such as email, userName
    and password that have an access scope only within its own class.
    After creating and object of the class, that user should be able to call methods and
    in each method separately pass values to set users emails, username and password.
    Requirements:
    -Valid email consider to be only yahoo
    -valid userName and password can not be empty and should be larger than 6 characters
    -valid password can not contain userName;

     */
public class Registration {
    private String userName;
    private String email;

    private String password;
    public void emailRequirments(String email) {
        if (email.toLowerCase().endsWith("@yahoo.com")) {
            System.out.println("Email set successfully!");
        } else {
            System.out.println("Invalid email. Please provide a valid Yahoo email.");
        }
    }

    public void nameRequirments(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully!");
        } else {
            System.out.println("Invalid username. Username should not be empty and should be longer than 6 characters.");
        }
    }
    public void passwordRequirments(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
           this.password=password;
            System.out.println("Password set successfully!");
        } else {
            System.out.println("Invalid password. Password should not be empty, should be longer than 6 characters, and should not contain the username.");
        }
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.emailRequirments("shrek@yahoo.com");
        registration.nameRequirments("Shrek2024");
        registration.passwordRequirments("Disney123");
    }

}





