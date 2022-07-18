package fares.recipeproject.Recipeapp.services.Map;

import fares.recipeproject.Recipeapp.domain.Recipe;
import fares.recipeproject.Recipeapp.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class RecipeMapService implements RecipeService {

    protected Map<Long, Recipe> map = new HashMap<>();

    public Set<Recipe> findAll(){
        return new HashSet<>(map.values());
    }

    public Recipe findById(Long id){
        return map.get(id);
    }

    public Recipe save(Recipe object){

        if(object != null){
            if (object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }


        return object;
    }

    private Long getNextId(){
        Long nextId= null;
        try {
            nextId =  Collections.max(map.keySet())+1;
        }catch (NoSuchElementException ex){
            nextId = 1L;
        }
        return nextId;
    }


}
