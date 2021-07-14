package dao.service.implService;

import dao.BucketDao;
import dao.impl.BucketDaoImpl;
import dao.service.BucketService;
import domain.Bucket;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class BucketServiceImpl implements BucketService {
    private static Logger LOGGER= Logger.getLogger(BucketServiceImpl.class);
    private BucketDao bucketDao;
    private static BucketServiceImpl bucketServiceImpl;

    private BucketServiceImpl(){
        try {
            bucketDao = new BucketDaoImpl();
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
    public static BucketService getBucketService() {
        if (bucketServiceImpl == null) {
            bucketServiceImpl = new BucketServiceImpl();
        }
        return bucketServiceImpl;
    }


    @Override
    public Bucket create(Bucket bucket) {
        return bucketDao.create(bucket);
    }

    @Override
    public Bucket read(Integer id) throws SQLException {
        return bucketDao.read(id);
    }

    @Override
    public Bucket update(Bucket bucket) {
        return bucketDao.update(bucket);
    }

    @Override
    public void delete(Integer id) {
        bucketDao.delete(id);
    }

    @Override
    public List<Bucket> readAll() {
        return bucketDao.readAll();
    }
}
