package com.example.hamberger.domain;

        import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
        import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "study")
public class StudyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "study_name")
    private String studyName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "post")
    private String post;

    @Column(name = "persons")
    private String persons;

    @Column(name = "progress_method")
    private String progressMethod;

    @Column(name = "close_date")
    private String closeDate;

    public void setCloseDate(String closeDate) {
    }

    public void setProgressMethod(String progressMethod) {
    }

    public void setPersons(String persons) {
    }

    public void setPost(String post) {
    }

    public void setEmail(String email) {
    }

    public void setPhoneNumber(String phoneNumber) {
    }

    public void setStudyName(String studyName) {
    }

    // Getters and setters
}
