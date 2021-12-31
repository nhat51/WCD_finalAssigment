package manage.phone.finalassigment.controller.Phone;

import manage.phone.finalassigment.entity.Brand;
import manage.phone.finalassigment.entity.Phone;
import manage.phone.finalassigment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreatePhoneController extends HttpServlet {
    private JpaRepository<Phone> phoneJpaRepository = new JpaRepository<>(Phone.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            req.setCharacterEncoding("UTF-8");
            String name = req.getParameter("name");
            String description = req.getParameter("description");
            int brandId = Integer.parseInt(req.getParameter("brand"));
            double price = Double.parseDouble(req.getParameter("price"));
            Phone phone = new Phone(name,brandId,price,description);
            phoneJpaRepository.save(phone);
            resp.sendRedirect("/brand/list");
        }
        catch (Exception e){
            resp.getWriter().println("Bad request");
        }
    }
}
