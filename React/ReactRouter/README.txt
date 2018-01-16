1. Describe the term Single Page Application and why it relevant for modern web-applications
  - Single Page Application (SPA) er en hjemmeside, hvor man i stedet for at blive navigeret til forskellige dele af hjemmesiden, så 
    bruger man en side, og opdatere den dynamisk alt efter hvor man navigere sig hen osv. 
    
  
2. Describe how SPA's are implemented with React
  - I React laves Single Page Applications ved brug af Reack-dom, som genererer en model af hjemmesiden i form at et diagramtræ, 
    hvor programmer ( i det her tilfælde javascript-react ) kan manipulere denne. Hertil benyttes React routing også. 
  
3. Explain about Routing in React
  - React routing gør at ens hjemmeside interface (det som man ser) er synkroniseret med url'en. Det gøres ved at importere Router
    og Route i ens app.js fra "react-router". Herefter kan man i komponentet sætte router paths ved <Route path='/' component={Test} />
    Her lavet flere routes, og det betyder at når man først indlæser hjemmesiden, så kommer man på home. Man kan så navigere rundt på
    hjemmesiden, hvor hjemmesiden indhold ændre sig dynamisk. Men man kan også skrive hjemmesiden ind, efterfuglt af "/#/Test", fx. 
    localhost:8100/#/test for at komme direkte til det state som ens single page application er på, når man navigere til test.
