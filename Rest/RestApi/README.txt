1. Elaborate on some of the characteristics of REST, like: Stateless, Cacheable, Layered System, Uniform Interface etc.
    - Først og fremmest er REST stateless, hvilket betyder at den aldrig har et state. Det betyder at den husker ikke hvem der er logget
      ind, eller hvad en person har i deres indkøbskurv på en online shop. Denne data bliver i stedet kommunikeret frem og tilbage
      mellem server og klient hver gang der bliver kommunikeret.
      REST er også cacheable, hvilket betyder at hver response meddelelse fra serveren til clienten kan markeres med "cacheable", og denne
      besked vil så blive cachet af klienten, så den kan bruges i fremtide requests. Fx. hvis du logger ind, får du et response fra 
      serveren med et token, hvortil denne vil være "cacheable" og denne bil altså caches af klienten, og sendes med hver gang klienten
      foretager et request (sådan at serveren ved at personen er logget på, men stadig forbliver stateless).
      At REST har et layered system betyder blot at der kan være flere lag til systemet, og at ingen af disse lag har adgang til at se
      ind i de andre lag.
      Uniform interface i REST er blot at der er en uniform kontrakt mellem services og service consumers der benytter rest. Hertil 
      er det eksempelvis at der altid benyttes HTTP.
  
2. Explain the benefit(s) from having a backend that exposes all data to clients via a REST-API
    - Det gør at man ikke behøver session variabler for hver klient, med nødvendig data. For man giver dem den data de har brug for, 
      og markerer den data med "cacheable" og dermed bliver det cachet hos klienten. Klienten kan så bruge den data, manipulere den, 
      og sende den tilbage, og REST-API'et kan så gøre det der skal gøres, helt uden at huske på hvem der er hvem. Det gør det meget
      skalerbart, hvilket betyder at man kan have mange flere klienter på samme tid, uden at løbe tør for ram, eller cpu kraft på sin
      server.
  
3. Elaborate on how JSON or XML supports communication between subsystems, even when the subsystems are implemented on diﬀerent platforms.
    - JSON or XML er blot tekstbaserede datarepresentationer. Derfor kan ethvert subsystem, på enhver platform, der har logik for
      tekst (som alle har), læse filen. Det betyder at dataen er tilgængelig for enhver platform, og et subsystem skal så bare kunne
      få teksten til at give mening. Man kunne eventuelt skrive et program på et fuldstændigt ukendt operativsystem, og få det program
      til at læse og forstå et JSON objekt.
