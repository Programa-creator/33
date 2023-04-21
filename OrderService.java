package ua.hillel;

import org.jvnet.hk2.annotations.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }
}
