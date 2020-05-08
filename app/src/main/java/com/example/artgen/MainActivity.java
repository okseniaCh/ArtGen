package com.example.artgen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View v) {
        String[] listOne = {"Кот", "Девочка", "Хомячок", "Альпака", "Мальчик", "Мастер", "Няня", "Клоун", "Эльф", "Воин", "Рыцарь", "Доктор"};

        String[] listTwo = {"спит", "сидит", "бежит", "скучает", "злится", "смеется", "улыбается", "радуется", "удивляется", "позирует", "хмурится"};

        String[] listThree = {"слушая музыку", "вечером", "на улице", "оставшись дома", "загадочно", "смотря на часы", "во время дождя", "в магазине", "смотря в зеркало", "на Марсе"};

        String[] listFour = {"смотрит вдаль", "снимает видео"};

        int oneLength = listOne.length;
        int twoLength = listTwo.length;
        int threeLength = listThree.length;
        int fourLength = listFour.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);

        String phrase1 = listOne[rand1] + " " + listTwo[rand2] + " " + listThree[rand3];
        String phrase2 = listOne[rand1] + " " + listTwo[rand2];
        String phrase3 = listOne[rand1] + " " + listTwo[rand2] + " " + listThree[rand3] + " и " + listFour[rand4];

        String[] phraseOut = {phrase1, phrase2, phrase3};
        int phraseLength = phraseOut.length;
        int randOut = (int) (Math.random() * phraseLength);

        TextView textOut = (TextView)findViewById(R.id.TextOut);
        textOut.setText(phraseOut[randOut]);
    }


}
