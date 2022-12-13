package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {
//
//
//
//    public UserDaoJDBCImpl() {
//
//    }
//
//    public void createUsersTable() throws SQLException {
//        String sqlCommandToCreateTable = "create table if not exists Users (id BIGINT PRIMARY "
//                + "KEY AUTO_INCREMENT, name VARCHAR(20), " +
//                "lastName VARCHAR(20), age TINYINT)";
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sqlCommandToCreateTable);
//            System.out.println("Создана таблица");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void dropUsersTable() throws SQLException {
//        String sqlCommandToDropTable = "drop table if exists Users";
//        try(Connection connection = Util.getConnection();
//            Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sqlCommandToDropTable);
//            System.out.println("Таблица удалена");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void saveUser(String name, String lastName, byte age) throws SQLException {
//        String sqlCommandSaveUser = "INSERT INTO Users (name, lastName, age) VALUES (?,?,?)";
//        try (Connection connection = Util.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sqlCommandSaveUser)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//            System.out.println("User с именем" + " " + name + " " + "добавлен в базу данных");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void removeUserById(long id) throws SQLException {
//        String sqlCommandDeleteByValue = "DELETE FROM Users WHERE id = 1";
//        try(Connection connection = Util.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(sqlCommandDeleteByValue)) {
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<User> getAllUsers() throws SQLException {
//        List<User> userList = new ArrayList<>();
//        String sqlCommandGetAll = "SELECT id, name, lastName, age FROM users";
//        try(Connection connection = Util.getConnection();
//            Statement statement = connection.createStatement();) {
//            ResultSet resultset = statement.executeQuery(sqlCommandGetAll);
//            while (resultset.next()){
//                User user = new User();
//                user.setId(resultset.getLong("id"));
//                user.setName(resultset.getString("name"));
//                user.setLastName(resultset.getString("lastName"));
//                user.setAge(resultset.getByte("age"));
//                userList.add(user);
//            }
//            System.out.println(userList);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return userList;
//    }
//
//    public void cleanUsersTable() throws SQLException {
//        String sqlCommandDeleteAll = "TRUNCATE TABLE users";
//        try (Connection connection = Util.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sqlCommandDeleteAll);){
//            preparedStatement.executeUpdate();
//            System.out.println("Все строки удалены");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
