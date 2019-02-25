UKÁZKA PRÁCE S ROZHRANÍM
-----------------------------------------------
Tøídy Ètverec a Obrázek implementují rozhraní Obrazec.
To znamená, že instance obou tøíd lze ovládat pomocí stejného 
"ovládacího panelu" (rozhraní). Mají totiž povinnost implementovat
metodu "nakresliSe()" pøedepsanou rozhraním Obrazec.

Co je zapsáno ve tøídach Tabule a Plátno neøešte. To je pro nás 
zatím èerná skøíòka.

POSTUP
-----------------------------------------------
1. Vytvoøte si po jedné instanci od tøíd Obrázek a Ètverec. Instance
   pojmenujte ctverec1 a obrazek1.
2. Do pøíkazového panelu (Ctrl+P) zapište pøíkaz definující promìnnou
   "o" typu rozhraní Obrazec. Pøíkaz tedy bude:
   Obrazec o = null;
3. Vyzkoušejte si, že pøes promìnnou o lze ovládat jak instanci
   ètverce, tak instanci obrázku, do pøíkazového panelu napište:
   o = ctverec1;
4. Pokracujte pøíkazem o.nakresliSe(); Vyhledejte novì otevøené okno, v nìmž by mìl být
   vidìt vykreslený ètverec. Èerné okno nezavírejte, budete se k nìmu vracet.
5. Pøiøaïte do promìnné o tentokrát instanci Obrázku
   o = obrazek1;
6. Od teï lze pøes stejný "ovládací panel" o ovládat instanci obrázku. Zapište
   pøíkaz: o.nakresliSe();
   
Poznámky.
------------------
Klinìte pravým tlaèítkem na instanci ètverec1 a zkuste si vypsat obsah a obvod ètverce.
Zkuste znovu zapsat pøíkaz z bodu 3 a pøes referenèní promìnnou o zkuste v pøíkazovém
panelu vypsat opìt obvod a obsah ètverce, který byl pøed chvilièkou do této promìnné pøiøazen. 
Pøíkaz (bez støedníku):
                o.getObsah()
                
Objevuje se chyba? ANO -----> promìnná o je "ovládacím panelem" Obrazce. Umí tedy volat jen 
metody, které byly zavedeny rozhraním Obrazec. Metody ctverce, které v se v rozhraní Obrazec
nevyskytují tedy tato promìnná nemùže znát. 

Zkuste pøíkaz (bez støedníku):
                ctverec1.getObsah()
To funguje, že? Proèpak?

