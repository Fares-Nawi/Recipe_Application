package fares.recipeproject.Recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4l;

        category.setId(idValue);
        assertEquals( idValue, category.getId());

    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}