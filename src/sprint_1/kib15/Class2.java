package sprint_1.kib15;

class Class2 {

    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    void anotherMethod() {
        this.firstname = firstname;
        this.lastname = lastname;

        System.out.println(firstname + " " + lastname);
    }
}