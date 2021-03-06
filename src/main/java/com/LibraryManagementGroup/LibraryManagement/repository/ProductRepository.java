package com.LibraryManagementGroup.LibraryManagement.repository;

import com.LibraryManagementGroup.LibraryManagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value="UPDATE product SET delete_at =?2  WHERE id=?1")
    int deleteProduct(int id, String currentTime);


    @Query(nativeQuery = true, value="select * from product WHERE shop_id=?1")
    List<Product> getProductsByShopId(int id);
}
