
# Rapport

**Skriv din rapport här!**

Man började med att lägga till en knapp på första skämren som är 
"ButtonActivity". Uppgiften var att denna knapp skulle starta den 
andra aktiviteten när den första aktiviteten klickades på. Man hade 
som uppgift att skicka data mellan skärmarna också genom att använda 
sig av Intent bundle. För att detta skulle fungera var man tvungen 
att använda sig av t.ex TextView och Button. 


Förklara kod:
Koden är indelat i fyra olika stycken, här kommer en en beskrivning: 

Stycke 1:
Denna kod representerar en onCreate-metod i en Android-aktivitet som 
sätter layouten till "activity_main" och kopplar en knapp med id "button" 
till en medlemsvariabel "b". Detta gör det möjligt att hantera knappen i koden.

Stycke 2:
När knappen klickas på kommer koden i onClick-metoden att utföras.

stycke 3:
Koden skriver ett debug-loggmeddelande och ändrar sedan aktivitetens layout 
till att använda "activity_button2" efter att knappen har klickats på.

stycke 4:
Koden skapar ett Intent-objekt för att starta en ny aktivitet, ButtonActivity2, 
med extra data "name" som innehåller strängen "Hello world". Den nya aktiviteten 
startas sedan med startActivity-metoden.
```
 protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Log.d("==>","We clicked on Tomten!");
                setContentView(R.layout.activity_button2);

                Intent intent = new Intent(MainActivity.this, ButtonActivity2.class);
                intent.putExtra("name", "Hello world"); // Optional
                //intent.putExtra("number", 1); // Optional
                startActivity(intent);
                
    }
}
```

Bilder:

![](ScreenButton1.png)
![](Screen.Button2.png)


För och nackdelar: 

Fördelar:
Fördelen är att att det var enkelt emd att placera ut kompontenterna, det var smidigt
att placera ut delarna på skärmen. Det blir enkelt att ändra på placeringen av komponenterna 
på ett sätt som passar användaren.

nackdelar:
Nackdelar kan vara att behärska samt lära sig XML-kod. Eftersom layoutfiler är komplicerade. 
Det krävs tid och erfarenhet. Det är ganska utmanande för nybörjare att förstå sig på och 
använda sig av layoutfiler.
