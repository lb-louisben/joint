package baizhi.Service;

import baizhi.Entity.Cinema;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CinemaServiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void selectCin1() {
        CinemaService cinemaService = new CinemaService();
        // cinemaService.UpdateCin(new Cinema(3,"xxx影院","中原区科学大道"));
    }

    @Test
    public void selectCin2() {
        CinemaService cinemaService = new CinemaService();
        List<Cinema> cinemas = cinemaService.selectCin2();
        for (Cinema cinema : cinemas) {
            System.out.println(cinema); // 打印每个电影院的信息
        }
    }

    @Test
    public void testUpdateCin() {
        CinemaService cinemaService = new CinemaService();
        cinemaService.selectCin1("xx影院");
    }
}