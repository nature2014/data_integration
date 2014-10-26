package jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    /*
     *
     */
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setGender(rs.getInt("gender"));
        person.setIdentityCard(rs.getString("identityCard"));
        person.setDateOfBirth(rs.getDate("birthday"));
        return person;
    }
}
