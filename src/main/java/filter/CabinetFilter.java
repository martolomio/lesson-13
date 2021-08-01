package filter;

import domain.UserAccess;
import sheard.FilterService;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebFilter("/cabinet.jsp")
public class CabinetFilter implements Filter {

    private FilterService filterService = FilterService.getFilterService();

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        filterService.doFilterValidation(request, response, chain, Arrays.asList(UserAccess.USER, UserAccess.ADMIN));
    }
}
