package manage.phone.finalassigment.controller.Brand;

import manage.phone.finalassigment.entity.Brand;
import manage.phone.finalassigment.entity.Phone;
import manage.phone.finalassigment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CreateBrand extends HttpServlet {

    private JpaRepository<Brand> brandJpaRepository = new JpaRepository<>(Brand.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/Brand/addbrand.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            String name = req.getParameter("name");
            Brand brand = new Brand(name);
            brandJpaRepository.save(brand);
            resp.sendRedirect("/brand/list");

        }
        catch (Exception e){
            resp.getWriter().println("Bad request");
        }
    }
}
