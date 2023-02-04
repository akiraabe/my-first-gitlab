package com.example.demo.domain.repositoy;

import com.example.demo.domain.model.Music;
import com.example.demo.domain.repository.MusicRepository;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test; // jupiterの@Testを指定すること！！
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@DataJpaTest(excludeAutoConfiguration = AutoConfigureTestDatabase.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MusicRepositoryTest {

    @Autowired
    private MusicRepository musicRepository;

    // TODO: BeforeAllだとSqlが実行されないように見える。
    // やむなく、各テストメソッドでinit.sqlを呼ぶようにした。BeforeEachの方がいいかも？(試したらBeforeEachでもSql呼ばれない)
    // @BeforeAll
    // @Sql(scripts="classpath:/scripts/init.sql")
    // static void beforeAll() {
    // System.out.println("beforeAll");
    // }

    @Test
    @Sql(scripts = { "classpath:/scripts/init.sql", "classpath:/scripts/test1.sql" } )
    public void test1() {
        List<Music> musicList = musicRepository.findAll();
        Assertions.assertThat(musicList.size()).isEqualTo(2);
    }
}
