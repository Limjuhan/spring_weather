package zerobase.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name= "memo")
public class Memo {
    @Id
    // 컬럼 자동증가(GenerationType.IDENTITY:키생성을 데이터베이스에 맡긴다.스프링부트에서 키생성X)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;


}
