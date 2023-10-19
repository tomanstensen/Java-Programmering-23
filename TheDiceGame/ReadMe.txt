Detta spelet består av tre separata filer. Två komponent-filer och en main-fil.
Den första komponenten är en tärning. Die.java
Klassen Die består av tre variabler vilka är antal sidor som tärningen har,
vilken sida som är uppåt och en rullningsfunktion som returnerar ett värde mellan 1 och tärningens storlek.
Den andra komponenten som spelet har är spelaren. Player.java
Klassen Player innehåller variablerna namn, poäng, gissning och en tärning samt en rullning av den tärning som tilldelas spelaren.
Dessa variabler har setters och getters för användning i main-metoden.

Den sista komponenten är filen DiceGame.java som innehåller en main-metod där det skapas 
en instans av spelet och sedan körs två metoder som heter intro och playtime.
Metoden intro förklarar spelets upplägg och hämtar värden för vad spelaren heter, hur många rundor som vill spelas
och hur många sidor som tärningen skall ha under spelets gång.

Metoden playTime kör sedan själva spelet.
Spelet går ut på att ta emot en gissning för att sedan rulla en tärning och ge spelaren en poäng om gissningen matchar rullningen.
Detta sker genom en while-loop där input hämtas för dessa variabler.
Varje runda får spelaren även en uppdatering på hur många poäng som spelaren har samt vilken runda det är.
När alla rundor har spelats så avslutas spelet med en summering där spelaren får respons utifrån hur
många poäng som spelaren har samlat ihop och spelet avslutas sedan.


Ha så kul!