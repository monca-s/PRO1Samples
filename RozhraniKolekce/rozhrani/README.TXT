UK�ZKA PR�CE S ROZHRAN�M
-----------------------------------------------
T��dy �tverec a Obr�zek implementuj� rozhran� Obrazec.
To znamen�, �e instance obou t��d lze ovl�dat pomoc� stejn�ho 
"ovl�dac�ho panelu" (rozhran�). Maj� toti� povinnost implementovat
metodu "nakresliSe()" p�edepsanou rozhran�m Obrazec.

Co je zaps�no ve t��dach Tabule a Pl�tno ne�e�te. To je pro n�s 
zat�m �ern� sk���ka.

POSTUP
-----------------------------------------------
1. Vytvo�te si po jedn� instanci od t��d Obr�zek a �tverec. Instance
   pojmenujte ctverec1 a obrazek1.
2. Do p��kazov�ho panelu (Ctrl+P) zapi�te p��kaz definuj�c� prom�nnou
   "o" typu rozhran� Obrazec. P��kaz tedy bude:
   Obrazec o = null;
3. Vyzkou�ejte si, �e p�es prom�nnou o lze ovl�dat jak instanci
   �tverce, tak instanci obr�zku, do p��kazov�ho panelu napi�te:
   o = ctverec1;
4. Pokracujte p��kazem o.nakresliSe(); Vyhledejte nov� otev�en� okno, v n�m� by m�l b�t
   vid�t vykreslen� �tverec. �ern� okno nezav�rejte, budete se k n�mu vracet.
5. P�i�a�te do prom�nn� o tentokr�t instanci Obr�zku
   o = obrazek1;
6. Od te� lze p�es stejn� "ovl�dac� panel" o ovl�dat instanci obr�zku. Zapi�te
   p��kaz: o.nakresliSe();
   
Pozn�mky.
------------------
Klin�te prav�m tla��tkem na instanci �tverec1 a zkuste si vypsat obsah a obvod �tverce.
Zkuste znovu zapsat p��kaz z bodu 3 a p�es referen�n� prom�nnou o zkuste v p��kazov�m
panelu vypsat op�t obvod a obsah �tverce, kter� byl p�ed chvili�kou do t�to prom�nn� p�i�azen. 
P��kaz (bez st�edn�ku):
                o.getObsah()
                
Objevuje se chyba? ANO -----> prom�nn� o je "ovl�dac�m panelem" Obrazce. Um� tedy volat jen 
metody, kter� byly zavedeny rozhran�m Obrazec. Metody ctverce, kter� v se v rozhran� Obrazec
nevyskytuj� tedy tato prom�nn� nem��e zn�t. 

Zkuste p��kaz (bez st�edn�ku):
                ctverec1.getObsah()
To funguje, �e? Pro�pak?

