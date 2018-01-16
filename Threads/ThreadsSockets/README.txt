1. When and why we will use Threads in our programs?
  - Når noget skal køre samtidigt, eller når to eller flere ting skal udføres synkront, men man vil ikke have at den første ting
    "går i stå" imens den anden kører (fx et UI og en metode for at gange to høje tal sammen).
  
2. Explain about the Race Condition Problem and ways to solve it in Java
  - Race condition er når to eller flere threads får adgang til den samme data, og prøver at ændre den på samme tid. Dette løses
    som regelt ved at "låse" dataen når den bliver brugt. Fks. med en blocking queue i java. 

3. Explain how we can write reusable non-blocking Java Controls using Threads 
  - 
  
4. Explain about deadlocks, how to detect them and ways to solve the Deadlock Problem
  - Deadlocks er når to eller flere processer elelr tråde venter på hinanden for at kunne fortsætte (fx hvis en person i counter strike
    gerne vil have modstanderen vinder, men modstanderen vil gerne have de andre vinder, så er der ingen af dem der skyder hinanden.
    de venter "for evigt"). 
    Håndtering af dem:
      1. Strudsealgoritmen:
        – Tillader deadlock at opstå
        – Timeout eller bruger løser problemet
      2. Detektér og fjern deadlock:
        – Tillader deadlock at opstå
        – Deadlock detekteres, og elimineres af systemet
      3. Undgå deadlock dynamisk (avoidance):
        – Deadlock kan ikke opstå (systemet kan have potentielle deadlocks)
        – Dynamisk check af forespørgsler på resurser (requests)
        – Hvis tildeling af en resurse kan føre til en deadlock udsættes den
      4. Undgå deadlock statisk (prevention):
        – Deadlock kan ikke opstå (ingen potentielle deadlocks)
        – Sikret statisk via regler for requests
