package com.mangkyu.stream.Quiz1;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz1 {

    // 1.1 각 취미를 선호하는 인원이 몇 명인지 계산하여라.
    public Map<String, Integer> quiz1() throws IOException {
        List<String[]> csvLines = readCsvLines();

        HashMap<String, Integer> hashMap = new HashMap<>();

        csvLines.stream()
                .map(line -> line[1].replaceAll(" ", ""))
                .flatMap(hobbies -> Arrays.stream(hobbies.split(":")))
                .forEach(hobby -> hashMap.put(hobby, hashMap.getOrDefault(hobby, 0) + 1));

        return hashMap;
    }

    // 1.2 각 취미를 선호하는 정씨 성을 갖는 인원이 몇 명인지 계산하여라.
    public Map<String, Integer> quiz2() throws IOException {
        List<String[]> csvLines = readCsvLines();
        return new HashMap<>();
    }

    // 1.3 소개 내용에 '좋아'가 몇번 등장하는지 계산하여라.
    public int quiz3() throws IOException {
        List<String[]> csvLines = readCsvLines();
        return 0;
    }

    private List<String[]> readCsvLines() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(getClass().getResource("/user.csv").getFile(), StandardCharsets.UTF_8));
        csvReader.readNext();
        return csvReader.readAll();
    }

}
