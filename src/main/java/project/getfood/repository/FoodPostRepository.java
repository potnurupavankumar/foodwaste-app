package project.getfood.repository;
import project.getfood.model.FoodPost;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FoodPostRepository extends JpaRepository<FoodPost, Long> {}
