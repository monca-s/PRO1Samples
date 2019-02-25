Ukázka implementacejednosmìrné trvalé asociace 
mezi tøídami
-----------------------------------------------
1. Vytvoøte si instanci Osoby pomocí konstruktoru bez
   parametrù (kliknìte pravım tlaèítkem na tøídu).
2. Prohlédnìte si tuto instanci a zamìøte se na adresu.
   Ta byla "vyrobena" pøímo konstruktorem osoby, bez 
   vašeho zásahu.
2. Vytvoøte si instanci tøídy Adresa a zadejte svoje 
   bydlištì (ulice,mìsto, èíslo popisné a psè bez mezer) 
        - pozor texty zadávejte v úvozovkách
3. Vytvoøte si instanci tøídy Osoba pomocí prvního 
   konstruktoru (má 4 parametry - jméno, pøíjmení, vìk a adresa).
   V posledním poli pro adresu kliknìte na èervenou instanci adresy
   z pøedešlého kroku - tím se doplní správná reference.
   Tím jsme pomocí konstruktoru vytvoøili instanci Osoby a zároveò
   jí napojili na existující instanci Adresy.
4. Prohlédnìte si vytvoøené instance Osoby a Adresy
5. Vytvoøte novou osobu, ale pomocí 3-parametrového konstruktoru.
   Tentokrát tedy neurèujeme adresu.
6. Kliknìte na instanci nové osoby a pomocí settru setAdresa nastavte
   adresu osoby (mùete pouít u vytvoøenou adresu, nebo si pøedem
   pøipravit instanci odlišnou). Tím jsme tedy asociaci Osoba->Adresa
   nastavili a dodateènì
7. Projdìte si zdrojovı kód obou tøíd.   
   
   
POZNÁMKY:
--------------------------------
* Máme tøídu Osoba. Tato tøída vyuívá pro uloení informace o adrese bydlištì tøídu Adresa.
* Kadá osoba mùe mít tedy pøiøazenou adresu
* Charakter této asociace je trvalı -> atribut / instanèní promìnná adresa ve tøídì Osoba
* Instance Osoby „ví“, jak se dostat ke své adrese bydlištì, ale
* Instance Adresy „neví“, ke které osobì patøí 
* Vztah je tedy jednosmìrnı.
