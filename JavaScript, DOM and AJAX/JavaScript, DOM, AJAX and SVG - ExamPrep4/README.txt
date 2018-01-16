1. Explain about the Document Object Model, and why it’s (very) relevant for modern Web-development
  - DOM er en programmerings interface for html og xml dokumenter (fx en hjemmeside). Den representere siden på en sådan måde, at et  
    program kan ændre sidens struktur og indhold (fx tilføje eller fjerne noget, samt at skifte farver og størrelser på elementer). 
    Det er utroligt relevant for moderne web udvikling, da man i dag går meget op i web design, samt man arbejder mere og mere med
    SPA (Single Page Application).

2. Explain (using an example of your own choice) about JavaScript events, and Event Bubbling
  - Der kan fx tales om et click event. Hvis du har følgende html køde:
    <div>
      <ul>
        <li></li>
      </ul>
    </div>
    og man klikker på <li> elementet. Så vil der normalt først køres on click på <div>. Og derefter på <ul>. og sidst på <li>
    som var den man faktisk trykkede på. Event bubbling benytter så det modsatte, altså den starter med at kører <li> og så <ul> 
    og så <div>. 
  
3. Elaborate on how JSON or XML supports communication between subsystems, even when the subsystems are implemented on diﬀerent platforms.
    - JSON or XML er blot tekstbaserede datarepresentationer. Derfor kan ethvert subsystem, på enhver platform, der har logik for
      tekst (som alle har), læse filen. Det betyder at dataen er tilgængelig for enhver platform, og et subsystem skal så bare kunne
      få teksten til at give mening. Man kunne eventuelt skrive et program på et fuldstændigt ukendt operativsystem, og få det program
      til at læse og forstå et JSON objekt.

4. Explain the topic AJAX and how it has changed the way modern web-applications are created
  - AJAX er et værktøj der benyttes i web udvikling, til asynkront at kunne sende og modtage data fra klient siden. Altså kan en side
    sende og modtage data i baggrunden, uden at det spiller ind med det som brugeren ser på hjemmesiden, og derefter tilladen den at 
    benytte dataen fra baggrunden til dynamisk at opdatere/ændre på den side der vises. AJAX har haft, og har stadig stor betydning for
    moderne webapplikationer, da Single page applications er meget populært i dag. Og også pga. at man i dag er blevet vant til, at 
    en hjemmeside opdatere sig selv, uden man hele tiden skal igennem et refresh. Fx. på facebook, så regner du ikke med at du skal
    opdatere siden for at se nye posts, eller for at se nye chat beskeder. Det skal helst ske automatisk. 
    Ligeledes hvis jeg navigere mig fra forsiden til min profil på facebook, så antager jeg ikke at mine åbne chat vinduer på 
    hjemmesiden forsvinder, eller at det jeg var i gang med at skrive i en af chat 
  
5. Explain the Same Origin Policy (for AJAX), and different ways to work around it
    - SOP (Same Origin Policy) kalder man det som browseren gør, når man loader et dokument/script/noget data på en hjemmeside, hvor
      ens browser tjekker for om dataen/dokumentet/scriptet kommer fra samme origin (host/port osv). Dette benyttes som sikkerhed sådan
      at en hjemmeside ikke bare kan downloade et dokument/fremhente malicious scripts fra andre sider.
      
      CORS kan benyttes som en workaround. CORS eller Cross-Origin Resource Sharing er når man sætter nogle HTTP headers der tillader 
      at man kan indlæse nogle filer/scripts fra nogle definerede servers på et andet domæne. Fx hvis man skal indlæse et billede fra 
      en anden side, på sin hjemmeside, så ville man benytte CORS. 
