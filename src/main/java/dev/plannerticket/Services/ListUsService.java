package dev.plannerticket.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import dev.plannerticket.Models.ListUs;
import dev.plannerticket.Repositories.ListUsRepository;
import io.micrometer.common.lang.NonNull;

@Service
public class ListUsService {
    ListUsRepository repository;

    public ListUsService(ListUsRepository repository) {
        this.repository = repository;
    }
 
    public List<ListUs> getAll() {
        List<ListUs> users = repository.findAll();
        return users;
    }

    public ListUs save(@NonNull ListUs type) {
        ListUs newList = new ListUs();
        newList.setTitle(type.getTitle());
        newList.setDescription(type.getDescription());
        newList.setLocation(type.getLocation());
        newList.setCapacity(type.getCapacity());
        newList.setDate(type.getDate());
        newList.setTime(type.getTime());
        newList.setImage(type.getImage());
        newList.setUser(type.getUser());
        return repository.save(newList);
    }
    
}
