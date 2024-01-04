package com.example.study01.entity;

        import jakarta.persistence.*;
        import lombok.*;
@Getter
@ToString
@Builder
@Entity

@NoArgsConstructor
@Table(name = "studymake")
public class MakeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;

    @Column(length = 500, nullable = false)
    private String studyName;

    @Column(length = 500, nullable = false)
    private String phoneNumber;

    @Column(length = 500, nullable = false)
    private String email;

    @Column(length = 500, nullable = false)
    private String post;

    @Column(length = 500, nullable = false)
    private String persons;

    @Column(length = 500, nullable = false)
    private String progressMethod;

    @Column(length = 500, nullable = false)
    private String closeDate;


    public MakeEntity(Long sid, String studyName, String phoneNumber, String email, String post, String persons, String progressMethod, String closeDate) {
        this.sid = sid;
        this.studyName = studyName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.post = post;
        this.persons = persons;
        this.progressMethod = progressMethod;
        this.closeDate = closeDate;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public void setPhoneNumber(String phoneNumber) {
    }

    public void setEmail(String email) {
    }

    public void setPost(String post) {
    }

    public void setPersons(String persons) {
    }

    public void setProgressMethod(String progressMethod) {
    }

    public void setCloseDate(String closeDate) {
    }
}
