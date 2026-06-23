public class Customer {

    /**
     * Customer first name.
     */
    private String firstName;

    /**
     * Customer last name.
     */
    private String lastName;

    /**
     * Customer phone number.
     */
    private String phoneNumber;

    /**
     * Empty constructor for Gson.
     */
    public Customer() {
    }

    /**
     * Constructor for Customer.
     *
     * @param firstName Customer first name.
     * @param lastName Customer last name.
     * @param phoneNumber Customer phone number.
     */
    public Customer(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets first name.
     *
     * @return First name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName First name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return Last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName Last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets phone number.
     *
     * @return Phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number.
     *
     * @param phoneNumber Phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }