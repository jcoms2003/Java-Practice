/** Student Code for Coding Exam 1
 *  Joshua Comstock
 *  I will not lie, steal, or cheat, nor tolerate anyone who does. 
 */
public class Contact {
    private String name;
    private String email;
    private long phone;

    // Setters 
    public void setName(String s) {
        this.name = s;
    }
    public void setEmail(String s) {
        this.email = s;
    }
    public void setPhone(long l) {
        this.phone = l;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public long getPhone() {
        return phone;
    }

    /**
     * Contact constructor
     * @param name
     * @param email
     * @param phone
     */
    public Contact(String name, String email, long phone) {
        setName(name);
        setEmail(email);
        setPhone(phone);
    }

    /**
     * toString method
     * @return String
     */
    public String toString() {
        return String.format("{name:%s, email:%s, phone:%d}", getName(), getEmail(), getPhone());

    }
    // end provided code

    // you are free to use this main for testing if you develop in your own IDE
    public static void main(String[] args) {
        Contact contact1 = new Contact("Hello", "email@email.com", 1037984455);
        System.out.println(contact1);

    }


}