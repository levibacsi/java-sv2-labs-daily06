package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct (Product product){
        productList.add(product);
    }

    public int getProductNumberByType(Type type){
        int productNumber = 0;
        for (Product product: productList){
            if (type.equals(product.getType())){
                productNumber++;
            }
        }
        return productNumber;
    }

    public List<String> getProductNumbers(){
        List<Type> types = Arrays.asList(Type.values());
        List <String> typesAndNumbers = new ArrayList<>();
        for (Type t: types){
            typesAndNumbers.add(t + ": " + getProductNumberByType(t));
        }
        return typesAndNumbers;
    }
}
