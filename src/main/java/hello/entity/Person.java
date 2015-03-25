package hello.entity;

import jp.sf.amateras.mirage.annotation.Column;
import jp.sf.amateras.mirage.annotation.PrimaryKey;
import jp.sf.amateras.mirage.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by in-sumida on 2015/03/24.
 */
@SuppressWarnings("serial")
@Table(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person implements Serializable {
    @Id
    @PrimaryKey(generationType = PrimaryKey.GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}
