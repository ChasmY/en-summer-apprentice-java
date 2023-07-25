package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.Event;
import com.endava.java2023.repository.modelDBO.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    public Order findByOrderId(int id);


    public List<Order> findAll();

}
