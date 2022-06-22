package com.example.kochubeyscode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button doCipher;
   Button doUncipher;
   Button deleteAll;
   TextView inputText;
   TextView outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doCipher=findViewById(R.id.doCipher);
        doUncipher=findViewById(R.id.doUncipher);
        deleteAll= findViewById(R.id.deleteAll);
        inputText = findViewById(R.id.inputText);
        outputText = findViewById(R.id.outputText);



    }
    String toast1 = "Введите текст для шиврования";
    String toast2 = "Введите текст для расшифровки";
    String toast3 = "Работает";

    public void cipher(View v){ //Кнопка шифрования введенного текста
        if (inputText.length() == 0) {
            Toast.makeText(
                    MainActivity.this, toast1, Toast.LENGTH_SHORT).show();
        } else {



            int b=1; //не истинная длина, нужна для кодирования каждого отдельного слова с пропуском пробелов
            int textLength = inputText.length();
            int a;

            for (a= 0; a < textLength; a++) {
                char simvol = inputText.getText().toString().charAt(a);
                String simvolS = (Character.toString(simvol));

                if (b%3 == 0) {

                    switch (simvolS) {
                        case " ":
                            outputText.append(" "); b=0; break;
                        case "й":
                            outputText.append("ф");
                            break;
                        case "ц":
                            outputText.append("я");

                            break;
                        case "у":
                            outputText.append("ч");
                            break;
                        case "к":
                            outputText.append("с");
                            break;
                        case "е":
                            outputText.append("м");
                            break;
                        case "н":
                            outputText.append("и");
                            break;
                        case "г":
                            outputText.append("т");
                            break;
                        case "ш":
                            outputText.append("ь");
                            break;
                        case "щ":
                            outputText.append("б");
                            break;
                        case "з":
                            outputText.append("ю");
                            break;
                        case "х":
                            outputText.append("э");
                            break;


                        //Вторая строка
                        case "ф":
                            outputText.append("й");
                            break;
                        case "ы":
                            outputText.append("ц");
                            break;
                        case "в":
                            outputText.append("у");
                            break;
                        case "а":
                            outputText.append("к");
                            break;
                        case "п":
                            outputText.append("е");
                            break;
                        case "р":
                            outputText.append("н");
                            break;
                        case "о":
                            outputText.append("г");
                            break;
                        case "л":
                            outputText.append("ш");
                            break;
                        case "д":
                            outputText.append("щ");
                            break;
                        case "ж":
                            outputText.append("з");
                            break;
                        case "э":
                            outputText.append("х");
                            break;
                        //Третья строка
                        case "я":
                            outputText.append("ы");
                            break;
                        case "ч":
                            outputText.append("в");
                            break;
                        case "с":
                            outputText.append("а");
                            break;
                        case "м":
                            outputText.append("п");
                            break;
                        case "и":
                            outputText.append("р");
                            break;
                        case "т":
                            outputText.append("о");
                            break;
                        case "ь":
                            outputText.append("л");
                            break;
                        case "б":
                            outputText.append("д");
                            break;
                        case "ю":
                            outputText.append("ж");
                            break;

                    }
                } else { //не третьи символы
                    switch (simvolS) {
                        case " ":
                            outputText.append(" "); b=0; break;
                        case "й":
                            outputText.append("ц");
                            break;
                        case "ц":
                            outputText.append("у");
                            break;
                        case "у":
                            outputText.append("ц");
                            break;
                        case "к":
                            outputText.append("е");
                            break;
                        case "е":
                            outputText.append("к");
                            break;
                        case "н":
                            outputText.append("г");
                            break;
                        case "г":
                            outputText.append("ш");
                            break;
                        case "ш":
                            outputText.append("щ");
                            break;
                        case "щ":
                            outputText.append("з");
                            break;
                        case "з":
                            outputText.append("х");
                            break;
                        case "х":
                            outputText.append("й");
                            break;

                        //Вторая строка
                        case "ф":
                            outputText.append("ы");
                            break;
                        case "ы":
                            outputText.append("ф");
                            break;
                        case "в":
                            outputText.append("а");
                            break;
                        case "а":
                            outputText.append("в");
                            break;
                        case "п":
                            outputText.append("р");
                            break;
                        case "р":
                            outputText.append("о");
                            break;
                        case "о":
                            outputText.append("р");
                            break;
                        case "л":
                            outputText.append("д");
                            break;
                        case "д":
                            outputText.append("ж");
                            break;
                        case "ж":
                            outputText.append("э");
                            break;
                        case "э":
                            outputText.append("ж");
                            break;
                        //Третья строка
                        case "я":
                            outputText.append("ю");
                            break;
                        case "ч":
                            outputText.append("с");
                            break;
                        case "с":
                            outputText.append("м");
                            break;
                        case "м":
                            outputText.append("и");
                            break;
                        case "и":
                            outputText.append("м");
                            break;
                        case "т":
                            outputText.append("ь");
                            break;
                        case "ь":
                            outputText.append("б");
                            break;
                        case "б":
                            outputText.append("ю");
                            break;
                        case "ю":
                            outputText.append("б");
                            break;

                    }
                }
                b++;
            }
        }
    }

    public void deleteAllTexts(View v){  //Очистка обоих текстов
        outputText.setText("");
        inputText.setText("");
    }

    public void uncipher(View v){ //Кнопка расшифровки введенного текста
        if (inputText.length() == 0) {
            Toast.makeText(
                    MainActivity.this, toast2, Toast.LENGTH_SHORT).show();
        } else {



            int b=1; //не истинная длина, нужна для декодирования каждого отдельного слова с пропуском пробелов
            int textLength = inputText.length();
            int a;

            for (a= 0; a < textLength; a++) {
                char simvol = inputText.getText().toString().charAt(a);
                String simvolS = (Character.toString(simvol));

                if (b%3 == 0) {

                    switch (simvolS) {
                        case " ":
                            outputText.append(" "); b=0; break;
                        case "й":
                            outputText.append("ф");
                            break;
                        case "ц":
                            outputText.append("ы");
                            break;
                        case "у":
                            outputText.append("в");
                            break;
                        case "к":
                            outputText.append("а");
                            break;
                        case "е":
                            outputText.append("п");
                            break;
                        case "н":
                            outputText.append("р");
                            break;
                        case "г":
                            outputText.append("о");
                            break;
                        case "ш":
                            outputText.append("л");
                            break;
                        case "щ":
                            outputText.append("д");
                            break;
                        case "з":
                            outputText.append("ж");
                            break;
                        case "х":
                            outputText.append("э");
                            break;


                        //Вторая строка
                        case "ф":
                            outputText.append("й");
                            break;
                        case "ы":
                            outputText.append("я");
                            break;
                        case "в":
                            outputText.append("ч");
                            break;
                        case "а":
                            outputText.append("с");
                            break;
                        case "п":
                            outputText.append("м");
                            break;
                        case "р":
                            outputText.append("и");
                            break;
                        case "о":
                            outputText.append("т");
                            break;
                        case "л":
                            outputText.append("ь");
                            break;
                        case "д":
                            outputText.append("б");
                            break;
                        case "ж":
                            outputText.append("ю");
                            break;
                        case "э":
                            outputText.append("х");
                            break;
                        //Третья строка
                        case "я":
                            outputText.append("ц");
                            break;
                        case "ч":
                            outputText.append("у");
                            break;
                        case "с":
                            outputText.append("к");
                            break;
                        case "м":
                            outputText.append("е");
                            break;
                        case "и":
                            outputText.append("н");
                            break;
                        case "т":
                            outputText.append("г");
                            break;
                        case "ь":
                            outputText.append("ш");
                            break;
                        case "б":
                            outputText.append("щ");
                            break;
                        case "ю":
                            outputText.append("з");
                            break;

                    }
                } else { //не третьи символы
                    switch (simvolS) {
                        case " ":
                            outputText.append(" "); b=0; break;
                        case "й":
                            outputText.append("х");
                            break;
                        case "ц":
                            outputText.append("(й/у)");
                            break;
                        case "у":
                            outputText.append("ц");
                            break;
                        case "к":
                            outputText.append("е");
                            break;
                        case "е":
                            outputText.append("к");
                            break;
                        case "н":
                            outputText.append("?");
                            break;
                        case "г":
                            outputText.append("н");
                            break;
                        case "ш":
                            outputText.append("г");
                            break;
                        case "щ":
                            outputText.append("ш");
                            break;
                        case "з":
                            outputText.append("щ");
                            break;
                        case "х":
                            outputText.append("з");
                            break;

                        //Вторая строка
                        case "ф":
                            outputText.append("ы");
                            break;
                        case "ы":
                            outputText.append("ф");
                            break;
                        case "в":
                            outputText.append("а");
                            break;
                        case "а":
                            outputText.append("в");
                            break;
                        case "п":
                            outputText.append("?");
                            break;
                        case "р":
                            outputText.append("(п/о)");
                            break;
                        case "о":
                            outputText.append("р");
                            break;
                        case "л":
                            outputText.append("?");
                            break;
                        case "д":
                            outputText.append("л");
                            break;
                        case "ж":
                            outputText.append("(д/э)");
                            break;
                        case "э":
                            outputText.append("ж");
                            break;
                        //Третья строка
                        case "я":
                            outputText.append("?");
                            break;
                        case "ч":
                            outputText.append("?");
                            break;
                        case "с":
                            outputText.append("ч");
                            break;
                        case "м":
                            outputText.append("(с/и)");
                            break;
                        case "и":
                            outputText.append("м");
                            break;
                        case "т":
                            outputText.append("?");
                            break;
                        case "ь":
                            outputText.append("т");
                            break;
                        case "б":
                            outputText.append("ь");
                            break;
                        case "ю":
                            outputText.append("(б/я)");
                            break;

                    }
                }
                b++;
            }
        }
    }

}
