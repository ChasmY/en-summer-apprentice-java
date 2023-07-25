package com.endava.java2023.repository;

import com.endava.java2023.repository.modelDBO.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Long> {

//    public List<TicketCategory> findAllByTicketCategory_Id(TicketCategory id);
}
