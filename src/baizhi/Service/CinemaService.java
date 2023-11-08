package baizhi.Service;

import baizhi.DAO.impl.CinemaDAOImpl;
import baizhi.Entity.Cinema;

import java.util.List;

public class CinemaService {
    public void selectCin1(String name) {
        CinemaDAOImpl cinemaDAO = new CinemaDAOImpl(); // 实例化CinemaDao对象
        Cinema cinema = cinemaDAO.selectCinemaByName(name); // 通过名称查询电影院信息
        System.out.println(cinema); // 打印查询结果
    }

    public List<Cinema> selectCin2() {
        CinemaDAOImpl cinemaDAO = new CinemaDAOImpl();// 实例化CinemaDao对象
        List<Cinema> cinemas = cinemaDAO.selectCinema(); // 查询所有电影院信息
        return cinemas; // 返回查询结果
    }

    public void testUpdateCin(){
        CinemaDAOImpl cinemaDAO = new CinemaDAOImpl();// 实例化CinemaService对象
        // Cinema updatedCinema = new Cinema(3, "xxx影院", "中原区科学大道");
        // cinemaDAO.updateCin(updatedCinema); // 更新ID为3的电影院信息
    }

}
