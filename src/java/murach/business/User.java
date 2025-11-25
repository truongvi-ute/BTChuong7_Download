package murach.business;

import java.io.Serializable;

public class User implements Serializable {

    // Thuộc tính cũ
    private String firstName;
    private String lastName;
    private String email;

    // Thuộc tính mới thêm vào
    private String dateOfBirth;
    private String heardFrom;
    private boolean wantsGeneralUpdates; // Cho checkbox "YES, I'd like that."
    private boolean wantsEmailAnnouncements; // Cho checkbox "YES, please send me email..."
    private String contactMethod;

    public User() {
        // Thuộc tính cũ
        firstName = "";
        lastName = "";
        email = "";
        
        // Khởi tạo giá trị mặc định cho thuộc tính mới
        dateOfBirth = "";
        heardFrom = "";
        wantsGeneralUpdates = false;
        wantsEmailAnnouncements = false;
        contactMethod = "";
    }

    // Constructor có tham số (chỉ cho các trường ban đầu, bạn có thể thêm các trường mới nếu muốn)
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        
        // Khởi tạo giá trị mặc định cho thuộc tính mới
        this.dateOfBirth = "";
        this.heardFrom = "";
        this.wantsGeneralUpdates = false;
        this.wantsEmailAnnouncements = false;
        this.contactMethod = "";
    }

    // --- Getters and Setters cho thuộc tính cũ ---

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // --- Getters and Setters cho thuộcTính mới ---

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    // Getter cho boolean thường bắt đầu bằng 'is'
    public boolean isWantsGeneralUpdates() {
        return wantsGeneralUpdates;
    }

    public void setWantsGeneralUpdates(boolean wantsGeneralUpdates) {
        this.wantsGeneralUpdates = wantsGeneralUpdates;
    }

    public boolean isWantsEmailAnnouncements() {
        return wantsEmailAnnouncements;
    }

    public void setWantsEmailAnnouncements(boolean wantsEmailAnnouncements) {
        this.wantsEmailAnnouncements = wantsEmailAnnouncements;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}