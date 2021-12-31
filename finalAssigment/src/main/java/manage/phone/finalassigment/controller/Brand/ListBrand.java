package manage.phone.finalassigment.controller.Brand;

import manage.phone.finalassigment.entity.Brand;
import manage.phone.finalassigment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListBrand extends HttpServlet {

    private JpaRepository<Brand> brandJpaRepository = new JpaRepository<>(Brand.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Brand> brands = brandJpaRepository.findAll();
        req.setAttribute("brand",brands);
        req.getRequestDispatcher("/Brand/listbrands.jsp");
    }
}
