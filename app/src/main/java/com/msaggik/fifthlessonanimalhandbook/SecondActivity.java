package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Клевер", "Род растений семейства Бобовые, подсемейства Мотыльковые",
                R.drawable.klever, "Около 250 видов"));
        animals.add( new Animal("Лотос", "Лотос - род двудольных растений, единственный представитель семейства Лотосовые",
                R.drawable.lotos, "Два вида"));
        animals.add( new Animal("Банан", " Род многолетних травянистых растений семейства Банановые, наибольшее видовое разнообразие которых наблюдается в тропиках Юго-Восточной Азии и, в частности, на Малайском архипелаге.",
                R.drawable.bananas, "Около 70 видов"));
        animals.add( new Animal("Росянка", "Род плотоядных растений семейства Росянковые, встречающихся на болотах, песчаниках, в горах, в лесах - почти на любых видах почв.",
                R.drawable.rosanka, "Около 100 видов"));
        animals.add( new Animal("Ромашка", "Род однолетних цветковых растений семейства астровые.Это растение широко используется в лечебных и косметических целях.",
                R.drawable.romas, "Около 70 видов"));
    }
}