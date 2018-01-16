1. When and why will we use Threads in our programs?
  - Når noget skal køre samtidigt, eller når to eller flere ting skal udføres synkront, men man vil ikke have at den første ting
    "går i stå" imens den anden kører (fx et UI og en metode for at gange to høje tal sammen).
  
2. What is the Race Condition Problem and how can you solve it?
  - Race condition er når to eller flere threads får adgang til den samme data, og prøver at ændre den på samme tid. Dette løses
    som regelt ved at "låse" dataen når den bliver brugt. Fks. med en blocking queue i java. 
  
3. Explain the Producer/Consumer-problem and how to solve it in modern Java Programs
  - Det handler om at man har to tråde, en producer og en consumer tråd. Producer tråden smider noget data ind i en fixed-size buffer
    (altså en buffer der har en størrelse på fx 64), hvor consumeren tager den data og bruger den til et eller andet. Problemet er at
    man skal få produceren til ikke at prøve at tilføje data til bufferen, hvis den er fuld. 
    I java kan det gøres ved at bruge en blockingqueue, da den blockere tråden indtil den handling (at smide dataen ind) er tilgængelig.
  
4. Explain what Busy Waiting is and why it's a bad thing in a modern software system.
  - Busy waiting er når man i et program bliver ved med at checke om noget er true eller false. Fx om man må smide data ind i en buffer
    (producer consumer). Altså hvis man havde lavet en løsning til producer consumer hvor man bare bliver ved med at tjekker om man kan
    smide data ind i bufferen, så bruger man busy waiting, og ulempen er at man bruger en hel masse cpu kræft (og man låser en del af
    cpu'en da ingen nye tråde kan bruge den krædt som busy waiting trådene bruger).
  
5. Describe Java's BlockingQueue interface, relevant implementations and methods relevant for the producer consumer problem.
  - En Queue, der understøtter at vente på at queuen har data i sig (således at fx consumeren ved at der er noget data den skal hente),
    og ligeledes understøtter den at vente på at queuen har plads til at smide noget i sig (således at produceren ved hvornår den kan 
    smide data ind i queuen)
