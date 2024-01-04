package com.example.hamberger;

        import com.example.hamberger.Repository.MakeRepository;
        import com.example.hamberger.domain.StudyEntity;
        import jakarta.transaction.Transactional;
        import lombok.NoArgsConstructor;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

@Service
@Transactional
@NoArgsConstructor
@WebServlet("/makeStudy")
public class MakeStudyServlet extends HttpServlet {

    @Autowired
    private MakeRepository studyRepository;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // POST 데이터 받기
        String studyName = request.getParameter("studyName");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String post = request.getParameter("post");
        String persons = request.getParameter("persons");
        String progressMethod = request.getParameter("progressMethod");
        String closeDate = request.getParameter("closeDate");

        // StudyEntity 객체 생성 및 값 설정
        StudyEntity studyEntity = new StudyEntity();
        studyEntity.setStudyName(studyName);
        studyEntity.setPhoneNumber(phoneNumber);
        studyEntity.setEmail(email);
        studyEntity.setPost(post);
        studyEntity.setPersons(persons);
        studyEntity.setProgressMethod(progressMethod);
        studyEntity.setCloseDate(closeDate);

        // JPA를 사용하여 데이터베이스에 저장
        studyRepository.save(studyEntity);

        // 성공적인 응답 보내기
        response.setContentType("text/plain");
        response.getWriter().print("스터디가 성공적으로 생성되었습니다.");
    }
}
