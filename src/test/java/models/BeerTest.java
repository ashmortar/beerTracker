package models;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/9/18.
 */
public class BeerTest {

    public Beer setUpNewBeer() {
        return new Beer("avatar jasmine", "elysian", "IPA", "6.3", "45");
    }

    @Test
    public void intiatesCorrectly_true() throws Exception {
        Beer testBeer = setUpNewBeer();
        assertTrue(testBeer instanceof Beer);
    }

    @Test
    public void getName_returnsName_name() throws Exception {
        Beer testBeer = setUpNewBeer();
        assertEquals("avatar jasmine", testBeer.getName());
    }

    @Test
    public void getBrewer_returnsBrewer_brewer() throws Exception {
        Beer testBeer = setUpNewBeer();
        assertEquals("elysian", testBeer.getBrewer());
    }

    @Test
    public void getType_returnsType_type() throws Exception {
        Beer testBeer = setUpNewBeer();
        assertEquals("IPA", testBeer.getType());
    }

    @Test
    public void getABV_returnsABV_ABV() throws Exception {
        Beer testBeer = setUpNewBeer();
        assertEquals("6.3", testBeer.getAbv());
    }

    @Test
    public void getIBU_returnsIBU_IBU() throws Exception {
        Beer testBeer = setUpNewBeer();
        assertEquals("45", testBeer.getIbu());
    }

    @Test
    public void setAndGetComment_workCorrectly_true() throws Exception {
        Beer testBeer = setUpNewBeer();
        testBeer.setComments("Fred", "Beer is good");
        Map<String, String> output = new HashMap<>();
        output.put("Fred", "Beer is good");
        assertEquals(output, testBeer.getComments());
    }
}


