package dao.service.implService;
import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import dao.service.ProductService;
import domain.Product;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    private static ProductServiceImpl productServiceImpl;
    private ProductDao productDao;

    private ProductServiceImpl(){

            productDao = new ProductDaoImpl();
    }

    public static ProductService getProductService() {
        if (productServiceImpl == null) {
            productServiceImpl = new ProductServiceImpl();
        }
        return productServiceImpl;
    }

    @Override
    public Product create(Product product) {
        return productDao.create(product);
    }

    @Override
    public Product read(Integer id) {
        return productDao.read(id);
    }

    @Override
    public Product update(Product product) {
        return productDao.update(product);
    }

    @Override
    public void delete(Integer id) {
        productDao.delete(id);
    }

    @Override
    public List<Product> readAll() {
        return productDao.readAll();
    }

    @Override
    public Map<Integer, Product> readAllMap() {
        List<Product> products = readAll();
        return products.stream().collect(Collectors.toMap(Product::getId, Function.identity()));
    }
}
