# Java_Snails
First attempt at Java threads

English

Univeristy excercise - snails are supposed to represent threads and field of grass is a common resources they all have to share. Snails eat X amount of grass every Y miliseconds. If their current location has no grass they are checking neighbouring tiles for grass and moving to randomly chosen one. If neighbouring tiles have no grass - they sleep for a set amount of time. Grass grows, so unless user creates super-hungry snails emptying entire grid all the time, they are bound to find grass sooner or later to feed on in peace. Field of grass must be synchronized so we can avoid problems like two hungry snails moving to same tile. Program is written in Polish, same as most of my univeristy assignment. I don't think its good enough to bother translating - maybe when I'll have time to go through code and enough knowledge to be sure its good I will translate it.

Polish

Zadanie z przedmiotu Języki Programowania (a raczej język ponieważ nie było wyboru innego niż Java), 3 semestr.
Program mający na celu przedstawienie wątków dzielących jeden zasób - w tym przypadku wątkami są ślimaki dzielące pole z trawą o zadanych wymiarach.
Ślimak zjada trawę na swoim miejscu - w momencie gdy trawa się skończy poszukuje najbliższego miejsca z trawą; jeżeli takiego nie znajdzie to idzie spać.
Głównym problemem jest stworzenie programu w taki sposób by żaden ślimak nie wchodził drugiemu w drogę. Należy skorzystać z synchronizacji współdzielonego zasobu tak by tylko jeden ślimak mógł uzyskać informacje na temat pola z trawą i wykonać na jej temat decyzję. Przykładowy konflikt - dwa ślimaki siedzą na polu bez trawy i wybierają to samo pole jako ich cel podróży. Żeby nie dopuścić do takiej sytuacji jeden ślimak musi sprawdzić pole i ew. na nie przejść, blokując możliwość sprawdzenia potencjalnym rywalom.
Można zabić losowego ślimaka za pomocą przycisku - pole z martwym ślimakiem może zostać bez problemu zajęte przez innego, jest ono traktowane jako puste pole z trawą.
Program nie jest idealny, jest to mój pierwszy program z wykorzystaniem wątków. 
