package baizhi.DAO;

import baizhi.Entity.Cinema;

import java.util.List;

public interface CinemaDAO {

    Cinema selectCinemaByName(String name);

    List<Cinema> selectCinema();

    void updateCin(Cinema cinema);

}
