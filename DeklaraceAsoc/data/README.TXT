Uk�zka implementacejednosm�rn� trval� asociace 
mezi t��dami
-----------------------------------------------
1. Vytvo�te si instanci Osoby pomoc� konstruktoru bez
   parametr� (klikn�te prav�m tla��tkem na t��du).
2. Prohl�dn�te si tuto instanci a zam��te se na adresu.
   Ta byla "vyrobena" p��mo konstruktorem osoby, bez 
   va�eho z�sahu.
2. Vytvo�te si instanci t��dy Adresa a zadejte svoje 
   bydli�t� (ulice,m�sto, ��slo popisn� a ps� bez mezer) 
        - pozor texty zad�vejte v �vozovk�ch
3. Vytvo�te si instanci t��dy Osoba pomoc� prvn�ho 
   konstruktoru (m� 4 parametry - jm�no, p��jmen�, v�k a adresa).
   V posledn�m poli pro adresu klikn�te na �ervenou instanci adresy
   z p�ede�l�ho kroku - t�m se dopln� spr�vn� reference.
   T�m jsme pomoc� konstruktoru vytvo�ili instanci Osoby a z�rove�
   j� napojili na existuj�c� instanci Adresy.
4. Prohl�dn�te si vytvo�en� instance Osoby a Adresy
5. Vytvo�te novou osobu, ale pomoc� 3-parametrov�ho konstruktoru.
   Tentokr�t tedy neur�ujeme adresu.
6. Klikn�te na instanci nov� osoby a pomoc� settru setAdresa nastavte
   adresu osoby (m��ete pou��t u� vytvo�enou adresu, nebo si p�edem
   p�ipravit instanci odli�nou). T�m jsme tedy asociaci Osoba->Adresa
   nastavili a� dodate�n�
7. Projd�te si zdrojov� k�d obou t��d.   
   
   
POZN�MKY:
--------------------------------
* M�me t��du Osoba. Tato t��da vyu��v� pro ulo�en� informace o adrese bydli�t� t��du Adresa.
* Ka�d� osoba m��e m�t tedy p�i�azenou adresu
* Charakter t�to asociace je trval� -> atribut / instan�n� prom�nn� adresa ve t��d� Osoba
* Instance Osoby �v�, jak se dostat ke sv� adrese bydli�t�, ale
* Instance Adresy �nev�, ke kter� osob� pat�� 
* Vztah je tedy jednosm�rn�.
