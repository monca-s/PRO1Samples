UKÁZKA SYMETRICKÉ ASOCIACE 1:1
-------------------------------------
Tøída Kanceláø odkazuje na svého Správce a Správce obsahuje
referenci na instanci Kanceláøe, kterou má ve správì.

POSTUP:
----------------------
1. Vytvoøte si instanci kanceláøe pomocí konstruktoru bez parametrù.
2. Vyzkoušejte, jak obì asociace fungují (Kancelar->Spravce, Spravce->Kancelar).
3. Vytvoøte si instanci Správce pomocí dvou parametrového konstruktoru
4. Vytvoøte instanci Kanceláøe pomocí ètyø parametrového konstruktoru. Jako
   jeho poslední parametr uveïte referenci na Správce vytvoøeného v kroku 3
5. Máme hotovou asociaci Kanceláø->Správce. Nastavte pomocí setru opaènou asociaci -
   tedy Správce musí odkazovat na svoji kanceláø
6. Upravte konstruktor použitý v kroku 3 tak, aby nebylo napøíštì již nutné 
   provádìt krok 5 samostatnì. Inspirujte se v konstruktoru Kanceláøe bez parametrù
   
Zkuste si výše uvedené kroky provést i pomocí pøíkazového panelu (Ctrl + P)