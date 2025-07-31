package project.getfood.controller;
import project.getfood.model.FoodPost;
import project.getfood.repository.FoodPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin(origins = "http://localhost")
public class FoodPostController {
    @Autowired private FoodPostRepository repo;
    
    @PostMapping("/post") public FoodPost postFood(@RequestBody FoodPost foodPost) { return repo.save(foodPost); }
    @GetMapping("/all") public List<FoodPost> getAllFood() { return repo.findAll(); }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFood(@PathVariable Long id) {
        repo.deleteById(id); // Use the instance variable 'repo' instead of 'FoodPostRepository'
        return ResponseEntity.ok("Food item deleted successfully");
    }

}
