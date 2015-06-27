package jdbc;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PersonMapper implements RowMapper<Person> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Jdbc4PersonApplication.class);
    static final Properties properties = new Properties();

    static {
        try {
            properties.load(PersonMapper.class.getResourceAsStream("/mapping.properties"));
        } catch (IOException e) {
            LOGGER.error("IOException: {}", e.getMessage());
        }
    }

    /*
     *
     */
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Person person = new Person();
        Set<Map.Entry<Object, Object>> sets = properties.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = sets.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> result = iterator.next();
            try {
                if (PropertyUtils.getPropertyType(person, result.getKey().toString()) == Date.class) {
                    if (rs.getString(result.getValue().toString()) != null) {
                        BeanUtils.setProperty(person, result.getKey().toString(), df.parse(rs.getString(result.getValue().toString())));
                    }
                } else {
                    BeanUtils.setProperty(person, result.getKey().toString(), rs.getString(result.getValue().toString()));
                }
            } catch (Exception e) {
                LOGGER.error("InvocationTargetException: {}", e.getMessage());
            }
        }
        return person;
    }

    public static void main(String[] args) {
        Set<Map.Entry<Object, Object>> sets = properties.entrySet();
        System.out.println(sets.toString());
    }
}
