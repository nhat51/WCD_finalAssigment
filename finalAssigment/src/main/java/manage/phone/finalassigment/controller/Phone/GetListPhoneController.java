package manage.phone.finalassigment.controller.Phone;

import manage.phone.finalassigment.entity.Phone;
import manage.phone.finalassigment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetListPhoneController extends HttpServlet {
    private JpaRepository<Phone> phoneJpaRepository = new JpaRepository<>(Phone.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Phone> phones = phoneJpaRepository.findAll();
        req.setAttribute("phone",phones);
        req.getRequestDispatcher("/Phone/listphone.jsp").forward(req,resp);
    }
}
