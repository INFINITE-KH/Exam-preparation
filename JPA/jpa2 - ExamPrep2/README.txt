1. Describe how you have handled persistence in the last three semesters. 
   The considerations should include all relevant layers. File IO, Relational Databases, local storage and cookies in browsers.
    - Den største forskel er hvordan vi har håndteret persistency til databasen på. Indtil dette semester er det foregået ved
      manuelt at skrive sql statements ind i metoder ved brug af JDBC. Nu benytter vi obejct relational mapping, som er et 
      framework der gør dette automatisk. Altså giver vi en EntityManager et objekt vi vil persistere, og denne håndtere så sql
      statementet og database skrivningen osv.
      Derudover benyttede vi File IO til at skrive til og fra filer for at gemme ting lokalt, og cookie håndtering gjorde vi 
      manuelt, hvor ved benyttelse af REST er det automatiseret at nødvendig data bliver cachet.
     
2. Explain the rationale behind the topic Object Relational Mapping and the Pros and Cons in using a ORM
    - Fordelene ved at bruge object relational mapping er essentielt at database logik i form af sql scripts, sql statements osv.
      er håndteret igennem programmering. Altså laver man blot sine objekter, og ens ORM framework håndtere så databaseskrivning
      osv. 
      Der er dog også ulemper ved at benytte ORM. Eksempelvis er håndteringen af normalisering ikke fjernet, den er blot ændret
      til at skulle håndteres programatisk. Dette går tit glemt hos udviklere, og databasestrukturen kan derfor ende med at være
      værre, end hvis man ikke benyttede ORM. 

3. Explain how Inheritance in an OO language can be mapped to tables in a relational database
    - Man kan benytte inheritance til at skabe en mere overblikrig database tabel. Ekempelvis kunne du i dit program have biler
      der alle inheriter fra klassen "Car". De biler får så specifikke ting til deres behov (fx en mercerdes og en volkswargen 
      osv). I databasen ville de så alle sammen stå i tabellen "Car", med deres egne specifikationer i tabellen. 
      Det vil sige at selvom der er et behov for flere klasser i programmet, kan databasen smide alle bilerne ind i en tabel, 
      hvor nødvendig information om disse er tilgængelig. Disse ville kunne differencieres ved en kolonne  i tabellen der 
      definere typen af objektet.

4. Explain (at least two) JPA-strategies for Inheritance Mapping
    - En JPA-strategi for inheritance mapping er single table inheritance, som samler flere objekter af samme type
      i en tabel.
      En anden strategi er joined multiple table inheritance, som laver tabeller for hver type af objekterne, men som også
      laver en joined tabel, hvor alle objekterne findes.
