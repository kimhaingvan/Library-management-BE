package com.LibraryManagementGroup.LibraryManagement.service.ProductService;

import com.LibraryManagementGroup.LibraryManagement.common.requests.productrequests.CreateProductRequest;
import com.LibraryManagementGroup.LibraryManagement.common.requests.productrequests.CreateTagRequest;
import com.LibraryManagementGroup.LibraryManagement.common.requests.productrequests.DeteleProductRequest;
import com.LibraryManagementGroup.LibraryManagement.common.requests.productrequests.UpdateProductRequest;
import com.LibraryManagementGroup.LibraryManagement.entity.Product;
import net.minidev.json.JSONObject;

import java.util.List;

public interface IProductService {
    public CreateProductRequest createProduct(CreateProductRequest prod);
    public Integer deleteProduct(DeteleProductRequest req);
    public UpdateProductRequest updateProduct(UpdateProductRequest prod);
    public List<Product>  getProductsByShopId(int shopId);
    public CreateTagRequest createTag(CreateTagRequest tag);
}
