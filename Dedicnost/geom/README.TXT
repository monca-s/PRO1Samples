UKÁZKA POUŽITÍ DÌDIÈNOSTI  A ABSTRAKTNÍ TØÍDY
-------------------------------------------------------------
1. Vytvoøte si instanci Ctverce a Kruznice. Vyberte konstruktor se tøemi parametry.
2. Pro každou instanci zavolejte metodu zobrazit() zdìdìnou od Geometrického útvaru.
3. V novì otevøeném èerném oknì byste mìli vidìt vykreslený ètverec a kružnici.
4. Vyzkoušejte zdìdìné metody pro posun o zadaný vektor

Prohlédnìte si zdrojové kódy. Pøedek GeometrickyUtvar zavádí potøebné metody 
a spoleèný atribur pozice. Tøída obsahuje abstraktní metodu kresliTvar, která musí
být redefinována ve všech potomcích. Tato metoda je ale využita již pøi definici metod 
jako jsou zobrazit, posunout, posunoutPomalu. Tyto metody mohou být tøídami potomkù
zdìdìny beze zmìny (bez nutnosti redefinice).