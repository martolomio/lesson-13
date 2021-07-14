package dao.service.implService;
import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import dao.service.ProductService;
import domain.Product;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static Logger LOGGER= Logger.getLogger(ProductServiceImpl.class);
    private static ProductServiceImpl productServiceImpl;
    private ProductDao productDao;

    private ProductServiceImpl(){
        try {
            productDao = new ProductDaoImpl();
        } catch (SQLException throwables) {
            LOGGER.error(throwables);
        } catch (ClassNotFoundException e) {
            LOGGER.error(e);
        } catch (InvocationTargetException e) {
            LOGGER.error(e);
        } catch (InstantiationException e) {
            LOGGER.error(e);
        } catch (IllegalAccessException e) {
            LOGGER.error(e);
        } catch (NoSuchMethodException e) {
            LOGGER.error(e);
        }
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
    public Product read(Integer id) throws SQLException {
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
}
