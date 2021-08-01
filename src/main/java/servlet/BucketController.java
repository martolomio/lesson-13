package servlet;

import dao.service.BucketService;
import dao.service.implService.BucketServiceImpl;
import domain.Bucket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet("/bucket")
public class BucketController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BucketService bucketService = BucketServiceImpl.getBucketService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productId = request.getParameter("productId");

        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("userId");

        Bucket bucket = new Bucket(userId, Integer.parseInt(productId), new Date());
        bucketService.create(bucket);

        response.setContentType("text/text");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("Success");
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bucketId = request.getParameter("bucketId");
        bucketService.delete(Integer.parseInt(bucketId));

        response.setContentType("text/text");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("Success");
    }

}
