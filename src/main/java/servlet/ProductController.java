package servlet;

import com.google.gson.Gson;
import dao.service.ProductService;
import dao.service.implService.ProductServiceImpl;
import domain.Product;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/product")
public class ProductController extends HttpServlet {
    private static Logger LOGGER = Logger.getLogger(ProductServiceImpl.class);
    private static final long serialVersionUID = 1L;
    private ProductService productService = ProductServiceImpl.getProductService();


    //to create resource(product)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String price = request.getParameter("price");

        Product product = new Product(name, description, getValidatedPrice(price));
        productService.create(product);
        response.setContentType("text/text");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("200");
    }

    private double getValidatedPrice(String price) {
        if (price == null || price.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(price);
    }

    //to get resource(product)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String productId = request.getParameter("id");
            Product product = productService.read(Integer.parseInt(productId));

            request.setAttribute("product", product);
            request.getRequestDispatcher("singleProduct.jsp").forward(request, response);
        } catch (SQLException e) {
            LOGGER.error(e);
        }

    }

    //to update resource(product)
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    //to delete resource(product)
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
