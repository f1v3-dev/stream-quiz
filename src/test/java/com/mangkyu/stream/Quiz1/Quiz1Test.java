package com.mangkyu.stream.Quiz1;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz1Test {

    private final Answer1 answer = new Answer1();
    private final Quiz1 quiz = new Quiz1();

    @Test
    void quiz1() throws IOException {
        assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
    }

    @Test
    void quiz1_my_version() throws IOException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        quiz.quiz1();
        stopWatch.stop();

        System.out.println(stopWatch.getNanoTime());
    }

    @Test
    void quiz1_answer_version() throws IOException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        answer.quiz1();
        stopWatch.stop();

        System.out.println(stopWatch.getNanoTime());
    }

    @Test
    void quiz2() throws IOException {
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

    @Test
    void quiz3() throws IOException {
        assertThat(quiz.quiz3()).isEqualTo(answer.quiz3());
    }

}