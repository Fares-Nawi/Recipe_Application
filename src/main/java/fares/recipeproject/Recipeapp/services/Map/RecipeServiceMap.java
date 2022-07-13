package fares.recipeproject.Recipeapp.services.Map;

import fares.recipeproject.Recipeapp.models.recipe;
import fares.recipeproject.Recipeapp.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class RecipeServiceMap implements RecipeService {

    protected Map<Long, recipe> map = new HashMap<>();

    public Set<recipe> findAll(){
        return new HashSet<>(map.values());
    }

    public recipe findById(Long id){
        return map.get(id);
    }

    public recipe save(recipe object){

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
