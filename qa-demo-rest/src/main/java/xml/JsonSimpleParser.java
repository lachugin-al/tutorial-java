package xml;

import model.People;
import model.Root;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleParser {

    public Root parse() {

        Root root = new Root();
        JSONParser parser = new JSONParser();

        FileReader reader = null;
        try {
            reader = new FileReader("src/test/resources/test.json");

            // приводим в Объекту и достаем по ключу значение
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            String name = (String) rootJsonObject.get("name");

            JSONArray peopleJsonArray = (JSONArray) rootJsonObject.get("people");
            List<People> peopleList = new ArrayList<>();
            // проходим по циклу объекта people
            for (Object peopleObject: peopleJsonArray) {
                // приводи массив к объекту
                JSONObject peopleJsonObject = (JSONObject) peopleObject;

                // достаем хначения по ключу и записываем в коллекцию
                String peopleName = (String) peopleJsonObject.get("name");
                int peopleAge = Integer.parseInt((String) peopleJsonObject.get("age"));


                // создаем объект people для каждого массива
                People people = new People(peopleName, peopleAge);

                // добавляем объеты в коллекцию JSONArray
                peopleList.add(people);
            }

            root.setName(name);
            root.setPeople(peopleList);

            return root;
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // чтобы не закрывать reader в catch, возможно использовать конструкцию в сигнатуре try
        // в таком случае reader будет закрыаться автоматически
        /*try (FileReader reader = new FileReader("src/test/resources/test.json")) {
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        return null;
    }
}
