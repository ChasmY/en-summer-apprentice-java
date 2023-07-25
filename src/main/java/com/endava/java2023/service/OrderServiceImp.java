package com.endava.java2023.service;

import com.endava.java2023.repository.CustomerRepository;
import com.endava.java2023.repository.OrderRepository;
import com.endava.java2023.repository.TicketCategoryRepository;
import com.endava.java2023.repository.modelDBO.Customer;
import com.endava.java2023.repository.modelDBO.NewOrder;
import com.endava.java2023.repository.modelDBO.Order;
import com.endava.java2023.repository.modelDBO.TicketCategory;
import com.endava.java2023.service.mapper.OrderToOrderDtoMapper;
import com.endava.java2023.service.modelDTO.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class OrderServiceImp implements OrderService{
    private Customer customer;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImp(OrderRepository orderRepo){
        this.orderRepository = orderRepo;
        System.out.println("Creating order service");
    }

    @Override
    public OrderDto getOrder(int ordersId) {
        return OrderToOrderDtoMapper.convert(orderRepository.findByOrderId(ordersId));
    }

    @Override
    public List<OrderDto> getOrders() {
        return orderRepository.findAll().stream().map(OrderToOrderDtoMapper::convert).collect(Collectors.toList());
    }

    @Override
    public OrderDto postOrder(NewOrder newOrder){
          LocalDateTime localDateTime = LocalDateTime.now();
          TicketCategory ticketCategory = ticketCategoryRepository.
                  findById(newOrder.getTicketCategoryId()).get();
          Customer customer = customerRepository.findById(1L).get();
          Order order = new Order(localDateTime, newOrder.getNumberOfTickets(),
                  newOrder.getNumberOfTickets() * ticketCategory.getPrice(),customer, ticketCategory);

          Order savedOrder = order;
          return OrderToOrderDtoMapper.convert(savedOrder);
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Customer customer = customerRepository.findById(2L).orElse(null);


        if (customer == null) {

            throw new RuntimeException("Customer not found");
        }

        TicketCategory ticketCategory = ticketCategoryRepository.findById((long)
                orderDto.getTicketCategory()).orElse(null);


        if (ticketCategory == null) {

            throw new RuntimeException("TicketCategory not found");
        }


        Order order = new Order();
        order.setCustomer(customer);
        order.setTicketCategory(ticketCategory);
        order.setNumberOfTickets(orderDto.getNumberOfTickets());
        double ticketPrice = ticketCategory.getPrice();
        double totalPrice = ticketPrice * orderDto.getNumberOfTickets();
        order.setTotalPrice((float) totalPrice);

        Order savedOrder = orderRepository.save(order);


        return OrderToOrderDtoMapper.convert(savedOrder);
    }

}
