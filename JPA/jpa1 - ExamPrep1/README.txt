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

3. Explain the JPA strategy for handling Object Relational Mapping and important classes/annotations involved.
    - Man benytter en EntityManager til at persiste sine objekter. Denne bliver lavet igennem en EntityManagerFactory. I sine
      Entities skal man så annotere, for at JPA forstår klassen. Her starter man med at annotere en variabel som skal benyttes som
      ID i databasen (@Id). Herudover kan man annotere variabler med "@GeneratedValue" som betyder at variablen er autogenereret, 
      og "@Transient" benyttes til at ekskludere en variabel fra databasen. 
      Herefter kan objekter i entitien annoteres med "@ManyToMany(mappedBy="AndenVariabel")". Dette definere relationen i databasen.
      Hertil kan følgende annoteringer bruges:
      @OneToOne, @OneToMany, @ManyToOne og @ManyToMany.

4. Outline some of the fundamental differences in Database handling using plain JDBC versus JPA
    - Ved benyttelse af JDBC foregår persistency manuelt. JDBC virker til at skabe en connection til ens databse, 
      hvorefter man selv skriver et sql script til at generere sin database, og derefter skriver metoder med SQL statements
      til at kommunikere med databasen (skrive og læse til og fra databasen)
      JPA foregår mere automatisk, ved at man definere nogle entities med annotations, hvorefter JPA håndtere at skrive og læse
      til og fra databsen.
