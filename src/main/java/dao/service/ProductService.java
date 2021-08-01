package dao.service;

import domain.Product;
import sheard.AbstractCrud;

import java.util.Map;

public interface ProductService extends AbstractCrud<Product> {
    public Map<Integer, Product> readAllMap();
}
